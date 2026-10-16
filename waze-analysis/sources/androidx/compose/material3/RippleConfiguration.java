package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RippleConfiguration {
    public static final int $stable = 0;
    private final long color;
    private final Focus focus;
    private final RippleAlpha rippleAlpha;

    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, int i2, o oVar) {
        this((i2 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2, (i2 & 2) != 0 ? null : rippleAlpha, (o) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.m8229equalsimpl0(this.color, rippleConfiguration.color) && x.n(this.focus, rippleConfiguration.focus) && x.n(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5408getColor0d7_KjU() {
        return this.color;
    }

    public final Focus getFocus() {
        return this.focus;
    }

    public final RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public int hashCode() {
        Color.Companion companion = Color.Companion;
        Focus focus = this.focus;
        int iHashCode = focus != null ? focus.hashCode() : 0;
        long j2 = this.color;
        RippleAlpha rippleAlpha = this.rippleAlpha;
        return (((Color.m8235hashCodeimpl(j2) * 31) + iHashCode) * 31) + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) Color.m8236toStringimpl(this.color)) + ", focus=" + this.focus + ", rippleAlpha=" + this.rippleAlpha + ')';
    }

    /* compiled from: WazeSource */
    public abstract class Focus {
        public static final int $stable = 0;

        /* compiled from: WazeSource */
        public final class Opacity extends Focus {
            public static final int $stable = 0;

            public Opacity() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Opacity);
            }

            public int hashCode() {
                return 1;
            }
        }

        private Focus() {
        }

        public /* synthetic */ Focus(o oVar) {
            this();
        }

        /* compiled from: WazeSource */
        public final class InsetRing extends Focus {
            public static final int $stable = 0;
            private final long innerStrokeColor;
            private final long outerStrokeColor;

            private InsetRing(long j2, long j3) {
                super(null);
                this.outerStrokeColor = j2;
                this.innerStrokeColor = j3;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InsetRing)) {
                    return false;
                }
                InsetRing insetRing = (InsetRing) obj;
                return Color.m8229equalsimpl0(this.outerStrokeColor, insetRing.outerStrokeColor) && Color.m8229equalsimpl0(this.innerStrokeColor, insetRing.innerStrokeColor);
            }

            /* renamed from: getInnerStrokeColor-0d7_KjU, reason: not valid java name */
            public final long m5409getInnerStrokeColor0d7_KjU() {
                return this.innerStrokeColor;
            }

            /* renamed from: getOuterStrokeColor-0d7_KjU, reason: not valid java name */
            public final long m5410getOuterStrokeColor0d7_KjU() {
                return this.outerStrokeColor;
            }

            public int hashCode() {
                return (Color.m8235hashCodeimpl(this.outerStrokeColor) * 31) + Color.m8235hashCodeimpl(this.innerStrokeColor);
            }

            public /* synthetic */ InsetRing(long j2, long j3, o oVar) {
                this(j2, j3);
            }
        }
    }

    private RippleConfiguration(long j2, Focus focus, RippleAlpha rippleAlpha) {
        this.color = j2;
        this.focus = focus;
        this.rippleAlpha = rippleAlpha;
    }

    public /* synthetic */ RippleConfiguration(long j2, Focus focus, RippleAlpha rippleAlpha, o oVar) {
        this(j2, focus, rippleAlpha);
    }

    public /* synthetic */ RippleConfiguration(long j2, o oVar) {
        this(j2);
    }

    public /* synthetic */ RippleConfiguration(Focus focus, long j2, o oVar) {
        this(focus, j2);
    }

    private RippleConfiguration(long j2) {
        this(j2, (Focus) null, (RippleAlpha) null, (o) null);
    }

    private RippleConfiguration(Focus focus, long j2) {
        this(j2, focus, (RippleAlpha) null, (o) null);
    }

    public /* synthetic */ RippleConfiguration(long j2, int i2, o oVar) {
        this((i2 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2, (o) null);
    }

    public /* synthetic */ RippleConfiguration(Focus focus, long j2, int i2, o oVar) {
        this(focus, (i2 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2, (o) null);
    }

    private RippleConfiguration(long j2, RippleAlpha rippleAlpha) {
        this(j2, (Focus) null, rippleAlpha, (o) null);
    }

    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, o oVar) {
        this(j2, rippleAlpha);
    }
}
