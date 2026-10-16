package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GlowEdgeEffectCompat extends EdgeEffect {
    private float oppositeReleaseDelta;
    private final float oppositeReleaseDeltaThreshold;

    public GlowEdgeEffectCompat(Context context) {
        super(context);
        this.oppositeReleaseDeltaThreshold = AndroidDensity_androidKt.Density(context).mo2127toPx0680j_4(1.0f);
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i2) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(i2);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f2) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f2);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    public final void releaseWithOppositeDelta(float f2) {
        float f3 = this.oppositeReleaseDelta + f2;
        this.oppositeReleaseDelta = f3;
        if (Math.abs(f3) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f2, float f3) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f2, f3);
    }
}
