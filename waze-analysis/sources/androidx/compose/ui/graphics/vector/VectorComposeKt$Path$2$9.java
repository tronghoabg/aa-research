package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeJoin;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$9 extends y implements p<PathComponent, StrokeJoin, ab> {
    public static final VectorComposeKt$Path$2$9 INSTANCE = new VectorComposeKt$Path$2$9();

    VectorComposeKt$Path$2$9() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
        m9012invokekLtJ_vA(pathComponent, strokeJoin.m8641unboximpl());
        return ab.f48028a;
    }

    /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
    public final void m9012invokekLtJ_vA(PathComponent pathComponent, int i2) {
        pathComponent.m9005setStrokeLineJoinWw9F2mQ(i2);
    }
}
