package M0;

import U8.v0;
import android.graphics.Canvas;
import e0.AbstractC2451c;
import e0.C2450b;
import e0.InterfaceC2463o;
import ef.C2515C;
import g0.InterfaceC2663d;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3906k;
import r0.s;
import t0.t;
import u0.C4188n;

/* loaded from: classes.dex */
public final class a extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7232i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f7233j;
    public final /* synthetic */ o k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, t tVar) {
        super(1);
        this.f7232i = 1;
        this.f7233j = tVar;
        this.k = oVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C2515C c2515c = C2515C.f34653a;
        t tVar = this.f7233j;
        o oVar = this.k;
        switch (this.f7232i) {
            case 0:
                s layout = (s) obj;
                AbstractC3340k.e(layout, "$this$layout");
                v0.i(oVar, tVar);
                break;
            case 1:
                InterfaceC2663d drawBehind = (InterfaceC2663d) obj;
                AbstractC3340k.e(drawBehind, "$this$drawBehind");
                InterfaceC2463o interfaceC2463oV = drawBehind.u().v();
                C4188n c4188n = tVar.f45517g;
                if (!(c4188n instanceof C4188n)) {
                    c4188n = null;
                }
                if (c4188n != null) {
                    Canvas canvas = AbstractC2451c.f34360a;
                    AbstractC3340k.e(interfaceC2463oV, "<this>");
                    Canvas canvas2 = ((C2450b) interfaceC2463oV).f34357a;
                    AbstractC3340k.e(canvas2, "canvas");
                    c4188n.getAndroidViewsHandler$ui_release().getClass();
                    oVar.draw(canvas2);
                    break;
                }
                break;
            default:
                InterfaceC3906k it = (InterfaceC3906k) obj;
                AbstractC3340k.e(it, "it");
                v0.i(oVar, tVar);
                break;
        }
        return c2515c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(o oVar, t tVar, int i5) {
        super(1);
        this.f7232i = i5;
        this.k = oVar;
        this.f7233j = tVar;
    }
}
