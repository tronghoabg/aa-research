package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class goy {
    public static final void a(gow gowVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bxf bxfVarJ;
        gox goxVar;
        bux buxVarC = buxVar.c(643939259);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gowVar) : buxVarC.E(gowVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        boolean z2 = false;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            List list = gowVar.a;
            if (list.isEmpty()) {
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    goxVar = new gox(gowVar, cfyVar, i, 0);
                    bxfVarJ.c = goxVar;
                }
                return;
            }
            if (((buxVarC.f(dbc.i) == dlr.a && ((hjo) buxVarC.f(hjp.a)).a(hjn.b, hjm.b)) ? 2 : gowVar.b) - 1 != 0) {
                buxVarC.v(-2023567883);
                ctp ctpVarA = atp.a(atd.g(gux.e(buxVarC).b.f), cfl.k, buxVarC, 48);
                bvv bvvVar = (bvv) buxVarC;
                int iG = a.g(bvvVar.u);
                ccx ccxVarAh = bvvVar.ah();
                cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
                afdr afdrVar = cwb.a;
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA, cwb.e);
                byq.c(buxVarC, ccxVarAh, cwb.d);
                byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
                byq.b(buxVarC, cwb.g);
                byq.c(buxVarC, cfyVarJ, cwb.c);
                buxVarC.v(-2129387868);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    fwl.a((fwm) it.next(), null, null, false, null, null, null, null, buxVarC, 8, 254);
                    z2 = z2;
                    bvvVar = bvvVar;
                    it = it;
                    z = true;
                }
                bvv bvvVar2 = bvvVar;
                boolean z3 = z2;
                bvvVar2.Y(z3);
                bvvVar2.Y(true);
                bvvVar2.Y(z3);
            } else {
                buxVarC.v(-2023935760);
                cfy cfyVarR = awd.r(cfyVar);
                ctp ctpVarA2 = avv.a(atd.h(gux.e(buxVarC).a.f, cfl.l), cfl.n, buxVarC, 48);
                bvv bvvVar3 = (bvv) buxVarC;
                int iG2 = a.g(bvvVar3.u);
                ccx ccxVarAh2 = bvvVar3.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarR);
                afdr afdrVar2 = cwb.a;
                buxVarC.w();
                if (bvvVar3.t) {
                    buxVarC.j(afdrVar2);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA2, cwb.e);
                byq.c(buxVarC, ccxVarAh2, cwb.d);
                byq.c(buxVarC, Integer.valueOf(iG2), cwb.f);
                byq.b(buxVarC, cwb.g);
                byq.c(buxVarC, cfyVarJ2, cwb.c);
                buxVarC.v(558685545);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    fwl.a((fwm) it2.next(), null, null, false, null, null, null, null, buxVarC, 8, 254);
                    z = true;
                }
                bvvVar3.Y(false);
                bvvVar3.Y(true);
                bvvVar3.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            goxVar = new gox(gowVar, cfyVar, i, 2);
            bxfVarJ.c = goxVar;
        }
    }

    public static final int b(int i) {
        if (i == 2) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 8) {
            return i != 16 ? 2 : 3;
        }
        return 1;
    }

    public static final hal c(GridTemplate gridTemplate, geu geuVar) {
        int i;
        List arrayList;
        List<uf> items;
        int i2;
        int itemSize = gridTemplate.getItemSize();
        if (itemSize != 1) {
            if (itemSize != 2) {
                i2 = 4;
                if (itemSize != 4) {
                    throw new IllegalArgumentException(a.bp(itemSize, "Invalid GridTemplate item size: "));
                }
            } else {
                i2 = 3;
            }
            i = i2;
        } else {
            i = 2;
        }
        ItemList singleList = gridTemplate.getSingleList();
        CarText noItemsMessage = singleList != null ? singleList.getNoItemsMessage() : null;
        int itemImageShape = gridTemplate.getItemImageShape();
        int i3 = (itemImageShape == 1 || itemImageShape != 2) ? 1 : 2;
        ItemList singleList2 = gridTemplate.getSingleList();
        if (singleList2 == null || (items = singleList2.getItems()) == null) {
            arrayList = afbe.a;
        } else {
            arrayList = new ArrayList(woy.bp(items, 10));
            for (uf ufVar : items) {
                ufVar.getClass();
                arrayList.add(gnz.c((GridItem) ufVar, geuVar));
            }
        }
        List list = arrayList;
        ItemList singleList3 = gridTemplate.getSingleList();
        return new hal(null, noItemsMessage, i, i3, singleList3 != null ? grv.c(singleList3, geuVar) : null, list, 131);
    }
}
