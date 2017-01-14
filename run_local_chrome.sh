#! /bin/sh

driver_path=${CHROME_DRIVER_PATH-/usr/local/bin/chromedriver}
sbt -Denvironment=local -Dbrowser=chrome -Dwebdriver.chrome.driver=$driver_path clean 'test-only -- -n "uk.co.testcraft.restfulbookerplatform.tags.SmokeTest"'