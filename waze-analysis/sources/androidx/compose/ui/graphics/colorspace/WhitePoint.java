package androidx.compose.ui.graphics.colorspace;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WhitePoint {
    public static final int $stable = 0;
    private final float x;
    private final float y;

    public WhitePoint(float f2, float f3) {
        this.x = f2;
        this.y = f3;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = whitePoint.x;
        }
        if ((i2 & 2) != 0) {
            f3 = whitePoint.y;
        }
        return whitePoint.copy(f2, f3);
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    public final WhitePoint copy(float f2, float f3) {
        return new WhitePoint(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.x, whitePoint.x) == 0 && Float.compare(this.y, whitePoint.y) == 0;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y);
    }

    public String toString() {
        return "WhitePoint(x=" + this.x + ", y=" + this.y + ')';
    }

    public final float[] toXyz$ui_graphics() {
        float f2 = this.x;
        float f3 = this.y;
        return new float[]{f2 / f3, 1.0f, ((1.0f - f2) - f3) / f3};
    }

    public WhitePoint(float f2, float f3, float f4) {
        this(f2, f3, f4, f2 + f3 + f4);
    }

    private WhitePoint(float f2, float f3, float f4, float f5) {
        this(f2 / f5, f3 / f5);
    }
}
