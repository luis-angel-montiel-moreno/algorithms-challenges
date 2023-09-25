package com.affinipay.minuteadder

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class MinuteAdderTest extends AnyFunSpec with Matchers {
  
  describe("addMinutes") {
    it("should be implemented") {
      noException should be thrownBy MinuteAdder.addMinutes("5:02 PM", 1)
    }

    it("should add minutes") {
      MinuteAdder.addMinutes("5:02 PM", 1) should be("5:03 PM")
    }

    it("should add a lot of minutes") {
      MinuteAdder.addMinutes("5:02 PM", 60) should be("6:02 PM")
    }

    it("should switch ante meridiem to post meridiem"){
      MinuteAdder.addMinutes("9:13 AM", 200) should be("12:33 PM")
    }

    it("should switch post meridiem to ante meridiem"){
      MinuteAdder.addMinutes("9:13 PM", 200) should be("12:33 AM")
    }

    it("should shift one day") {
      MinuteAdder.addMinutes("9:13 PM", 24*60) should be("9:13 PM")
    }

    it("should shift half of the day") {
      MinuteAdder.addMinutes("9:13 PM", 12*60) should be("9:13 AM")
    }

    it("should shift PM time by 7 days") {
      MinuteAdder.addMinutes("9:13 PM", 24 * 60*7) should be("9:13 PM")
    }

    it("should shift AM time by 7 days") {
      MinuteAdder.addMinutes("9:13 AM", 24 * 60 * 7) should be("9:13 AM")
    }

    it("should add 0 minutes") {
      MinuteAdder.addMinutes("9:13 PM", 0) should be("9:13 PM")
    }


  }

}