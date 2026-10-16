package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BiasAbsoluteAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public Horizontal(float f2) {
            this.bias = f2;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = horizontal.bias;
            }
            return horizontal.copy(f2);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int i2, int i3, LayoutDirection layoutDirection) {
            return Math.round(((i3 - i2) / 2.0f) * (this.bias + 1.0f));
        }

        public final float component1() {
            return this.bias;
        }

        public final Horizontal copy(float f2) {
            return new Horizontal(f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0;
        }

        public final float getBias() {
            return this.bias;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.bias);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public Alignment plus(Alignment.Vertical vertical) {
            return vertical instanceof BiasAlignment.Vertical ? new BiasAbsoluteAlignment(this.bias, ((BiasAlignment.Vertical) vertical).getBias()) : Alignment.Horizontal.CC.$default$plus(this, vertical);
        }

        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    public BiasAbsoluteAlignment(float f2, float f3) {
        this.horizontalBias = f2;
        this.verticalBias = f3;
    }

    public static /* synthetic */ BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = biasAbsoluteAlignment.horizontalBias;
        }
        if ((i2 & 2) != 0) {
            f3 = biasAbsoluteAlignment.verticalBias;
        }
        return biasAbsoluteAlignment.copy(f2, f3);
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo7648alignKFBX0sM(long j2, long j3, LayoutDirection layoutDirection) {
        long j4 = ((((int) (j3 >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return (Math.round((((int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / 2.0f) * (this.verticalBias + 1.0f)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Math.round((((int) (j4 >> 32)) / 2.0f) * (this.horizontalBias + 1.0f)) << 32);
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final BiasAbsoluteAlignment copy(float f2, float f3) {
        return new BiasAbsoluteAlignment(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        return Float.compare(this.horizontalBias, biasAbsoluteAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAbsoluteAlignment.verticalBias) == 0;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.horizontalBias) * 31) + Float.floatToIntBits(this.verticalBias);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
