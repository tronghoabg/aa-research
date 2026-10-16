package B;

import N.C0718d;
import N.C0732k;
import N.C0740o;
import N.L0;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import n0.AbstractC3566e;
import n0.C3564c;
import r7.AbstractC3935e;
import u0.Y;
import x0.C4435e;

/* renamed from: B.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326q extends AbstractC3343n implements tf.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tf.a f1460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1461j;
    public final /* synthetic */ D.i k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f1462l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f1463m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4435e f1464n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0326q(tf.a aVar, boolean z2, D.i iVar, Q q4, String str, C4435e c4435e) {
        super(3);
        this.f1460i = aVar;
        this.f1461j = z2;
        this.k = iVar;
        this.f1462l = q4;
        this.f1463m = str;
        this.f1464n = c4435e;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i5 = 1;
        Z.k composed = (Z.k) obj;
        C0740o c0740o = (C0740o) obj2;
        ((Number) obj3).intValue();
        AbstractC3340k.e(composed, "$this$composed");
        c0740o.M(92076020);
        tf.a onClick = this.f1460i;
        N.V vI = C0718d.I(onClick, c0740o);
        c0740o.M(-492369756);
        Object objF = c0740o.F();
        N.P p10 = C0732k.f7800a;
        N.P p11 = N.P.f7730f;
        if (objF == p10) {
            objF = C0718d.G(null, p11);
            c0740o.U(objF);
        }
        c0740o.p(false);
        N.V v2 = (N.V) objF;
        c0740o.M(1841981204);
        boolean z2 = this.f1461j;
        D.i interactionSource = this.k;
        if (z2) {
            com.moloco.sdk.internal.publisher.H.H(interactionSource, v2, c0740o, 48);
        }
        c0740o.p(false);
        int i10 = AbstractC0329u.f1484b;
        c0740o.M(-1990508712);
        A0.p pVar = new A0.p((View) c0740o.j(AndroidCompositionLocals_androidKt.f18016f), 3);
        c0740o.p(false);
        c0740o.M(-492369756);
        Object objF2 = c0740o.F();
        if (objF2 == p10) {
            objF2 = C0718d.G(Boolean.TRUE, p11);
            c0740o.U(objF2);
        }
        c0740o.p(false);
        N.V v10 = (N.V) objF2;
        N.V vI2 = C0718d.I(new A0.e(i5, v10, pVar), c0740o);
        Z.i iVar = Z.i.f16922a;
        Boolean boolValueOf = Boolean.valueOf(z2);
        C0325p c0325p = new C0325p(this.f1461j, this.k, v2, vI2, vI, null);
        p0.f fVar = p0.w.f43193a;
        Z.k gestureModifiers = AbstractC3935e.n(iVar, new C0321l(interactionSource, boolValueOf, c0325p));
        c0740o.M(-492369756);
        Object objF3 = c0740o.F();
        if (objF3 == p10) {
            objF3 = new C0322m(v10);
            c0740o.U(objF3);
        }
        c0740o.p(false);
        Z.k other = (Z.k) objF3;
        AbstractC3340k.e(other, "other");
        AbstractC3340k.e(gestureModifiers, "gestureModifiers");
        AbstractC3340k.e(interactionSource, "interactionSource");
        AbstractC3340k.e(onClick, "onClick");
        Z.k kVarJ = Fe.g.J(other, true, new r(this.f1464n, this.f1463m, z2, onClick));
        C0324o c0324o = new C0324o(1, onClick, z2);
        a2.v vVar = AbstractC3566e.f40757a;
        AbstractC3340k.e(kVarJ, "<this>");
        Z.k kVarA = Y.a(kVarJ, new C3564c(c0324o));
        L0 l02 = U.f1404a;
        AbstractC3340k.e(kVarA, "<this>");
        Z.k kVarN = AbstractC3935e.n(kVarA, new T(0, this.f1462l, interactionSource));
        AbstractC3340k.e(kVarN, "<this>");
        Z.k kVarN2 = AbstractC3935e.n(kVarN, new E(interactionSource, z2, 2));
        AbstractC3340k.e(kVarN2, "<this>");
        Z.k kVarG = AbstractC3935e.n(kVarN2, new E(1, interactionSource, z2)).g(gestureModifiers);
        c0740o.p(false);
        return kVarG;
    }
}
