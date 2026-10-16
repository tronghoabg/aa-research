package androidx.compose.material3;

import h.g.a.p;
import h.g.b.u;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1 extends u implements p<Integer, Integer, Integer> {
    public static final InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1 INSTANCE = new InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1();

    InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1() {
        super(2, a.class, "min", "min(II)I", 1);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    public final Integer invoke(int i2, int i3) {
        return Integer.valueOf(Math.min(i2, i3));
    }
}
