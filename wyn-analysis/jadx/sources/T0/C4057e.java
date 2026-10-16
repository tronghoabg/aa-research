package t0;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4057e extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final C4057e f45462j = new C4057e(1, 0);
    public static final C4057e k = new C4057e(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C4057e f45463l = new C4057e(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C4057e f45464m = new C4057e(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C4057e f45465n = new C4057e(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C4057e f45466o = new C4057e(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C4057e f45467p = new C4057e(1, 6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f45468i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4057e(int i5, int i10) {
        super(i5);
        this.f45468i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f45468i) {
            case 0:
                C4058f drawEntity = (C4058f) obj;
                AbstractC3340k.e(drawEntity, "drawEntity");
                y yVar = (y) drawEntity.f15788b;
                if (yVar.S()) {
                    drawEntity.f45471g = true;
                    yVar.R();
                }
                break;
            case 1:
                y wrapper = (y) obj;
                AbstractC3340k.e(wrapper, "wrapper");
                InterfaceC4042G interfaceC4042G = wrapper.f45577v;
                if (interfaceC4042G != null) {
                    interfaceC4042G.invalidate();
                }
                break;
            case 2:
                y wrapper2 = (y) obj;
                AbstractC3340k.e(wrapper2, "wrapper");
                if (wrapper2.n()) {
                    wrapper2.f0();
                }
                break;
            case 3:
                C4037B node = (C4037B) obj;
                AbstractC3340k.e(node, "node");
                node.b();
                break;
            case 4:
                t layoutNode = (t) obj;
                AbstractC3340k.e(layoutNode, "layoutNode");
                if (layoutNode.r()) {
                    layoutNode.y(false);
                }
                break;
            case 5:
                t layoutNode2 = (t) obj;
                AbstractC3340k.e(layoutNode2, "layoutNode");
                if (layoutNode2.r()) {
                    layoutNode2.y(false);
                }
                break;
            default:
                t layoutNode3 = (t) obj;
                AbstractC3340k.e(layoutNode3, "layoutNode");
                if (layoutNode3.r()) {
                    layoutNode3.z(false);
                }
                break;
        }
        return C2515C.f34653a;
    }
}
