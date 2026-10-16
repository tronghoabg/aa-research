package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScaffoldKt$ScaffoldLayout$contentPadding$1$1 implements PaddingValues {
    private final MutableState paddingHolder$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PaddingKt.m2748PaddingValues0680j_4(0.0f), null, 2, null);

    ScaffoldKt$ScaffoldLayout$contentPadding$1$1() {
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo2704calculateBottomPaddingD9Ej5fM() {
        return getPaddingHolder().mo2704calculateBottomPaddingD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo2705calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return getPaddingHolder().mo2705calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo2706calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return getPaddingHolder().mo2706calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo2707calculateTopPaddingD9Ej5fM() {
        return getPaddingHolder().mo2707calculateTopPaddingD9Ej5fM();
    }

    public final PaddingValues getPaddingHolder() {
        return (PaddingValues) this.paddingHolder$delegate.getValue();
    }

    public final void setPaddingHolder(PaddingValues paddingValues) {
        this.paddingHolder$delegate.setValue(paddingValues);
    }
}
