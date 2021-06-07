* Selecting Value of Radio Button with WebDriver

          for (WebElement radioButton :
                radioButtons) {
            if(radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
          }