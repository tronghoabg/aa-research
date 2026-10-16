package com.google.firebase.perf.config;

import android.content.Context;
import androidx.camera.video.AudioStats;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10300a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f10301b;

    /* renamed from: c, reason: collision with root package name */
    private final RemoteConfigManager f10302c = RemoteConfigManager.getInstance();

    /* renamed from: d, reason: collision with root package name */
    private com.google.firebase.perf.e.e f10303d = new com.google.firebase.perf.e.e();

    /* renamed from: e, reason: collision with root package name */
    private final x f10304e = x.a();

    private final com.google.firebase.perf.e.f A(w wVar) {
        return this.f10303d.b(wVar.b());
    }

    private final com.google.firebase.perf.e.f B(w wVar) {
        return this.f10303d.c(wVar.b());
    }

    private final com.google.firebase.perf.e.f C(w wVar) {
        return this.f10302c.getDouble(wVar.d());
    }

    private final com.google.firebase.perf.e.f D(w wVar) {
        return this.f10302c.getLong(wVar.d());
    }

    private static final boolean E(long j2) {
        return j2 >= 0;
    }

    private static final boolean F(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(com.google.firebase.perf.a.f10252b)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean G(long j2) {
        return j2 >= 0;
    }

    private static final boolean H(double d2) {
        return d2 >= AudioStats.AUDIO_AMPLITUDE_NONE && d2 <= 1.0d;
    }

    private static final boolean I(long j2) {
        return j2 > 0;
    }

    private static final boolean J(long j2) {
        return j2 > 0;
    }

    public static synchronized a o() {
        if (f10301b == null) {
            f10301b = new a();
        }
        return f10301b;
    }

    private final com.google.firebase.perf.e.f v(w wVar) {
        return this.f10304e.b(wVar.c());
    }

    private final com.google.firebase.perf.e.f w(w wVar) {
        return this.f10304e.c(wVar.c());
    }

    private final com.google.firebase.perf.e.f x(w wVar) {
        return this.f10304e.d(wVar.c());
    }

    private final com.google.firebase.perf.e.f y(w wVar) {
        return this.f10304e.e(wVar.c());
    }

    private final com.google.firebase.perf.e.f z(w wVar) {
        return this.f10303d.a(wVar.b());
    }

    public final double a() {
        e eVarA = e.a();
        com.google.firebase.perf.e.f fVarA = A(eVarA);
        if (fVarA.e()) {
            double dDoubleValue = ((Double) fVarA.d()).doubleValue() / 100.0d;
            if (H(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        com.google.firebase.perf.e.f fVarC = C(eVarA);
        if (fVarC.e() && H(((Double) fVarC.d()).doubleValue())) {
            this.f10304e.h("com.google.firebase.perf.FragmentSamplingRate", ((Double) fVarC.d()).doubleValue());
            return ((Double) fVarC.d()).doubleValue();
        }
        com.google.firebase.perf.e.f fVarW = w(eVarA);
        if (fVarW.e() && H(((Double) fVarW.d()).doubleValue())) {
            return ((Double) fVarW.d()).doubleValue();
        }
        Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE).getClass();
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public final double b() {
        j jVarA = j.a();
        com.google.firebase.perf.e.f fVarC = C(jVarA);
        if (fVarC.e() && H(((Double) fVarC.d()).doubleValue())) {
            this.f10304e.h("com.google.firebase.perf.NetworkRequestSamplingRate", ((Double) fVarC.d()).doubleValue());
            return ((Double) fVarC.d()).doubleValue();
        }
        com.google.firebase.perf.e.f fVarW = w(jVarA);
        if (fVarW.e() && H(((Double) fVarW.d()).doubleValue())) {
            return ((Double) fVarW.d()).doubleValue();
        }
        if (!this.f10302c.isLastFetchFailed()) {
            return j.e().doubleValue();
        }
        double dDoubleValue = j.e().doubleValue() / 1000.0d;
        Double.valueOf(dDoubleValue).getClass();
        return dDoubleValue;
    }

    public final double c() {
        s sVarA = s.a();
        com.google.firebase.perf.e.f fVarA = A(sVarA);
        if (fVarA.e()) {
            double dDoubleValue = ((Double) fVarA.d()).doubleValue() / 100.0d;
            if (H(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        com.google.firebase.perf.e.f fVarC = C(sVarA);
        if (fVarC.e() && H(((Double) fVarC.d()).doubleValue())) {
            this.f10304e.h("com.google.firebase.perf.SessionSamplingRate", ((Double) fVarC.d()).doubleValue());
            return ((Double) fVarC.d()).doubleValue();
        }
        com.google.firebase.perf.e.f fVarW = w(sVarA);
        if (fVarW.e() && H(((Double) fVarW.d()).doubleValue())) {
            return ((Double) fVarW.d()).doubleValue();
        }
        if (!this.f10302c.isLastFetchFailed()) {
            return s.e().doubleValue();
        }
        double dDoubleValue2 = s.e().doubleValue() / 1000.0d;
        Double.valueOf(dDoubleValue2).getClass();
        return dDoubleValue2;
    }

    public final double d() {
        v vVarA = v.a();
        com.google.firebase.perf.e.f fVarC = C(vVarA);
        if (fVarC.e() && H(((Double) fVarC.d()).doubleValue())) {
            this.f10304e.h("com.google.firebase.perf.TraceSamplingRate", ((Double) fVarC.d()).doubleValue());
            return ((Double) fVarC.d()).doubleValue();
        }
        com.google.firebase.perf.e.f fVarW = w(vVarA);
        if (fVarW.e() && H(((Double) fVarW.d()).doubleValue())) {
            return ((Double) fVarW.d()).doubleValue();
        }
        if (!this.f10302c.isLastFetchFailed()) {
            return v.e().doubleValue();
        }
        double dDoubleValue = v.e().doubleValue() / 1000.0d;
        Double.valueOf(dDoubleValue).getClass();
        return dDoubleValue;
    }

    public final long e() {
        h hVarA = h.a();
        com.google.firebase.perf.e.f fVarD = D(hVarA);
        if (fVarD.e() && E(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.NetworkEventCountBackground", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(hVarA);
        if (fVarX.e() && E(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        Long l2 = 70L;
        l2.getClass();
        return 70L;
    }

    public final long f() {
        i iVarA = i.a();
        com.google.firebase.perf.e.f fVarD = D(iVarA);
        if (fVarD.e() && E(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.NetworkEventCountForeground", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(iVarA);
        if (fVarX.e() && E(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        Long l2 = 700L;
        l2.getClass();
        return 700L;
    }

    public final long g() {
        k kVarA = k.a();
        com.google.firebase.perf.e.f fVarD = D(kVarA);
        if (fVarD.e() && J(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.TimeLimitSec", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(kVarA);
        if (fVarX.e() && J(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        Long l2 = 600L;
        l2.getClass();
        return 600L;
    }

    public final long h() {
        n nVarA = n.a();
        com.google.firebase.perf.e.f fVarB = B(nVarA);
        if (fVarB.e() && G(((Long) fVarB.d()).longValue())) {
            return ((Long) fVarB.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarD = D(nVarA);
        if (fVarD.e() && G(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(nVarA);
        if (fVarX.e() && G(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        Long l2 = 0L;
        l2.getClass();
        return 0L;
    }

    public final long i() {
        o oVarA = o.a();
        com.google.firebase.perf.e.f fVarB = B(oVarA);
        if (fVarB.e() && G(((Long) fVarB.d()).longValue())) {
            return ((Long) fVarB.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarD = D(oVarA);
        if (fVarD.e() && G(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(oVarA);
        if (fVarX.e() && G(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        if (!this.f10302c.isLastFetchFailed()) {
            o.e().longValue();
            return 100L;
        }
        o.e().longValue();
        Long l2 = 300L;
        l2.getClass();
        return 300L;
    }

    public final long j() {
        p pVarA = p.a();
        com.google.firebase.perf.e.f fVarB = B(pVarA);
        if (fVarB.e() && I(((Long) fVarB.d()).longValue())) {
            return ((Long) fVarB.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarD = D(pVarA);
        if (fVarD.e() && I(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.SessionsMaxDurationMinutes", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(pVarA);
        if (fVarX.e() && I(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        Long l2 = 240L;
        l2.getClass();
        return 240L;
    }

    public final long k() {
        q qVarA = q.a();
        com.google.firebase.perf.e.f fVarB = B(qVarA);
        if (fVarB.e() && G(((Long) fVarB.d()).longValue())) {
            return ((Long) fVarB.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarD = D(qVarA);
        if (fVarD.e() && G(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(qVarA);
        if (fVarX.e() && G(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        Long l2 = 0L;
        l2.getClass();
        return 0L;
    }

    public final long l() {
        r rVarA = r.a();
        com.google.firebase.perf.e.f fVarB = B(rVarA);
        if (fVarB.e() && G(((Long) fVarB.d()).longValue())) {
            return ((Long) fVarB.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarD = D(rVarA);
        if (fVarD.e() && G(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(rVarA);
        if (fVarX.e() && G(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        if (!this.f10302c.isLastFetchFailed()) {
            r.e().longValue();
            return 100L;
        }
        r.e().longValue();
        Long l2 = 300L;
        l2.getClass();
        return 300L;
    }

    public final long m() {
        t tVarA = t.a();
        com.google.firebase.perf.e.f fVarD = D(tVarA);
        if (fVarD.e() && E(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.TraceEventCountBackground", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(tVarA);
        if (fVarX.e() && E(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        Long l2 = 30L;
        l2.getClass();
        return 30L;
    }

    public final long n() {
        u uVarA = u.a();
        com.google.firebase.perf.e.f fVarD = D(uVarA);
        if (fVarD.e() && E(((Long) fVarD.d()).longValue())) {
            this.f10304e.i("com.google.firebase.perf.TraceEventCountForeground", ((Long) fVarD.d()).longValue());
            return ((Long) fVarD.d()).longValue();
        }
        com.google.firebase.perf.e.f fVarX = x(uVarA);
        if (fVarX.e() && E(((Long) fVarX.d()).longValue())) {
            return ((Long) fVarX.d()).longValue();
        }
        Long l2 = 300L;
        l2.getClass();
        return 300L;
    }

    public final Boolean p() {
        com.google.firebase.perf.e.f fVarZ = z(b.a());
        if ((fVarZ.e() ? (Boolean) fVarZ.d() : false).booleanValue()) {
            return false;
        }
        c cVarA = c.a();
        com.google.firebase.perf.e.f fVarV = v(cVarA);
        if (fVarV.e()) {
            return (Boolean) fVarV.d();
        }
        com.google.firebase.perf.e.f fVarZ2 = z(cVarA);
        if (fVarZ2.e()) {
            return (Boolean) fVarZ2.d();
        }
        return null;
    }

    public final String q() {
        String strE;
        g gVarA = g.a();
        com.google.firebase.perf.a.f10251a.booleanValue();
        long jLongValue = ((Long) this.f10302c.getRemoteConfigValueOrDefault("fpr_log_source", -1L)).longValue();
        if (!g.f(jLongValue) || (strE = g.e(jLongValue)) == null) {
            com.google.firebase.perf.e.f fVarY = y(gVarA);
            return fVarY.e() ? (String) fVarY.d() : com.google.firebase.perf.a.f10253c;
        }
        this.f10304e.j("com.google.firebase.perf.LogSourceName", strE);
        return strE;
    }

    public final void r(Context context) {
        f10300a.h(com.google.firebase.perf.e.n.c(context));
        this.f10304e.g(context);
    }

    public final void s(com.google.firebase.perf.e.e eVar) {
        this.f10303d = eVar;
    }

    public final boolean t() {
        com.google.firebase.perf.e.f fVarZ = z(d.a());
        if (fVarZ.e()) {
            return ((Boolean) fVarZ.d()).booleanValue();
        }
        Boolean bool = false;
        bool.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u() {
        /*
            r6 = this;
            java.lang.Boolean r0 = r6.p()
            r1 = 1
            if (r0 == 0) goto Ld
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto Lb9
        Ld:
            com.google.firebase.perf.config.m r0 = com.google.firebase.perf.config.m.a()
            com.google.firebase.perf.e.f r0 = r6.v(r0)
            com.google.firebase.perf.config.RemoteConfigManager r2 = r6.f10302c
            java.lang.String r3 = "fpr_enabled"
            com.google.firebase.perf.e.f r3 = r2.getBoolean(r3)
            boolean r4 = r3.e()
            if (r4 == 0) goto L4d
            boolean r4 = r2.isLastFetchFailed()
            if (r4 == 0) goto L2b
            goto Lb9
        L2b:
            java.lang.Object r3 = r3.d()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r4 = r0.e()
            if (r4 == 0) goto L3d
            java.lang.Object r0 = r0.d()
            if (r0 == r3) goto L48
        L3d:
            com.google.firebase.perf.config.x r0 = r6.f10304e
            boolean r4 = r3.booleanValue()
            java.lang.String r5 = "com.google.firebase.perf.SdkEnabled"
            r0.k(r5, r4)
        L48:
            boolean r0 = r3.booleanValue()
            goto L5d
        L4d:
            boolean r3 = r0.e()
            if (r3 == 0) goto L60
            java.lang.Object r0 = r0.d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L5d:
            if (r0 == 0) goto Lb9
            goto L67
        L60:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r0.getClass()
        L67:
            com.google.firebase.perf.config.l r0 = com.google.firebase.perf.config.l.a()
            com.google.firebase.perf.e.f r0 = r6.y(r0)
            java.lang.String r3 = "fpr_disabled_android_versions"
            com.google.firebase.perf.e.f r2 = r2.getString(r3)
            boolean r3 = r2.e()
            if (r3 == 0) goto L9f
            java.lang.Object r2 = r2.d()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.e()
            if (r3 == 0) goto L93
            java.lang.Object r0 = r0.d()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L9a
        L93:
            com.google.firebase.perf.config.x r6 = r6.f10304e
            java.lang.String r0 = "com.google.firebase.perf.SdkDisabledVersions"
            r6.j(r0, r2)
        L9a:
            boolean r6 = F(r2)
            goto Lb6
        L9f:
            boolean r6 = r0.e()
            if (r6 == 0) goto Lb0
            java.lang.Object r6 = r0.d()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = F(r6)
            goto Lb6
        Lb0:
            java.lang.String r6 = ""
            boolean r6 = F(r6)
        Lb6:
            if (r6 != 0) goto Lb9
            return r1
        Lb9:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.a.u():boolean");
    }
}
