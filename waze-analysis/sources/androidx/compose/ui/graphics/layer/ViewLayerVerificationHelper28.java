package androidx.compose.ui.graphics.layer;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ViewLayerVerificationHelper28 {
    public static final ViewLayerVerificationHelper28 INSTANCE = new ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    public final void resetPivot(View view) {
        view.resetPivot();
    }

    public final void setOutlineAmbientShadowColor(View view, int i2) {
        view.setOutlineAmbientShadowColor(i2);
    }

    public final void setOutlineSpotShadowColor(View view, int i2) {
        view.setOutlineSpotShadowColor(i2);
    }
}
