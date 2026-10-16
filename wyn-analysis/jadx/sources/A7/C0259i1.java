package A7;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: A7.i1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0259i1 extends Y {

    /* renamed from: c, reason: collision with root package name */
    public volatile C0262j1 f901c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0262j1 f902d;

    /* renamed from: e, reason: collision with root package name */
    public C0262j1 f903e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f904f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f905g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f906h;

    /* renamed from: i, reason: collision with root package name */
    public volatile C0262j1 f907i;

    /* renamed from: j, reason: collision with root package name */
    public C0262j1 f908j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f909l;

    public C0259i1(C0273n0 c0273n0) {
        super(c0273n0);
        this.f909l = new Object();
        this.f904f = new ConcurrentHashMap();
    }

    @Override // A7.Y
    public final boolean j0() {
        return false;
    }

    public final C0262j1 k0(boolean z2) {
        h0();
        c0();
        if (!z2) {
            return this.f903e;
        }
        C0262j1 c0262j1 = this.f903e;
        return c0262j1 != null ? c0262j1 : this.f908j;
    }

    public final String l0(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        int length = str.length();
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        c0273n0.f979g.getClass();
        if (length <= 500) {
            return str;
        }
        c0273n0.f979g.getClass();
        return str.substring(0, 500);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(A7.C0262j1 r18, A7.C0262j1 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0259i1.m0(A7.j1, A7.j1, long, boolean, android.os.Bundle):void");
    }

    public final void n0(C0262j1 c0262j1, boolean z2, long j8) {
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        r rVarH = c0273n0.h();
        c0273n0.f985n.getClass();
        rVarH.h0(SystemClock.elapsedRealtime());
        if (!g0().f1115f.c(j8, c0262j1 != null && c0262j1.f920d, z2) || c0262j1 == null) {
            return;
        }
        c0262j1.f920d = false;
    }

    public final void o0(Activity activity, C0262j1 c0262j1, boolean z2) {
        C0262j1 c0262j12 = this.f901c == null ? this.f902d : this.f901c;
        C0262j1 c0262j13 = c0262j1.f918b == null ? new C0262j1(c0262j1.f917a, l0(activity.getClass()), c0262j1.f919c, c0262j1.f921e, c0262j1.f922f) : c0262j1;
        this.f902d = this.f901c;
        this.f901c = c0262j13;
        ((C0273n0) this.f421a).f985n.getClass();
        zzl().m0(new RunnableC0244d1(this, c0262j13, c0262j12, SystemClock.elapsedRealtime(), z2));
    }

    public final void p0(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((C0273n0) this.f421a).f979g.q0() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f904f.put(Integer.valueOf(activity.hashCode()), new C0262j1(bundle2.getString(MediationMetaData.KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final C0262j1 q0(Activity activity) {
        AbstractC1732v.i(activity);
        C0262j1 c0262j1 = (C0262j1) this.f904f.get(Integer.valueOf(activity.hashCode()));
        if (c0262j1 == null) {
            C0262j1 c0262j12 = new C0262j1(null, l0(activity.getClass()), b0().o1());
            this.f904f.put(Integer.valueOf(activity.hashCode()), c0262j12);
            c0262j1 = c0262j12;
        }
        return this.f907i != null ? this.f907i : c0262j1;
    }
}
