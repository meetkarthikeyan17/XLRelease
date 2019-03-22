// Exported from:        http://e18-PC:5516/#/templates/FolderSamplesAndTutorials-Releaseedf8add7b65b489d95c64a6a98db460d/releasefile
// XL Release version:   8.5.4
// Date created:         Thu Mar 21 23:36:52 PDT 2019

xlr {
  template('Mytest') {
    folder('Samples & Tutorials')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-03-21T09:00:00-0700')
    phases {
      phase('New Phase') {
        tasks {
          manual('ccc') {
            
          }
        }
      }
    }
    
  }
}