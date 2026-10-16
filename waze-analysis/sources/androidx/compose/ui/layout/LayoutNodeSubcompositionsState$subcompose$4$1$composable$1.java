package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LayoutNodeSubcompositionsState$subcompose$4$1$composable$1 extends y implements p<Composer, Integer, ab> {
    final /* synthetic */ p<Composer, Integer, ab> $content;
    final /* synthetic */ LayoutNodeSubcompositionsState.NodeState $nodeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LayoutNodeSubcompositionsState$subcompose$4$1$composable$1(LayoutNodeSubcompositionsState.NodeState nodeState, p<? super Composer, ? super Integer, ab> pVar) {
        super(2);
        this.$nodeState = nodeState;
        this.$content = pVar;
    }

    public final void invoke(Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1524156494, i2, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:706)");
        }
        LayoutNodeSubcompositionsState.NodeState nodeState = this.$nodeState;
        p<Composer, Integer, ab> pVar = this.$content;
        boolean active = nodeState.getActive();
        composer.startReusableGroup(207, Boolean.valueOf(active));
        boolean zChanged = composer.changed(active);
        if (active) {
            pVar.invoke(composer, 0);
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReusableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return ab.f48028a;
    }
}
