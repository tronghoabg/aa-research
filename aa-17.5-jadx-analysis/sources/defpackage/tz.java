package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class tz {
    public boolean a;
    public ItemList b;
    public CarText c;
    public Action d;
    public ActionStrip e;
    public final List f = new ArrayList();
    public int g = 1;
    public final int h = 1;
    public Header i;

    public final GridTemplate a() {
        ItemList itemList = this.b;
        if (this.a == (itemList != null)) {
            throw new IllegalStateException("Template is in a loading state but lists are added, or vice versa");
        }
        if (itemList != null) {
            Iterator<uf> it = itemList.getItems().iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof GridItem)) {
                    throw new IllegalArgumentException("All the items in grid template's item list must be grid items");
                }
            }
        }
        return new GridTemplate(this);
    }

    public final void b() {
        this.g = 2;
    }

    public final void c() {
        this.a = true;
    }
}
