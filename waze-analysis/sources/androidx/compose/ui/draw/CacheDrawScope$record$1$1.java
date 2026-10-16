package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CacheDrawScope$record$1$1 extends y implements l<DrawScope, ab> {
    final /* synthetic */ l<ContentDrawScope, ab> $block;
    final /* synthetic */ Density $density;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ Density $prevDensity;
    final /* synthetic */ LayoutDirection $prevLayoutDirection;
    final /* synthetic */ ContentDrawScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CacheDrawScope$record$1$1(l<? super ContentDrawScope, ab> lVar, ContentDrawScope contentDrawScope, Density density, LayoutDirection layoutDirection, Density density2, LayoutDirection layoutDirection2) {
        super(1);
        this.$block = lVar;
        this.$scope = contentDrawScope;
        this.$density = density;
        this.$layoutDirection = layoutDirection;
        this.$prevDensity = density2;
        this.$prevLayoutDirection = layoutDirection2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope drawScope) {
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(this.$density);
        drawContext.setLayoutDirection(this.$layoutDirection);
        try {
            this.$block.invoke(this.$scope);
        } finally {
            DrawContext drawContext2 = drawScope.getDrawContext();
            Density density = this.$prevDensity;
            LayoutDirection layoutDirection = this.$prevLayoutDirection;
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection);
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return ab.f48028a;
    }
}
