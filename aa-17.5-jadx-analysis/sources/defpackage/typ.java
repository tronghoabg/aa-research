package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class typ implements tqv, ujd, ush, uml {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/StylesImpl");
    static final tpx b;
    static final tqo c;
    static final tym d;
    public final tyt e;
    public final tyh g;
    public final tyo h;
    public final AtomicReference i;
    public final List j;
    private final boolean l;
    private final boolean m;
    private final Map n;
    private final ycc o;
    private final AtomicInteger k = new AtomicInteger(3);
    public final Object f = new Object();

    static {
        tyi tyiVar = new tyi();
        b = tyiVar;
        c = tyiVar;
        d = new tym();
    }

    public typ(gjv gjvVar, upr uprVar, boolean z, boolean z2, erb erbVar, zgt zgtVar) {
        HashMap map = new HashMap();
        this.n = map;
        new SparseArray();
        this.j = DesugarCollections.synchronizedList(new ArrayList());
        this.o = new yey();
        this.i = new AtomicReference();
        this.e = new tyt(gjvVar, uprVar, erbVar, zgtVar);
        this.m = z;
        this.l = z2;
        tyh tyhVar = new tyh(this, "GMM-CLIENT-INJECTED-STYLE-NAMESPACE", 1, z);
        this.g = tyhVar;
        map.put(1, tyhVar);
        tyo tyoVar = new tyo(this);
        this.h = tyoVar;
        map.put(2, tyoVar);
    }

    static final ukf r(int i, wnq wnqVar, aekf aekfVar) {
        return ((ukh) wnqVar.c).d(i, aekfVar, (ukj) ((rhj) wnqVar.e).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final usf s(Bitmap bitmap, usg usgVar) {
        usf usfVar;
        synchronized (this.f) {
            usfVar = bitmap == null ? null : (usf) this.o.get(new tyj(bitmap, usgVar));
        }
        return usfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void t(tyj tyjVar) {
        usr usrVar;
        synchronized (this.f) {
            usg usgVar = tyjVar.b;
            if (usgVar == usg.WRAP_T) {
                Bitmap bitmapE = tyjVar.a;
                if (!this.l) {
                    bitmapE = uuz.e(bitmapE, Bitmap.Config.ARGB_8888, true);
                }
                usrVar = new usr(bitmapE);
            } else {
                usrVar = new usr(tyjVar.a);
            }
            ycc yccVar = this.o;
            boolean zContainsKey = yccVar.containsKey(tyjVar);
            tyt tytVar = this.e;
            ((yey) yccVar).j(tyjVar, zContainsKey ? tytVar.b((usf) yccVar.get(tyjVar), usrVar) : tytVar.a(usgVar, usrVar));
        }
    }

    @Override // defpackage.tqv
    public final tqo a(int i, int i2, tqo tqoVar) {
        return this.g.g(null, i, i2, tqoVar);
    }

    @Override // defpackage.tqv
    public final tqo b(int i, List list) {
        List listN = n(list);
        ygp ygpVar = new ygp();
        tyh tyhVar = this.g;
        int andIncrement = tyhVar.c.getAndIncrement();
        uke[] ukeVarArr = new uke[listN.size()];
        for (int i2 = 0; i2 < listN.size(); i2++) {
            tvn tvnVar = (tvn) listN.get(i2);
            usf usfVar = tvnVar.b;
            if (usfVar != null) {
                ygpVar.c(usfVar);
            }
            usf usfVar2 = tvnVar.c;
            if (usfVar2 != null) {
                ygpVar.c(usfVar2);
            }
            usf usfVar3 = tvnVar.d;
            if (usfVar3 != null) {
                ygpVar.c(usfVar3);
            }
            ukeVarArr[i2] = uke.b(tvnVar.a, null, usfVar, usfVar2, usfVar3);
        }
        ujf ujfVar = ujf.c;
        uje ujeVar = new uje();
        ujeVar.k = ukeVarArr;
        ujeVar.v = i;
        txk txkVarE = tyhVar.e(new ujf(ujeVar), andIncrement, ygpVar.g());
        txkVarE.h(true);
        return txkVarE;
    }

    @Override // defpackage.tqv
    public final tqt c(String str) {
        int andIncrement = this.k.getAndIncrement();
        tyh tyhVar = new tyh(this, str, andIncrement, this.m);
        Map map = this.n;
        synchronized (map) {
            map.put(Integer.valueOf(andIncrement), tyhVar);
        }
        return tyhVar;
    }

    @Override // defpackage.tqv
    public final void d(tqu tquVar) {
        abgx abgxVar;
        wnq wnqVar = (wnq) this.i.get();
        if (wnqVar != null && (abgxVar = ((ujk) wnqVar.d).L) != null) {
            tquVar.gq(abgxVar, wnqVar.a);
        }
        this.j.add(tquVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tqv
    public final void e(tqo tqoVar) {
        if (tqoVar instanceof txk) {
            txk txkVar = (txk) tqoVar;
            synchronized (this.f) {
                yno it = txkVar.g(yly.a).iterator();
                while (it.hasNext()) {
                    usf usfVar = (usf) it.next();
                    if (this.e.j(usfVar)) {
                        ycc yccVar = this.o;
                        yccVar.remove(yccVar.a().get(usfVar));
                    }
                }
            }
            tyh tyhVar = txkVar.d;
            vaq.d();
            if (tqoVar instanceof txk) {
                txk txkVar2 = (txk) tqoVar;
                tyh tyhVar2 = txkVar2.d;
                woy.W(tyhVar2 == tyhVar, "[%s] was told to destroy a style from namespace [%s]", tyhVar.d, tyhVar2.d);
                aeoa aeoaVar = tyhVar.b;
                synchronized (aeoaVar) {
                    long jA = txkVar2.a();
                    if (aeoaVar.c(jA)) {
                        aeoaVar.b(jA);
                        txkVar2.e();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tqv
    public final void f(tqt tqtVar) {
        p(tqtVar);
        vaq.d();
        aeoa aeoaVar = ((tyh) tqtVar).b;
        synchronized (aeoaVar) {
            aety it = aeoaVar.values().iterator();
            while (it.hasNext()) {
                ((txk) it.next()).e();
            }
            aeoaVar.clear();
        }
    }

    @Override // defpackage.tqv
    public final void g(tqu tquVar) {
        this.j.remove(tquVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uml
    public final void gp() {
        vaq.d();
        Map map = this.n;
        synchronized (map) {
            for (tqt tqtVar : map.values()) {
                if (tqtVar instanceof tyh) {
                    tyh tyhVar = (tyh) tqtVar;
                    vaq.d();
                    aeoa aeoaVar = tyhVar.b;
                    synchronized (aeoaVar) {
                        aety it = ((aeod) aeoaVar.values()).iterator();
                        while (it.hasNext()) {
                            txk txkVar = (txk) it.next();
                            if (txkVar instanceof twg) {
                                twg twgVar = (twg) txkVar;
                                vaq.d();
                                synchronized (twgVar) {
                                    twgVar.f = false;
                                    twgVar.a.o(twgVar, true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.tqv
    public final tqo h(Bitmap bitmap, int i) {
        usg usgVar = usg.NO_WRAP;
        t(new tyj(bitmap, usgVar));
        return this.g.g(s(bitmap, usgVar), 0, i, null);
    }

    @Override // defpackage.ujd
    public final tqt i(ukh ukhVar) {
        int andIncrement = this.k.getAndIncrement();
        tyl tylVar = new tyl(andIncrement, ukhVar);
        Map map = this.n;
        synchronized (map) {
            map.put(Integer.valueOf(andIncrement), tylVar);
        }
        return tylVar;
    }

    final ujx j(int i) {
        Map map = this.n;
        synchronized (map) {
            Integer numValueOf = Integer.valueOf(i);
            if (!map.containsKey(numValueOf)) {
                return d;
            }
            tqt tqtVar = (tqt) map.get(numValueOf);
            if (tqtVar instanceof ujx) {
                return (ujx) tqtVar;
            }
            return d;
        }
    }

    final ukf k(long j) {
        ukh ukhVarL = l();
        if (ukhVarL != null) {
            return ukhVarL.c(j);
        }
        ((ynz) ((ynz) a.h()).ai(9209)).x("Styles aren't loaded, so could not retrieve legend style %d", j);
        return ukf.a;
    }

    final ukh l() {
        wnq wnqVar = (wnq) this.i.get();
        if (wnqVar != null) {
            return (ukh) wnqVar.c;
        }
        return null;
    }

    @Override // defpackage.ush
    public final uwc m(usf usfVar) {
        uwc uwcVarC;
        uwc uwcVarC2;
        synchronized (this.f) {
            uwcVarC = this.e.c(usfVar);
        }
        if (usfVar.a() || uwcVarC != null) {
            return uwcVarC;
        }
        synchronized (this.f) {
            tyt tytVar = this.e;
            tytVar.e(usfVar);
            uwcVarC2 = tytVar.c(usfVar);
        }
        return uwcVarC2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List n(List list) {
        woy.O(!list.isEmpty(), "There should be at least one bitmap line definition");
        woy.O(list.size() < 4, String.format(Locale.US, "There should be less than %d bitmap line definitions", 4));
        synchronized (this.f) {
            ygp ygpVar = new ygp();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tpq tpqVar = (tpq) it.next();
                Bitmap bitmap = tpqVar.b;
                if (bitmap != null) {
                    ygpVar.c(new tyj(bitmap, usg.WRAP_T));
                }
                Bitmap bitmap2 = tpqVar.c;
                if (bitmap2 != null) {
                    ygpVar.c(new tyj(bitmap2, usg.NO_WRAP));
                }
                Bitmap bitmap3 = tpqVar.d;
                if (bitmap3 != null) {
                    ygpVar.c(new tyj(bitmap3, usg.NO_WRAP));
                }
            }
            yno it2 = ygpVar.g().iterator();
            while (it2.hasNext()) {
                t((tyj) it2.next());
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        synchronized (this.f) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                tpq tpqVar2 = (tpq) it3.next();
                usf usfVarS = s(tpqVar2.b, usg.WRAP_T);
                Bitmap bitmap4 = tpqVar2.c;
                usg usgVar = usg.NO_WRAP;
                arrayList.add(new tvn(tpqVar2.a, usfVarS, s(bitmap4, usgVar), s(tpqVar2.d, usgVar)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(txk txkVar, boolean z) {
        ygr ygrVarF = txkVar.f();
        if (z) {
            txkVar.h(false);
        }
        if (ygrVarF.isEmpty()) {
            txkVar.h(true);
            return;
        }
        tyk tykVar = new tyk(this, txkVar, ygrVarF.size());
        synchronized (this.f) {
            yno it = ygrVarF.iterator();
            while (it.hasNext()) {
                usf usfVar = (usf) it.next();
                if (z) {
                    this.e.i(usfVar);
                }
                this.e.f(usfVar, tykVar);
            }
            yno it2 = txkVar.g(ygrVarF).iterator();
            while (it2.hasNext()) {
                this.e.j((usf) it2.next());
            }
        }
    }

    public final void p(tqt tqtVar) {
        Map map = this.n;
        synchronized (map) {
            map.remove(Integer.valueOf(tqtVar.a()));
        }
    }

    public final wnq q() {
        return (wnq) this.i.get();
    }
}
