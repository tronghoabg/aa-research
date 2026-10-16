package A7;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import p7.AbstractC3772b;

/* renamed from: A7.c1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0241c1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f831a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f832b;

    public C0241c1() {
        this.f831a = 1;
        this.f832b = new ArrayDeque(10);
    }

    public void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f832b;
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e7) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e7);
        }
        if (bundle == null ? false : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(bundle.getString("google.c.a.tc"))) {
                    w8.d dVar = (w8.d) s8.g.e().c(w8.d.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (dVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        dVar.a("fcm", string2);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        dVar.b("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            AbstractC3772b.L(bundle, "_no");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.app.Activity r10, android.os.Bundle r11) {
        /*
            r9 = this;
            int r0 = r9.f831a
            switch(r0) {
                case 0: goto L2a;
                default: goto L5;
            }
        L5:
            android.content.Intent r10 = r10.getIntent()
            if (r10 != 0) goto Lc
            goto L29
        Lc:
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r11 > r0) goto L26
            android.os.Handler r11 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r11.<init>(r0)
            T3.r r0 = new T3.r
            r1 = 16
            r0.<init>(r1, r9, r10)
            r11.post(r0)
            goto L29
        L26:
            r9.a(r10)
        L29:
            return
        L2a:
            java.lang.Object r0 = r9.f832b
            r1 = r0
            A7.P0 r1 = (A7.P0) r1
            A7.N r0 = r1.zzj()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            A7.P r0 = r0.f612n     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            java.lang.String r2 = "onActivityCreated"
            r0.c(r2)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            android.content.Intent r0 = r10.getIntent()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            if (r0 != 0) goto L49
            A7.i1 r0 = r1.f0()
            r0.p0(r10, r11)
            goto Lca
        L49:
            android.net.Uri r2 = r0.getData()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            if (r2 == 0) goto L5c
            boolean r3 = r2.isHierarchical()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            if (r3 == 0) goto L5c
        L55:
            r6 = r2
            goto L75
        L57:
            r0 = move-exception
            goto Lcb
        L5a:
            r0 = move-exception
            goto Lb8
        L5c:
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            if (r2 == 0) goto L73
            java.lang.String r3 = "com.android.vending.referral_url"
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            if (r3 != 0) goto L73
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            goto L55
        L73:
            r2 = 0
            goto L55
        L75:
            if (r6 == 0) goto Lb0
            boolean r2 = r6.isHierarchical()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            if (r2 != 0) goto L7e
            goto Lb0
        L7e:
            r1.b0()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            boolean r0 = A7.U1.L0(r0)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            if (r0 == 0) goto L8b
            java.lang.String r0 = "gs"
        L89:
            r7 = r0
            goto L8e
        L8b:
            java.lang.String r0 = "auto"
            goto L89
        L8e:
            java.lang.String r0 = "referrer"
            java.lang.String r8 = r6.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            if (r11 != 0) goto L99
            r0 = 1
        L97:
            r5 = r0
            goto L9b
        L99:
            r0 = 0
            goto L97
        L9b:
            A7.k0 r0 = r1.zzl()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            A7.A0 r3 = new A7.A0     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            r0.m0(r3)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a
            A7.i1 r0 = r1.f0()
            r0.p0(r10, r11)
            goto Lca
        Lb0:
            A7.i1 r0 = r1.f0()
            r0.p0(r10, r11)
            goto Lca
        Lb8:
            A7.N r2 = r1.zzj()     // Catch: java.lang.Throwable -> L57
            A7.P r2 = r2.f605f     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.d(r3, r0)     // Catch: java.lang.Throwable -> L57
            A7.i1 r0 = r1.f0()
            r0.p0(r10, r11)
        Lca:
            return
        Lcb:
            A7.i1 r1 = r1.f0()
            r1.p0(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0241c1.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f831a) {
            case 0:
                C0259i1 c0259i1F0 = ((P0) this.f832b).f0();
                synchronized (c0259i1F0.f909l) {
                    try {
                        if (activity == c0259i1F0.f905g) {
                            c0259i1F0.f905g = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (((C0273n0) c0259i1F0.f421a).f979g.q0()) {
                    c0259i1F0.f904f.remove(Integer.valueOf(activity.hashCode()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f831a) {
            case 0:
                C0259i1 c0259i1F0 = ((P0) this.f832b).f0();
                synchronized (c0259i1F0.f909l) {
                    c0259i1F0.k = false;
                    c0259i1F0.f906h = true;
                }
                ((C0273n0) c0259i1F0.f421a).f985n.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (((C0273n0) c0259i1F0.f421a).f979g.q0()) {
                    C0262j1 c0262j1Q0 = c0259i1F0.q0(activity);
                    c0259i1F0.f902d = c0259i1F0.f901c;
                    c0259i1F0.f901c = null;
                    c0259i1F0.zzl().m0(new T0(c0259i1F0, c0262j1Q0, jElapsedRealtime));
                } else {
                    c0259i1F0.f901c = null;
                    c0259i1F0.zzl().m0(new A(c0259i1F0, jElapsedRealtime, 1));
                }
                C0303x1 c0303x1G0 = ((P0) this.f832b).g0();
                ((C0273n0) c0303x1G0.f421a).f985n.getClass();
                c0303x1G0.zzl().m0(new RunnableC0309z1(c0303x1G0, SystemClock.elapsedRealtime(), 0));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f831a) {
            case 0:
                C0303x1 c0303x1G0 = ((P0) this.f832b).g0();
                ((C0273n0) c0303x1G0.f421a).f985n.getClass();
                c0303x1G0.zzl().m0(new RunnableC0309z1(c0303x1G0, SystemClock.elapsedRealtime(), 1));
                C0259i1 c0259i1F0 = ((P0) this.f832b).f0();
                synchronized (c0259i1F0.f909l) {
                    c0259i1F0.k = true;
                    if (activity != c0259i1F0.f905g) {
                        synchronized (c0259i1F0.f909l) {
                            c0259i1F0.f905g = activity;
                            c0259i1F0.f906h = false;
                        }
                        if (((C0273n0) c0259i1F0.f421a).f979g.q0()) {
                            c0259i1F0.f907i = null;
                            c0259i1F0.zzl().m0(new RunnableC0265k1(c0259i1F0, 1));
                        }
                    }
                }
                if (!((C0273n0) c0259i1F0.f421a).f979g.q0()) {
                    c0259i1F0.f901c = c0259i1F0.f907i;
                    c0259i1F0.zzl().m0(new RunnableC0265k1(c0259i1F0, 0));
                    return;
                }
                c0259i1F0.o0(activity, c0259i1F0.q0(activity), false);
                r rVarH = ((C0273n0) c0259i1F0.f421a).h();
                ((C0273n0) rVarH.f421a).f985n.getClass();
                rVarH.zzl().m0(new A(rVarH, SystemClock.elapsedRealtime(), 0));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C0262j1 c0262j1;
        switch (this.f831a) {
            case 0:
                C0259i1 c0259i1F0 = ((P0) this.f832b).f0();
                if (((C0273n0) c0259i1F0.f421a).f979g.q0() && bundle != null && (c0262j1 = (C0262j1) c0259i1F0.f904f.get(Integer.valueOf(activity.hashCode()))) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("id", c0262j1.f919c);
                    bundle2.putString(MediationMetaData.KEY_NAME, c0262j1.f917a);
                    bundle2.putString("referrer_name", c0262j1.f918b);
                    bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i5 = this.f831a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i5 = this.f831a;
    }

    public C0241c1(P0 p02) {
        this.f831a = 0;
        this.f832b = p02;
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    private final void k(Activity activity) {
    }

    private final void g(Activity activity, Bundle bundle) {
    }
}
