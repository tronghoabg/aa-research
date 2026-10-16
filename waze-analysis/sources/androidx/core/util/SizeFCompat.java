package androidx.core.util;

import android.util.SizeF;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SizeFCompat {
    private final float mHeight;
    private final float mWidth;

    public SizeFCompat(float f2, float f3) {
        Preconditions.checkArgumentFinite(f2, "width");
        this.mWidth = f2;
        Preconditions.checkArgumentFinite(f3, "height");
        this.mHeight = f3;
    }

    public static SizeFCompat toSizeFCompat(SizeF sizeF) {
        return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        return sizeFCompat.mWidth == this.mWidth && sizeFCompat.mHeight == this.mHeight;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public float getWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.mWidth) ^ Float.floatToIntBits(this.mHeight);
    }

    public SizeF toSizeF() {
        return new SizeF(getWidth(), getHeight());
    }

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }
}
