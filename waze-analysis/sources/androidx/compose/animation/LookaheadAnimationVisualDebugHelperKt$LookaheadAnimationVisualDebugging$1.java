package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadAnimationVisualDebugHelperKt$LookaheadAnimationVisualDebugging$1 extends y implements p<Composer, Integer, ab> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<Composer, Integer, ab> $content;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isShowKeyLabelEnabled;
    final /* synthetic */ long $multipleMatchesColor;
    final /* synthetic */ long $overlayColor;
    final /* synthetic */ long $unmatchedElementColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LookaheadAnimationVisualDebugHelperKt$LookaheadAnimationVisualDebugging$1(boolean z, long j2, long j3, long j4, boolean z2, p<? super Composer, ? super Integer, ab> pVar, int i2, int i3) {
        super(2);
        this.$isEnabled = z;
        this.$overlayColor = j2;
        this.$multipleMatchesColor = j3;
        this.$unmatchedElementColor = j4;
        this.$isShowKeyLabelEnabled = z2;
        this.$content = pVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public final void invoke(Composer composer, int i2) {
        LookaheadAnimationVisualDebugHelperKt.m1799LookaheadAnimationVisualDebugginggUzqikQ(this.$isEnabled, this.$overlayColor, this.$multipleMatchesColor, this.$unmatchedElementColor, this.$isShowKeyLabelEnabled, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return ab.f48028a;
    }
}
