* Adding a little more complexity to our script

* Exit our of Ajax state

        searchField.submit(); => Acts as if pressing Enter within field

* Find another element on the page: Images tab

        WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);

* Click on said element

        imagesLink.click(); => Clicks