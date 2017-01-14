#! /bin/sh

sbt -Denvironment=local -Dbrowser=firefox clean 'test-only -- -n "uk.co.testcraft.restfulbookerplatform.tags.SmokeTest"'