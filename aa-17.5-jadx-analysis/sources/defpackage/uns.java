package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class uns implements uiw, unz, uny {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/GlobalStyleTablesImpl");
    public static final ujk[] b = {null, null, null, null, ujk.d, ujk.n, ujk.u, null, ujk.a, null, null, ujk.z, null, null, null, ujk.x, ujk.y, null, ujk.G, null, ujk.A, null, ujk.j, ujk.l, null, ujk.c, null, ujk.b, ujk.B, null, ujk.H, ujk.C, ujk.D, null, null, null, null, ujk.k, ujk.p, null, null, null, null, ujk.w, ujk.E, ujk.F, ujk.f, ujk.g, ujk.I, ujk.J, ujk.e, ujk.o, ujk.v, ujk.s, ujk.t, ujk.m, null, ujk.q, ujk.h, ujk.i, ujk.r};
    private final AtomicLong A;
    private final tmb B;
    private final tsn C;
    private final uaj D;
    public final aezk c;
    public final ackk d;
    public final Set e;
    private final Runnable k;
    private final Consumer l;
    private final ackk m;
    private final ackk n;
    private final zgt o;
    private volatile ujk w;
    private final AtomicInteger x;
    private long y;
    private final Map z;
    private final AtomicInteger p = new AtomicInteger(-1);
    private final Object q = new Object();
    private final Set r = new HashSet();
    private int s = 0;
    private int t = 0;
    private int u = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    private final AtomicInteger v = new AtomicInteger(0);
    final Map j = new ConcurrentHashMap();

    public uns(Runnable runnable, xxh xxhVar, aezk aezkVar, tsn tsnVar, ackk ackkVar, ackk ackkVar2, zgt zgtVar, ackk ackkVar3, tmb tmbVar, uaj uajVar) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.x = atomicInteger;
        new AtomicInteger(0);
        this.y = 0L;
        this.z = new HashMap();
        this.A = new AtomicLong(0L);
        this.k = runnable;
        this.l = a$$ExternalSyntheticApiModelOutline3.m39m(xxhVar.e());
        this.c = aezkVar;
        this.C = tsnVar;
        this.m = ackkVar;
        this.n = ackkVar2;
        this.o = zgtVar;
        this.d = ackkVar3;
        this.w = null;
        atomicInteger.set(-1);
        this.e = new HashSet();
        this.B = tmbVar;
        this.D = uajVar;
    }

    private final unq m(int i) {
        unq unqVar = (unq) this.j.get(Integer.valueOf(i));
        if (unqVar == null) {
            abfu abfuVarB = ((uoa) this.d.a()).b(i);
            if (abfuVarB != null) {
                unqVar = new unq(abfuVarB, "disk");
            } else {
                try {
                } catch (IOException e) {
                    ((ynz) ((ynz) a.a(uys.a).p(e)).ai((char) 9472)).u("Error reading offline epoch resources");
                    this.v.incrementAndGet();
                }
                unqVar = null;
            }
            if (unqVar != null) {
                this.j.put(Integer.valueOf(i), unqVar);
            }
        }
        if (unqVar != null || i == -1) {
            return unqVar;
        }
        ((ynz) ((ynz) a.h()).ai(9473)).w("Could not find url for epoch %d", i);
        qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
        s();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String n(ujk ujkVar, String str, unq unqVar) {
        String str2;
        Map mapP = p(str, unqVar);
        if (mapP != null && (str2 = (String) mapP.get(ujkVar)) != null) {
            return str2;
        }
        qsb qsbVarH = ((zwm) this.c.a()).h();
        if (qsbVarH.p(str)) {
            return (String) unqVar.a.get(ujkVar);
        }
        if (!Objects.equals(str, "") && mapP == null && qsbVarH.q(ujkVar.L)) {
            return null;
        }
        return (String) unqVar.a.get(ujkVar);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    private final Map o() {
        HashMap map = new HashMap();
        aezk aezkVar = this.c;
        for (String str : ((zwm) aezkVar.a()).h().n().keySet()) {
            EnumMap enumMap = new EnumMap(ujk.class);
            Map mapN = ((zwm) aezkVar.a()).h().n();
            if (mapN.containsKey(str)) {
                for (Map.Entry entry : ((rjs) mapN.get(str)).a.entrySet()) {
                    int i = ((abgx) entry.getKey()).aj;
                    ujk[] ujkVarArr = b;
                    int length = ujkVarArr.length;
                    ujk ujkVar = ujkVarArr[i];
                    if (ujkVar != null) {
                        enumMap.put((EnumMap) ujkVar, (ujk) entry.getValue());
                    }
                }
            }
            map.put(str, enumMap);
        }
        return map;
    }

    private final Map p(String str, unq unqVar) {
        if (unqVar.g.isEmpty() || !unqVar.g.containsKey(str)) {
            unqVar.g = o();
        }
        return (Map) unqVar.g.get(str);
    }

    private final void q(unq unqVar, int i) {
        ((uoa) this.d.a()).f(unqVar, i, this);
    }

    private final void r(unq unqVar, int i, ujk ujkVar, abft abftVar, String str) {
        uns unsVar;
        boolean z = zwm.f().c;
        ackk ackkVar = this.d;
        if (z) {
            unsVar = this;
            ((uoa) ackkVar.a()).v(unqVar, i, abftVar, ujkVar, unsVar, str);
        } else {
            ((uoa) ackkVar.a()).v(unqVar, i, abftVar, ujkVar, this, "");
            unsVar = this;
        }
        qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
        unsVar.s();
    }

    private final void s() {
    }

    @Override // defpackage.uiw
    public final Map a(int i, String str) {
        unq unqVarM = m(i);
        if (unqVarM == null) {
            return null;
        }
        return p(str, unqVarM);
    }

    @Override // defpackage.uiw
    public final void c(uiu uiuVar) {
        synchronized (this.q) {
            this.r.add(uiuVar);
        }
        int i = this.p.get();
        if (i != -1) {
            uiuVar.t(i);
        }
    }

    @Override // defpackage.uiw
    public final void d() {
        AtomicInteger atomicInteger = this.p;
        if (atomicInteger.get() != -1) {
            qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
            atomicInteger.get();
            s();
        }
        aezk aezkVar = this.c;
        if (aezkVar.a() != null) {
            ((uoa) this.d.a()).o((zwm) aezkVar.a());
            h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uiw
    public final synchronized void f() {
        for (zgp zgpVar : ((uoa) this.d.a()).c()) {
            if (zgpVar.isDone()) {
                try {
                    qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
                    this.p.get();
                    s();
                    ((ukh) zgpVar.get()).h();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
    }

    @Override // defpackage.uiw
    public final void g() {
        unq unqVarM;
        if (!zwm.f().c || (unqVarM = m(this.p.get())) == null) {
            return;
        }
        unqVarM.g = o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("GlobalStyleTablesImpl:"));
        abgi abgiVarA = this.C.a();
        String str2 = abgiVarA.g;
        abfu abfuVar = abgiVarA.d;
        if (abfuVar == null) {
            abfuVar = abfu.a;
        }
        String strConcat = str.concat("  ");
        printWriter.println(strConcat + "Paint Parameters:  base url " + str2 + ", epoch " + abfuVar.b);
        synchronized (this.e) {
            printWriter.print(strConcat);
            printWriter.print("requestsMade=" + this.s);
            printWriter.print(" requestsNeedParameters=" + this.t);
            printWriter.print(" requestsFailEarly=" + this.u);
            printWriter.print(" requestsGotTable=" + this.f);
            printWriter.print(" requestsGotCommon=" + this.g);
            printWriter.print(" requestsSucceed=" + this.h);
            printWriter.print(" requestsError=" + this.i);
            printWriter.println();
        }
        printWriter.println(strConcat + "epochResourcesIOExceptions=" + this.v.get());
        printWriter.println(strConcat + "Latest requested legend: " + String.valueOf(this.w) + " at epoch " + this.x.toString());
        ygr ygrVarR = ygr.r(ujk.a, ujk.d, ujk.n, this.w != null ? this.w : ujk.a);
        Map map = this.j;
        for (Map.Entry entry : map.entrySet()) {
            printWriter.println(strConcat + "Epoch URLs for epoch " + String.valueOf(entry.getKey()) + " (source: " + ((unq) entry.getValue()).h + ")");
            yno it = ygrVarR.iterator();
            while (it.hasNext()) {
                ujk ujkVar = (ujk) it.next();
                printWriter.println(strConcat + "  " + String.valueOf(ujkVar) + " " + ((String) ((unq) entry.getValue()).a.get(ujkVar)));
            }
        }
        ((uoa) this.d.a()).e(strConcat, printWriter, map);
        for (Map.Entry entry2 : this.z.entrySet()) {
            if (entry2.getValue() != null) {
                printWriter.println(strConcat + "Epoch " + String.valueOf(entry2.getKey()) + " style table URLs unavailable time (ms): " + Duration.between((Temporal) entry2.getValue(), this.B.f()).toMillis());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, uiv] */
    @Override // defpackage.uiw
    public final void h() {
        boolean z;
        unq unqVar;
        uns unsVar;
        ygr ygrVarN;
        vaq.d();
        this.A.set(0L);
        abfu abfuVar = this.C.a().d;
        if (abfuVar == null) {
            abfuVar = abfu.a;
        }
        abfu abfuVar2 = abfuVar;
        vaq.d();
        int i = abfuVar2.b;
        if (i <= 0) {
            ((ynz) ((ynz) a.d()).ai(9475)).w("Current GMM server returns paint parameters with outdated epoch: %d. Try switching severs", i);
            return;
        }
        if (this.p.getAndSet(i) != i) {
            ((ynz) ((ynz) a.f()).ai(9480)).w("Current epoch is now %d", i);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            unqVar = null;
        } else {
            unq unqVarM = m(i);
            if (unqVarM == null || unqVarM.e != abfuVar2.hashCode()) {
                unqVar = unqVarM;
                z = true;
            } else {
                unqVar = unqVarM;
                z = false;
            }
        }
        if (z) {
            int i2 = abfuVar2.b;
            unq unqVar2 = new unq(abfuVar2, "network");
            this.j.put(Integer.valueOf(i2), unqVar2);
            unsVar = this;
            this.o.execute(new oa(unsVar, i2, abfuVar2, 19, null));
            synchronized (unsVar.q) {
                ygrVarN = ygr.n(unsVar.r);
            }
            yno it = ygrVarN.iterator();
            while (it.hasNext()) {
                ((uiu) it.next()).t(i);
            }
            unqVar = unqVar2;
        } else {
            unsVar = this;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Set set = unsVar.e;
        synchronized (set) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                xa xaVar = (xa) it2.next();
                if (xaVar.a) {
                    Object obj = xaVar.c;
                    if (((unr) obj).a == i) {
                        if (unqVar == null) {
                            unqVar = new unq(abfuVar2, "network");
                        }
                        ((unr) obj).f = unqVar.c;
                        ((unr) obj).g = unqVar.d;
                        arrayList2.add(xaVar);
                        xaVar.a = false;
                    } else {
                        it2.remove();
                        arrayList.add(xaVar);
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            xa xaVar2 = (xa) it3.next();
            unsVar.i++;
            xaVar2.b.H(null);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (unqVar == null) {
            unqVar = new unq(abfuVar2, "network");
        }
        unq unqVar3 = unqVar;
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            xa xaVar3 = (xa) it4.next();
            unsVar.s++;
            unsVar.q(unqVar3, i);
            Object obj2 = xaVar3.c;
            unsVar.r(unqVar3, i, ((unr) obj2).b, unqVar3.f, ((unr) obj2).c);
        }
    }

    @Override // defpackage.uiw
    public final void i(uiu uiuVar) {
        synchronized (this.q) {
            this.r.remove(uiuVar);
        }
    }

    @Override // defpackage.uiw
    public final void j() {
        int i = this.p.get();
        unq unqVarM = m(i);
        if (unqVarM != null) {
            unqVarM.g = o();
            uoa uoaVar = (uoa) this.d.a();
            unq unqVarM2 = m(i);
            unqVarM2.getClass();
            uoaVar.k(i, unqVarM2.f, unqVarM);
        }
    }

    @Override // defpackage.uiw
    public final boolean k(int i, ujk ujkVar, String str, uiv uivVar) {
        String str2;
        String strN;
        Duration durationBetween;
        this.w = ujkVar;
        int i2 = i == -1 ? this.p.get() : i;
        this.x.set(i2);
        unq unqVarM = m(i2);
        if (unqVarM != null) {
            unq unqVarM2 = m(i2);
            if (unqVarM2 == null) {
                ((ynz) a.a(uys.a).ai(9474)).D("Legend urls not found (getTableUrl) for epoch = %s, legend = %s", i2, ujkVar);
                str2 = str;
                strN = null;
            } else {
                str2 = str;
                strN = n(ujkVar, str2, unqVarM2);
            }
            String str3 = unqVarM.b;
            if (strN != null && str3 != null) {
                Set set = this.e;
                synchronized (set) {
                    this.s++;
                    set.add(new xa(new unr(i2, ujkVar, str2, strN, unqVarM.c, unqVarM.d), uivVar, false));
                }
                q(unqVarM, i2);
                int i3 = i2;
                r(unqVarM, i3, ujkVar, unqVarM.f, str);
                Map map = this.z;
                Integer numValueOf = Integer.valueOf(i3);
                if (map.containsKey(numValueOf)) {
                    Instant instant = (Instant) map.remove(numValueOf);
                    durationBetween = instant != null ? Duration.between(instant, this.B.f()) : null;
                    if (durationBetween != null) {
                        qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
                        s();
                        durationBetween.toMillis();
                    }
                }
                return true;
            }
            this.u++;
            return false;
        }
        yob yobVar = a;
        ((ynz) ((ynz) yobVar.h()).ai(9478)).w("urls for epoch %d not available.", i2);
        if (i2 != -1) {
            ynz ynzVar = (ynz) ((ynz) yobVar.h()).ai(9479);
            Integer numValueOf2 = Integer.valueOf(i2);
            ynzVar.R("Missing style tables for epoch %d and legend %s. currentEpoch %d", numValueOf2, ujkVar.name(), Integer.valueOf(this.p.get()));
            Map map2 = this.z;
            if (map2.containsKey(numValueOf2)) {
                Instant instant2 = (Instant) map2.get(numValueOf2);
                durationBetween = instant2 != null ? Duration.between(instant2, this.B.f()) : null;
                if (durationBetween != null && ysi.c(Duration.ofSeconds(30L), durationBetween)) {
                    qbs qbsVar2 = qbs.AUTO_PAN_MODE_ENABLED;
                    s();
                    durationBetween.toMillis();
                }
            } else {
                map2.put(numValueOf2, this.B.f());
            }
            Set set2 = this.e;
            synchronized (set2) {
                this.t++;
                set2.add(new xa(new unr(i2, ujkVar, str, null, null, null), uivVar, true));
            }
            tmb tmbVar = this.B;
            AtomicLong atomicLong = this.A;
            long jA = tmbVar.a();
            long j = atomicLong.get();
            if (jA >= this.y + j) {
                this.y = jA;
                if (atomicLong.compareAndSet(j, Math.min(180000L, Math.max(j + j, 5000L)))) {
                    Consumer consumer = this.l;
                    if (consumer != null) {
                        consumer.accept(pqj.b);
                    } else {
                        this.k.run();
                    }
                    uaj uajVar = this.D;
                    if (uajVar != null && uajVar.g()) {
                    }
                }
            }
            return true;
        }
        this.u++;
        return false;
    }

    @Override // defpackage.uiw
    public final boolean l(int i, ujk ujkVar, String str) {
        unq unqVarM = m(i);
        return unqVarM == null || n(ujkVar, str, unqVarM) == null;
    }

    @Override // defpackage.uiw
    public final void e() {
    }
}
