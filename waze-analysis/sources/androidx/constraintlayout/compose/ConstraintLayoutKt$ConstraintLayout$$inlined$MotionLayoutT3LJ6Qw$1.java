package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import h.ab;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout-T3LJ6Qw$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1 implements q<MotionLayoutScope, Composer, Integer, ab> {
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ p $content$inlined;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ InvalidationStrategy $invalidationStrategy;

    public ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1(MutableState mutableState, InvalidationStrategy invalidationStrategy, Ref ref, p pVar) {
        this.$contentTracker = mutableState;
        this.$invalidationStrategy = invalidationStrategy;
        this.$compositionSource = ref;
        this.$content$inlined = pVar;
    }

    public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(511777000, i2, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
        }
        this.$contentTracker.setValue(ab.f48028a);
        if (this.$invalidationStrategy.getOnObservedStateChange() == null && this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        composer.startReplaceGroup(194695217);
        this.$content$inlined.invoke(composer, 0);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ ab invoke(MotionLayoutScope motionLayoutScope, Composer composer, Integer num) {
        invoke(motionLayoutScope, composer, num.intValue());
        return ab.f48028a;
    }
}
