package androidx.compose.ui.layout;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowWindowInsetsAnimationValues implements PlatformWindowInsetsAnimation {
    public static final int $stable = 8;
    private final RectRulers source;
    private final RectRulers target;
    private final MutableState isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private final MutableState isAnimating$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableFloatState fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableLongState durationMillis$delegate = SnapshotLongStateKt.mutableLongStateOf(0);
    private final MutableFloatState alpha$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private long current = ValueInsets_androidKt.getUnsetValueInsets();
    private long maximum = ValueInsets_androidKt.getUnsetValueInsets();
    private long sourceValueInsets = ValueInsets_androidKt.getUnsetValueInsets();
    private long targetValueInsets = ValueInsets_androidKt.getUnsetValueInsets();

    public WindowWindowInsetsAnimationValues(String str) {
        this.source = RectRulersKt.RectRulers(String.valueOf(str).concat(" source"));
        this.target = RectRulersKt.RectRulers(String.valueOf(str).concat(" target"));
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getAlpha() {
        return this.alpha$delegate.getFloatValue();
    }

    /* renamed from: getCurrent-hdzbrEE, reason: not valid java name */
    public final long m9894getCurrenthdzbrEE() {
        return this.current;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public long getDurationMillis() {
        return this.durationMillis$delegate.getLongValue();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getFraction() {
        return this.fraction$delegate.getFloatValue();
    }

    /* renamed from: getMaximum-hdzbrEE, reason: not valid java name */
    public final long m9895getMaximumhdzbrEE() {
        return this.maximum;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getSource() {
        return this.source;
    }

    /* renamed from: getSourceValueInsets-hdzbrEE, reason: not valid java name */
    public final long m9896getSourceValueInsetshdzbrEE() {
        return this.sourceValueInsets;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getTarget() {
        return this.target;
    }

    /* renamed from: getTargetValueInsets-hdzbrEE, reason: not valid java name */
    public final long m9897getTargetValueInsetshdzbrEE() {
        return this.targetValueInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isAnimating() {
        return ((Boolean) this.isAnimating$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    public void setAlpha(float f2) {
        this.alpha$delegate.setFloatValue(f2);
    }

    public void setAnimating(boolean z) {
        this.isAnimating$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setCurrent-Ynlvx88, reason: not valid java name */
    public final void m9898setCurrentYnlvx88(long j2) {
        this.current = j2;
    }

    public void setDurationMillis(long j2) {
        this.durationMillis$delegate.setLongValue(j2);
    }

    public void setFraction(float f2) {
        this.fraction$delegate.setFloatValue(f2);
    }

    /* renamed from: setMaximum-Ynlvx88, reason: not valid java name */
    public final void m9899setMaximumYnlvx88(long j2) {
        this.maximum = j2;
    }

    /* renamed from: setSourceValueInsets-Ynlvx88, reason: not valid java name */
    public final void m9900setSourceValueInsetsYnlvx88(long j2) {
        this.sourceValueInsets = j2;
    }

    /* renamed from: setTargetValueInsets-Ynlvx88, reason: not valid java name */
    public final void m9901setTargetValueInsetsYnlvx88(long j2) {
        this.targetValueInsets = j2;
    }

    public void setVisible(boolean z) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z));
    }
}
