package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.ContentScale;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SkipToLookaheadSizeNodeKt {
    private static final a<Boolean> DefaultEnabled = SkipToLookaheadSizeNodeKt$DefaultEnabled$1.INSTANCE;

    public static final Modifier createContentScaleModifier(Modifier modifier, ScaleToBoundsImpl scaleToBoundsImpl, a<Boolean> aVar) {
        return modifier.then(x.n(scaleToBoundsImpl.getContentScale(), ContentScale.Companion.getCrop()) ? GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new AnonymousClass1(aVar)) : Modifier.Companion).then(new SkipToLookaheadSizeElement(scaleToBoundsImpl, aVar));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SkipToLookaheadSizeNodeKt$createContentScaleModifier$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<GraphicsLayerScope, ab> {
        final /* synthetic */ a<Boolean> $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a<Boolean> aVar) {
            super(1);
            this.$isEnabled = aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
            graphicsLayerScope.setClip(this.$isEnabled.invoke().booleanValue());
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return ab.f48028a;
        }
    }
}
