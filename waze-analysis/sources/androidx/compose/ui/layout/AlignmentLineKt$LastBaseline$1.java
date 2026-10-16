package androidx.compose.ui.layout;

import h.g.a.p;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends u implements p<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    AlignmentLineKt$LastBaseline$1() {
        super(2, h.h.a.class, "max", "max(II)I", 1);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    public final Integer invoke(int i2, int i3) {
        return Integer.valueOf(Math.max(i2, i3));
    }
}
