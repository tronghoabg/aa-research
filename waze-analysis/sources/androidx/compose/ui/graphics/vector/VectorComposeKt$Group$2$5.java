package androidx.compose.ui.graphics.vector;

import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$5 extends y implements p<GroupComponent, Float, ab> {
    public static final VectorComposeKt$Group$2$5 INSTANCE = new VectorComposeKt$Group$2$5();

    VectorComposeKt$Group$2$5() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(GroupComponent groupComponent, Float f2) {
        invoke(groupComponent, f2.floatValue());
        return ab.f48028a;
    }

    public final void invoke(GroupComponent groupComponent, float f2) {
        groupComponent.setScaleX(f2);
    }
}
