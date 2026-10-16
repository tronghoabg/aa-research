package e0;

import A7.AbstractC0279p0;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.unity3d.services.UnityAdsConstants;
import ef.C2539w;
import f0.AbstractC2547c;
import f0.C2549e;

/* renamed from: e0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2465q {

    /* renamed from: b, reason: collision with root package name */
    public static final long f34373b = z.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f34374c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f34375d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f34376e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f34377f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f34378g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f34379h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f34380i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34381j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f34382a;

    static {
        z.c(4282664004L);
        f34374c = z.c(4287137928L);
        z.c(4291611852L);
        f34375d = z.c(4294967295L);
        f34376e = z.c(4294901760L);
        z.c(4278255360L);
        f34377f = z.c(4278190335L);
        f34378g = z.c(4294967040L);
        z.c(4278255615L);
        z.c(4294902015L);
        f34379h = z.b(0);
        f34380i = z.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, C2549e.f34761s);
    }

    public /* synthetic */ C2465q(long j8) {
        this.f34382a = j8;
    }

    public static long a(long j8, float f10) {
        return z.a(g(j8), f(j8), d(j8), f10, e(j8));
    }

    public static final boolean b(long j8, long j10) {
        return j8 == j10;
    }

    public static final float c(long j8) {
        float fN;
        float f10;
        if ((63 & j8) == 0) {
            fN = (float) Fe.g.N((j8 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fN = (float) Fe.g.N((j8 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fN / f10;
    }

    public static final float d(long j8) {
        return (63 & j8) == 0 ? ((float) Fe.g.N((j8 >>> 32) & 255)) / 255.0f : s.b((short) ((j8 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    public static final AbstractC2547c e(long j8) {
        float[] fArr = C2549e.f34744a;
        return C2549e.f34762t[(int) (j8 & 63)];
    }

    public static final float f(long j8) {
        return (63 & j8) == 0 ? ((float) Fe.g.N((j8 >>> 40) & 255)) / 255.0f : s.b((short) ((j8 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    public static final float g(long j8) {
        return (63 & j8) == 0 ? ((float) Fe.g.N((j8 >>> 48) & 255)) / 255.0f : s.b((short) ((j8 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    public static String h(long j8) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(g(j8));
        sb2.append(", ");
        sb2.append(f(j8));
        sb2.append(", ");
        sb2.append(d(j8));
        sb2.append(", ");
        sb2.append(c(j8));
        sb2.append(", ");
        return AbstractC0279p0.n(sb2, e(j8).f34738a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2465q) {
            return this.f34382a == ((C2465q) obj).f34382a;
        }
        return false;
    }

    public final int hashCode() {
        return C2539w.a(this.f34382a);
    }

    public final String toString() {
        return h(this.f34382a);
    }
}
