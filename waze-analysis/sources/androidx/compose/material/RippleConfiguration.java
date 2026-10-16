package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RippleConfiguration {
    public static final int $stable = 0;
    private final long color;
    private final RippleAlpha rippleAlpha;

    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, int i2, o oVar) {
        this((i2 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2, (i2 & 2) != 0 ? null : rippleAlpha, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.m8229equalsimpl0(this.color, rippleConfiguration.color) && x.n(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4165getColor0d7_KjU() {
        return this.color;
    }

    public final RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public int hashCode() {
        Color.Companion companion = Color.Companion;
        RippleAlpha rippleAlpha = this.rippleAlpha;
        return (Color.m8235hashCodeimpl(this.color) * 31) + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) Color.m8236toStringimpl(this.color)) + ", rippleAlpha=" + this.rippleAlpha + ')';
    }

    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, o oVar) {
        this(j2, rippleAlpha);
    }

    private RippleConfiguration(long j2, RippleAlpha rippleAlpha) {
        this.color = j2;
        this.rippleAlpha = rippleAlpha;
    }
}
