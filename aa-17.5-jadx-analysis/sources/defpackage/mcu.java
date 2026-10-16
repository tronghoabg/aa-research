package defpackage;

import android.content.Intent;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class mcu extends nyh {
    public static final mct a = new mct();
    public static final yph b = yph.c("GH.OEMAppProvider");
    public static final afgl c = new kkp(mki.b, 13);
    private boolean d;

    public mcu() {
        super("OEM");
    }

    @Override // defpackage.nyh
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        qrnVar.getClass();
        Stream streamSorted = Collection.EL.stream(mjv.b().b(qrnVar, new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_OEM"), rji.a)).sorted(Comparator.CC.comparing(new lpc(new eyr((Object) this, 14, (char[][][]) null), 4), zdd.TRUE_FIRST));
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        Stream map = streamSorted.filter(new lou(setNewSetFromMap, 14)).map(new lpc(new lti(18), 5));
        map.getClass();
        Stream streamFilter = map.filter(new lou(new lti(17), 15));
        streamFilter.getClass();
        Stream map2 = streamFilter.filter(new lou(new mcm(qrnVar, 5), 16)).map(new lpc(new lti(19), 6));
        int i = yfq.d;
        Object objCollect = map2.collect(ycm.a);
        objCollect.getClass();
        yfq yfqVar = (yfq) objCollect;
        if (!this.d) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.OEM_FACET, yzy.qZ);
            ArrayList arrayList = new ArrayList(woy.bp(yfqVar, 10));
            Iterator<E> it = yfqVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((mqc) it.next()).a());
            }
            rrbVarH.q(arrayList);
            ohsVarJ.F(rrbVarH.l());
            this.d = true;
        }
        ((ype) b.f()).y("OemAppProvider.getApps: %s", yfqVar);
        return yfqVar;
    }
}
