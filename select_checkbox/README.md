* Selecting a Checbox with WebDriver

* Create new ChecBox html pg
  
      <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>Checkboxes Test</title>
      </head>
      <body>
        <form>
          <input type="checkbox" id="mayoCheckbox" value="mayo"> Mayo<br>
          <input type="checkbox" id="lettuceCheckbox" value="lettuce"> Lettuce<br>
          <input type="checkbox" id="turkeyCheckbox" value="turkey"> Turkey
        </form>
      
      </body>
      </html>

* Create WebDriver and connect to the above local html pg

* Using id, connect to any checkbox and toggle on


    WebElement checkBox = driver.findElement(By.id("lettuceCheckbox"));
    checkBox.click();

* To toggle off the selected checkbox, click once more

      checkBox.click();