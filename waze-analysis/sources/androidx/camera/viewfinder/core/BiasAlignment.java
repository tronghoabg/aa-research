package androidx.camera.viewfinder.core;

import android.util.SizeF;
import androidx.camera.viewfinder.core.impl.Alignment;
import androidx.camera.viewfinder.core.impl.TransformationsKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BiasAlignment implements Alignment {
    private final float horizontalBias;
    private final float verticalBias;

    public BiasAlignment(float f2, float f3) {
        this.horizontalBias = f2;
        this.verticalBias = f3;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = biasAlignment.horizontalBias;
        }
        if ((i2 & 2) != 0) {
            f3 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f2, f3);
    }

    @Override // androidx.camera.viewfinder.core.impl.Alignment
    /* renamed from: align-41g9ag8, reason: not valid java name */
    public long mo1546align41g9ag8(SizeF sizeF, SizeF sizeF2, int i2) {
        x.f(sizeF, "size");
        x.f(sizeF2, "space");
        float width = sizeF2.getWidth() - sizeF.getWidth();
        float height = sizeF2.getHeight() - sizeF.getHeight();
        float f2 = this.horizontalBias;
        if (i2 != 0) {
            f2 = -f2;
        }
        return TransformationsKt.OffsetF((width / 2.0f) * (f2 + 1.0f), (height / 2.0f) * (this.verticalBias + 1.0f));
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final BiasAlignment copy(float f2, float f3) {
        return new BiasAlignment(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
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
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ")";
    }
}
