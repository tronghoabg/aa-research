package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ksu {
    public static final dhs a;
    public static final dhs b;
    public static final dhs c;
    public static final dhs d;
    public static final die e;
    public static final die f;
    private static final dio g = new dio();
    private static final List h;

    static {
        List<aezu> listBi = woy.bi(new aezu(die.a, new dhx(0)), new aezu(die.b, new dhx(0)), new aezu(die.c, new dhx(0)), new aezu(die.d, new dhx(0)), new aezu(die.e, new dhx(0)), new aezu(die.f, new dhx(0)), new aezu(die.g, new dhx(0)), new aezu(die.h, new dhx(0)), new aezu(die.i, new dhx(0)));
        h = listBi;
        ArrayList arrayList = new ArrayList();
        for (aezu aezuVar : listBi) {
            die dieVar = (die) aezuVar.a;
            int i = ((dhx) aezuVar.b).a;
            dhp.a("google-sans");
            woy.cq(arrayList, woy.bi(dao.l("google-sans", dieVar, i), dap.v(new kwp("Google Sans"), g, dieVar, i)));
        }
        a = new dhv(arrayList);
        List<aezu> list = h;
        b = new dhv(a(list, BitmapDescriptorFactory.HUE_RED));
        ArrayList arrayList2 = new ArrayList();
        for (aezu aezuVar2 : list) {
            die dieVar2 = (die) aezuVar2.a;
            int i2 = ((dhx) aezuVar2.b).a;
            int i3 = did.a;
            dic dicVarC = did.c(dieVar2, i2, new dia("opsz", 17.0f));
            dhp.a("google-sans-text");
            woy.cq(arrayList2, woy.bi(new dhq("google-sans-text", dieVar2, i2, dicVarC), dap.v(new kwp("Google Sans Text"), g, dieVar2, i2)));
        }
        new dhv(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (aezu aezuVar3 : h) {
            die dieVar3 = (die) aezuVar3.a;
            int i4 = ((dhx) aezuVar3.b).a;
            dhp.a("sans-serif");
            List listSingletonList = Collections.singletonList(dao.l("sans-serif", dieVar3, i4));
            listSingletonList.getClass();
            woy.cq(arrayList3, listSingletonList);
        }
        c = new dhv(arrayList3);
        d = new dhv(a(h, 100.0f));
        e = die.m;
        f = die.l;
    }

    private static final List a(List list, float f2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aezu aezuVar = (aezu) it.next();
            die dieVar = (die) aezuVar.a;
            int i = ((dhx) aezuVar.b).a;
            int i2 = dieVar.o;
            int i3 = did.a;
            dic dicVar = new dic(did.a(i2), new dia("wdth", 100.0f), new dia("ROND", f2));
            dhp.a("google-sans-flex");
            dhp.a("google-sans");
            woy.cq(arrayList, woy.bi(new dhq("google-sans-flex", dieVar, i, dicVar), new dii(R.font.google_sans_flex, dieVar, i, dicVar), dao.l("google-sans", dieVar, i), dap.v(new kwp("Google Sans"), g, dieVar, i)));
        }
        return arrayList;
    }
}
