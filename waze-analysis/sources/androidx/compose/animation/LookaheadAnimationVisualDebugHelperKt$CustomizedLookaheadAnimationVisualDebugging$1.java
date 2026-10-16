package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadAnimationVisualDebugHelperKt$CustomizedLookaheadAnimationVisualDebugging$1 extends y implements p<Composer, Integer, ab> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<Composer, Integer, ab> $content;
    final /* synthetic */ long $debugColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LookaheadAnimationVisualDebugHelperKt$CustomizedLookaheadAnimationVisualDebugging$1(long j2, p<? super Composer, ? super Integer, ab> pVar, int i2) {
        super(2);
        this.$debugColor = j2;
        this.$content = pVar;
        this.$$changed = i2;
    }

    public final void invoke(Composer composer, int i2) {
        LookaheadAnimationVisualDebugHelperKt.m1798CustomizedLookaheadAnimationVisualDebuggingIv8Zu3U(this.$debugColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return ab.f48028a;
    }
}
