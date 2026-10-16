package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class InnermostAnimationProperties implements WindowInsetsAnimation {
    private final WindowInsetsRulers[] rulers;
    private final Placeable.PlacementScope scope;

    public InnermostAnimationProperties(Placeable.PlacementScope placementScope, WindowInsetsRulers[] windowInsetsRulersArr) {
        this.scope = placementScope;
        this.rulers = windowInsetsRulersArr;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getAlpha() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public long getDurationMillis() {
        return 0L;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getFraction() {
        return 0.0f;
    }

    public final WindowInsetsRulers[] getRulers() {
        return this.rulers;
    }

    public final Placeable.PlacementScope getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getSource() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getTarget() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isAnimating() {
        for (WindowInsetsRulers windowInsetsRulers : this.rulers) {
            if (windowInsetsRulers.getAnimation(this.scope).isAnimating()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isVisible() {
        for (WindowInsetsRulers windowInsetsRulers : this.rulers) {
            if (windowInsetsRulers.getAnimation(this.scope).isVisible()) {
                return true;
            }
        }
        return false;
    }
}
