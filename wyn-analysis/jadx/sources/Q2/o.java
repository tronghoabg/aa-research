package q2;

import Q1.x;
import android.view.Display;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import u6.v;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44084a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44085b;

    /* renamed from: c, reason: collision with root package name */
    public Surface f44086c;

    /* renamed from: d, reason: collision with root package name */
    public float f44087d;

    /* renamed from: e, reason: collision with root package name */
    public float f44088e;

    /* renamed from: f, reason: collision with root package name */
    public float f44089f;

    /* renamed from: g, reason: collision with root package name */
    public float f44090g;

    /* renamed from: h, reason: collision with root package name */
    public int f44091h;

    /* renamed from: i, reason: collision with root package name */
    public long f44092i;

    /* renamed from: j, reason: collision with root package name */
    public long f44093j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f44094l;

    /* renamed from: m, reason: collision with root package name */
    public long f44095m;

    /* renamed from: n, reason: collision with root package name */
    public long f44096n;

    /* renamed from: o, reason: collision with root package name */
    public long f44097o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f44098p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f44099q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f44100r;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r4.f44084a = r6
            switch(r6) {
                case 1: goto L52;
                default: goto L5;
            }
        L5:
            r4.<init>()
            q2.b r6 = new q2.b
            r6.<init>()
            q2.a r0 = new q2.a
            r1 = 0
            r0.<init>(r1)
            r6.f43985d = r0
            q2.a r0 = new q2.a
            r0.<init>(r1)
            r6.f43986e = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f43983b = r0
            r4.f44098p = r6
            r6 = 0
            if (r5 != 0) goto L2a
        L28:
            r2 = r6
            goto L3a
        L2a:
            java.lang.String r2 = "display"
            java.lang.Object r5 = r5.getSystemService(r2)
            android.hardware.display.DisplayManager r5 = (android.hardware.display.DisplayManager) r5
            if (r5 == 0) goto L28
            io.flutter.view.s r2 = new io.flutter.view.s
            r3 = 2
            r2.<init>(r4, r5, r3)
        L3a:
            r4.f44099q = r2
            if (r2 == 0) goto L40
            q2.n r6 = q2.n.f44079e
        L40:
            r4.f44100r = r6
            r4.f44092i = r0
            r4.f44093j = r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.f44087d = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.f44090g = r5
            r5 = 0
            r4.f44091h = r5
            return
        L52:
            r4.<init>()
            q2.b r6 = new q2.b
            r6.<init>()
            q2.a r0 = new q2.a
            r1 = 1
            r0.<init>(r1)
            r6.f43985d = r0
            q2.a r0 = new q2.a
            r0.<init>(r1)
            r6.f43986e = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f43983b = r0
            r4.f44098p = r6
            r6 = 0
            if (r5 == 0) goto La2
            android.content.Context r5 = r5.getApplicationContext()
            int r2 = u6.v.f46721a
            r3 = 17
            if (r2 < r3) goto L8f
            java.lang.String r2 = "display"
            java.lang.Object r2 = r5.getSystemService(r2)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            if (r2 == 0) goto L8f
            io.flutter.view.s r3 = new io.flutter.view.s
            r3.<init>(r2)
            goto L90
        L8f:
            r3 = r6
        L90:
            if (r3 != 0) goto La3
            java.lang.String r2 = "window"
            java.lang.Object r5 = r5.getSystemService(r2)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            if (r5 == 0) goto La2
            v6.l r3 = new v6.l
            r3.<init>(r5)
            goto La3
        La2:
            r3 = r6
        La3:
            r4.f44099q = r3
            if (r3 == 0) goto La9
            v6.m r6 = v6.m.f46891e
        La9:
            r4.f44100r = r6
            r4.f44092i = r0
            r4.f44093j = r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.f44087d = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.f44090g = r5
            r5 = 0
            r4.f44091h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.o.<init>(android.content.Context, int):void");
    }

    public static void a(o oVar, Display display) {
        oVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            oVar.f44092i = refreshRate;
            oVar.f44093j = (refreshRate * 80) / 100;
        } else {
            Q1.k.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            oVar.f44092i = -9223372036854775807L;
            oVar.f44093j = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        Surface surface2;
        switch (this.f44084a) {
            case 0:
                if (x.f9724a >= 30 && (surface = this.f44086c) != null && this.f44091h != Integer.MIN_VALUE && this.f44089f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.f44089f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    try {
                        surface.setFrameRate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                        break;
                    } catch (IllegalStateException e7) {
                        Q1.k.l("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
                        return;
                    }
                }
                break;
            default:
                if (v.f46721a >= 30 && (surface2 = this.f44086c) != null && this.f44091h != Integer.MIN_VALUE && this.f44089f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.f44089f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    v6.j.a(surface2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.o.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = r4.f44084a
            switch(r0) {
                case 0: goto L36;
                default: goto L5;
            }
        L5:
            int r0 = u6.v.f46721a
            r1 = 30
            if (r0 < r1) goto L35
            android.view.Surface r0 = r4.f44086c
            if (r0 == 0) goto L35
            int r1 = r4.f44091h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L16
            goto L35
        L16:
            boolean r1 = r4.f44085b
            if (r1 == 0) goto L26
            float r1 = r4.f44088e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L26
            float r2 = r4.f44090g
            float r1 = r1 * r2
            goto L27
        L26:
            r1 = 0
        L27:
            if (r5 != 0) goto L30
            float r5 = r4.f44089f
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L30
            goto L35
        L30:
            r4.f44089f = r1
            v6.j.a(r0, r1)
        L35:
            return
        L36:
            int r0 = Q1.x.f9724a
            r1 = 30
            if (r0 < r1) goto L77
            android.view.Surface r0 = r4.f44086c
            if (r0 == 0) goto L77
            int r1 = r4.f44091h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L47
            goto L77
        L47:
            boolean r1 = r4.f44085b
            r2 = 0
            if (r1 == 0) goto L58
            float r1 = r4.f44088e
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L58
            float r3 = r4.f44090g
            float r1 = r1 * r3
            goto L59
        L58:
            r1 = r2
        L59:
            if (r5 != 0) goto L62
            float r5 = r4.f44089f
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L62
            goto L77
        L62:
            r4.f44089f = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L6a
            r5 = 0
            goto L6b
        L6a:
            r5 = 1
        L6b:
            k1.c0.k(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L6f
            goto L77
        L6f:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            Q1.k.l(r0, r1, r5)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.o.d(boolean):void");
    }
}
