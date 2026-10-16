package e0;

import A.AbstractC0213f;
import A.W;
import A7.B0;
import Va.M6;
import com.unity3d.services.UnityAdsConstants;
import ef.C2539w;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import t0.C4070r;
import u0.C4186m;

/* renamed from: e0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2443F extends B0 implements InterfaceC3907l {

    /* renamed from: b, reason: collision with root package name */
    public final float f34341b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34342c;

    /* renamed from: d, reason: collision with root package name */
    public final float f34343d;

    /* renamed from: e, reason: collision with root package name */
    public final float f34344e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34345f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2442E f34346g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f34347h;

    /* renamed from: i, reason: collision with root package name */
    public final long f34348i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34349j;
    public final B.F k;

    public C2443F(long j8, InterfaceC2442E interfaceC2442E, boolean z2, long j10, long j11) {
        super((tf.l) C4186m.f46256l);
        this.f34341b = 1.0f;
        this.f34342c = 1.0f;
        this.f34343d = 1.0f;
        this.f34344e = 8.0f;
        this.f34345f = j8;
        this.f34346g = interfaceC2442E;
        this.f34347h = z2;
        this.f34348i = j10;
        this.f34349j = j11;
        this.k = new B.F(this, 13);
    }

    public final boolean equals(Object obj) {
        C2443F c2443f = obj instanceof C2443F ? (C2443F) obj : null;
        if (c2443f == null || this.f34341b != c2443f.f34341b || this.f34342c != c2443f.f34342c || this.f34343d != c2443f.f34343d || this.f34344e != c2443f.f34344e) {
            return false;
        }
        int i5 = C2447J.f34354c;
        return this.f34345f == c2443f.f34345f && AbstractC3340k.a(this.f34346g, c2443f.f34346g) && this.f34347h == c2443f.f34347h && C2465q.b(this.f34348i, c2443f.f34348i) && C2465q.b(this.f34349j, c2443f.f34349j);
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int hashCode() {
        int iC = AbstractC0213f.c(this.f34344e, AbstractC0213f.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AbstractC0213f.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AbstractC0213f.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AbstractC0213f.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AbstractC0213f.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AbstractC0213f.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AbstractC0213f.c(this.f34343d, AbstractC0213f.c(this.f34342c, Float.floatToIntBits(this.f34341b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i5 = C2447J.f34354c;
        long j8 = this.f34345f;
        int iHashCode = (((this.f34346g.hashCode() + ((((int) (j8 ^ (j8 >>> 32))) + iC) * 31)) * 31) + (this.f34347h ? 1231 : 1237)) * 961;
        int i10 = C2465q.f34381j;
        return C2539w.a(this.f34349j) + ((C2539w.a(this.f34348i) + iHashCode) * 31);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        r0.t tVarE = measurable.e(j8);
        return pd.f.j(measure, tVarE.f44307a, tVarE.f44308b, new W(20, tVarE, this));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f34341b);
        sb2.append(", scaleY=");
        sb2.append(this.f34342c);
        sb2.append(", alpha = ");
        sb2.append(this.f34343d);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb2.append(this.f34344e);
        sb2.append(", transformOrigin=");
        int i5 = C2447J.f34354c;
        sb2.append((Object) ("TransformOrigin(packedValue=" + this.f34345f + ')'));
        sb2.append(", shape=");
        sb2.append(this.f34346g);
        sb2.append(", clip=");
        sb2.append(this.f34347h);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        sb2.append((Object) C2465q.h(this.f34348i));
        sb2.append(", spotShadowColor=");
        sb2.append((Object) C2465q.h(this.f34349j));
        sb2.append(')');
        return sb2.toString();
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
