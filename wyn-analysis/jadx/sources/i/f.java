package I;

import N.D;
import N.Y;
import Va.X7;
import a.AbstractC1304a;
import com.moloco.sdk.internal.publisher.H;
import d0.C2384c;
import e0.InterfaceC2463o;
import ef.C2515C;
import g0.InterfaceC2663d;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3906k;
import tf.l;
import z0.m;
import z0.n;
import z0.p;

/* loaded from: classes.dex */
public final class f extends AbstractC3343n implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5253i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f5254j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i5) {
        super(1);
        this.f5253i = i5;
        this.f5254j = iVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C2515C c2515c = C2515C.f34653a;
        boolean z2 = false;
        i iVar = this.f5254j;
        switch (this.f5253i) {
            case 0:
                AbstractC3340k.e((InterfaceC3906k) obj, "it");
                X7 x72 = iVar.f5259a;
                D d3 = J.b.f5529a;
                return c2515c;
            case 1:
                List it = (List) obj;
                AbstractC3340k.e(it, "it");
                n nVar = (n) iVar.f5259a.f13843c;
                if (nVar != null) {
                    it.add(nVar);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                InterfaceC2663d drawBehind = (InterfaceC2663d) obj;
                AbstractC3340k.e(drawBehind, "$this$drawBehind");
                X7 x73 = iVar.f5259a;
                n nVar2 = (n) x73.f13843c;
                if (nVar2 != null) {
                    ((Y) x73.f13844d).getValue();
                    InterfaceC2463o canvas = drawBehind.u().v();
                    AbstractC3340k.e(canvas, "canvas");
                    float f10 = (int) (nVar2.f48330c >> 32);
                    z0.d dVar = nVar2.f48329b;
                    float f11 = dVar.f48277d;
                    m mVar = nVar2.f48328a;
                    p pVar = mVar.f48320b;
                    if ((f10 < f11 || dVar.f48276c || ((int) (r7 & 4294967295L)) < dVar.f48278e) && mVar.f48323e == 1) {
                        z2 = true;
                    }
                    if (z2) {
                        d0.d dVarF = AbstractC1304a.f(C2384c.f33931b, H.I(f10, (int) (r7 & 4294967295L)));
                        canvas.m();
                        canvas.j(dVarF);
                    }
                    try {
                        pVar.f48337a.f48300a.getClass();
                        long jA = pVar.f48337a.f48300a.a();
                        z0.j jVar = pVar.f48337a;
                        dVar.a(canvas, jA, jVar.f48312n, jVar.f48311m);
                        if (z2) {
                            canvas.restore();
                        }
                    } finally {
                    }
                }
                return c2515c;
        }
    }
}
