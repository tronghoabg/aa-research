package B;

import N.C0718d;
import N.C0732k;
import N.C0740o;
import N.C0745t;
import android.graphics.Typeface;
import android.text.SpannableString;
import ef.C2515C;
import jf.C3109i;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import o0.C3635c;
import o0.C3638f;
import u0.InterfaceC4193p0;

/* loaded from: classes.dex */
public final class T extends AbstractC3343n implements tf.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1402i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1403j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(int i5, Object obj, Object obj2) {
        super(3);
        this.f1402i = i5;
        this.f1403j = obj;
        this.k = obj2;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1402i) {
            case 0:
                Z.k composed = (Z.k) obj;
                C0740o c0740o = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed, "$this$composed");
                c0740o.M(-353972293);
                Q q4 = (Q) this.f1403j;
                if (q4 == null) {
                    q4 = C0331w.f1489c;
                }
                S sA = q4.a((D.i) this.k, c0740o);
                c0740o.M(1157296644);
                boolean zE = c0740o.e(sA);
                Object objF = c0740o.F();
                if (zE || objF == C0732k.f7800a) {
                    objF = new V(sA);
                    c0740o.U(objF);
                }
                c0740o.p(false);
                V v2 = (V) objF;
                c0740o.p(false);
                return v2;
            case 1:
                z0.j spanStyle = (z0.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC3340k.e(spanStyle, "spanStyle");
                E0.l fontWeight = spanStyle.f48302c;
                if (fontWeight == null) {
                    fontWeight = E0.l.f2798d;
                }
                E0.j jVar = spanStyle.f48303d;
                int i5 = jVar != null ? jVar.f2794a : 0;
                E0.k kVar = spanStyle.f48304e;
                int i10 = kVar != null ? kVar.f2795a : 1;
                H0.b bVar = (H0.b) this.k;
                AbstractC3340k.e(fontWeight, "fontWeight");
                H0.c cVar = (H0.c) bVar.f4855j;
                H0.e eVar = new H0.e(((E0.f) cVar.f4860e).b(spanStyle.f48305f, fontWeight, i5, i10));
                cVar.f4865j.add(eVar);
                ((SpannableString) this.f1403j).setSpan(new C0.b((Typeface) eVar.f4869b), iIntValue, iIntValue2, 33);
                return C2515C.f34653a;
            case 2:
                Z.k composed2 = (Z.k) obj;
                C0740o c0740o2 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed2, "$this$composed");
                c0740o2.M(410346167);
                c0740o2.M(773894976);
                c0740o2.M(-492369756);
                Object objF2 = c0740o2.F();
                N.P p10 = C0732k.f7800a;
                if (objF2 == p10) {
                    C0745t c0745t = new C0745t(C0718d.x(C3109i.f38759a, c0740o2));
                    c0740o2.U(c0745t);
                    objF2 = c0745t;
                }
                c0740o2.p(false);
                Kd.a aVar = ((C0745t) objF2).f7923a;
                c0740o2.p(false);
                c0740o2.M(100475938);
                C3635c c3635c = (C3635c) this.f1403j;
                if (c3635c == null) {
                    c0740o2.M(-492369756);
                    Object objF3 = c0740o2.F();
                    if (objF3 == p10) {
                        objF3 = new C3635c();
                        c0740o2.U(objF3);
                    }
                    c0740o2.p(false);
                    c3635c = (C3635c) objF3;
                }
                c0740o2.p(false);
                c0740o2.M(1618982084);
                M0.n nVar = (M0.n) this.k;
                boolean zE2 = c0740o2.e(nVar) | c0740o2.e(c3635c) | c0740o2.e(aVar);
                Object objF4 = c0740o2.F();
                if (zE2 || objF4 == p10) {
                    c3635c.f41246b = aVar;
                    objF4 = new C3638f(c3635c, nVar);
                    c0740o2.U(objF4);
                }
                c0740o2.p(false);
                C3638f c3638f = (C3638f) objF4;
                c0740o2.p(false);
                return c3638f;
            default:
                Z.k composed3 = (Z.k) obj;
                C0740o c0740o3 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed3, "$this$composed");
                c0740o3.M(-906157935);
                L0.b bVar2 = (L0.b) c0740o3.j(u0.M.f46143e);
                InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o3.j(u0.M.f46152o);
                c0740o3.M(1157296644);
                boolean zE3 = c0740o3.e(bVar2);
                Object objF5 = c0740o3.F();
                if (zE3 || objF5 == C0732k.f7800a) {
                    objF5 = new p0.t(interfaceC4193p0, bVar2);
                    c0740o3.U(objF5);
                }
                c0740o3.p(false);
                p0.t tVar = (p0.t) objF5;
                C0718d.f(tVar, this.f1403j, new p0.u(tVar, (tf.p) this.k, null), c0740o3);
                c0740o3.p(false);
                return tVar;
        }
    }
}
