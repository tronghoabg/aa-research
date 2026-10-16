package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hjj {
    public static final dhs a;
    public static final die b;
    private static final List c;

    static {
        List<aezu> listBi = woy.bi(new aezu(die.d, new dhx(0)), new aezu(die.e, new dhx(0)), new aezu(die.f, new dhx(0)), new aezu(die.g, new dhx(0)), new aezu(die.h, new dhx(0)), new aezu(die.i, new dhx(0)));
        c = listBi;
        ArrayList arrayList = new ArrayList();
        for (aezu aezuVar : listBi) {
            die dieVar = (die) aezuVar.a;
            int i = ((dhx) aezuVar.b).a;
            int i2 = did.a;
            dic dicVarC = did.c(dieVar, i, new dia("opsz", 17.0f));
            dhp.a("google-sans-text");
            arrayList.add(new dhq("google-sans-text", dieVar, i, dicVarC));
        }
        a = new dhv(arrayList);
        b = die.l;
    }
}
