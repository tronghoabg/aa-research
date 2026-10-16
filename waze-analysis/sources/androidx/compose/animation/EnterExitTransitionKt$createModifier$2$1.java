package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionKt$createModifier$2$1 extends y implements l<GraphicsLayerScope, ab> {
    final /* synthetic */ boolean $disableClip;
    final /* synthetic */ a<Boolean> $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createModifier$2$1(boolean z, a<Boolean> aVar) {
        super(1);
        this.$disableClip = z;
        this.$isEnabled = aVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
        boolean z = false;
        if (!this.$disableClip && this.$isEnabled.invoke().booleanValue()) {
            z = true;
        }
        graphicsLayerScope.setClip(z);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return ab.f48028a;
    }
}
