* Experimenting with Tables and WebDriver

* Create TablesTest html page
  
      <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>Tables</title>
      </head>
      <body>
          <table>
              <tr>
                  <td>Table 1 Row 1</td>
                  <td>
                      <table>
                          <tr><td>Table 2 Row 1</td></tr>
                          <tr><td>Table 2 Row 2</td></tr>
                      </table>
                  </td>
              </tr>
          </table>
      </body>
      </html>
  
* Brute force method => Creating multiple WebElements to access outer & inner table as well as data

      WebElement outerTable = driver.findElement(By.tagName("table"));
      WebElement innerTable = outerTable.findElement(By.tagName("table"));
  
      WebElement row = innerTable.findElements(By.tagName("td")).get(1);
  
      System.out.println(row.getText());

* Using xpath: Quicker and cleaner

      WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
      System.out.println(row.getText());
