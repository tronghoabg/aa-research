package E;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: E.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428s extends AbstractC3343n implements tf.s {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2768i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0413c f2769j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0428s(InterfaceC0413c interfaceC0413c, int i5) {
        super(5);
        this.f2768i = i5;
        this.f2769j = interfaceC0413c;
    }

    @Override // tf.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f2768i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int[] size = (int[]) obj2;
                L0.b density = (L0.b) obj4;
                int[] outPosition = (int[]) obj5;
                AbstractC3340k.e(size, "size");
                AbstractC3340k.e((L0.i) obj3, "<anonymous parameter 2>");
                AbstractC3340k.e(density, "density");
                AbstractC3340k.e(outPosition, "outPosition");
                ((InterfaceC0414d) this.f2769j).a(density, iIntValue, size, outPosition);
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                int[] size2 = (int[]) obj2;
                L0.i layoutDirection = (L0.i) obj3;
                L0.b density2 = (L0.b) obj4;
                int[] outPosition2 = (int[]) obj5;
                AbstractC3340k.e(size2, "size");
                AbstractC3340k.e(layoutDirection, "layoutDirection");
                AbstractC3340k.e(density2, "density");
                AbstractC3340k.e(outPosition2, "outPosition");
                this.f2769j.c(density2, iIntValue2, size2, layoutDirection, outPosition2);
                break;
        }
        return C2515C.f34653a;
    }
}
