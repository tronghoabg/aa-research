package E;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: E.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422l extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final C0422l f2750j = new C0422l(1, 0);
    public static final C0422l k = new C0422l(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0422l f2751l = new C0422l(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2752i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0422l(int i5, int i10) {
        super(i5);
        this.f2752i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f2752i) {
            case 0:
                r0.s layout = (r0.s) obj;
                AbstractC3340k.e(layout, "$this$layout");
                return C2515C.f34653a;
            case 1:
                r0.s layout2 = (r0.s) obj;
                AbstractC3340k.e(layout2, "$this$layout");
                return C2515C.f34653a;
            case 2:
                r0.s layout3 = (r0.s) obj;
                AbstractC3340k.e(layout3, "$this$layout");
                return C2515C.f34653a;
            case 3:
                if (obj != null) {
                    throw new ClassCastException();
                }
                AbstractC3340k.e(null, "$this$$receiver");
                throw null;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                AbstractC3340k.e(null, "$this$$receiver");
                throw null;
        }
    }
}
