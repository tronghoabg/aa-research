package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ugy implements uoq {
    private static final yob n = yob.c("com/google/android/libraries/geo/mapcore/internal/legacy/vector/fetch/TileFetcher");
    private static final uii o = new uib();
    private static final String p = new tox("m", abgl.GMM_VECTOR_BASE).b;
    private final tpa K;
    private final ackk L;
    private tqa M;
    private final tzt N;
    private volatile aacq O;
    public ttv a;
    public volatile uly b;
    public final tox d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final tmb h;
    public final Executor i;
    public ufs l;
    public final uvg m;
    private final ugq q;
    private final uor s;
    private final uiw t;
    private volatile String v;
    private volatile ygr w;
    private final ukr y;
    private final Executor z;
    private final Map r = new LinkedHashMap();
    private volatile uij u = null;
    private final Set x = new HashSet();
    public final Map c = new HashMap();
    private int A = 0;
    private int B = 0;
    private final AtomicInteger C = new AtomicInteger(0);
    private final AtomicInteger D = new AtomicInteger(0);
    private final AtomicInteger E = new AtomicInteger(0);
    private final AtomicInteger F = new AtomicInteger(0);
    private final AtomicInteger G = new AtomicInteger(0);
    public long j = 0;
    private long H = 0;
    public volatile boolean k = true;
    private final AtomicBoolean I = new AtomicBoolean(true);
    private final AtomicBoolean J = new AtomicBoolean(true);

    public ugy(uvg uvgVar, ackk ackkVar, uiw uiwVar, tox toxVar, ukr ukrVar, uor uorVar, boolean z, int i, boolean z2, tzt tztVar, ugq ugqVar, tmb tmbVar, Executor executor, tpa tpaVar, uly ulyVar, aacq aacqVar, String str, ygr ygrVar) {
        this.m = uvgVar;
        this.L = ackkVar;
        this.t = uiwVar;
        this.d = toxVar;
        this.y = ukrVar;
        this.s = uorVar;
        this.e = z;
        this.f = i;
        this.g = z2;
        this.N = tztVar;
        this.q = ugqVar;
        this.h = tmbVar;
        this.z = executor;
        this.K = tpaVar;
        this.b = ulyVar;
        this.O = aacqVar;
        this.w = ygrVar;
        this.v = z(str, ygrVar);
        this.i = executor;
    }

    private final void A(uij uijVar) {
        vaq.d();
        if (uijVar != null) {
            this.q.e(uijVar);
        }
        Map map = this.r;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((uii) it.next()).t();
            }
            map.clear();
        }
    }

    private final boolean B() {
        return this.J.get() && !this.K.j(h());
    }

    public static boolean t(tox toxVar) {
        return p.equals(toxVar.b);
    }

    private static String z(String str, ygr ygrVar) {
        return ygrVar.contains(str) ? str : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        if (r1.u.booleanValue() != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015b, code lost:
    
        r5 = ((defpackage.abmt) r2).v();
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    @Override // defpackage.uoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ukp r13, defpackage.uop r14, defpackage.uko r15) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugy.a(ukp, uop, uko):void");
    }

    public final synchronized tqa b() {
        return this.M;
    }

    public final ugy c(ukr ukrVar, uor uorVar) {
        return new ugy(this.m, this.L, this.t, this.d, ukrVar, uorVar, this.e, this.f, this.g, this.N, this.q, this.h, this.z, this.K, this.b, this.O, this.v, this.w);
    }

    public final uii d(ukp ukpVar, long j, uij uijVar) {
        uii uiiVarD;
        if (uijVar == null || (uiiVarD = this.q.d(uijVar, ukpVar, false, j)) == o) {
            return null;
        }
        if (uiiVarD == null) {
            Map map = this.r;
            synchronized (map) {
                uiiVarD = (uii) map.get(ukpVar);
            }
            if (uiiVarD == null) {
                return null;
            }
            if (!Objects.equals(uiiVarD.n(), uijVar)) {
                ugt ugtVar = new ugt(ukpVar, true);
                uqw.d();
                w(ugtVar);
            }
            uiiVarD.q();
        }
        if (uiiVarD.y() && !uiiVarD.x(j)) {
            return uiiVarD;
        }
        uiiVarD.t();
        return null;
    }

    public final uij e() {
        if (this.u == null) {
            synchronized (this) {
                if (this.u == null) {
                    r();
                }
            }
        }
        return this.u;
    }

    public final ujk f() {
        return this.b.b;
    }

    @ResultIgnorabilityUnspecified
    public final uop g(ugt ugtVar, abad abadVar) {
        vaq.d();
        uij uijVarE = e();
        uih uihVar = null;
        if (uijVarE != null) {
            ugq ugqVar = this.q;
            ukp ukpVar = ugtVar.a;
            uih uihVarC = ugqVar.c(uijVarE, ukpVar, true);
            if (uihVarC == null) {
                Map map = this.r;
                synchronized (map) {
                    uihVarC = (uih) map.get(ukpVar);
                }
            }
            if (uihVarC == null || !uihVarC.x(this.h.a())) {
                uihVar = uihVarC;
            }
        }
        if (uihVar == null) {
            w(ugtVar);
            return uop.NOT_FOUND_LOCALLY;
        }
        boolean z = !this.K.i(uihVar.a()) && uihVar.B(this.h);
        if (!Objects.equals(uihVar.n(), uijVarE) || z) {
            if (ugtVar.b) {
                ugtVar = new ugt(ugtVar.a, false, ugtVar.c, ugtVar.d, ugtVar.e);
            }
            w(ugtVar);
        }
        return uihVar == o ? uop.NOT_EXIST : uop.OK;
    }

    public final abgl h() {
        return this.s.c();
    }

    public final void i() {
        vaq.d();
        Map map = this.c;
        synchronized (map) {
            map.clear();
        }
    }

    public final void j() {
        A(e());
    }

    public final void k(ugt ugtVar, boolean z, abad abadVar) {
        int i;
        if (this.a == null) {
            return;
        }
        ukp ukpVar = ugtVar.a;
        if (ukpVar.a < ugtVar.c) {
            return;
        }
        while (true) {
            ukp ukpVarB = this.a.b(ukpVar, ugtVar.e);
            if (ukpVarB == null || ukpVarB.a < (i = ugtVar.c)) {
                return;
            }
            boolean z2 = true;
            if (!ugtVar.d && !z) {
                z2 = false;
            }
            boolean z3 = z2;
            if (g(new ugt(ukpVarB, z3, i, z3, ugtVar.e), abadVar) != uop.NOT_EXIST) {
                return;
            } else {
                ukpVar = ukpVarB;
            }
        }
    }

    public final void l(ukp ukpVar, boolean z) {
        if (z) {
            Map map = this.c;
            synchronized (map) {
                map.remove(ukpVar);
            }
        }
    }

    public final void m() {
        vaq.d();
        uij uijVarE = e();
        if (uijVarE == null) {
            return;
        }
        Set set = this.x;
        synchronized (set) {
            set.add(uijVarE);
        }
    }

    public final synchronized void n(String str, ygr ygrVar) {
        this.w = ygrVar;
        String strZ = z(str, ygrVar);
        if (strZ.equals(this.v)) {
            return;
        }
        this.v = strZ;
        r();
    }

    public final void o(boolean z) {
        this.J.set(z);
    }

    public final void p(List list) {
        Map map = this.r;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((uii) it.next()).t();
            }
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                uii uiiVar = (uii) list.get(i);
                uiiVar.q();
                uii uiiVar2 = (uii) map.put(uiiVar.o(), uiiVar);
                if (uiiVar2 != null) {
                    uiiVar2.t();
                }
            }
        }
    }

    public final void q(final uii uiiVar, final uij uijVar, final boolean z, boolean z2, final boolean z3) {
        tzl tzlVar;
        uiiVar.getClass();
        if (!z2 || !uiiVar.y()) {
            uvg uvgVar = this.m;
            uvgVar.m(new Runnable() { // from class: ugu
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q(uiiVar, uijVar, z, true, z3);
                }
            });
            uvgVar.k();
            return;
        }
        if (z) {
            ugq ugqVar = this.q;
            ugqVar.c(uijVar, uiiVar.o(), true);
            ugqVar.g(uijVar, uiiVar.o(), uiiVar);
            tzt tztVar = this.N;
            if (tztVar != null && (tzlVar = tztVar.b) != null) {
                tzlVar.gs(uiiVar);
            }
        } else {
            this.E.incrementAndGet();
            synchronized (this) {
                if (Objects.equals(uijVar, e())) {
                    Map map = this.r;
                    synchronized (map) {
                        uiiVar.q();
                        uii uiiVar2 = (uii) map.put(uiiVar.o(), uiiVar);
                        if (uiiVar2 != null) {
                            uiiVar2.t();
                        }
                    }
                }
            }
            this.q.g(uijVar, uiiVar.o(), uiiVar);
            ufs ufsVar = this.l;
            if (ufsVar != null) {
                ufsVar.gs(uiiVar);
            }
        }
        l(uiiVar.o(), z3);
        uiiVar.t();
    }

    public final void r() {
        this.u = uij.a(this.d, this.y, this.b.b, this.b.a, Integer.valueOf(System.identityHashCode(((ugs) this.L.a()).e.r)), this.O, this.v);
    }

    @ResultIgnorabilityUnspecified
    public final boolean s() {
        Set set = this.x;
        synchronized (set) {
            if (set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A((uij) it.next());
            }
            set.clear();
            return true;
        }
    }

    public final String toString() {
        String string;
        Map map = this.c;
        synchronized (map) {
            uij uijVar = this.u;
            long jA = this.h.a();
            Long l = uijVar != null ? (Long) this.q.e.get(uijVar) : null;
            xxg xxgVarAo = woy.ao(this);
            xxgVarAo.b("drawMode", this.b);
            xxgVarAo.b("legend", this.b.b);
            xxgVarAo.h("enableNetworkRequests", this.k);
            xxgVarAo.h("allowEarlyFetching", this.I.get());
            xxgVarAo.f("tileCacheKey hash", uijVar == null ? 0 : uijVar.hashCode());
            xxgVarAo.b("legalCountryKey ", this.v);
            xxgVarAo.b("exactMatchCountries ", this.w);
            xxgVarAo.h("tilePreppingEnabled", B());
            xxgVarAo.f("requestsEmittedCount", this.A);
            xxgVarAo.f("requestsLocalEmittedCount", this.B);
            xxgVarAo.f("responsesReceivedCount", this.C.get());
            xxgVarAo.f("prepsAttemptedCount", this.D.get());
            xxgVarAo.f("prepsCompleteCount", this.E.get());
            xxgVarAo.f("notExistsCount", this.F.get());
            xxgVarAo.f("styleRequestsCount", this.G.get());
            xxgVarAo.f("pendingTileLoadRequestsCount", map.size());
            xxgVarAo.g("lastPrepRequestedMsAgo", jA - this.j);
            xxgVarAo.g("lastPrepCompletedMsAgo", jA - this.H);
            xxgVarAo.b("lastTileRemovedMsAgo", l == null ? "never" : Long.valueOf(jA - l.longValue()));
            string = xxgVarAo.toString();
        }
        return string;
    }

    @ResultIgnorabilityUnspecified
    public final boolean u(final too tooVar, List list, Set set, final tpk tpkVar, final int i, final boolean z, boolean z2, final abad abadVar) {
        boolean z3 = false;
        if (this.a == null) {
            return false;
        }
        xuv xuvVarD = xuw.d("startFetching ", h());
        try {
            int size = list.size();
            if (set != null) {
                size += set.size();
            }
            if (this.g && !z) {
                size += (int) Math.ceil(size * 0.35f);
            }
            uij uijVarE = e();
            if (uijVarE != null) {
                this.q.i(uijVarE, size);
            }
            AtomicBoolean atomicBoolean = this.I;
            if (z2) {
                if (!atomicBoolean.get()) {
                }
                xuvVarD.close();
                return z3;
            }
            atomicBoolean.set(false);
            final ArrayList arrayList = new ArrayList(list);
            final HashSet hashSet = new HashSet();
            if (set != null) {
                hashSet.addAll(set);
            }
            this.z.execute(new Runnable() { // from class: ugv
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    xuv xuvVar;
                    Throwable th;
                    Set set2;
                    int size2;
                    int i2;
                    int i3;
                    abad abadVar2;
                    too tooVar2;
                    xuv xuvVar2;
                    ttv ttvVar;
                    boolean z4;
                    int i4;
                    int i5;
                    LinkedHashSet linkedHashSet;
                    int i6;
                    too tooVar3;
                    boolean z5;
                    ArrayList arrayList2 = arrayList;
                    tpk tpkVar2 = tpkVar;
                    int i7 = i;
                    ugy ugyVar = this.a;
                    boolean z6 = true;
                    boolean z7 = ugyVar.g && !z;
                    xuv xuvVarD2 = xuw.d("beginFetching ", ugyVar.h());
                    try {
                        Map map = ugyVar.c;
                        synchronized (map) {
                            try {
                                try {
                                    if (map.isEmpty()) {
                                        ugyVar.j = ugyVar.h.a();
                                    }
                                    Iterator it = map.entrySet().iterator();
                                    while (true) {
                                        boolean zHasNext = it.hasNext();
                                        set2 = hashSet;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (!set2.contains(entry.getKey()) && !tpkVar2.j(((ukp) entry.getKey()).e())) {
                                            it.remove();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                th = th;
                                try {
                                    xuvVar.close();
                                    throw th;
                                } catch (Throwable th5) {
                                    th.addSuppressed(th5);
                                    throw th;
                                }
                            }
                        }
                        size2 = arrayList2.size();
                        i2 = 0;
                    } catch (Throwable th6) {
                        th = th6;
                        xuvVar = xuvVarD2;
                    }
                    while (true) {
                        i3 = ugyVar.f;
                        abadVar2 = abadVar;
                        tooVar2 = tooVar;
                        if (i2 >= size2) {
                            break;
                        }
                        try {
                            ukp ukpVar = (ukp) arrayList2.get(i2);
                            boolean z8 = ugyVar.k ^ z6;
                            int i8 = ukpVar.a - i3;
                            if (ugyVar.k && ugyVar.e) {
                                z5 = false;
                                tooVar3 = tooVar2;
                            } else {
                                tooVar3 = tooVar2;
                                z5 = true;
                            }
                            ugt ugtVar = new ugt(ukpVar, z8, i8, z5, tooVar3);
                            if (ugyVar.g(ugtVar, abadVar2) == uop.NOT_EXIST) {
                                ugyVar.k(ugtVar, false, abadVar2);
                            }
                            i2++;
                            z6 = true;
                        } catch (Throwable th7) {
                            th = th7;
                            xuvVar = xuvVarD2;
                        }
                        th = th7;
                        xuvVar = xuvVarD2;
                        xuvVar.close();
                        throw th;
                    }
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        ugyVar.g(new ugt((ukp) it2.next(), true), abadVar2);
                    }
                    if (!z7 || (ttvVar = ugyVar.a) == null) {
                        xuvVar2 = xuvVarD2;
                    } else {
                        LinkedHashSet<ukp> linkedHashSet2 = new LinkedHashSet(arrayList2);
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        if (linkedHashSet2.isEmpty()) {
                            i4 = i7;
                            xuvVar2 = xuvVarD2;
                        } else {
                            ukp ukpVar2 = (ukp) linkedHashSet2.iterator().next();
                            int i9 = ukpVar2.a;
                            int i10 = 1 << i9;
                            int i11 = i10 - 1;
                            int i12 = i10 >> 1;
                            int iMin = ukpVar2.b;
                            Iterator it3 = linkedHashSet2.iterator();
                            while (it3.hasNext()) {
                                iMin = Math.min(iMin, ((ukp) it3.next()).b);
                            }
                            Iterator it4 = linkedHashSet2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((ukp) it4.next()).b - iMin >= i12) {
                                        z4 = true;
                                        break;
                                    }
                                } else {
                                    z4 = false;
                                    break;
                                }
                            }
                            i4 = i7;
                            boolean z9 = z4;
                            xuvVar2 = xuvVarD2;
                            int iMin2 = i10;
                            int iMin3 = iMin2;
                            int iMax = 0;
                            int iMax2 = 0;
                            for (ukp ukpVar3 : linkedHashSet2) {
                                int i13 = i10;
                                int i14 = i11;
                                int i15 = ukpVar3.b;
                                if (z9 && i15 < i12) {
                                    i15 += i13;
                                }
                                iMin3 = Math.min(iMin3, i15);
                                iMax2 = Math.max(iMax2, i15);
                                int i16 = ukpVar3.c;
                                iMin2 = Math.min(iMin2, i16);
                                iMax = Math.max(iMax, i16);
                                i11 = i14;
                                i10 = i13;
                            }
                            int i17 = i11;
                            tzy tzyVar = ukpVar2.d;
                            int i18 = iMin3 & i17;
                            linkedHashSet3.add(new ukp(i9, i18, iMin2, tzyVar));
                            linkedHashSet3.add(new ukp(i9, i18, iMax, tzyVar));
                            int i19 = iMax2 & i17;
                            linkedHashSet3.add(new ukp(i9, i19, iMin2, tzyVar));
                            linkedHashSet3.add(new ukp(i9, i19, iMax, tzyVar));
                        }
                        Set<ukp> setU = tmo.u(ttvVar, linkedHashSet2, tooVar2);
                        Set setU2 = tmo.u(ttvVar, linkedHashSet3, tooVar2);
                        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                        int i20 = i4;
                        int i21 = 0;
                        int i22 = 1;
                        while (!setU.isEmpty() && i20 > 0 && i22 <= i3 && i21 < 3) {
                            if (((ukp) setU.iterator().next()).a <= 13 && ((i21 <= 0 && setU.size() <= 2) || ((i21 < 2 && i22 >= 4) || (i21 < 3 && i22 >= 6)))) {
                                int i23 = i20;
                                for (ukp ukpVar4 : setU) {
                                    if (i23 == 0) {
                                        break;
                                    } else if (linkedHashSet4.add(ukpVar4)) {
                                        i23--;
                                    }
                                }
                                if (i20 != i23) {
                                    i21++;
                                }
                                i20 = i23;
                            }
                            if (setU2 != null && (setU.size() <= 2 || i22 >= 3)) {
                                setU.addAll(setU2);
                                setU2 = null;
                            }
                            if (setU.size() <= 2) {
                                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                                Iterator it5 = setU.iterator();
                                while (it5.hasNext()) {
                                    ukp ukpVar5 = (ukp) it5.next();
                                    int i24 = ukpVar5.a;
                                    int i25 = 1;
                                    int i26 = 1 << i24;
                                    int i27 = i26 - 1;
                                    Iterator it6 = it5;
                                    int i28 = -1;
                                    while (i28 <= i25) {
                                        int i29 = i28;
                                        int i30 = -1;
                                        while (i30 <= i25) {
                                            int i31 = ukpVar5.c + i30;
                                            if (i31 < 0 || i31 >= i26) {
                                                i5 = i30;
                                                linkedHashSet = linkedHashSet4;
                                                i6 = i20;
                                            } else {
                                                i5 = i30;
                                                linkedHashSet = linkedHashSet4;
                                                i6 = i20;
                                                linkedHashSet5.add(new ukp(i24, (ukpVar5.b + i29 + i26) & i27, i31, ukpVar5.d));
                                            }
                                            i30 = i5 + 1;
                                            linkedHashSet4 = linkedHashSet;
                                            i20 = i6;
                                            i25 = 1;
                                        }
                                        i28 = i29 + 1;
                                        i25 = 1;
                                    }
                                    it5 = it6;
                                }
                                setU = linkedHashSet5;
                            }
                            LinkedHashSet linkedHashSet6 = linkedHashSet4;
                            int i32 = i20;
                            if (setU2 != null) {
                                setU2 = tmo.u(ttvVar, setU2, tooVar2);
                            }
                            setU = tmo.u(ttvVar, setU, tooVar2);
                            i22++;
                            linkedHashSet4 = linkedHashSet6;
                            i20 = i32;
                        }
                        Iterator it7 = linkedHashSet4.iterator();
                        while (it7.hasNext()) {
                            ugt ugtVar2 = new ugt((ukp) it7.next(), !ugyVar.k);
                            abnp abnpVarN = abad.a.n();
                            abnpVarN.t();
                            abad abadVar3 = (abad) abnpVarN.b;
                            abadVar3.c = 3;
                            abadVar3.b |= 1;
                            ugyVar.g(ugtVar2, (abad) abnpVarN.q());
                        }
                    }
                    xuvVar2.close();
                }
            });
            z3 = true;
            xuvVarD.close();
            return z3;
        } finally {
        }
    }

    @ResultIgnorabilityUnspecified
    public final synchronized boolean v(tqa tqaVar) {
        if (Objects.equals(this.M, tqaVar)) {
            return false;
        }
        this.M = tqaVar;
        return true;
    }

    final void w(ugt ugtVar) {
        ugt ugtVar2;
        vaq.d();
        Map map = this.c;
        synchronized (map) {
            ugtVar2 = (ugt) map.put(ugtVar.a, ugtVar);
        }
        if (ugtVar2 == null || (!ugtVar.b && ugtVar2.b)) {
            if (ugtVar.b) {
                this.B++;
                this.s.g(ugtVar.a, this, this.k);
            } else {
                this.A++;
                this.s.i(ugtVar.a, this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0506 A[Catch: all -> 0x059e, TryCatch #11 {all -> 0x059e, blocks: (B:47:0x0161, B:49:0x01b9, B:50:0x01bf, B:52:0x01c5, B:54:0x01cc, B:56:0x01d2, B:58:0x0213, B:59:0x0217, B:64:0x022a, B:77:0x0298, B:79:0x02a2, B:81:0x02ac, B:82:0x02ba, B:84:0x02c0, B:86:0x02cb, B:91:0x02e0, B:87:0x02d1, B:89:0x02d9, B:92:0x02e4, B:93:0x02f3, B:95:0x02f9, B:97:0x0310, B:99:0x031b, B:101:0x0322, B:103:0x0326, B:100:0x031e, B:104:0x032e, B:106:0x0334, B:133:0x04e2, B:135:0x04e8, B:138:0x04fb, B:140:0x0506, B:142:0x050e, B:143:0x0510, B:145:0x0516, B:147:0x051e, B:148:0x0520, B:150:0x0524, B:151:0x0526, B:153:0x052c, B:155:0x0534, B:156:0x0536, B:158:0x053a, B:159:0x053c, B:161:0x0542, B:162:0x055d, B:110:0x0341, B:111:0x036a, B:113:0x0370, B:115:0x0388, B:116:0x038a, B:118:0x03cf, B:120:0x03d8, B:122:0x03e1, B:124:0x03ea, B:126:0x0438, B:128:0x0456, B:127:0x0441, B:129:0x046f, B:131:0x04bb, B:132:0x04ca, B:69:0x0289, B:23:0x0084, B:24:0x008b), top: B:221:0x0084, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x057d A[Catch: all -> 0x0599, TRY_LEAVE, TryCatch #5 {all -> 0x0599, blocks: (B:30:0x00a9, B:32:0x00af, B:34:0x00b6, B:36:0x0128, B:166:0x056e, B:167:0x0577, B:169:0x057d), top: B:229:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.ukp r79, defpackage.uij r80, defpackage.wnq r81, defpackage.uko r82, boolean r83) {
        /*
            Method dump skipped, instructions count: 1767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugy.x(ukp, uij, wnq, uko, boolean):void");
    }

    public final synchronized void y(aacq aacqVar) {
        if (this.O != aacqVar) {
            this.O = aacqVar;
            r();
        }
    }
}
