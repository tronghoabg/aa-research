package com.google.android.gms.measurement.internal;

import A7.A0;
import A7.AbstractC0304y;
import A7.C0233a;
import A7.C0241c1;
import A7.C0245e;
import A7.C0259i1;
import A7.C0262j1;
import A7.C0264k0;
import A7.C0273n0;
import A7.C0298w;
import A7.C0301x;
import A7.I0;
import A7.J0;
import A7.K0;
import A7.N;
import A7.P0;
import A7.Q0;
import A7.RunnableC0278p;
import A7.RunnableC0282q0;
import A7.S0;
import A7.T0;
import A7.U1;
import A7.W0;
import A7.Y0;
import A7.Z0;
import S3.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzdp;
import com.google.android.gms.internal.measurement.zzdu;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzpu;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import x.C4412e;

@DynamiteApi
/* loaded from: classes4.dex */
public class AppMeasurementDynamiteService extends zzdm {

    /* renamed from: a, reason: collision with root package name */
    public C0273n0 f26746a = null;

    /* renamed from: b, reason: collision with root package name */
    public final C4412e f26747b = new C4412e(0);

    public final void R(String str, zzdo zzdoVar) {
        zza();
        U1 u12 = this.f26746a.f983l;
        C0273n0.c(u12);
        u12.E0(str, zzdoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void beginAdUnitExposure(String str, long j8) throws RemoteException {
        zza();
        this.f26746a.h().j0(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.u0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void clearMeasurementEnabled(long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.h0();
        p02.zzl().m0(new RunnableC0278p(7, p02, (Object) null));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void endAdUnitExposure(String str, long j8) throws RemoteException {
        zza();
        this.f26746a.h().m0(j8, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void generateEventId(zzdo zzdoVar) throws RemoteException {
        zza();
        U1 u12 = this.f26746a.f983l;
        C0273n0.c(u12);
        long jO1 = u12.o1();
        zza();
        U1 u13 = this.f26746a.f983l;
        C0273n0.c(u13);
        u13.z0(zzdoVar, jO1);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getAppInstanceId(zzdo zzdoVar) throws RemoteException {
        zza();
        C0264k0 c0264k0 = this.f26746a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.m0(new RunnableC0282q0(this, zzdoVar, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getCachedAppInstanceId(zzdo zzdoVar) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        R((String) p02.f654g.get(), zzdoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getConditionalUserProperties(String str, String str2, zzdo zzdoVar) throws RemoteException {
        zza();
        C0264k0 c0264k0 = this.f26746a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.m0(new W0(2, str, this, zzdoVar, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getCurrentScreenClass(zzdo zzdoVar) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        C0259i1 c0259i1 = ((C0273n0) p02.f421a).f986o;
        C0273n0.b(c0259i1);
        C0262j1 c0262j1 = c0259i1.f901c;
        R(c0262j1 != null ? c0262j1.f918b : null, zzdoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getCurrentScreenName(zzdo zzdoVar) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        C0259i1 c0259i1 = ((C0273n0) p02.f421a).f986o;
        C0273n0.b(c0259i1);
        C0262j1 c0262j1 = c0259i1.f901c;
        R(c0262j1 != null ? c0262j1.f917a : null, zzdoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getGmpAppId(zzdo zzdoVar) throws Resources.NotFoundException, RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        C0273n0 c0273n0 = (C0273n0) p02.f421a;
        String string = c0273n0.f974b;
        if (string == null) {
            string = null;
            try {
                Context context = c0273n0.f973a;
                String strB = c0273n0.f990s;
                AbstractC1732v.i(context);
                Resources resources = context.getResources();
                if (TextUtils.isEmpty(strB)) {
                    strB = I0.b(context);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", strB);
                if (identifier != 0) {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e7) {
                N n10 = c0273n0.f981i;
                C0273n0.d(n10);
                n10.f605f.d("getGoogleAppId failed with exception", e7);
            }
        }
        R(string, zzdoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getMaxUserProperties(String str, zzdo zzdoVar) throws RemoteException {
        zza();
        C0273n0.b(this.f26746a.f987p);
        AbstractC1732v.f(str);
        zza();
        U1 u12 = this.f26746a.f983l;
        C0273n0.c(u12);
        u12.y0(zzdoVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getSessionId(zzdo zzdoVar) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.zzl().m0(new RunnableC0278p(6, p02, zzdoVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getTestFlag(zzdo zzdoVar, int i5) throws RemoteException {
        zza();
        if (i5 == 0) {
            U1 u12 = this.f26746a.f983l;
            C0273n0.c(u12);
            P0 p02 = this.f26746a.f987p;
            C0273n0.b(p02);
            AtomicReference atomicReference = new AtomicReference();
            u12.E0((String) p02.zzl().i0(atomicReference, 15000L, "String test flag value", new Q0(p02, atomicReference, 2)), zzdoVar);
            return;
        }
        if (i5 == 1) {
            U1 u13 = this.f26746a.f983l;
            C0273n0.c(u13);
            P0 p03 = this.f26746a.f987p;
            C0273n0.b(p03);
            AtomicReference atomicReference2 = new AtomicReference();
            u13.z0(zzdoVar, ((Long) p03.zzl().i0(atomicReference2, 15000L, "long test flag value", new Q0(p03, atomicReference2, 4))).longValue());
            return;
        }
        if (i5 == 2) {
            U1 u14 = this.f26746a.f983l;
            C0273n0.c(u14);
            P0 p04 = this.f26746a.f987p;
            C0273n0.b(p04);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) p04.zzl().i0(atomicReference3, 15000L, "double test flag value", new Q0(p04, atomicReference3, 5))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, dDoubleValue);
            try {
                zzdoVar.zza(bundle);
                return;
            } catch (RemoteException e7) {
                N n10 = ((C0273n0) u14.f421a).f981i;
                C0273n0.d(n10);
                n10.f608i.d("Error returning double value to wrapper", e7);
                return;
            }
        }
        if (i5 == 3) {
            U1 u15 = this.f26746a.f983l;
            C0273n0.c(u15);
            P0 p05 = this.f26746a.f987p;
            C0273n0.b(p05);
            AtomicReference atomicReference4 = new AtomicReference();
            u15.y0(zzdoVar, ((Integer) p05.zzl().i0(atomicReference4, 15000L, "int test flag value", new Q0(p05, atomicReference4, 3))).intValue());
            return;
        }
        if (i5 != 4) {
            return;
        }
        U1 u16 = this.f26746a.f983l;
        C0273n0.c(u16);
        P0 p06 = this.f26746a.f987p;
        C0273n0.b(p06);
        AtomicReference atomicReference5 = new AtomicReference();
        u16.C0(zzdoVar, ((Boolean) p06.zzl().i0(atomicReference5, 15000L, "boolean test flag value", new Q0(p06, atomicReference5, 1))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getUserProperties(String str, String str2, boolean z2, zzdo zzdoVar) throws RemoteException {
        zza();
        C0264k0 c0264k0 = this.f26746a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.m0(new A0(this, zzdoVar, str, str2, z2, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void initForTests(Map map) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void initialize(InterfaceC3876a interfaceC3876a, zzdw zzdwVar, long j8) throws RemoteException {
        C0273n0 c0273n0 = this.f26746a;
        if (c0273n0 == null) {
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            AbstractC1732v.i(context);
            this.f26746a = C0273n0.a(context, zzdwVar, Long.valueOf(j8));
        } else {
            N n10 = c0273n0.f981i;
            C0273n0.d(n10);
            n10.f608i.c("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void isDataCollectionEnabled(zzdo zzdoVar) throws RemoteException {
        zza();
        C0264k0 c0264k0 = this.f26746a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.m0(new RunnableC0282q0(this, zzdoVar, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.w0(str, str2, bundle, z2, z10, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzdo zzdoVar, long j8) throws RemoteException {
        zza();
        AbstractC1732v.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C0301x c0301x = new C0301x(str2, new C0298w(bundle), "app", j8);
        C0264k0 c0264k0 = this.f26746a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.m0(new W0(this, zzdoVar, c0301x, str, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void logHealthData(int i5, String str, InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, InterfaceC3876a interfaceC3876a3) throws RemoteException {
        zza();
        Object objS = interfaceC3876a == null ? null : BinderC3877b.S(interfaceC3876a);
        Object objS2 = interfaceC3876a2 == null ? null : BinderC3877b.S(interfaceC3876a2);
        Object objS3 = interfaceC3876a3 != null ? BinderC3877b.S(interfaceC3876a3) : null;
        N n10 = this.f26746a.f981i;
        C0273n0.d(n10);
        n10.k0(i5, true, false, str, objS, objS2, objS3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityCreated(InterfaceC3876a interfaceC3876a, Bundle bundle, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        C0241c1 c0241c1 = p02.f650c;
        if (c0241c1 != null) {
            P0 p03 = this.f26746a.f987p;
            C0273n0.b(p03);
            p03.A0();
            c0241c1.onActivityCreated((Activity) BinderC3877b.S(interfaceC3876a), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityDestroyed(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        C0241c1 c0241c1 = p02.f650c;
        if (c0241c1 != null) {
            P0 p03 = this.f26746a.f987p;
            C0273n0.b(p03);
            p03.A0();
            c0241c1.onActivityDestroyed((Activity) BinderC3877b.S(interfaceC3876a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityPaused(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        C0241c1 c0241c1 = p02.f650c;
        if (c0241c1 != null) {
            P0 p03 = this.f26746a.f987p;
            C0273n0.b(p03);
            p03.A0();
            c0241c1.onActivityPaused((Activity) BinderC3877b.S(interfaceC3876a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityResumed(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        C0241c1 c0241c1 = p02.f650c;
        if (c0241c1 != null) {
            P0 p03 = this.f26746a.f987p;
            C0273n0.b(p03);
            p03.A0();
            c0241c1.onActivityResumed((Activity) BinderC3877b.S(interfaceC3876a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivitySaveInstanceState(InterfaceC3876a interfaceC3876a, zzdo zzdoVar, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        C0241c1 c0241c1 = p02.f650c;
        Bundle bundle = new Bundle();
        if (c0241c1 != null) {
            P0 p03 = this.f26746a.f987p;
            C0273n0.b(p03);
            p03.A0();
            c0241c1.onActivitySaveInstanceState((Activity) BinderC3877b.S(interfaceC3876a), bundle);
        }
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e7) {
            N n10 = this.f26746a.f981i;
            C0273n0.d(n10);
            n10.f608i.d("Error returning bundle value to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityStarted(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        if (p02.f650c != null) {
            P0 p03 = this.f26746a.f987p;
            C0273n0.b(p03);
            p03.A0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityStopped(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        if (p02.f650c != null) {
            P0 p03 = this.f26746a.f987p;
            C0273n0.b(p03);
            p03.A0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void performAction(Bundle bundle, zzdo zzdoVar, long j8) throws RemoteException {
        zza();
        zzdoVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void registerOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException {
        Object c0233a;
        zza();
        synchronized (this.f26747b) {
            try {
                c0233a = (J0) this.f26747b.get(Integer.valueOf(zzdpVar.zza()));
                if (c0233a == null) {
                    c0233a = new C0233a(this, zzdpVar);
                    this.f26747b.put(Integer.valueOf(zzdpVar.zza()), c0233a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.h0();
        if (p02.f652e.add(c0233a)) {
            return;
        }
        p02.zzj().f608i.c("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void resetAnalyticsData(long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.G0(null);
        p02.zzl().m0(new Z0(p02, j8, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setConditionalUserProperty(Bundle bundle, long j8) throws RemoteException {
        zza();
        if (bundle == null) {
            N n10 = this.f26746a.f981i;
            C0273n0.d(n10);
            n10.f605f.c("Conditional user property must not be null");
        } else {
            P0 p02 = this.f26746a.f987p;
            C0273n0.b(p02);
            p02.F0(bundle, j8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setConsent(Bundle bundle, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        C0264k0 c0264k0Zzl = p02.zzl();
        T0 t02 = new T0();
        t02.f699c = p02;
        t02.f700d = bundle;
        t02.f698b = j8;
        c0264k0Zzl.n0(t02);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setConsentThirdParty(Bundle bundle, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.r0(bundle, -20, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r0 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r0 > 500) goto L34;
     */
    @Override // com.google.android.gms.internal.measurement.zzdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreen(q7.InterfaceC3876a r3, java.lang.String r4, java.lang.String r5, long r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r2.zza()
            A7.n0 r6 = r2.f26746a
            A7.i1 r6 = r6.f986o
            A7.C0273n0.b(r6)
            java.lang.Object r3 = q7.BinderC3877b.S(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r7 = r6.f421a
            A7.n0 r7 = (A7.C0273n0) r7
            A7.e r7 = r7.f979g
            boolean r7 = r7.q0()
            if (r7 != 0) goto L28
            A7.N r3 = r6.zzj()
            A7.P r3 = r3.k
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.c(r4)
            return
        L28:
            A7.j1 r7 = r6.f901c
            if (r7 != 0) goto L38
            A7.N r3 = r6.zzj()
            A7.P r3 = r3.k
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.c(r4)
            return
        L38:
            j$.util.concurrent.ConcurrentHashMap r0 = r6.f904f
            int r1 = r3.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L54
            A7.N r3 = r6.zzj()
            A7.P r3 = r3.k
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.c(r4)
            return
        L54:
            if (r5 != 0) goto L5e
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r6.l0(r5)
        L5e:
            java.lang.String r0 = r7.f918b
            boolean r0 = j$.util.Objects.equals(r0, r5)
            java.lang.String r7 = r7.f917a
            boolean r7 = j$.util.Objects.equals(r7, r4)
            if (r0 == 0) goto L7a
            if (r7 == 0) goto L7a
            A7.N r3 = r6.zzj()
            A7.P r3 = r3.k
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.c(r4)
            return
        L7a:
            r7 = 500(0x1f4, float:7.0E-43)
            if (r4 == 0) goto La7
            int r0 = r4.length()
            if (r0 <= 0) goto L93
            int r0 = r4.length()
            java.lang.Object r1 = r6.f421a
            A7.n0 r1 = (A7.C0273n0) r1
            A7.e r1 = r1.f979g
            r1.getClass()
            if (r0 <= r7) goto La7
        L93:
            A7.N r3 = r6.zzj()
            A7.P r3 = r3.k
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            r3.d(r5, r4)
            return
        La7:
            if (r5 == 0) goto Ld2
            int r0 = r5.length()
            if (r0 <= 0) goto Lbe
            int r0 = r5.length()
            java.lang.Object r1 = r6.f421a
            A7.n0 r1 = (A7.C0273n0) r1
            A7.e r1 = r1.f979g
            r1.getClass()
            if (r0 <= r7) goto Ld2
        Lbe:
            A7.N r3 = r6.zzj()
            A7.P r3 = r3.k
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            r3.d(r5, r4)
            return
        Ld2:
            A7.N r7 = r6.zzj()
            A7.P r7 = r7.f612n
            if (r4 != 0) goto Ldd
            java.lang.String r0 = "null"
            goto Lde
        Ldd:
            r0 = r4
        Lde:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.b(r0, r1, r5)
            A7.j1 r7 = new A7.j1
            A7.U1 r0 = r6.b0()
            long r0 = r0.o1()
            r7.<init>(r4, r5, r0)
            j$.util.concurrent.ConcurrentHashMap r4 = r6.f904f
            int r5 = r3.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r5, r7)
            r4 = 1
            r6.o0(r3, r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(q7.a, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setDataCollectionEnabled(boolean z2) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.h0();
        p02.zzl().m0(new Y0(0, p02, z2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setDefaultEventParameters(Bundle bundle) {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C0264k0 c0264k0Zzl = p02.zzl();
        S0 s02 = new S0();
        s02.f696c = p02;
        s02.f695b = bundle2;
        c0264k0Zzl.m0(s02);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setEventInterceptor(zzdp zzdpVar) throws RemoteException {
        zza();
        c cVar = new c(2, this, zzdpVar);
        C0264k0 c0264k0 = this.f26746a.f982j;
        C0273n0.d(c0264k0);
        if (!c0264k0.o0()) {
            C0264k0 c0264k02 = this.f26746a.f982j;
            C0273n0.d(c0264k02);
            c0264k02.m0(new RunnableC0278p(9, this, cVar));
            return;
        }
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.c0();
        p02.h0();
        K0 k02 = p02.f651d;
        if (cVar != k02) {
            AbstractC1732v.k("EventInterceptor already set.", k02 == null);
        }
        p02.f651d = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setInstanceIdProvider(zzdu zzduVar) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setMeasurementEnabled(boolean z2, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        Boolean boolValueOf = Boolean.valueOf(z2);
        p02.h0();
        p02.zzl().m0(new RunnableC0278p(7, p02, boolValueOf));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setMinimumSessionDuration(long j8) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setSessionTimeoutDuration(long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.zzl().m0(new Z0(p02, j8, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        if (zzpu.zza()) {
            C0273n0 c0273n0 = (C0273n0) p02.f421a;
            if (c0273n0.f979g.o0(null, AbstractC0304y.f1224y0)) {
                Uri data = intent.getData();
                if (data == null) {
                    p02.zzj().f610l.c("Activity intent has no data. Preview Mode was not enabled.");
                    return;
                }
                String queryParameter = data.getQueryParameter("sgtm_debug_enable");
                C0245e c0245e = c0273n0.f979g;
                if (queryParameter == null || !queryParameter.equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
                    p02.zzj().f610l.c("Preview Mode was not enabled.");
                    c0245e.f852c = null;
                    return;
                }
                String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
                if (TextUtils.isEmpty(queryParameter2)) {
                    return;
                }
                p02.zzj().f610l.d("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
                c0245e.f852c = queryParameter2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setUserId(String str, long j8) throws RemoteException {
        zza();
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        if (str != null && TextUtils.isEmpty(str)) {
            N n10 = ((C0273n0) p02.f421a).f981i;
            C0273n0.d(n10);
            n10.f608i.c("User ID must be non-empty or null");
        } else {
            C0264k0 c0264k0Zzl = p02.zzl();
            RunnableC0278p runnableC0278p = new RunnableC0278p(5);
            runnableC0278p.f1018b = p02;
            runnableC0278p.f1019c = str;
            c0264k0Zzl.m0(runnableC0278p);
            p02.x0(null, "_id", str, true, j8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setUserProperty(String str, String str2, InterfaceC3876a interfaceC3876a, boolean z2, long j8) throws SecurityException, RemoteException {
        zza();
        Object objS = BinderC3877b.S(interfaceC3876a);
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.x0(str, str2, objS, z2, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void unregisterOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException {
        Object c0233a;
        zza();
        synchronized (this.f26747b) {
            c0233a = (J0) this.f26747b.remove(Integer.valueOf(zzdpVar.zza()));
        }
        if (c0233a == null) {
            c0233a = new C0233a(this, zzdpVar);
        }
        P0 p02 = this.f26746a.f987p;
        C0273n0.b(p02);
        p02.h0();
        if (p02.f652e.remove(c0233a)) {
            return;
        }
        p02.zzj().f608i.c("OnEventListener had not been registered");
    }

    public final void zza() {
        if (this.f26746a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
