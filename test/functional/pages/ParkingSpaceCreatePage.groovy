package pages

import geb.Page
import steps.InternationalizationHelper;

class CreateParkingSpacePage extends Page {
    static url = "/parkingSpace/create"

    static at = {
        InternationalizationHelper helper = InternationalizationHelper.instance

        String parkingSpace = "ParkingSpace"
        String pageTitle = helper.getMessage("default.create.label", parkingSpace)
        print pageTitle
        title ==~ pageTitle
    }

    def createParkingSpace(String description, String sector, boolean preferential) {
        $("input[name='description']").value(description)
        $("select[name='sector']").value(sector)
        $("checkBox[name='preferential']").value(preferential)
        $("input[name='create']").click()
    }


}
