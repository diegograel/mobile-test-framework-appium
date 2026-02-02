Android Mobile Automation – Appium + Java + TestNG

📌 Project Overview

This repository contains an Android mobile automation portfolio project built using Appium, Java, and TestNG, targeting the BestBuy Android application.
The purpose of this project is to demonstrate how I apply strong QA principles and test strategy thinking while developing and evolving mobile automation skills.

🎯 Testing Goals

 Validate critical user-facing functionality without compromising real user flows

 Demonstrate structured automation design for Android applications

 Apply risk-based testing decisions when choosing what to automate

🧪 Test Scope

Automated scenarios focus on:

 High-value, low-risk user flows

 Stable application areas suitable for automation

 Reusable interactions and navigation patterns

Out of scope (by design):

 Critical purchase and payment flows

 Newly released or frequently changing features

-> These areas are intentionally left for manual and exploratory testing, where automation could introduce risk or false confidence.

🧠 Test Strategy & QA Perspective

As a QA with extensive manual testing experience, automation decisions in this project are driven by:

 Risk analysis

 Stability of features

 Maintenance cost vs. value

 Impact of failures on real users

 Automation here complements — not replaces — manual testing.

🏗️ Project Structure

The project is organized to keep responsibilities separated and maintain readability:

 tests – Test cases and scenarios

 locators – UI element definitions

 actions – Reusable interaction logic

 utils – Helper methods (e.g., scrolling utilities)

-> This structure is intentionally simple and designed to evolve as the framework grows.

⚠️ Known Limitations

 Limited device coverage

 No CI integration in this version

 Simplified configuration management

-> In a production environment, these areas would be expanded with device farms, CI pipelines, and environment-based configurations.

🚀 Future Improvements

 Enhanced reporting

 Device and OS version parameterization

 CI execution support

 Expanded negative and edge case coverage
