package W1;

import A.e0;
import android.media.AudioTrack;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: A, reason: collision with root package name */
    public long f14979A;

    /* renamed from: B, reason: collision with root package name */
    public long f14980B;

    /* renamed from: C, reason: collision with root package name */
    public long f14981C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14982D;

    /* renamed from: E, reason: collision with root package name */
    public long f14983E;

    /* renamed from: F, reason: collision with root package name */
    public long f14984F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14985G;

    /* renamed from: H, reason: collision with root package name */
    public long f14986H;

    /* renamed from: I, reason: collision with root package name */
    public Q1.q f14987I;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f14988a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f14989b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f14990c;

    /* renamed from: d, reason: collision with root package name */
    public int f14991d;

    /* renamed from: e, reason: collision with root package name */
    public G5.v f14992e;

    /* renamed from: f, reason: collision with root package name */
    public int f14993f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14994g;

    /* renamed from: h, reason: collision with root package name */
    public long f14995h;

    /* renamed from: i, reason: collision with root package name */
    public float f14996i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14997j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f14998l;

    /* renamed from: m, reason: collision with root package name */
    public Method f14999m;

    /* renamed from: n, reason: collision with root package name */
    public long f15000n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15001o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15002p;

    /* renamed from: q, reason: collision with root package name */
    public long f15003q;

    /* renamed from: r, reason: collision with root package name */
    public long f15004r;

    /* renamed from: s, reason: collision with root package name */
    public long f15005s;

    /* renamed from: t, reason: collision with root package name */
    public long f15006t;

    /* renamed from: u, reason: collision with root package name */
    public long f15007u;

    /* renamed from: v, reason: collision with root package name */
    public int f15008v;

    /* renamed from: w, reason: collision with root package name */
    public int f15009w;

    /* renamed from: x, reason: collision with root package name */
    public long f15010x;

    /* renamed from: y, reason: collision with root package name */
    public long f15011y;

    /* renamed from: z, reason: collision with root package name */
    public long f15012z;

    public l(e0 e0Var) {
        this.f14988a = e0Var;
        try {
            this.f14999m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14989b = new long[10];
        this.f14987I = Q1.q.f9708a;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a A[Catch: Exception -> 0x0230, TRY_LEAVE, TryCatch #0 {Exception -> 0x0230, blocks: (B:91:0x01f3, B:93:0x021a), top: B:135:0x01f3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r26) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.l.a(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r11 = this;
            Q1.q r0 = r11.f14987I
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r11.f15010x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L46
            android.media.AudioTrack r2 = r11.f14990c
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L23
            long r0 = r11.f15012z
            return r0
        L23:
            long r0 = Q1.x.K(r0)
            long r2 = r11.f15010x
            long r0 = r0 - r2
            float r2 = r11.f14996i
            long r3 = Q1.x.w(r0, r2)
            int r0 = r11.f14993f
            long r5 = (long) r0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r9 = java.math.RoundingMode.UP
            long r0 = Q1.x.S(r3, r5, r7, r9)
            long r2 = r11.f14979A
            long r4 = r11.f15012z
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L46:
            long r6 = r11.f15004r
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto Lb7
            android.media.AudioTrack r2 = r11.f14990c
            r2.getClass()
            int r6 = r2.getPlayState()
            r7 = 1
            if (r6 != r7) goto L5d
            goto Lb5
        L5d:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            boolean r2 = r11.f14994g
            r9 = 0
            if (r2 == 0) goto L7b
            if (r6 != r3) goto L78
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L78
            long r2 = r11.f15005s
            r11.f15007u = r2
        L78:
            long r2 = r11.f15007u
            long r7 = r7 + r2
        L7b:
            int r2 = Q1.x.f9724a
            r3 = 29
            if (r2 > r3) goto L99
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L97
            long r2 = r11.f15005s
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L97
            r2 = 3
            if (r6 != r2) goto L97
            long r2 = r11.f15011y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb5
            r11.f15011y = r0
            goto Lb5
        L97:
            r11.f15011y = r4
        L99:
            long r2 = r11.f15005s
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto Lb3
            boolean r4 = r11.f14985G
            if (r4 == 0) goto Lac
            long r4 = r11.f14986H
            long r4 = r4 + r2
            r11.f14986H = r4
            r2 = 0
            r11.f14985G = r2
            goto Lb3
        Lac:
            long r2 = r11.f15006t
            r4 = 1
            long r2 = r2 + r4
            r11.f15006t = r2
        Lb3:
            r11.f15005s = r7
        Lb5:
            r11.f15004r = r0
        Lb7:
            long r0 = r11.f15005s
            long r2 = r11.f14986H
            long r0 = r0 + r2
            long r2 = r11.f15006t
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.l.b():long");
    }

    public final boolean c(long j8) {
        long jA = a(false);
        int i5 = this.f14993f;
        int i10 = Q1.x.f9724a;
        if (j8 > Q1.x.S(jA, i5, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (this.f14994g) {
            AudioTrack audioTrack = this.f14990c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && b() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.k = 0L;
        this.f15009w = 0;
        this.f15008v = 0;
        this.f14998l = 0L;
        this.f14981C = 0L;
        this.f14984F = 0L;
        this.f14997j = false;
    }
}
