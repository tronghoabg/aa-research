package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public final class zyb {
    public static final String a = "zyb";
    public static final String[] b = {"DATA_ServerControlledParametersManager.data"};
    public static final ScheduledExecutorService c = zrz.e("scpm");
    private static final ygr y = ygr.t(acef.PREFETCHER_SETTINGS, acef.VECTOR_MAPS, acef.API, acef.PAINT_PARAMETERS, acef.IMAGERY_VIEWER, acef.TILE_ZOOM_PROGRESSION, acef.MAPS_API_PARAMETERS, acef.LOGGING);
    private volatile HashMap A;
    private volatile boolean B;
    private boolean C;
    private final xyc D;
    private final Set E;
    public volatile List d;
    public final Set e;
    public volatile HashMap f;
    public volatile boolean g;
    public volatile String h;
    public volatile abgj i;
    public volatile List j;
    public volatile acdh k;
    public volatile ScheduledFuture l;
    public volatile boolean m;
    public volatile boolean n;
    public final Object o;
    public boolean p;
    public boolean q;
    public final Context r;
    public zxy s;
    final Set t;
    public final xyc u;
    public final xyc v;
    public acbu w;
    public final aacq x;
    private volatile HashMap z;

    public zyb(final Context context, xyc xycVar, final zut zutVar, final zta ztaVar, ScheduledExecutorService scheduledExecutorService, final zyx zyxVar) {
        Set setT;
        if (addm.f()) {
            List listL = l();
            setT = yrm.t();
            yrm.ar(setT, listL);
        } else {
            setT = yrm.t();
        }
        this.e = setT;
        this.f = new HashMap();
        this.z = new HashMap();
        this.A = new HashMap();
        this.l = null;
        this.m = false;
        this.n = false;
        this.o = new Object();
        this.p = false;
        this.q = false;
        this.C = false;
        new ArrayList();
        this.t = yrm.t();
        this.E = new HashSet();
        this.x = new aacq();
        zkt.n(context, "clientApplicationContext");
        this.r = context;
        zkt.n(xycVar, "dispatcher");
        this.D = xycVar;
        zkt.n(ztaVar, "util");
        zkt.n(scheduledExecutorService, "mapsApiClientParamsExecutorService");
        final String packageName = context.getPackageName();
        this.u = wub.L(new xyc() { // from class: zxx
            /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
            @Override // defpackage.xyc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object gu() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 368
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zxx.gu():java.lang.Object");
            }
        });
        zrz.b.execute(new zte(this, 14));
        this.v = wub.L(new plm(packageName, context, 13, null));
        zrz.a.execute(new zte(this, 15));
    }

    public static String d(aceh acehVar) {
        if (acehVar == null) {
            return "null";
        }
        zsa zsaVarA = zsa.a(acehVar);
        aceg acegVar = (aceg) acehVar;
        if ((acegVar.b & 1) != 0) {
            acef acefVarB = acef.b(acegVar.e);
            if (acefVarB == null) {
                acefVarB = acef.UNKNOWN_TYPE;
            }
            zsaVarA.b(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, acefVarB);
        }
        if ((acegVar.b & 2) != 0) {
            zsaVarA.f("hash", acegVar.f);
        }
        return zsaVarA.toString();
    }

    public static final List l() {
        ArrayList arrayList = new ArrayList();
        aceg acegVar = aceg.a;
        abnp abnpVarN = acegVar.n();
        acef acefVar = acef.PREFETCHER_SETTINGS;
        abnpVarN.t();
        aceg acegVar2 = (aceg) abnpVarN.b;
        acegVar2.e = acefVar.eO;
        acegVar2.b |= 1;
        aceq aceqVar = aceq.a;
        abnpVarN.t();
        aceg acegVar3 = (aceg) abnpVarN.b;
        aceqVar.getClass();
        acegVar3.d = aceqVar;
        acegVar3.c = 8;
        arrayList.add((aceg) abnpVarN.q());
        abnp abnpVarN2 = acegVar.n();
        acef acefVar2 = acef.VECTOR_MAPS;
        abnpVarN2.t();
        aceg acegVar4 = (aceg) abnpVarN2.b;
        acegVar4.e = acefVar2.eO;
        acegVar4.b |= 1;
        achj achjVar = achj.a;
        abnpVarN2.t();
        aceg acegVar5 = (aceg) abnpVarN2.b;
        achjVar.getClass();
        acegVar5.d = achjVar;
        acegVar5.c = 10;
        arrayList.add((aceg) abnpVarN2.q());
        abnp abnpVarN3 = acegVar.n();
        acef acefVar3 = acef.API;
        abnpVarN3.t();
        aceg acegVar6 = (aceg) abnpVarN3.b;
        acegVar6.e = acefVar3.eO;
        acegVar6.b |= 1;
        acbi acbiVar = acbi.a;
        abnpVarN3.t();
        aceg acegVar7 = (aceg) abnpVarN3.b;
        acbiVar.getClass();
        acegVar7.d = acbiVar;
        acegVar7.c = 14;
        arrayList.add((aceg) abnpVarN3.q());
        abnp abnpVarN4 = acegVar.n();
        acef acefVar4 = acef.PAINT_PARAMETERS;
        abnpVarN4.t();
        aceg acegVar8 = (aceg) abnpVarN4.b;
        acegVar8.e = acefVar4.eO;
        acegVar8.b |= 1;
        abgi abgiVar = abgi.a;
        abnpVarN4.t();
        aceg acegVar9 = (aceg) abnpVarN4.b;
        abgiVar.getClass();
        acegVar9.d = abgiVar;
        acegVar9.c = 39;
        arrayList.add((aceg) abnpVarN4.q());
        abnp abnpVarN5 = acegVar.n();
        acef acefVar5 = acef.IMAGERY_VIEWER;
        abnpVarN5.t();
        aceg acegVar10 = (aceg) abnpVarN5.b;
        acegVar10.e = acefVar5.eO;
        acegVar10.b |= 1;
        accy accyVar = accy.a;
        abnpVarN5.t();
        aceg acegVar11 = (aceg) abnpVarN5.b;
        accyVar.getClass();
        acegVar11.d = accyVar;
        acegVar11.c = 47;
        arrayList.add((aceg) abnpVarN5.q());
        abnp abnpVarN6 = acegVar.n();
        acef acefVar6 = acef.MAPS_API_PARAMETERS;
        abnpVarN6.t();
        aceg acegVar12 = (aceg) abnpVarN6.b;
        acegVar12.e = acefVar6.eO;
        acegVar12.b |= 1;
        arrayList.add((aceg) abnpVarN6.q());
        abnp abnpVarN7 = acegVar.n();
        acef acefVar7 = acef.LOGGING;
        abnpVarN7.t();
        aceg acegVar13 = (aceg) abnpVarN7.b;
        acegVar13.e = acefVar7.eO;
        acegVar13.b |= 1;
        arrayList.add((aceg) abnpVarN7.q());
        return arrayList;
    }

    private final synchronized void m() {
        abnp abnpVarN = aauw.a.n();
        abnpVarN.T(new ArrayList(this.E));
        i(false, (aauw) abnpVarN.q());
    }

    final ygr a(String str) {
        return this.A.containsKey(str) ? ygr.n((Collection) this.A.get(str)) : yly.a;
    }

    final ygr b(String str) {
        return this.z.containsKey(str) ? ygr.n((Collection) this.z.get(str)) : new ymp(aauq.UNKNOWN_MAP_FACTS_TYPE);
    }

    final synchronized acbu c() {
        if (this.C) {
            return this.w;
        }
        acbu acbuVar = (acbu) ((zri) this.v.gu()).a();
        this.w = acbuVar;
        this.C = true;
        return acbuVar;
    }

    public final void e(zxz zxzVar) {
        boolean z;
        this.t.add(zxzVar);
        synchronized (this) {
            z = true;
            if (!this.p && !this.q) {
                z = false;
            }
        }
        if (z) {
            zxzVar.i();
        }
    }

    public final void f() {
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((zxz) it.next()).i();
        }
    }

    public final synchronized void g(String str) {
        aauw aauwVar;
        if (str.isEmpty()) {
            abnp abnpVarN = aauw.a.n();
            abnpVarN.T(new ArrayList(this.E));
            aauwVar = (aauw) abnpVarN.q();
        } else {
            abnp abnpVarN2 = aauw.a.n();
            abnpVarN2.t();
            aauw aauwVar2 = (aauw) abnpVarN2.b;
            aauwVar2.b();
            aauwVar2.b.add(str);
            aauwVar = (aauw) abnpVarN2.q();
            this.E.add(str);
        }
        zrz.a.execute(new zww(this, aauwVar, 2, null));
    }

    public final synchronized void h() {
        m();
    }

    public final synchronized void i(boolean z, aauw aauwVar) {
        synchronized (this.o) {
            if (this.l != null) {
                this.l.cancel(false);
                this.l = null;
            }
            if (!this.n || z) {
                this.n = true;
                this.m = false;
                ((zst) this.D.gu()).i(new zya(this, z, aauwVar));
            } else {
                this.m = true;
            }
        }
    }

    public final void j(aceg acegVar) {
        acef acefVarB = acef.b(acegVar.e);
        if (acefVarB == null) {
            acefVarB = acef.UNKNOWN_TYPE;
        }
        if (y.contains(acefVarB)) {
            if (addm.f()) {
                Set set = this.e;
                Collection.EL.removeIf(set, new pcx(acefVarB, 20));
                set.add(acegVar);
                return;
            }
            ArrayList arrayList = new ArrayList(this.d);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                aceg acegVar2 = (aceg) arrayList.get(i);
                acef acefVarB2 = acef.b(acegVar2.e);
                if (acefVarB2 == null) {
                    acefVarB2 = acef.UNKNOWN_TYPE;
                }
                i++;
                if (acefVarB == acefVarB2) {
                    this.d.remove(acegVar2);
                    break;
                }
            }
            this.d.add(acegVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final boolean k(aceg acegVar) {
        int i;
        int i2;
        yvo yvoVar;
        Object obj;
        int i3;
        int i4;
        int i5;
        acef acefVarB = acef.b(acegVar.e);
        if (acefVarB == null) {
            acefVarB = acef.UNKNOWN_TYPE;
        }
        if ((acefVarB.equals(acef.PREFETCHER_SETTINGS) && acegVar.c == 8) || (acefVarB.equals(acef.IMAGERY_VIEWER) && acegVar.c == 47)) {
            return true;
        }
        if (acefVarB.equals(acef.VECTOR_MAPS) && (i5 = acegVar.c) == 10) {
            achj achjVar = i5 == 10 ? (achj) acegVar.d : achj.a;
            this.B = achjVar.c;
            this.h = achjVar.e;
            return true;
        }
        if (acefVarB.equals(acef.API) && (i4 = acegVar.c) == 14) {
            this.g = (i4 == 14 ? (acbi) acegVar.d : acbi.a).b;
            return true;
        }
        if (acefVarB.equals(acef.PAINT_PARAMETERS) && (i3 = acegVar.c) == 39) {
            abgn abgnVar = (i3 == 39 ? (abgi) acegVar.d : abgi.a).c;
            if (abgnVar == null) {
                abgnVar = abgn.a;
            }
            abgj abgjVar = abgnVar.b;
            if (abgjVar == null) {
                abgjVar = abgj.a;
            }
            this.i = abgjVar;
            this.j = (acegVar.c == 39 ? (abgi) acegVar.d : abgi.a).h;
            return true;
        }
        boolean z = false;
        if (!acefVarB.equals(acef.MAPS_API_PARAMETERS) || (i2 = acegVar.c) != 151) {
            if (acefVarB.equals(acef.LOGGING) && (i = acegVar.c) == 18) {
                this.k = i == 18 ? (acdh) acegVar.d : acdh.a;
                return true;
            }
            String str = a;
            if (zrn.e(str, 3)) {
                Log.d(str, a.bW(acefVarB, "ParameterGroupProto with type ", " is not updated"));
            }
            return false;
        }
        for (Map.Entry entry : DesugarCollections.unmodifiableMap((i2 == 151 ? (aavd) acegVar.d : aavd.a).d).entrySet()) {
            String str2 = (String) entry.getKey();
            if (!woy.am(str2)) {
                HashMap map = this.f;
                int iAp = a.ap(((aava) entry.getValue()).c);
                if (iAp == 0) {
                    iAp = 1;
                }
                int i6 = iAp - 1;
                map.put(str2, i6 != 1 ? i6 != 2 ? zwp.a : zwp.c : zwp.b);
            }
        }
        for (Map.Entry entry2 : DesugarCollections.unmodifiableMap((acegVar.c == 151 ? (aavd) acegVar.d : aavd.a).d).entrySet()) {
            String str3 = (String) entry2.getKey();
            if (!woy.am(str3)) {
                for (aavc aavcVar : ((aava) entry2.getValue()).d) {
                    aavb aavbVarB = aavb.b(aavcVar.b);
                    if (aavbVarB == null) {
                        aavbVarB = aavb.UNKNOWN_SDK_MAP_VARIANT;
                    }
                    if (aavbVarB.equals(aavb.VARIANT_ROADMAP)) {
                        aboh abohVar = aavcVar.h;
                        HashSet hashSet = new HashSet();
                        Iterator<E> it = abohVar.iterator();
                        while (it.hasNext()) {
                            aauq aauqVarB = aauq.b(((aaur) it.next()).b);
                            if (aauqVarB == null) {
                                aauqVarB = aauq.UNKNOWN_MAP_FACTS_TYPE;
                            }
                            if (zuv.a.containsValue(aauqVarB)) {
                                hashSet.add(aauqVarB);
                            }
                        }
                        this.z.put(str3, hashSet);
                        aboh abohVar2 = aavcVar.d;
                        HashSet hashSet2 = new HashSet();
                        Iterator<E> it2 = abohVar2.iterator();
                        while (it2.hasNext()) {
                            hashSet2.add(((aaus) it2.next()).b);
                        }
                        this.A.put(str3, hashSet2);
                    }
                }
            }
        }
        aacq aacqVar = this.x;
        aavd aavdVar = acegVar.c == 151 ? (aavd) acegVar.d : aavd.a;
        if (aavdVar != null) {
            zwh zwhVar = new zwh();
            zwhVar.a(false);
            for (Map.Entry entry3 : DesugarCollections.unmodifiableMap(aavdVar.d).entrySet()) {
                String str4 = (String) entry3.getKey();
                aava aavaVar = (aava) entry3.getValue();
                ackh ackhVar = (ackh) ConcurrentMap.EL.computeIfAbsent(aacqVar.a, str4, new zwd(z ? 1 : 0));
                ygp ygpVar = new ygp();
                for (aavc aavcVar2 : aavaVar.d) {
                    aavb aavbVarB2 = aavb.b(aavcVar2.b);
                    if (aavbVarB2 == null) {
                        aavbVarB2 = aavb.UNKNOWN_SDK_MAP_VARIANT;
                    }
                    abgx abgxVarJ = a.J(aavbVarB2);
                    ygpVar.c(abgxVarJ);
                    zwf zwfVar = new zwf();
                    zwfVar.c = abgx.UNKNOWN;
                    zwfVar.d = null;
                    zwfVar.a(z);
                    zwfVar.c = abgxVarJ;
                    Integer numD = ackhVar.d(abgxVarJ);
                    aaup aaupVar = aavcVar2.e;
                    if (aaupVar == null) {
                        aaupVar = aaup.a;
                    }
                    boolean z2 = z;
                    if (aaupVar == null || (aaupVar.b & 1) == 0) {
                        zwfVar.d = null;
                        if (numD != null) {
                            zwhVar.a(true);
                        }
                    } else {
                        Integer numValueOf = Integer.valueOf(aaupVar.c);
                        zwfVar.d = numValueOf;
                        if (!numValueOf.equals(numD)) {
                            zwhVar.a(true);
                        }
                    }
                    aaut aautVar = aavcVar2.g;
                    if (aautVar == null) {
                        aautVar = aaut.a;
                    }
                    zwfVar.a(aautVar.b);
                    if (zwfVar.b != 1 || (obj = zwfVar.c) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (zwfVar.c == null) {
                            sb.append(" versatileMapStyle");
                        }
                        if (zwfVar.b == 0) {
                            sb.append(" usesCustomTiles");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    zwg zwgVar = new zwg((abgx) obj, (Integer) zwfVar.d, zwfVar.a);
                    ackhVar.b.put(zwgVar.a, zwgVar);
                    z = z2;
                }
                boolean z3 = z;
                HashSet hashSet3 = new HashSet();
                Iterator<T> it3 = new abof(aavaVar.e, aava.a).iterator();
                while (it3.hasNext()) {
                    int iOrdinal = ((aavb) it3.next()).ordinal();
                    if (iOrdinal == 1) {
                        yvoVar = yvo.VARIANT_ROADMAP;
                    } else if (iOrdinal == 2) {
                        yvoVar = yvo.VARIANT_ROADMAP_DARK;
                    } else if (iOrdinal == 3) {
                        yvoVar = yvo.VARIANT_NAVIGATION;
                    } else if (iOrdinal == 4) {
                        yvoVar = yvo.VARIANT_NAVIGATION_LOW_LIGHT;
                    } else if (iOrdinal != 7) {
                        switch (iOrdinal) {
                            case 10:
                                yvoVar = yvo.VARIANT_TERRAIN;
                                break;
                            case 11:
                                yvoVar = yvo.VARIANT_TERRAIN_DARK;
                                break;
                            case 12:
                                yvoVar = yvo.VARIANT_TRANSIT;
                                break;
                            case 13:
                                yvoVar = yvo.VARIANT_TRANSIT_DARK;
                                break;
                            default:
                                yvoVar = yvo.UNKNOWN_SDK_MAP_VARIANT;
                                break;
                        }
                    } else {
                        yvoVar = yvo.VARIANT_HYBRID;
                    }
                    hashSet3.add(yvoVar);
                }
                ackhVar.a = hashSet3;
                ygr ygrVarG = ygpVar.g();
                ?? r6 = ackhVar.b;
                yno it4 = yrm.p(ygr.n(r6.keySet()), ygrVarG).iterator();
                while (it4.hasNext()) {
                    zwg zwgVar2 = (zwg) r6.remove((abgx) it4.next());
                    if (zwgVar2 != null && zwgVar2.b != null) {
                        zwhVar.a(true);
                    }
                }
                z = z3;
            }
            if (zwhVar.b != 1) {
                throw new IllegalStateException("Missing required properties: backgroundColorUpdated");
            }
            if (new zwi(zwhVar.a).a) {
                Iterator it5 = aacqVar.b.iterator();
                while (it5.hasNext()) {
                    ((zwe) it5.next()).b();
                }
            }
        }
        return true;
    }
}
