* Clicking an image using CSS Selector
    - Isolate the image element thru classname and cssSelector firstchild
      

        WebElement imageElement = driver.findElement(By.cssSelector(".isv-r:first-child"));

* Utilize the classname/cssSelector to indicate img

      WebElement imageLink = imageElement.findElement(By.cssSelector(".rg_i"));

* Click on the link image

      imageLink.click();