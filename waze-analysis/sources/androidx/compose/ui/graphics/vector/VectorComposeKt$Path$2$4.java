package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$4 extends y implements p<PathComponent, Brush, ab> {
    public static final VectorComposeKt$Path$2$4 INSTANCE = new VectorComposeKt$Path$2$4();

    VectorComposeKt$Path$2$4() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(PathComponent pathComponent, Brush brush) {
        invoke2(pathComponent, brush);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PathComponent pathComponent, Brush brush) {
        pathComponent.setFill(brush);
    }
}
