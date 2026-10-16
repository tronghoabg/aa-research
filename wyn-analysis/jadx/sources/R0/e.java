package R0;

import R8.v;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import cg.y;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.UnityAdsConstants;
import ff.AbstractC2640A;
import ff.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10049a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10050b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10051c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10052d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10053e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10054f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10055g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10056h;

    /* renamed from: i, reason: collision with root package name */
    public Object f10057i;

    public /* synthetic */ e(int i5) {
        this.f10049a = i5;
    }

    public void a(f fVar, int i5, ArrayList arrayList, l lVar) {
        o oVar = fVar.f10061d;
        if (oVar.f10082c == null) {
            Q0.e eVar = (Q0.e) this.f10052d;
            if (oVar == eVar.f9546d || oVar == eVar.f9548e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f10071a = null;
                lVar.f10072b = new ArrayList();
                lVar.f10071a = oVar;
                arrayList.add(lVar);
            }
            oVar.f10082c = lVar;
            lVar.f10072b.add(oVar);
            f fVar2 = oVar.f10087h;
            Iterator it = fVar2.k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar instanceof f) {
                    a((f) dVar, i5, arrayList, lVar);
                }
            }
            f fVar3 = oVar.f10088i;
            Iterator it2 = fVar3.k.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                if (dVar2 instanceof f) {
                    a((f) dVar2, i5, arrayList, lVar);
                }
            }
            if (i5 == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).k.k.iterator();
                while (it3.hasNext()) {
                    d dVar3 = (d) it3.next();
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i5, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = fVar2.f10068l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i5, arrayList, lVar);
            }
            Iterator it5 = fVar3.f10068l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i5, arrayList, lVar);
            }
            if (i5 == 1 && (oVar instanceof m)) {
                Iterator it6 = ((m) oVar).k.f10068l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i5, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(Q0.e r23) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.e.b(Q0.e):void");
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f10054f;
        arrayList.clear();
        Q0.e eVar = (Q0.e) this.f10053e;
        eVar.f9546d.f();
        eVar.f9548e.f();
        arrayList.add(eVar.f9546d);
        arrayList.add(eVar.f9548e);
        Iterator it = eVar.f9592q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            Q0.d dVar = (Q0.d) it.next();
            if (dVar instanceof Q0.h) {
                i iVar = new i(dVar);
                dVar.f9546d.f();
                dVar.f9548e.f();
                iVar.f10085f = ((Q0.h) dVar).f9655u0;
                arrayList.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f9542b == null) {
                        dVar.f9542b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f9542b);
                } else {
                    arrayList.add(dVar.f9546d);
                }
                if (dVar.y()) {
                    if (dVar.f9544c == null) {
                        dVar.f9544c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f9544c);
                } else {
                    arrayList.add(dVar.f9548e);
                }
                if (dVar instanceof Q0.i) {
                    arrayList.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar = (o) it3.next();
            if (oVar.f10081b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f10055g;
        arrayList2.clear();
        Q0.e eVar2 = (Q0.e) this.f10052d;
        e(eVar2.f9546d, 0, arrayList2);
        e(eVar2.f9548e, 1, arrayList2);
        this.f10050b = false;
    }

    public int d(Q0.e eVar, int i5) {
        ArrayList arrayList;
        int i10;
        int i11;
        long jMax;
        float f10;
        Q0.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f10055g;
        int size = arrayList2.size();
        int i12 = 0;
        long jMax2 = 0;
        while (i12 < size) {
            o oVar = ((l) arrayList2.get(i12)).f10071a;
            if (!(oVar instanceof c) ? !(i5 != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f10085f != i5) {
                f fVar = (i5 == 0 ? eVar2.f9546d : eVar2.f9548e).f10087h;
                f fVar2 = (i5 == 0 ? eVar2.f9546d : eVar2.f9548e).f10088i;
                boolean zContains = oVar.f10087h.f10068l.contains(fVar);
                f fVar3 = oVar.f10088i;
                boolean zContains2 = fVar3.f10068l.contains(fVar2);
                long j8 = oVar.j();
                f fVar4 = oVar.f10087h;
                if (zContains && zContains2) {
                    long jB = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i10 = size;
                    long jA = l.a(fVar3, 0L);
                    long j10 = jB - j8;
                    int i13 = fVar3.f10063f;
                    arrayList = arrayList3;
                    i11 = i12;
                    if (j10 >= (-i13)) {
                        j10 += i13;
                    }
                    long j11 = (-jA) - j8;
                    long j12 = fVar4.f10063f;
                    long j13 = j11 - j12;
                    if (j13 >= j12) {
                        j13 -= j12;
                    }
                    Q0.d dVar = oVar.f10081b;
                    if (i5 == 0) {
                        f10 = dVar.f9547d0;
                    } else if (i5 == 1) {
                        f10 = dVar.f9549e0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (long) ((j10 / (1.0f - f10)) + (j13 / f10)) : 0L;
                    jMax = (fVar4.f10063f + ((((long) ((f11 * f10) + 0.5f)) + j8) + ((long) N0.a.b(1.0f, f10, f11, 0.5f)))) - fVar3.f10063f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i12;
                    jMax = zContains ? Math.max(l.b(fVar4, fVar4.f10063f), fVar4.f10063f + j8) : zContains2 ? Math.max(-l.a(fVar3, fVar3.f10063f), (-fVar3.f10063f) + j8) : (oVar.j() + fVar4.f10063f) - fVar3.f10063f;
                }
            } else {
                arrayList = arrayList2;
                i10 = size;
                i11 = i12;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i12 = i11 + 1;
            eVar2 = eVar;
            size = i10;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    public void e(o oVar, int i5, ArrayList arrayList) {
        f fVar;
        Iterator it = oVar.f10087h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = oVar.f10088i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i5, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f10087h, i5, arrayList, null);
            }
        }
        Iterator it2 = fVar.k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i5, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f10088i, i5, arrayList, null);
            }
        }
        if (i5 == 1) {
            Iterator it3 = ((m) oVar).k.k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i5, arrayList, null);
                }
            }
        }
    }

    public synchronized boolean f() {
        boolean zK;
        Boolean bool = (Boolean) this.f10056h;
        if (bool != null) {
            zK = bool.booleanValue();
        } else {
            try {
                zK = ((s8.g) this.f10053e).k();
            } catch (IllegalStateException unused) {
                zK = false;
            }
        }
        g(zK);
        return zK;
    }

    public void g(boolean z2) {
        String strG = v.g("Crashlytics automatic data collection ", z2 ? "ENABLED" : "DISABLED", " by ", ((Boolean) this.f10056h) == null ? "global Firebase setting" : this.f10051c ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strG, null);
        }
    }

    public void h(int i5, int i10, int i11, int i12, Q0.d dVar) {
        b bVar = (b) this.f10057i;
        bVar.f10038a = i5;
        bVar.f10039b = i11;
        bVar.f10040c = i10;
        bVar.f10041d = i12;
        ((T0.e) this.f10056h).b(dVar, bVar);
        dVar.O(bVar.f10042e);
        dVar.L(bVar.f10043f);
        dVar.f9519E = bVar.f10045h;
        dVar.I(bVar.f10044g);
    }

    public void i() {
        a aVar;
        Iterator it = ((Q0.e) this.f10052d).f9592q0.iterator();
        while (it.hasNext()) {
            Q0.d dVar = (Q0.d) it.next();
            if (!dVar.f9540a) {
                int[] iArr = dVar.f9570p0;
                boolean z2 = false;
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = dVar.f9572r;
                int i12 = dVar.f9573s;
                boolean z10 = i5 == 2 || (i5 == 3 && i11 == 1);
                if (i10 == 2 || (i10 == 3 && i12 == 1)) {
                    z2 = true;
                }
                g gVar = dVar.f9546d.f10084e;
                boolean z11 = gVar.f10067j;
                g gVar2 = dVar.f9548e.f10084e;
                boolean z12 = gVar2.f10067j;
                boolean z13 = z10;
                if (z11 && z12) {
                    h(1, gVar.f10064g, 1, gVar2.f10064g, dVar);
                    dVar.f9540a = true;
                } else if (z11 && z2) {
                    h(1, gVar.f10064g, 2, gVar2.f10064g, dVar);
                    if (i10 == 3) {
                        dVar.f9548e.f10084e.f10069m = dVar.k();
                    } else {
                        dVar.f9548e.f10084e.d(dVar.k());
                        dVar.f9540a = true;
                    }
                } else if (z12 && z13) {
                    h(2, gVar.f10064g, 1, gVar2.f10064g, dVar);
                    if (i5 == 3) {
                        dVar.f9546d.f10084e.f10069m = dVar.q();
                    } else {
                        dVar.f9546d.f10084e.d(dVar.q());
                        dVar.f9540a = true;
                    }
                }
                if (dVar.f9540a && (aVar = dVar.f9548e.f10073l) != null) {
                    aVar.d(dVar.f9541a0);
                }
            }
        }
    }

    public String toString() {
        switch (this.f10049a) {
            case 2:
                ArrayList arrayList = new ArrayList();
                if (this.f10050b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f10051c) {
                    arrayList.add("isDirectory");
                }
                Long l10 = (Long) this.f10053e;
                if (l10 != null) {
                    arrayList.add("byteCount=" + l10);
                }
                Long l11 = (Long) this.f10054f;
                if (l11 != null) {
                    arrayList.add("createdAt=" + l11);
                }
                Long l12 = (Long) this.f10055g;
                if (l12 != null) {
                    arrayList.add("lastModifiedAt=" + l12);
                }
                Long l13 = (Long) this.f10056h;
                if (l13 != null) {
                    arrayList.add("lastAccessedAt=" + l13);
                }
                Map map = (Map) this.f10057i;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return ff.o.w0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public e(s8.g gVar) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f10049a = 1;
        Object obj = new Object();
        this.f10054f = obj;
        this.f10055g = new TaskCompletionSource();
        this.f10050b = false;
        this.f10051c = false;
        this.f10057i = new TaskCompletionSource();
        gVar.a();
        Context context = gVar.f45328a;
        this.f10053e = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f10052d = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f10051c = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e7);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f10051c = false;
                boolValueOf = null;
            } else {
                this.f10051c = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f10056h = boolValueOf;
        synchronized (obj) {
            try {
                if (f()) {
                    ((TaskCompletionSource) this.f10055g).trySetResult(null);
                    this.f10050b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public e(boolean z2, boolean z10, y yVar, Long l10, Long l11, Long l12, Long l13, Map extras) {
        this.f10049a = 2;
        AbstractC3340k.e(extras, "extras");
        this.f10050b = z2;
        this.f10051c = z10;
        this.f10052d = yVar;
        this.f10053e = l10;
        this.f10054f = l11;
        this.f10055g = l12;
        this.f10056h = l13;
        this.f10057i = AbstractC2640A.Y(extras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z2, boolean z10, y yVar, Long l10, Long l11, Long l12, Long l13) {
        this(z2, z10, yVar, l10, l11, l12, l13, w.f35433a);
        this.f10049a = 2;
    }
}
