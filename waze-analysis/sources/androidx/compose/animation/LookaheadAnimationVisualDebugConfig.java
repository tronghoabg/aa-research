package androidx.compose.animation;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LookaheadAnimationVisualDebugConfig {
    public static final int $stable = 0;
    private final boolean isEnabled;
    private final boolean isShowKeyLabelEnabled;
    private final long multipleMatchesColor;
    private final long overlayColor;
    private final long unmatchedElementColor;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LookaheadAnimationVisualDebugConfig(boolean z, long j2, long j3, long j4, boolean z2, int i2, o oVar) {
        long jColor = (i2 & 2) != 0 ? ColorKt.Color(2150934611L) : j2;
        long jColor2 = (i2 & 4) != 0 ? ColorKt.Color(4293542709L) : j3;
        long jColor3 = (i2 & 8) != 0 ? ColorKt.Color(4288323750L) : j4;
        int i3 = (z ? 1 : 0) | (i2 & 1);
        this(1 == i3, jColor, jColor2, jColor3, ((i2 & 16) == 0) & z2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LookaheadAnimationVisualDebugConfig)) {
            return false;
        }
        LookaheadAnimationVisualDebugConfig lookaheadAnimationVisualDebugConfig = (LookaheadAnimationVisualDebugConfig) obj;
        return this.isEnabled == lookaheadAnimationVisualDebugConfig.isEnabled && Color.m8229equalsimpl0(this.overlayColor, lookaheadAnimationVisualDebugConfig.overlayColor) && Color.m8229equalsimpl0(this.multipleMatchesColor, lookaheadAnimationVisualDebugConfig.multipleMatchesColor) && Color.m8229equalsimpl0(this.unmatchedElementColor, lookaheadAnimationVisualDebugConfig.unmatchedElementColor) && this.isShowKeyLabelEnabled == lookaheadAnimationVisualDebugConfig.isShowKeyLabelEnabled;
    }

    /* renamed from: getMultipleMatchesColor-0d7_KjU, reason: not valid java name */
    public final long m1779getMultipleMatchesColor0d7_KjU() {
        return this.multipleMatchesColor;
    }

    /* renamed from: getOverlayColor-0d7_KjU, reason: not valid java name */
    public final long m1780getOverlayColor0d7_KjU() {
        return this.overlayColor;
    }

    /* renamed from: getUnmatchedElementColor-0d7_KjU, reason: not valid java name */
    public final long m1781getUnmatchedElementColor0d7_KjU() {
        return this.unmatchedElementColor;
    }

    public int hashCode() {
        int iM = LookaheadAnimationVisualDebugConfig$$ExternalSyntheticBackport0.m(this.isEnabled);
        boolean z = this.isShowKeyLabelEnabled;
        long j2 = this.unmatchedElementColor;
        return (((((((iM * 31) + Color.m8235hashCodeimpl(this.overlayColor)) * 31) + Color.m8235hashCodeimpl(this.multipleMatchesColor)) * 31) + Color.m8235hashCodeimpl(j2)) * 31) + LookaheadAnimationVisualDebugConfig$$ExternalSyntheticBackport0.m(z);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isShowKeyLabelEnabled() {
        return this.isShowKeyLabelEnabled;
    }

    public String toString() {
        return "LookaheadAnimationVisualDebugConfig(isEnabled=" + this.isEnabled + ", overlayColor=" + ((Object) Color.m8236toStringimpl(this.overlayColor)) + ", multipleMatchesColor=" + ((Object) Color.m8236toStringimpl(this.multipleMatchesColor)) + ", unmatchedElementColor=" + ((Object) Color.m8236toStringimpl(this.unmatchedElementColor)) + ", isShowKeyLabelEnabled=" + this.isShowKeyLabelEnabled + ')';
    }

    public /* synthetic */ LookaheadAnimationVisualDebugConfig(boolean z, long j2, long j3, long j4, boolean z2, o oVar) {
        this(z, j2, j3, j4, z2);
    }

    private LookaheadAnimationVisualDebugConfig(boolean z, long j2, long j3, long j4, boolean z2) {
        this.isEnabled = z;
        this.overlayColor = j2;
        this.multipleMatchesColor = j3;
        this.unmatchedElementColor = j4;
        this.isShowKeyLabelEnabled = z2;
    }
}
