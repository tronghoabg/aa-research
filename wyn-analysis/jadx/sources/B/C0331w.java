package B;

import N.C0718d;
import N.C0732k;
import N.C0740o;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: B.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331w implements Q {

    /* renamed from: b, reason: collision with root package name */
    public static final C0331w f1488b = new C0331w(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0331w f1489c = new C0331w(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1490a;

    public /* synthetic */ C0331w(int i5) {
        this.f1490a = i5;
    }

    @Override // B.Q
    public final S a(D.i interactionSource, C0740o c0740o) {
        switch (this.f1490a) {
            case 0:
                AbstractC3340k.e(interactionSource, "interactionSource");
                c0740o.M(1683566979);
                c0740o.M(-1692965168);
                c0740o.M(-492369756);
                Object objF = c0740o.F();
                N.P p10 = C0732k.f7800a;
                N.P p11 = N.P.f7730f;
                if (objF == p10) {
                    objF = C0718d.G(Boolean.FALSE, p11);
                    c0740o.U(objF);
                }
                c0740o.p(false);
                N.V v2 = (N.V) objF;
                C0718d.d(c0740o, interactionSource, new D.m(interactionSource, v2, null));
                c0740o.p(false);
                c0740o.M(1206586544);
                c0740o.M(-492369756);
                Object objF2 = c0740o.F();
                if (objF2 == p10) {
                    objF2 = C0718d.G(Boolean.FALSE, p11);
                    c0740o.U(objF2);
                }
                c0740o.p(false);
                N.V v10 = (N.V) objF2;
                C0718d.d(c0740o, interactionSource, new D.g(interactionSource, v10, null));
                c0740o.p(false);
                c0740o.M(-1805515472);
                c0740o.M(-492369756);
                Object objF3 = c0740o.F();
                if (objF3 == p10) {
                    objF3 = C0718d.G(Boolean.FALSE, p11);
                    c0740o.U(objF3);
                }
                c0740o.p(false);
                N.V v11 = (N.V) objF3;
                C0718d.d(c0740o, interactionSource, new D.d(interactionSource, v11, null));
                c0740o.p(false);
                c0740o.M(1157296644);
                boolean zE = c0740o.e(interactionSource);
                Object objF4 = c0740o.F();
                if (zE || objF4 == p10) {
                    objF4 = new C0330v(v2, v10, v11);
                    c0740o.U(objF4);
                }
                c0740o.p(false);
                C0330v c0330v = (C0330v) objF4;
                c0740o.p(false);
                return c0330v;
            default:
                AbstractC3340k.e(interactionSource, "interactionSource");
                c0740o.M(285654452);
                W w2 = W.f1406a;
                c0740o.p(false);
                return w2;
        }
    }
}
