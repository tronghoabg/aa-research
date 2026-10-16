package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ColorSpace {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;
    private final String name;

    private ColorSpace(String str, long j2, int i2) {
        this.name = str;
        this.model = j2;
        this.id = i2;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i2 < -1 || i2 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.id == colorSpace.id && x.n(this.name, colorSpace.name)) {
            return ColorModel.m8690equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    public final float[] fromXyz(float f2, float f3, float f4) {
        float[] fArr = new float[ColorModel.m8691getComponentCountimpl(this.model)];
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        return fromXyz(fArr);
    }

    public abstract float[] fromXyz(float[] fArr);

    public final int getComponentCount() {
        return ColorModel.m8691getComponentCountimpl(this.model);
    }

    public final int getId$ui_graphics() {
        return this.id;
    }

    public abstract float getMaxValue(int i2);

    public abstract float getMinValue(int i2);

    /* renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m8699getModelxdoWZVw() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m8692hashCodeimpl(this.model)) * 31) + this.id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m8693toStringimpl(this.model)) + ')';
    }

    public long toXy$ui_graphics(float f2, float f3, float f4) {
        float[] xyz = toXyz(f2, f3, f4);
        float f5 = xyz[0];
        float f6 = xyz[1];
        return (Float.floatToRawIntBits(f5) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(f6));
    }

    public final float[] toXyz(float f2, float f3, float f4) {
        return toXyz(new float[]{f2, f3, f4});
    }

    public abstract float[] toXyz(float[] fArr);

    public float toZ$ui_graphics(float f2, float f3, float f4) {
        return toXyz(f2, f3, f4)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics, reason: not valid java name */
    public long mo8700xyzaToColorJlNiLsg$ui_graphics(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArrFromXyz = fromXyz(f2, f3, f4);
        return ColorKt.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], f5, colorSpace);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ ColorSpace(String str, long j2, o oVar) {
        this(str, j2);
    }

    private ColorSpace(String str, long j2) {
        this(str, j2, -1, null);
    }

    public /* synthetic */ ColorSpace(String str, long j2, int i2, o oVar) {
        this(str, j2, i2);
    }
}
