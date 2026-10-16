package G;

import A.InterfaceC0227u;
import A.N;
import A.W;
import A.Z;
import A0.p;
import B.C0312c;
import B.D;
import N.C0718d;
import N.C0732k;
import N.C0740o;
import N.C0745t;
import N.P;
import N.V;
import N.u0;
import Z.i;
import Z.k;
import a2.v;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.AbstractC1538c;
import c0.C1539d;
import c0.o;
import ef.C2515C;
import jf.C3109i;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r7.AbstractC3935e;
import t0.C4054b;
import t0.InterfaceC4055c;
import tf.q;
import z.s;

/* loaded from: classes.dex */
public final class f extends AbstractC3343n implements q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4130i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4131j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i5) {
        super(3);
        this.f4130i = i5;
        this.f4131j = obj;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        P p10 = C0732k.f7800a;
        Object obj4 = this.f4131j;
        switch (this.f4130i) {
            case 0:
                C0740o c0740o = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e((k) obj, "$this$composed");
                c0740o.M(-992853993);
                c0740o.M(-1031410916);
                View view = (View) c0740o.j(AndroidCompositionLocals_androidKt.f18016f);
                c0740o.M(1157296644);
                boolean zE = c0740o.e(view);
                Object objF = c0740o.F();
                if (zE || objF == p10) {
                    objF = new a(view);
                    c0740o.U(objF);
                }
                c0740o.p(false);
                a aVar = (a) objF;
                c0740o.p(false);
                c0740o.M(1157296644);
                boolean zE2 = c0740o.e(aVar);
                Object objF2 = c0740o.F();
                if (zE2 || objF2 == p10) {
                    objF2 = new g(aVar);
                    c0740o.U(objF2);
                }
                c0740o.p(false);
                g gVar = (g) objF2;
                e eVar = (e) obj4;
                C0718d.c(eVar, new W(8, eVar, gVar), c0740o);
                c0740o.p(false);
                return gVar;
            case 1:
                k composed = (k) obj;
                C0740o c0740o2 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed, "$this$composed");
                c0740o2.M(-1689569019);
                c0740o2.M(-492369756);
                Object objF3 = c0740o2.F();
                Object obj5 = objF3;
                if (objF3 == p10) {
                    b0.b bVar = new b0.b();
                    bVar.f19100a = b0.g.f19106a;
                    c0740o2.U(bVar);
                    obj5 = bVar;
                }
                c0740o2.p(false);
                k kVarG = composed.g(new b0.d((b0.b) obj5, (C0312c) obj4));
                c0740o2.p(false);
                return kVarG;
            case 2:
                C0740o c0740o3 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e((k) obj, "$this$composed");
                c0740o3.M(-1741761824);
                c0740o3.M(-492369756);
                Object objF4 = c0740o3.F();
                if (objF4 == p10) {
                    objF4 = C0718d.G(null, P.f7730f);
                    c0740o3.U(objF4);
                }
                c0740o3.p(false);
                i iVar = i.f16922a;
                W w2 = new W(17, (V) objF4, (D) obj4);
                v vVar = AbstractC1538c.f19492a;
                k kVarN = AbstractC3935e.n(iVar, new f(w2, 3));
                c0740o3.p(false);
                return kVarN;
            case 3:
                C0740o c0740o4 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e((k) obj, "$this$composed");
                c0740o4.M(607036704);
                c0740o4.M(1157296644);
                W w3 = (W) obj4;
                boolean zE3 = c0740o4.e(w3);
                Object objF5 = c0740o4.F();
                if (zE3 || objF5 == p10) {
                    objF5 = new C1539d(w3);
                    c0740o4.U(objF5);
                }
                c0740o4.p(false);
                C1539d c1539d = (C1539d) objF5;
                C0718d.g(new p(c1539d, 18), c0740o4);
                c0740o4.p(false);
                return c1539d;
            case 4:
                C0740o c0740o5 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e((k) obj, "$this$composed");
                c0740o5.M(-307396750);
                c0740o5.M(1157296644);
                o oVar = (o) obj4;
                boolean zE4 = c0740o5.e(oVar);
                Object objF6 = c0740o5.F();
                if (zE4 || objF6 == p10) {
                    objF6 = new c0.q(oVar);
                    c0740o5.U(objF6);
                }
                c0740o5.p(false);
                c0.q qVar = (c0.q) objF6;
                c0740o5.p(false);
                return qVar;
            case 5:
                C0740o c0740o6 = ((u0) obj).f7925a;
                ((Number) obj3).intValue();
                AbstractC3340k.e(c0740o6, "$this$null");
                k kVarF = AbstractC3935e.F((C0740o) obj2, (k) obj4);
                c0740o6.M(509942095);
                InterfaceC4055c.g9.getClass();
                C0718d.M(c0740o6, kVarF, C4054b.f45454c);
                c0740o6.p(false);
                return C2515C.f34653a;
            case 6:
                k composed2 = (k) obj;
                C0740o c0740o7 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed2, "$this$composed");
                c0740o7.M(-843180607);
                c0740o7.M(773894976);
                c0740o7.M(-492369756);
                Object objF7 = c0740o7.F();
                if (objF7 == p10) {
                    C0745t c0745t = new C0745t(C0718d.x(C3109i.f38759a, c0740o7));
                    c0740o7.U(c0745t);
                    objF7 = c0745t;
                }
                c0740o7.p(false);
                Kd.a aVar2 = ((C0745t) objF7).f7923a;
                c0740o7.p(false);
                c0740o7.M(1157296644);
                boolean zE5 = c0740o7.e(aVar2);
                Object objF8 = c0740o7.F();
                if (zE5 || objF8 == p10) {
                    objF8 = new s((InterfaceC0227u) obj4, aVar2);
                    c0740o7.U(objF8);
                }
                c0740o7.p(false);
                s sVar = (s) objF8;
                sVar.getClass();
                k kVarG2 = ic.d.l(composed2).g(sVar);
                c0740o7.p(false);
                return kVarG2;
            default:
                N animateFloat = (N) obj;
                C0740o c0740o8 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(animateFloat, "$this$animateFloat");
                c0740o8.M(438406499);
                c0740o8.p(false);
                return (Z) obj4;
        }
    }
}
