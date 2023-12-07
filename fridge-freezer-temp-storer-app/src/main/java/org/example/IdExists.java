package org.example;

import java.io.File;

public class IdExists {
    /* Method that takes fridge/freezer id and checks if file exists. If not it creates file.
     *
     * @param idToBeChecked
     * @return boolean
     */
    public static void IdCheck(String idToBeChecked, long temp){
        File file = new File();
        if (file.isFile(idToBeChecked)){
            //storeInExistingTxt(idToBeChecked, temp)
        } else{
            //storeInNewTxt(idToBeChecked, temp)
        }

    }
}
