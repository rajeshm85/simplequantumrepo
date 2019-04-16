jobName = manager.build.getProject().getName()
buildNumber = manager.build.getNumber()
summary = manager.createSummary("graph.gif")
summary.appendText("<a href=\"https://ps.reporting.perfectomobile.com/library?jobName[0]=${jobName}&jobNumber[0]=${buildNumber}\">Perfecto Test Report</a>", false)
