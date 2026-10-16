package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DynamicPaddingValues implements PaddingValues {
    public static final int $stable = 0;
    private final PaddingValues collapsedPaddingValues;
    private final PaddingValues expandedPaddingValues;
    private float progress;

    public DynamicPaddingValues(PaddingValues paddingValues, PaddingValues paddingValues2, boolean z) {
        this.collapsedPaddingValues = paddingValues;
        this.expandedPaddingValues = paddingValues2;
        this.progress = true != z ? 0.0f : 1.0f;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo2704calculateBottomPaddingD9Ej5fM() {
        return DpKt.m11207lerpMdfbLM(this.collapsedPaddingValues.mo2704calculateBottomPaddingD9Ej5fM(), this.expandedPaddingValues.mo2704calculateBottomPaddingD9Ej5fM(), this.progress);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo2705calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return DpKt.m11207lerpMdfbLM(this.collapsedPaddingValues.mo2705calculateLeftPaddingu2uoSUM(layoutDirection), this.expandedPaddingValues.mo2705calculateLeftPaddingu2uoSUM(layoutDirection), this.progress);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo2706calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return DpKt.m11207lerpMdfbLM(this.collapsedPaddingValues.mo2706calculateRightPaddingu2uoSUM(layoutDirection), this.expandedPaddingValues.mo2706calculateRightPaddingu2uoSUM(layoutDirection), this.progress);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo2707calculateTopPaddingD9Ej5fM() {
        return DpKt.m11207lerpMdfbLM(this.collapsedPaddingValues.mo2707calculateTopPaddingD9Ej5fM(), this.expandedPaddingValues.mo2707calculateTopPaddingD9Ej5fM(), this.progress);
    }

    public final PaddingValues getCollapsedPaddingValues() {
        return this.collapsedPaddingValues;
    }

    public final PaddingValues getExpandedPaddingValues() {
        return this.expandedPaddingValues;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final void setProgress(float f2) {
        this.progress = n.g(f2, 0.0f, 1.0f);
    }
}
