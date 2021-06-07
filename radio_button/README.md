* Radio Buttons
  - Experimenting with radio buttons by accessing local html file
  
* Create new directory: src/main/webapp/

* Create html file with simple radio buttons:

          <!DOCTYPE html>
          <html lang="en">
          <head>
              <meta charset="UTF-8">
              <title>Radio Button Test</title>
          </head>
          <body>
              <form>
                  <input type="radio" name="color" value="red" checked>Red<br>
                  <input type="radio" name="color" value="green">Green<br>
                  <input type="radio" name="color" value="blue">Blue
              </form>
          </body>
          </html>

* Create a webdriver to access local html by name

        List<WebElement> radioButtons = driver.findElements(By.name("color"));

* Select a new radio button

         radioButtons.get(1).click();