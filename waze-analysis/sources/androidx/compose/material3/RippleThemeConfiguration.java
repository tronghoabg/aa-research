package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RippleThemeConfiguration {
    public static final int $stable = 0;
    private final Focus focus;

    public RippleThemeConfiguration(Focus focus) {
        this.focus = focus;
    }

    public final Focus getFocus() {
        return this.focus;
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
            private final float innerStrokeInset;
            private final float innerStrokeWidth;
            private final float outerStrokeInset;
            private final float outerStrokeWidth;

            private InsetRing(float f2, float f3, float f4, float f5) {
                super(null);
                this.outerStrokeInset = f2;
                this.outerStrokeWidth = f3;
                this.innerStrokeInset = f4;
                this.innerStrokeWidth = f5;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InsetRing)) {
                    return false;
                }
                InsetRing insetRing = (InsetRing) obj;
                return Dp.m11169equalsimpl0(this.outerStrokeInset, insetRing.outerStrokeInset) && Dp.m11169equalsimpl0(this.outerStrokeWidth, insetRing.outerStrokeWidth) && Dp.m11169equalsimpl0(this.innerStrokeInset, insetRing.innerStrokeInset) && Dp.m11169equalsimpl0(this.innerStrokeWidth, insetRing.innerStrokeWidth);
            }

            /* renamed from: getInnerStrokeInset-D9Ej5fM, reason: not valid java name */
            public final float m5419getInnerStrokeInsetD9Ej5fM() {
                return this.innerStrokeInset;
            }

            /* renamed from: getInnerStrokeWidth-D9Ej5fM, reason: not valid java name */
            public final float m5420getInnerStrokeWidthD9Ej5fM() {
                return this.innerStrokeWidth;
            }

            /* renamed from: getOuterStrokeInset-D9Ej5fM, reason: not valid java name */
            public final float m5421getOuterStrokeInsetD9Ej5fM() {
                return this.outerStrokeInset;
            }

            /* renamed from: getOuterStrokeWidth-D9Ej5fM, reason: not valid java name */
            public final float m5422getOuterStrokeWidthD9Ej5fM() {
                return this.outerStrokeWidth;
            }

            public int hashCode() {
                return (((((Dp.m11170hashCodeimpl(this.outerStrokeInset) * 31) + Dp.m11170hashCodeimpl(this.outerStrokeWidth)) * 31) + Dp.m11170hashCodeimpl(this.innerStrokeInset)) * 31) + Dp.m11170hashCodeimpl(this.innerStrokeWidth);
            }

            public /* synthetic */ InsetRing(float f2, float f3, float f4, float f5, o oVar) {
                this(f2, f3, f4, f5);
            }
        }
    }
}
