package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class lup extends nyh implements lhg, lul {
    public static final /* synthetic */ int d = 0;
    private static final yph e = yph.c("GH.MsgAppProvider");
    public yfy a;
    public final luq b;
    public final luq c;
    private final luo f;
    private final luq g;
    private final luq h;

    public lup() {
        super("Messaging");
        this.f = new luo();
        this.b = new lus();
        this.c = new lur();
        this.g = new lut();
        this.h = new lum(mki.a.c);
    }

    public static lup e() {
        return (lup) mki.a.b(lup.class, new lfu(3));
    }

    static void f(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentName componentName = (ComponentName) it.next();
            if (!map.containsKey(componentName.getPackageName())) {
                map.put(componentName.getPackageName(), componentName);
            }
        }
    }

    public static final boolean k(ComponentName componentName) {
        return kmo.c(actg.b(), componentName.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final yfy o(qrn qrnVar, nyj nyjVar) {
        yfy yfyVar;
        HashMap map = new HashMap();
        if (nyjVar.equals(nyj.a()) && (yfyVar = this.a) != null) {
            return yfyVar;
        }
        if (actj.k()) {
            f(map, this.b.b(qrnVar, nyjVar).d());
            ((ype) e.l().ai((char) 4274)).w("Added messaging apps with service intent filter; have a total of %d", map.size());
        }
        luq luqVar = this.c;
        f(map, luqVar.b(qrnVar, nyjVar).d());
        yph yphVar = e;
        ((ype) yphVar.l().ai(4270)).K("Added notification messaging apps (%s); have a total of %d", luqVar.getClass().getSimpleName(), map.size());
        f(map, this.g.b(qrnVar, nyj.b()).d());
        ((ype) yphVar.l().ai(4271)).w("Added SMS apps; have a total of %d", map.size());
        if (!map.isEmpty() && actj.u()) {
            mkc mkcVarB = mjv.b();
            Intent intent = new Intent("androidx.car.app.CarAppService");
            qpi qpiVar = qpi.h;
            nyi nyiVar = nyi.b;
            yfq yfqVarN = n(mkcVarB.c(qrnVar, new nyk(intent, qpiVar, nyjVar.c(new ymp(nyiVar)))));
            yfq yfqVarN2 = n(mjv.b().c(qrnVar, new nyk(new Intent("androidx.car.app.CarAppService").addCategory("androidx.car.app.category.SETTINGS"), qpiVar, nyjVar.c(new ymp(nyiVar)))));
            yfq yfqVarN3 = n(mjv.b().c(qrnVar, new nyk(new Intent("android.media.browse.MediaBrowserService"), qpi.c, nyjVar.c(new ymp(nyiVar)))));
            HashSet hashSet = new HashSet();
            int i = ((yls) yfqVarN).c;
            for (int i2 = 0; i2 < i; i2++) {
                ComponentName componentName = (ComponentName) yfqVarN.get(i2);
                if (!yfqVarN2.contains(componentName)) {
                    hashSet.add(componentName.getPackageName());
                }
            }
            HashSet hashSet2 = new HashSet();
            int i3 = ((yls) yfqVarN3).c;
            for (int i4 = 0; i4 < i3; i4++) {
                hashSet2.add(((ComponentName) yfqVarN3.get(i4)).getPackageName());
            }
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (hashSet.contains(str)) {
                    ((ype) ((ype) yphVar.f()).ai((char) 4273)).y("Suppressing Messaging app %s because CAL app is present", entry.getValue());
                } else if (hashSet2.contains(str)) {
                    ((ype) ((ype) yphVar.f()).ai((char) 4272)).y("Suppressing Messaging app %s because MBS app is present", entry.getValue());
                } else {
                    map2.put(str, (ComponentName) entry.getValue());
                }
            }
            map = map2;
        }
        if (!nyjVar.equals(nyj.a())) {
            return yfy.j(map);
        }
        yfy yfyVarJ = yfy.j(map);
        this.a = yfyVarJ;
        return yfyVarJ;
    }

    public final ComponentName a(String str) {
        yfy yfyVarO = o(kio.b().e(), nyj.a());
        if (yfyVarO.containsKey(str)) {
            return (ComponentName) yfyVarO.get(str);
        }
        throw new IllegalArgumentException(a.bq(str, "Package ", " not found."));
    }

    @Override // defpackage.nyh
    @ResultIgnorabilityUnspecified
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        Stream map = Collection.EL.stream(o(qrnVar, nyjVar).values()).map(new lka(19));
        int i = yfq.d;
        return (yfq) map.collect(ycm.a);
    }

    @Override // defpackage.lhg
    public final void c() {
        this.a = null;
        this.b.c();
        mnc.a().b(mnb.m, this.f);
    }

    @Override // defpackage.lhg
    public final void d() {
        this.b.c();
        mnc.a().d(mnb.m);
    }

    public final boolean g(ComponentName componentName) {
        Stream streamDistinct = Collection.EL.stream(this.h.b(kio.b().e(), nyj.b())).map(new lka(18)).distinct();
        int i = yfq.d;
        return ((yfq) streamDistinct.collect(ycm.a)).contains(componentName.getPackageName());
    }

    public final boolean i(String str) {
        return o(kio.b().e(), nyj.a()).containsKey(str);
    }

    public final boolean j(qrn qrnVar, ComponentName componentName) {
        return this.g.b(qrnVar, nyj.b()).contains(componentName);
    }
}
