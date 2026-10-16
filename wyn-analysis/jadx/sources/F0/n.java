package f0;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;

/* loaded from: classes.dex */
public final class n extends AbstractC2547c {

    /* renamed from: d, reason: collision with root package name */
    public final p f34782d;

    /* renamed from: e, reason: collision with root package name */
    public final float f34783e;

    /* renamed from: f, reason: collision with root package name */
    public final float f34784f;

    /* renamed from: g, reason: collision with root package name */
    public final o f34785g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f34786h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f34787i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f34788j;
    public final AbstractC3343n k;

    /* renamed from: l, reason: collision with root package name */
    public final m f34789l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC3343n f34790m;

    /* renamed from: n, reason: collision with root package name */
    public final m f34791n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f34792o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0274  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.Object, tf.l] */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.lang.Object, tf.l] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.jvm.internal.n, tf.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(java.lang.String r34, float[] r35, f0.p r36, float[] r37, tf.l r38, tf.l r39, float r40, float r41, f0.o r42, int r43) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.n.<init>(java.lang.String, float[], f0.p, float[], tf.l, tf.l, float, float, f0.o, int):void");
    }

    @Override // f0.AbstractC2547c
    public final float[] a(float[] v2) {
        AbstractC3340k.e(v2, "v");
        h.j(this.f34788j, v2);
        Double dValueOf = Double.valueOf(v2[0]);
        m mVar = this.f34789l;
        v2[0] = (float) ((Number) mVar.invoke(dValueOf)).doubleValue();
        v2[1] = (float) ((Number) mVar.invoke(Double.valueOf(v2[1]))).doubleValue();
        v2[2] = (float) ((Number) mVar.invoke(Double.valueOf(v2[2]))).doubleValue();
        return v2;
    }

    @Override // f0.AbstractC2547c
    public final float b(int i5) {
        return this.f34784f;
    }

    @Override // f0.AbstractC2547c
    public final float c(int i5) {
        return this.f34783e;
    }

    @Override // f0.AbstractC2547c
    public final boolean d() {
        return this.f34792o;
    }

    @Override // f0.AbstractC2547c
    public final float[] e(float[] fArr) {
        Double dValueOf = Double.valueOf(fArr[0]);
        m mVar = this.f34791n;
        fArr[0] = (float) ((Number) mVar.invoke(dValueOf)).doubleValue();
        fArr[1] = (float) ((Number) mVar.invoke(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) mVar.invoke(Double.valueOf(fArr[2]))).doubleValue();
        h.j(this.f34787i, fArr);
        return fArr;
    }

    @Override // f0.AbstractC2547c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        I i5 = H.f39741a;
        if (!AbstractC3340k.a(i5.getOrCreateKotlinClass(n.class), i5.getOrCreateKotlinClass(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        n nVar = (n) obj;
        if (Float.compare(nVar.f34783e, this.f34783e) != 0 || Float.compare(nVar.f34784f, this.f34784f) != 0 || !AbstractC3340k.a(this.f34782d, nVar.f34782d) || !Arrays.equals(this.f34786h, nVar.f34786h)) {
            return false;
        }
        o oVar = nVar.f34785g;
        o oVar2 = this.f34785g;
        if (oVar2 != null) {
            return oVar2.equals(oVar);
        }
        if (oVar == null) {
            return true;
        }
        if (AbstractC3340k.a(this.k, nVar.k)) {
            return AbstractC3340k.a(this.f34790m, nVar.f34790m);
        }
        return false;
    }

    @Override // f0.AbstractC2547c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f34786h) + ((this.f34782d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f34783e;
        int iFloatToIntBits = (iHashCode + (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f34784f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : Float.floatToIntBits(f11))) * 31;
        o oVar = this.f34785g;
        int iHashCode2 = iFloatToIntBits2 + (oVar != null ? oVar.hashCode() : 0);
        if (oVar == null) {
            return this.f34790m.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public n(String str, float[] fArr, p pVar, o oVar, int i5) {
        this(str, fArr, pVar, null, new k(oVar, 0), new k(oVar, 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, oVar, i5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(String str, float[] fArr, p pVar, double d3, float f10, float f11, int i5) {
        tf.l lVar = C2548d.f34742l;
        this(str, fArr, pVar, null, d3 == 1.0d ? lVar : new l(d3, 0), d3 != 1.0d ? new l(d3, 1) : lVar, f10, f11, new o(d3, 1.0d, 0.0d, 0.0d, 0.0d), i5);
    }
}
