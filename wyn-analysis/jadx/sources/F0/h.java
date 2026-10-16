package f0;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final p f34766a = new p(0.31006f, 0.31616f);

    /* renamed from: b, reason: collision with root package name */
    public static final p f34767b = new p(0.34567f, 0.3585f);

    /* renamed from: c, reason: collision with root package name */
    public static final p f34768c = new p(0.32168f, 0.33767f);

    /* renamed from: d, reason: collision with root package name */
    public static final p f34769d = new p(0.31271f, 0.32902f);

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f34770e = {0.964212f, 1.0f, 0.825188f};

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.n, tf.l] */
    public static AbstractC2547c a(AbstractC2547c abstractC2547c) {
        p pVar = f34767b;
        C2545a c2545a = C2545a.f34731b;
        AbstractC3340k.e(abstractC2547c, "<this>");
        if (AbstractC2546b.a(abstractC2547c.f34739b, AbstractC2546b.f34733a)) {
            n nVar = (n) abstractC2547c;
            p pVar2 = nVar.f34782d;
            if (!e(pVar2, pVar)) {
                float[] fArrA = pVar.a();
                float[] fArrI = i(c(c2545a.f34732a, pVar2.a(), fArrA), nVar.f34787i);
                return new n(nVar.f34738a, nVar.f34786h, pVar, fArrI, nVar.k, nVar.f34790m, nVar.f34783e, nVar.f34784f, nVar.f34785g, -1);
            }
        }
        return abstractC2547c;
    }

    public static float b(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = (((((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
        return f16 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -f16 : f16;
    }

    public static final float[] c(float[] rhs, float[] fArr, float[] fArr2) {
        AbstractC3340k.e(rhs, "matrix");
        j(rhs, fArr);
        j(rhs, fArr2);
        float[] fArr3 = {fArr2[0] / fArr[0], fArr2[1] / fArr[1], fArr2[2] / fArr[2]};
        float[] fArrH = h(rhs);
        AbstractC3340k.e(rhs, "rhs");
        float f10 = fArr3[0];
        float f11 = rhs[0] * f10;
        float f12 = fArr3[1];
        float f13 = rhs[1] * f12;
        float f14 = fArr3[2];
        return i(fArrH, new float[]{f11, f13, rhs[2] * f14, rhs[3] * f10, rhs[4] * f12, rhs[5] * f14, f10 * rhs[6], f12 * rhs[7], f14 * rhs[8]});
    }

    public static boolean d(double d3, tf.l lVar, tf.l lVar2) {
        return Math.abs(((Number) lVar.invoke(Double.valueOf(d3))).doubleValue() - ((Number) lVar2.invoke(Double.valueOf(d3))).doubleValue()) <= 0.001d;
    }

    public static final boolean e(p a5, p b5) {
        AbstractC3340k.e(a5, "a");
        AbstractC3340k.e(b5, "b");
        if (a5 == b5) {
            return true;
        }
        return Math.abs(a5.f34798a - b5.f34798a) < 0.001f && Math.abs(a5.f34799b - b5.f34799b) < 0.001f;
    }

    public static G9.e f(AbstractC2547c connect, AbstractC2547c destination, int i5) {
        if ((i5 & 1) != 0) {
            destination = C2549e.f34746c;
        }
        AbstractC3340k.e(connect, "$this$connect");
        AbstractC3340k.e(destination, "destination");
        if (connect == destination) {
            return new C2550f(connect, connect, 1);
        }
        long j8 = AbstractC2546b.f34733a;
        return (AbstractC2546b.a(connect.f34739b, j8) && AbstractC2546b.a(destination.f34739b, j8)) ? new g((n) connect, (n) destination) : new G9.e(connect, destination, 0);
    }

    public static float g(float f10, float f11, float f12, float f13) {
        return (f10 * f13) - (f11 * f12);
    }

    public static final float[] h(float[] m10) {
        AbstractC3340k.e(m10, "m");
        float f10 = m10[0];
        float f11 = m10[3];
        float f12 = m10[6];
        float f13 = m10[1];
        float f14 = m10[4];
        float f15 = m10[7];
        float f16 = m10[2];
        float f17 = m10[5];
        float f18 = m10[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f12 * f21) + (f11 * f20) + (f10 * f19);
        float[] fArr = new float[m10.length];
        fArr[0] = f19 / f22;
        fArr[1] = f20 / f22;
        fArr[2] = f21 / f22;
        fArr[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr;
    }

    public static final float[] i(float[] lhs, float[] rhs) {
        AbstractC3340k.e(lhs, "lhs");
        AbstractC3340k.e(rhs, "rhs");
        float f10 = lhs[0];
        float f11 = rhs[0];
        float f12 = lhs[3];
        float f13 = rhs[1];
        float f14 = lhs[6];
        float f15 = rhs[2];
        float f16 = (f14 * f15) + (f12 * f13) + (f10 * f11);
        float f17 = lhs[1];
        float f18 = lhs[4];
        float f19 = lhs[7];
        float f20 = (f19 * f15) + (f18 * f13) + (f17 * f11);
        float f21 = lhs[2];
        float f22 = lhs[5];
        float f23 = lhs[8];
        float f24 = (f15 * f23) + (f13 * f22) + (f11 * f21);
        float f25 = rhs[3];
        float f26 = rhs[4];
        float f27 = rhs[5];
        float f28 = (f14 * f27) + (f12 * f26) + (f10 * f25);
        float f29 = (f19 * f27) + (f18 * f26) + (f17 * f25);
        float f30 = (f27 * f23) + (f26 * f22) + (f25 * f21);
        float f31 = rhs[6];
        float f32 = rhs[7];
        float f33 = rhs[8];
        return new float[]{f16, f20, f24, f28, f29, f30, (f14 * f33) + (f12 * f32) + (f10 * f31), (f19 * f33) + (f18 * f32) + (f17 * f31), (f23 * f33) + (f22 * f32) + (f21 * f31)};
    }

    public static final void j(float[] lhs, float[] rhs) {
        AbstractC3340k.e(lhs, "lhs");
        AbstractC3340k.e(rhs, "rhs");
        float f10 = rhs[0];
        float f11 = rhs[1];
        float f12 = rhs[2];
        rhs[0] = (lhs[6] * f12) + (lhs[3] * f11) + (lhs[0] * f10);
        rhs[1] = (lhs[7] * f12) + (lhs[4] * f11) + (lhs[1] * f10);
        rhs[2] = (lhs[8] * f12) + (lhs[5] * f11) + (lhs[2] * f10);
    }
}
