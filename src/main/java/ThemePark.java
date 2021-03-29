import attractions.*;
import behaviours.IReviewed;
import stalls.*;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviewed;

    public ThemePark() {
        this.reviewed = new ArrayList<>();
    }

    public ArrayList getAllReviewed() {
        return this.reviewed;
    }
}


