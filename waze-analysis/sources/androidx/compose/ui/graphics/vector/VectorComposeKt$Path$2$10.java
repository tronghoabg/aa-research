package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeCap;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$10 extends y implements p<PathComponent, StrokeCap, ab> {
    public static final VectorComposeKt$Path$2$10 INSTANCE = new VectorComposeKt$Path$2$10();

    VectorComposeKt$Path$2$10() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(PathComponent pathComponent, StrokeCap strokeCap) {
        m9010invokeCSYIeUk(pathComponent, strokeCap.m8631unboximpl());
        return ab.f48028a;
    }

    /* renamed from: invoke-CSYIeUk, reason: not valid java name */
    public final void m9010invokeCSYIeUk(PathComponent pathComponent, int i2) {
        pathComponent.m9004setStrokeLineCapBeK7IIE(i2);
    }
}
