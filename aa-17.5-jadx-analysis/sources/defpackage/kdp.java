package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.ItemList;
import java.util.List;

/* loaded from: classes2.dex */
public final class kdp {
    private static final yph k = yph.c("CarApp.H.Tem");
    public final boolean a;
    public final boolean b;
    public final CarText c;
    public final uw d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public kdp(kdo kdoVar) {
        yfq yfqVarG;
        this.a = kdoVar.c;
        this.b = kdoVar.d;
        this.c = kdoVar.e;
        this.d = kdoVar.b;
        List<uf> list = kdoVar.a;
        hin hinVar = kdoVar.f;
        int i = kdoVar.g;
        int i2 = kdoVar.m;
        boolean z = kdoVar.j;
        int i3 = kdoVar.l;
        if (list == null || list.isEmpty()) {
            int i4 = yfq.d;
            yfqVarG = yls.a;
        } else {
            yfl yflVar = new yfl(4);
            int i5 = 0;
            for (uf ufVar : list) {
                if (!(ufVar instanceof GridItem)) {
                    ((ype) ((ype) k.h()).ai((char) 2934)).u("Item in list is not a GridItem, dropping item");
                }
                kdh kdhVar = new kdh((GridItem) ufVar, i5);
                kdhVar.d = i;
                kdhVar.g = i2;
                kdhVar.e = z;
                kdhVar.f = i3;
                if (hinVar != null) {
                    kdhVar.c = hinVar;
                }
                yflVar.i(new kdi(kdhVar));
                i5++;
            }
            yfqVarG = yflVar.g();
        }
        this.e = yfqVarG;
        this.j = kdoVar.m;
        this.f = kdoVar.h;
        this.g = kdoVar.i;
        this.i = kdoVar.k;
        this.h = kdoVar.j;
    }

    public static kdo a(ItemList itemList) {
        if (itemList == null) {
            return new kdo();
        }
        List<uf> items = itemList.getItems();
        kdo kdoVar = new kdo();
        kdoVar.a = items;
        kdoVar.e = itemList.getNoItemsMessage();
        kdoVar.b = itemList.getOnItemVisibilityChangedDelegate();
        uy onSelectedDelegate = itemList.getOnSelectedDelegate();
        if (onSelectedDelegate != null) {
            kdoVar.f = new hin(0, items.size() - 1, itemList.getSelectedIndex(), onSelectedDelegate);
        }
        return kdoVar;
    }
}
