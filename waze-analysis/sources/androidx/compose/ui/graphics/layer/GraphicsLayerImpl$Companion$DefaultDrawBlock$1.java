package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GraphicsLayerImpl$Companion$DefaultDrawBlock$1 extends y implements l<DrawScope, ab> {
    public static final GraphicsLayerImpl$Companion$DefaultDrawBlock$1 INSTANCE = new GraphicsLayerImpl$Companion$DefaultDrawBlock$1();

    GraphicsLayerImpl$Companion$DefaultDrawBlock$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope drawScope) {
        DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, Color.Companion.m8263getTransparent0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126, null);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return ab.f48028a;
    }
}
