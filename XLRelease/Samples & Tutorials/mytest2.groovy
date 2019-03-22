// Exported from:        http://e18-PC:5516/#/templates/FolderSamplesAndTutorials-Released3a08d13f1bc4fb0b5701e7883db2868/releasefile
// XL Release version:   8.5.4
// Date created:         Thu Mar 21 23:38:38 PDT 2019

xlr {
  template('mytest2') {
    folder('Samples & Tutorials')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-03-21T09:00:00-0700')
    phases {
      phase('New Phase') {
        tasks {
          manual('day2') {
            
          }
        }
      }
    }
    
  }
}