package u0;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import d0.AbstractC2382a;
import d0.C2384c;
import e0.C2454f;
import e0.InterfaceC2442E;
import kotlin.jvm.internal.AbstractC3340k;
import vf.AbstractC4345a;

/* renamed from: u0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4167c0 {

    /* renamed from: a, reason: collision with root package name */
    public L0.b f46203a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46204b;

    /* renamed from: c, reason: collision with root package name */
    public final Outline f46205c;

    /* renamed from: d, reason: collision with root package name */
    public long f46206d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2442E f46207e;

    /* renamed from: f, reason: collision with root package name */
    public C2454f f46208f;

    /* renamed from: g, reason: collision with root package name */
    public e0.x f46209g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f46210h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f46211i;

    /* renamed from: j, reason: collision with root package name */
    public e0.x f46212j;
    public d0.e k;

    /* renamed from: l, reason: collision with root package name */
    public float f46213l;

    /* renamed from: m, reason: collision with root package name */
    public long f46214m;

    /* renamed from: n, reason: collision with root package name */
    public long f46215n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f46216o;

    /* renamed from: p, reason: collision with root package name */
    public L0.i f46217p;

    /* renamed from: q, reason: collision with root package name */
    public e0.z f46218q;

    public C4167c0(L0.b density) {
        AbstractC3340k.e(density, "density");
        this.f46203a = density;
        this.f46204b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f46205c = outline;
        long j8 = d0.f.f33949b;
        this.f46206d = j8;
        this.f46207e = e0.z.f34394a;
        this.f46214m = C2384c.f33931b;
        this.f46215n = j8;
        this.f46217p = L0.i.f6806a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(e0.InterfaceC2463o r20) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C4167c0.a(e0.o):void");
    }

    public final Outline b() {
        e();
        if (this.f46216o && this.f46204b) {
            return this.f46205c;
        }
        return null;
    }

    public final boolean c(long j8) {
        e0.z zVar;
        int i5;
        if (this.f46216o && (zVar = this.f46218q) != null) {
            float fB = C2384c.b(j8);
            float fC = C2384c.c(j8);
            if (!(zVar instanceof e0.v)) {
                if (!(zVar instanceof e0.w)) {
                    throw new E5.Q((byte) 0, 9);
                }
                d0.e eVar = ((e0.w) zVar).f34391e;
                float f10 = eVar.f33941a;
                if (fB < f10) {
                    return false;
                }
                float f11 = eVar.f33943c;
                if (fB >= f11) {
                    return false;
                }
                float f12 = eVar.f33942b;
                if (fC < f12) {
                    return false;
                }
                float f13 = eVar.f33944d;
                if (fC >= f13) {
                    return false;
                }
                long j10 = eVar.f33945e;
                float fB2 = AbstractC2382a.b(j10);
                long j11 = eVar.f33946f;
                if (AbstractC2382a.b(j11) + fB2 <= eVar.b()) {
                    long j12 = eVar.f33948h;
                    float fB3 = AbstractC2382a.b(j12);
                    i5 = 1;
                    long j13 = eVar.f33947g;
                    if (AbstractC2382a.b(j13) + fB3 <= eVar.b()) {
                        if (AbstractC2382a.c(j12) + AbstractC2382a.c(j10) <= eVar.a()) {
                            if (AbstractC2382a.c(j13) + AbstractC2382a.c(j11) <= eVar.a()) {
                                float fB4 = AbstractC2382a.b(j10) + f10;
                                float fC2 = AbstractC2382a.c(j10) + f12;
                                float fB5 = f11 - AbstractC2382a.b(j11);
                                float fC3 = AbstractC2382a.c(j11) + f12;
                                float fB6 = f11 - AbstractC2382a.b(j13);
                                float fC4 = f13 - AbstractC2382a.c(j13);
                                float fC5 = f13 - AbstractC2382a.c(j12);
                                float fB7 = AbstractC2382a.b(j12) + f10;
                                if (fB < fB4 && fC < fC2) {
                                    return Q.i(fB, fC, eVar.f33945e, fB4, fC2);
                                }
                                if (fB < fB7 && fC > fC5) {
                                    return Q.i(fB, fC, eVar.f33948h, fB7, fC5);
                                }
                                if (fB > fB5 && fC < fC3) {
                                    return Q.i(fB, fC, eVar.f33946f, fB5, fC3);
                                }
                                if (fB <= fB6 || fC <= fC4) {
                                    return true;
                                }
                                return Q.i(fB, fC, eVar.f33947g, fB6, fC4);
                            }
                        }
                    }
                    fB = fB;
                } else {
                    i5 = 1;
                }
                C2454f c2454fE = e0.z.e();
                c2454fE.a(eVar);
                float f14 = fB - 0.005f;
                float f15 = fC - 0.005f;
                float f16 = fB + 0.005f;
                float f17 = fC + 0.005f;
                C2454f c2454fE2 = e0.z.e();
                if (Float.isNaN(f14)) {
                    throw new IllegalStateException("Rect.left is NaN");
                }
                if (Float.isNaN(f15)) {
                    throw new IllegalStateException("Rect.top is NaN");
                }
                if (Float.isNaN(f16)) {
                    throw new IllegalStateException("Rect.right is NaN");
                }
                if (Float.isNaN(f17)) {
                    throw new IllegalStateException("Rect.bottom is NaN");
                }
                RectF rectF = c2454fE2.f34365b;
                rectF.set(new RectF(f14, f15, f16, f17));
                c2454fE2.f34364a.addRect(rectF, Path.Direction.CCW);
                C2454f c2454fE3 = e0.z.e();
                c2454fE3.b(c2454fE, c2454fE2, i5);
                boolean zIsEmpty = c2454fE3.f34364a.isEmpty();
                c2454fE3.c();
                c2454fE2.c();
                return !zIsEmpty;
            }
            d0.d dVar = ((e0.v) zVar).f34390e;
            if (dVar.f33937a > fB || fB >= dVar.f33939c || dVar.f33938b > fC || fC >= dVar.f33940d) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(InterfaceC2442E shape, float f10, boolean z2, float f11, L0.i layoutDirection, L0.b density) {
        AbstractC3340k.e(shape, "shape");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        AbstractC3340k.e(density, "density");
        this.f46205c.setAlpha(f10);
        boolean zA = AbstractC3340k.a(this.f46207e, shape);
        boolean z10 = !zA;
        if (!zA) {
            this.f46207e = shape;
            this.f46210h = true;
        }
        boolean z11 = z2 || f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (this.f46216o != z11) {
            this.f46216o = z11;
            this.f46210h = true;
        }
        if (this.f46217p != layoutDirection) {
            this.f46217p = layoutDirection;
            this.f46210h = true;
        }
        if (!AbstractC3340k.a(this.f46203a, density)) {
            this.f46203a = density;
            this.f46210h = true;
        }
        return z10;
    }

    public final void e() {
        if (this.f46210h) {
            this.f46214m = C2384c.f33931b;
            long j8 = this.f46206d;
            this.f46215n = j8;
            this.f46213l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f46209g = null;
            this.f46210h = false;
            this.f46211i = false;
            boolean z2 = this.f46216o;
            Outline outline = this.f46205c;
            if (!z2 || d0.f.d(j8) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || d0.f.b(this.f46206d) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                outline.setEmpty();
                return;
            }
            this.f46204b = true;
            e0.z zVarB = this.f46207e.b(this.f46206d, this.f46217p, this.f46203a);
            this.f46218q = zVarB;
            if (zVarB instanceof e0.v) {
                d0.d dVar = ((e0.v) zVarB).f34390e;
                float f10 = dVar.f33937a;
                float f11 = dVar.f33938b;
                this.f46214m = U8.v0.f(f10, f11);
                this.f46215n = com.moloco.sdk.internal.publisher.H.I(dVar.c(), dVar.b());
                outline.setRect(AbstractC4345a.H(f10), AbstractC4345a.H(f11), AbstractC4345a.H(dVar.f33939c), AbstractC4345a.H(dVar.f33940d));
                return;
            }
            if (zVarB instanceof e0.w) {
                d0.e eVar = ((e0.w) zVarB).f34391e;
                float fB = AbstractC2382a.b(eVar.f33945e);
                float f12 = eVar.f33941a;
                float f13 = eVar.f33942b;
                this.f46214m = U8.v0.f(f12, f13);
                this.f46215n = com.moloco.sdk.internal.publisher.H.I(eVar.b(), eVar.a());
                if (android.support.v4.media.session.b.l0(eVar)) {
                    this.f46205c.setRoundRect(AbstractC4345a.H(f12), AbstractC4345a.H(f13), AbstractC4345a.H(eVar.f33943c), AbstractC4345a.H(eVar.f33944d), fB);
                    this.f46213l = fB;
                    return;
                }
                C2454f c2454fE = this.f46208f;
                if (c2454fE == null) {
                    c2454fE = e0.z.e();
                    this.f46208f = c2454fE;
                }
                c2454fE.c();
                c2454fE.a(eVar);
                int i5 = Build.VERSION.SDK_INT;
                Path path = c2454fE.f34364a;
                if (i5 > 28 || path.isConvex()) {
                    outline.setConvexPath(path);
                    this.f46211i = true ^ outline.canClip();
                } else {
                    this.f46204b = false;
                    outline.setEmpty();
                    this.f46211i = true;
                }
                this.f46209g = c2454fE;
            }
        }
    }
}
