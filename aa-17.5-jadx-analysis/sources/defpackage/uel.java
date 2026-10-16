package defpackage;

import com.google.android.libraries.geo.mapcore.internal.label.jni.SharedLabelerJni;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class uel {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/SharedLabelerFacade");
    public uqm A;
    public final uaj B;
    public int C;
    private final Set D;
    private final AtomicInteger E;
    private final ConcurrentHashMap F;
    private final Set G;
    public final Object b = new Object();
    public volatile boolean c = true;
    public volatile boolean d = false;
    public volatile boolean e = false;
    public volatile boolean f = false;
    public final zgs g;
    public final zhc h;
    public SharedLabelerJni i;
    public final ConcurrentHashMap j;
    public final ConcurrentHashMap k;
    public final ConcurrentHashMap l;
    public final Map m;
    public final Map n;
    public final AtomicReference o;
    public ueg p;
    public final ConcurrentLinkedQueue q;
    public final Set r;
    public List s;
    public List t;
    public int u;
    public boolean v;
    public volatile uek w;
    public final vaa x;
    public final vaa y;
    public final String z;

    public uel(zgs zgsVar, Executor executor, String str, uaj uajVar) {
        zhc zhcVar = new zhc();
        this.h = zhcVar;
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.D = yrm.t();
        this.E = new AtomicInteger(100);
        this.l = new ConcurrentHashMap();
        this.F = new ConcurrentHashMap();
        new HashMap();
        this.m = new HashMap();
        this.n = new HashMap();
        this.A = null;
        this.G = new HashSet();
        this.o = new AtomicReference(ueu.a);
        this.q = new ConcurrentLinkedQueue();
        this.r = new HashSet();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = 0;
        this.v = false;
        this.C = 1;
        this.g = zgsVar;
        lws.M(zhcVar, executor);
        uej uejVar = new uej();
        uejVar.b(0);
        uejVar.c(0);
        uejVar.d(0);
        uejVar.f(0L);
        uejVar.e(Long.MAX_VALUE);
        this.w = uejVar.a();
        this.B = uajVar;
        this.x = new vaa();
        this.y = new vaa(false);
        this.z = str;
    }

    public static boolean n(uda udaVar) {
        return udaVar.a() != null;
    }

    public static final String p(uda udaVar) {
        return udaVar.a() == null ? udaVar.getClass().getName() : udaVar.a().name();
    }

    private static abjn s(Set set) {
        abnp abnpVarN = abjn.a.n();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abjm abjmVar = ((trz) it.next()).f;
            if (abjmVar != null) {
                abnpVarN.t();
                abjn abjnVar = (abjn) abnpVarN.b;
                aboh abohVar = abjnVar.b;
                if (!abohVar.c()) {
                    abjnVar.b = abnv.I(abohVar);
                }
                abjnVar.b.add(abjmVar);
            }
        }
        return (abjn) abnpVarN.q();
    }

    private final void t(abjn abjnVar) {
        h(new txo(this, abjnVar, 10, null));
    }

    public final int a(ujk ujkVar, boolean z) {
        Integer num;
        if (z && (num = (Integer) this.F.get(ujkVar)) != null) {
            return num.intValue();
        }
        AtomicInteger atomicInteger = this.E;
        ConcurrentHashMap concurrentHashMap = this.l;
        int andIncrement = atomicInteger.getAndIncrement();
        Integer numValueOf = Integer.valueOf(andIncrement);
        concurrentHashMap.put(numValueOf, ujkVar);
        this.F.put(ujkVar, numValueOf);
        return andIncrement;
    }

    public final synchronized void b(trz trzVar) {
        Set set = this.G;
        if (set.add(trzVar)) {
            t(s(set));
        }
    }

    public final synchronized void c(trz trzVar) {
        Set set = this.G;
        if (set.remove(trzVar)) {
            t(s(set));
        }
    }

    public final void d() {
        vat vatVar = uqb.c;
        uaj uajVar = this.B;
        if (uajVar == null || !uajVar.e()) {
            return;
        }
        ((ynz) ((ynz) a.e()).ai((char) 9287)).u("[Labeling thread] report major labeling input change event");
        this.f = true;
    }

    protected final void e() {
        Object obj = this.b;
        synchronized (obj) {
            this.d = true;
            obj.notifyAll();
        }
    }

    public final void f(abia abiaVar) {
        ((ynz) ((ynz) a.e()).ai((char) 9288)).u("[App thread] schedule EpochResourcesResponse");
        i(new txo(this, abiaVar, 16, null));
    }

    public final void g(long j, byte[] bArr) {
        ((ynz) ((ynz) a.e()).ai((char) 9291)).u("[App thread] schedule ReportStyleTable response");
        i(new jor(this, j, bArr, 4));
    }

    public final void h(Runnable runnable) {
        synchronized (this) {
            this.u++;
        }
        i(new txo(this, runnable, 17, null));
    }

    public final void i(Runnable runnable) {
        ((ynz) ((ynz) a.e()).ai((char) 9295)).u("[App thread] Schedule work");
        this.q.add(runnable);
        e();
    }

    public final void j(abis abisVar) {
        ((ynz) ((ynz) a.e()).ai(9296)).x("[Labeling thread] schedule MeasureIconLayerResponse: id %s", abisVar.c);
        vat vatVar = uqb.c;
        SharedLabelerJni sharedLabelerJni = this.i;
        sharedLabelerJni.getClass();
        sharedLabelerJni.d(abisVar);
    }

    public final void k(long j, float f, float f2, float f3, float f4, float f5) {
        ((ynz) ((ynz) a.e()).ai(9297)).x("[Labeling thread] schedule MeasureTextResponse: id %s", j);
        vat vatVar = uqb.c;
        SharedLabelerJni sharedLabelerJni = this.i;
        sharedLabelerJni.getClass();
        sharedLabelerJni.nativeReportTextSize(sharedLabelerJni.b, j, f, f2, f3, f4, f5);
    }

    public final void l(uda udaVar) {
        ((ynz) ((ynz) a.e()).ai((char) 9307)).y("[App thread] added updateLabelSource[%s] to pending work queue", p(udaVar));
        synchronized (this) {
            this.u++;
        }
        i(new txo(this, udaVar, 13));
    }

    public final boolean m() {
        boolean z;
        synchronized (this.b) {
            z = this.e;
        }
        return z;
    }

    public final boolean o(uda udaVar) {
        vat vatVar = uqb.c;
        zdh zdhVar = (zdh) this.k.remove(udaVar);
        if (zdhVar == null) {
            ((ynz) ((ynz) a.e()).ai((char) 9282)).y("[Labeler thread] failed to remove label source[%s] as it does not exist", p(udaVar));
            return false;
        }
        int i = zdhVar.b;
        if (i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                SharedLabelerJni sharedLabelerJni = this.i;
                sharedLabelerJni.getClass();
                sharedLabelerJni.c(zdhVar.a(i2));
            }
        }
        if (this.D.remove(udaVar)) {
            d();
        }
        ((ynz) ((ynz) a.e()).ai((char) 9281)).y("[Labeler thread] successfully removed label source[%s]", p(udaVar));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final zdh q(uda udaVar, rfe rfeVar) {
        vat vatVar = uqb.c;
        if (n(udaVar)) {
            ((ynz) ((ynz) a.g()).ai((char) 9306)).y("[Labeler thread] did not add label source[%s] because it is not client-injected", p(udaVar));
            return zdh.a;
        }
        ?? r0 = rfeVar.d;
        o(udaVar);
        if (r0.isEmpty() && !new uaw((uax) rfeVar.k()).hasNext()) {
            ((ynz) ((ynz) a.e()).ai((char) 9305)).y("[Labeler thread] did not add label source[%s] because it is empty", p(udaVar));
            return zdh.a;
        }
        int size = r0.size();
        boolean z = size >= 0;
        zdh zdhVar = zdh.a;
        woy.Q(z, "Invalid initialCapacity: %s", size);
        ajnt ajntVar = new ajnt(size);
        int length = 0;
        for (int i = 0; i < r0.size(); i++) {
            ucz uczVar = (ucz) r0.get(i);
            SharedLabelerJni sharedLabelerJni = this.i;
            sharedLabelerJni.getClass();
            abih abihVar = uczVar.a;
            byte[] bArr = uczVar.b;
            ajntVar.d(sharedLabelerJni.a(abihVar, bArr));
            length += bArr.length;
        }
        if (new uaw((uax) rfeVar.k()).hasNext()) {
            d();
            this.D.add(udaVar);
            abnp abnpVarN = abei.a.n();
            uaw uawVar = new uaw((uax) rfeVar.k());
            while (uawVar.hasNext()) {
                abeg next = uawVar.next();
                abnpVarN.t();
                abei abeiVar = (abei) abnpVarN.b;
                next.getClass();
                abeiVar.b();
                abeiVar.b.add(next);
            }
            abct abctVar = abct.a;
            SharedLabelerJni sharedLabelerJni2 = this.i;
            sharedLabelerJni2.getClass();
            abnp abnpVarN2 = abih.a.n();
            abei abeiVar2 = (abei) abnpVarN.q();
            abnpVarN2.t();
            abih abihVar2 = (abih) abnpVarN2.b;
            abeiVar2.getClass();
            abihVar2.c = abeiVar2;
            abihVar2.b |= 2;
            ajntVar.d(sharedLabelerJni2.a((abih) abnpVarN2.q(), abctVar.h()));
        }
        int i2 = ajntVar.a;
        zdh zdhVar2 = i2 == 0 ? zdh.a : new zdh((long[]) ajntVar.b, i2);
        this.k.put(udaVar, zdhVar2);
        ((ynz) ((ynz) a.e()).ai(9304)).R("[Labeler thread] successfully added label source[%s][id=%s][bytes=%d]", p(udaVar), zdhVar2, Integer.valueOf(length));
        return zdhVar2;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    public final zdh r(uda udaVar, rfe rfeVar) {
        vat vatVar = uqb.c;
        ConcurrentHashMap concurrentHashMap = this.j;
        if (!concurrentHashMap.containsKey(udaVar)) {
            return zdh.a;
        }
        if (!n(udaVar)) {
            ((ynz) ((ynz) a.g()).ai((char) 9313)).y("[Labeler thread] did not add label source[%s] because it is not paint-provided", p(udaVar));
            return zdh.a;
        }
        Map map = (Map) concurrentHashMap.get(udaVar);
        if (map == null) {
            return zdh.a;
        }
        ?? r15 = rfeVar.d;
        HashSet hashSet = new HashSet();
        int i = 0;
        int i2 = 0;
        int length = 0;
        for (ucz uczVar : r15) {
            String str = uczVar.c;
            if (true == woy.am(str)) {
                str = "Default Paint Version ID";
            }
            if (!map.containsKey(str)) {
                SharedLabelerJni sharedLabelerJni = this.i;
                sharedLabelerJni.getClass();
                abih abihVar = uczVar.a;
                byte[] bArr = uczVar.b;
                map.put(str, Long.valueOf(sharedLabelerJni.a(abihVar, bArr)));
                i2++;
                length += bArr.length;
            }
            hashSet.add(str);
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Long l = (Long) entry.getValue();
            if (!hashSet.contains(str2)) {
                SharedLabelerJni sharedLabelerJni2 = this.i;
                sharedLabelerJni2.getClass();
                l.getClass();
                sharedLabelerJni2.c(l.longValue());
                it.remove();
                i++;
            }
        }
        Collection collectionValues = map.values();
        zdh zdhVar = zdh.a;
        zdh zdhVar2 = collectionValues.isEmpty() ? zdh.a : new zdh(zeb.m(collectionValues));
        ((ynz) ((ynz) a.e()).ai(9312)).U("[Labeler thread] Successfully updated label source[%s][id=%s]. Removed [count=%d]candidates, added[count=%d][bytes=%d] candidates, kept [count=%d] existing candidates", p(udaVar), zdhVar2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length), Integer.valueOf(hashSet.size() - i2));
        return zdhVar2;
    }
}
