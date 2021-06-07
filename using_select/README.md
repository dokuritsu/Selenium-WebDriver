* Experimenting with Select drop-down forms and WebDriver

* Create SelectItems html page

      <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>Select Item</title>
      </head>
      <body>
          <form>
              <select id="select1">
                  <option value="yes">Yes</option>
                  <option value="no">No</option>
                  <option value="maybe">Maybe</option>
              </select>
          </form>
      
      </body>
      </html>

* Create web driver and find select drop-down thru id

      WebElement selectElement = driver.findElement(By.id("select1"));

* Use the class Select to provide quick access to inner elements

      Select select = new Select(selectElement);
      select.selectByVisibleText("Maybe");