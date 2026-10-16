package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Objects;

/* loaded from: classes3.dex */
public final /* synthetic */ class twk implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ twk(gjt gjtVar, gjt gjtVar2, tla tlaVar, Object obj, tkw tkwVar, int i) {
        this.f = i;
        this.c = gjtVar;
        this.b = gjtVar2;
        this.a = tlaVar;
        this.e = obj;
        this.d = tkwVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, tkw] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, trc] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f;
        if (i == 0) {
            Object obj = this.c;
            Object obj2 = this.b;
            if (obj2 instanceof tww) {
                Object obj3 = this.a;
                udx udxVarB = ((tyy) this.d).b();
                if (((twm) obj3).k.b(udxVarB, udxVarB.P(), ((uat) udxVarB).e, udxVarB.ae()) != null) {
                    try {
                        int iOrdinal = ((tqd) obj).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1) {
                            throw new RuntimeException(null, null);
                        }
                        woy.ad(a.Z(), "Expected to be running on the main thread, but running on thread with name '%s'", Thread.currentThread().getName());
                        throw new uqg();
                    } catch (uqg unused) {
                    }
                }
            }
            this.e.run();
            return;
        }
        if (i == 1) {
            gjt gjtVar = (gjt) this.c;
            Object objE = gjtVar.e();
            Object obj4 = this.a;
            Object obj5 = this.b;
            if (objE != tkr.b) {
                gjt gjtVar2 = (gjt) obj5;
                if (gjtVar2.e() != tkx.b) {
                    if (gjtVar2.e() != tkx.a) {
                        Object objE2 = gjtVar2.e();
                        Objects.toString(objE2);
                        throw new IllegalStateException("Illegal state transition, SetupStatus=".concat(String.valueOf(objE2)));
                    }
                    ?? r0 = this.d;
                    Object obj6 = this.e;
                    tla.a.l().M("[%s] Dispatching setup result %s", ((tla) obj4).b, obj6);
                    gjtVar2.f(tkx.c);
                    r0.a(new tkt(obj6));
                    return;
                }
            }
            tla.a.l().R("[%s] Setup result is obsolete: lastRequestFromClientForThisLifecycle=%s, setupStatusForThisLifecycle=%s", ((tla) obj4).b, gjtVar.e(), ((gjt) obj5).e());
            return;
        }
        if (i == 2) {
            Object obj7 = this.e;
            unp unpVar = (unp) this.c;
            String str = (String) obj7;
            zgp zgpVarR = unpVar.r(str);
            Object obj8 = this.b;
            Object obj9 = this.d;
            if (zgpVarR == null) {
                unx unxVar = (unx) obj9;
                unq unqVar = (unq) obj8;
                unpVar.u(unxVar.d, new unk(unpVar, str, new und(unpVar, unxVar, unqVar, 3), new une(unpVar, unxVar, unqVar, 3), unpVar.a()), false, unpVar.a());
                return;
            } else if (zgpVarR.isDone()) {
                unpVar.p((unx) obj9, zgpVarR, (unq) obj8);
                return;
            } else {
                zgpVarR.c(new saq(unpVar, (unx) obj9, zgpVarR, (unq) obj8, 9), unpVar.c);
                return;
            }
        }
        if (i == 3) {
            Object obj10 = this.e;
            Context context = zus.a;
            int i2 = tnd.a;
            String str2 = (String) obj10;
            if (new File(str2, "_google_maps_sdk_developer_exception_").exists()) {
                ?? r1 = this.b;
                if (r1.gu() != null) {
                    Object obj11 = this.c;
                    Object obj12 = this.d;
                    Object obj13 = this.a;
                    tng tngVar = (tng) r1.gu();
                    zbu zbuVarF = ysi.F((zyb) obj13, (zbi) obj12, ((Context) obj11).getPackageName());
                    tngVar.a.c("SdkDeveloperException").a(0L, sij.a(zbuVarF));
                    tngVar.a();
                    tng.b("SdkDeveloperException", zbuVarF);
                    tnd.a(str2, "_google_maps_sdk_developer_exception_");
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            Context context2 = zus.a;
            ?? r02 = this.b;
            if (r02.gu() != null) {
                Object obj14 = this.e;
                Object obj15 = this.c;
                Object obj16 = this.d;
                Object obj17 = this.a;
                tng tngVar2 = (tng) r02.gu();
                zbu zbuVarF2 = ysi.F((zyb) obj17, (zbi) obj16, ((Context) obj15).getPackageName());
                tngVar2.a.c("SdkCrashed").a(0L, sij.a(zbuVarF2));
                tngVar2.a();
                tng.b("SdkCrashed", zbuVarF2);
                tnd.a((String) obj14, "_google_maps_sdk_crash_");
                return;
            }
            return;
        }
        aacq aacqVar = ((zyb) ((aabc) this.d).h).x;
        Object obj18 = this.e;
        ?? r4 = this.b;
        String str3 = (String) obj18;
        boolean zF = r4.f(str3);
        Object obj19 = this.a;
        if (zF) {
            if (r4.g(str3)) {
                ((zys) obj19).f(4);
            } else {
                ((zys) obj19).f(3);
            }
            ((zys) obj19).c(aahu.MAP_USE_CLOUD_STYLING, wox.aw(aacqVar, str3));
        } else {
            ((zys) obj19).f(2);
        }
        txu txuVar = (txu) ((tnq) this.c).c();
        txuVar.l.g();
        txuVar.g.n();
        txuVar.u();
    }

    public /* synthetic */ twk(String str, xyc xycVar, zyb zybVar, zbi zbiVar, Context context, int i) {
        this.f = i;
        this.e = str;
        this.b = xycVar;
        this.a = zybVar;
        this.d = zbiVar;
        this.c = context;
    }

    public /* synthetic */ twk(twm twmVar, tqr tqrVar, tqd tqdVar, tqs tqsVar, Runnable runnable, int i) {
        this.f = i;
        this.a = twmVar;
        this.b = tqrVar;
        this.c = tqdVar;
        this.d = tqsVar;
        this.e = runnable;
    }

    public /* synthetic */ twk(unp unpVar, String str, unx unxVar, unq unqVar, vky vkyVar, int i) {
        this.f = i;
        this.c = unpVar;
        this.e = str;
        this.d = unxVar;
        this.b = unqVar;
        this.a = vkyVar;
    }

    public /* synthetic */ twk(xyc xycVar, zyb zybVar, zbi zbiVar, Context context, String str, int i) {
        this.f = i;
        this.b = xycVar;
        this.a = zybVar;
        this.d = zbiVar;
        this.c = context;
        this.e = str;
    }

    public /* synthetic */ twk(zys zysVar, tnq tnqVar, trc trcVar, aabc aabcVar, String str, int i) {
        this.f = i;
        this.a = zysVar;
        this.c = tnqVar;
        this.b = trcVar;
        this.d = aabcVar;
        this.e = str;
    }
}
