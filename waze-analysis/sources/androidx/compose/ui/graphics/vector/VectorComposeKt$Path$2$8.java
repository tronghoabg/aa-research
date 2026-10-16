package androidx.compose.ui.graphics.vector;

import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$8 extends y implements p<PathComponent, Float, ab> {
    public static final VectorComposeKt$Path$2$8 INSTANCE = new VectorComposeKt$Path$2$8();

    VectorComposeKt$Path$2$8() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(PathComponent pathComponent, Float f2) {
        invoke(pathComponent, f2.floatValue());
        return ab.f48028a;
    }

    public final void invoke(PathComponent pathComponent, float f2) {
        pathComponent.setStrokeLineWidth(f2);
    }
}
