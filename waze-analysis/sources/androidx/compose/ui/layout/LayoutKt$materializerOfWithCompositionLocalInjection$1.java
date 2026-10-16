package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import h.ab;
import h.g.a.q;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LayoutKt$materializerOfWithCompositionLocalInjection$1 extends y implements q<SkippableUpdater<ComposeUiNode>, Composer, Integer, ab> {
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LayoutKt$materializerOfWithCompositionLocalInjection$1(Modifier modifier) {
        super(3);
        this.$modifier = modifier;
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ ab invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
        m9771invokeDeg8D_g(skippableUpdater.m7323unboximpl(), composer, num.intValue());
        return ab.f48028a;
    }

    /* renamed from: invoke-Deg8D_g, reason: not valid java name */
    public final void m9771invokeDeg8D_g(Composer composer, Composer composer2, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123382363, i2, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:222)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        Modifier modifierMaterializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, this.$modifier);
        composer.startReplaceableGroup(509942095);
        Updater.m7351setimpl(composer, modifierMaterializeWithCompositionLocalInjectionInternal, ComposeUiNode.Companion.getSetModifier());
        Updater.m7351setimpl(composer, Integer.valueOf(currentCompositeKeyHash), ComposeUiNode.Companion.getSetCompositeKeyHash());
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
