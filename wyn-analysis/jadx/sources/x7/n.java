package x7;

import android.os.WorkSource;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.location.LocationRequest;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f47793a;

    /* renamed from: b, reason: collision with root package name */
    public final long f47794b;

    /* renamed from: c, reason: collision with root package name */
    public long f47795c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f47796d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f47797e = Long.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f47798f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: g, reason: collision with root package name */
    public float f47799g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47800h = true;

    /* renamed from: i, reason: collision with root package name */
    public long f47801i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f47802j = 0;
    public int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f47803l = false;

    /* renamed from: m, reason: collision with root package name */
    public WorkSource f47804m = null;

    public n(int i5, long j8) {
        this.f47793a = 102;
        AbstractC1732v.a("intervalMillis must be greater than or equal to 0", j8 >= 0);
        this.f47794b = j8;
        z.b(i5);
        this.f47793a = i5;
    }

    public final LocationRequest a() {
        int i5 = this.f47793a;
        long j8 = this.f47794b;
        long jMin = this.f47795c;
        if (jMin == -1) {
            jMin = j8;
        } else if (i5 != 105) {
            jMin = Math.min(jMin, j8);
        }
        long jMax = Math.max(this.f47796d, this.f47794b);
        long j10 = this.f47797e;
        int i10 = this.f47798f;
        float f10 = this.f47799g;
        boolean z2 = this.f47800h;
        long j11 = this.f47801i;
        if (j11 == -1) {
            j11 = this.f47794b;
        }
        return new LocationRequest(i5, j8, jMin, jMax, Long.MAX_VALUE, j10, i10, f10, z2, j11, this.f47802j, this.k, this.f47803l, new WorkSource(this.f47804m), null);
    }

    public final void b(int i5) {
        int i10;
        boolean z2;
        if (i5 != 0 && i5 != 1) {
            i10 = 2;
            if (i5 != 2) {
                i10 = i5;
                z2 = false;
            }
            AbstractC1732v.c(z2, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
            this.f47802j = i5;
        }
        i10 = i5;
        z2 = true;
        AbstractC1732v.c(z2, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
        this.f47802j = i5;
    }

    public final void c(long j8) {
        boolean z2 = true;
        if (j8 != -1 && j8 < 0) {
            z2 = false;
        }
        AbstractC1732v.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z2);
        this.f47801i = j8;
    }

    public final void d(long j8) {
        boolean z2 = true;
        if (j8 != -1 && j8 < 0) {
            z2 = false;
        }
        AbstractC1732v.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", z2);
        this.f47795c = j8;
    }
}
