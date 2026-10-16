package E5;

import com.unity3d.services.UnityAdsConstants;
import u6.AbstractC4256a;

/* renamed from: E5.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0459k {

    /* renamed from: a, reason: collision with root package name */
    public final o2.e f3441a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3442b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3443c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3444d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3445e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3446f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3447g;

    /* renamed from: h, reason: collision with root package name */
    public int f3448h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3449i;

    public C0459k() {
        o2.e eVar = new o2.e(1);
        a(UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f3441a = eVar;
        long j8 = 50000;
        this.f3442b = u6.v.y(j8);
        this.f3443c = u6.v.y(j8);
        this.f3444d = u6.v.y(UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL);
        this.f3445e = u6.v.y(5000);
        this.f3446f = -1;
        this.f3448h = 13107200;
        this.f3447g = u6.v.y(0);
    }

    public static void a(int i5, int i10, String str, String str2) {
        AbstractC4256a.d(str + " cannot be less than " + str2, i5 >= i10);
    }

    public final void b(boolean z2) {
        int i5 = this.f3446f;
        if (i5 == -1) {
            i5 = 13107200;
        }
        this.f3448h = i5;
        this.f3449i = false;
        if (z2) {
            o2.e eVar = this.f3441a;
            synchronized (eVar) {
                if (eVar.f41281b) {
                    eVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j8, float f10) {
        int i5;
        o2.e eVar = this.f3441a;
        synchronized (eVar) {
            i5 = eVar.f41284e * eVar.f41282c;
        }
        boolean z2 = i5 >= this.f3448h;
        long j10 = this.f3443c;
        long jMin = this.f3442b;
        if (f10 > 1.0f) {
            jMin = Math.min(u6.v.n(jMin, f10), j10);
        }
        if (j8 < Math.max(jMin, 500000L)) {
            this.f3449i = !z2;
            if (z2 && j8 < 500000) {
                AbstractC4256a.E("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j8 >= j10 || z2) {
            this.f3449i = false;
        }
        return this.f3449i;
    }
}
