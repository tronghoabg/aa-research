package androidx.compose.ui.graphics.vector;

import h.ab;
import h.g.a.p;
import h.g.b.y;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$9 extends y implements p<GroupComponent, List<? extends PathNode>, ab> {
    public static final VectorComposeKt$Group$2$9 INSTANCE = new VectorComposeKt$Group$2$9();

    VectorComposeKt$Group$2$9() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(GroupComponent groupComponent, List<? extends PathNode> list) {
        invoke2(groupComponent, list);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list) {
        groupComponent.setClipPathData(list);
    }
}
