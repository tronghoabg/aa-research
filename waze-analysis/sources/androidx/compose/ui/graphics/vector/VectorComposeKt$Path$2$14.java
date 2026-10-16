package androidx.compose.ui.graphics.vector;

import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$14 extends y implements p<PathComponent, Float, ab> {
    public static final VectorComposeKt$Path$2$14 INSTANCE = new VectorComposeKt$Path$2$14();

    VectorComposeKt$Path$2$14() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(PathComponent pathComponent, Float f2) {
        invoke(pathComponent, f2.floatValue());
        return ab.f48028a;
    }

    public final void invoke(PathComponent pathComponent, float f2) {
        pathComponent.setTrimPathOffset(f2);
    }
}
