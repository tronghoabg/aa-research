package androidx.compose.ui.unit.fontscaling;

import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontScaleConverterTable implements FontScaleConverter {
    private final float[] mFromSpValues;
    private final float[] mToDpValues;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        if (length != fArr2.length || length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.mFromSpValues = fArr;
        this.mToDpValues = fArr2;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f2) {
        return Companion.lookupAndInterpolate(f2, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f2) {
        return Companion.lookupAndInterpolate(f2, this.mFromSpValues, this.mToDpValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && Arrays.equals(this.mToDpValues, fontScaleConverterTable.mToDpValues);
    }

    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mFromSpValues) * 31) + Arrays.hashCode(this.mToDpValues);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.mFromSpValues);
        x.e(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.mToDpValues);
        x.e(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float lookupAndInterpolate(float f2, float[] fArr, float[] fArr2) {
            float f3;
            float f4;
            float f5;
            float f6;
            float fConstrainedMap;
            float fAbs = Math.abs(f2);
            float fSignum = Math.signum(f2);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fConstrainedMap = fArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                int i3 = i2 - 1;
                int length = fArr.length - 1;
                if (i3 >= length) {
                    float f7 = fArr[length];
                    float f8 = fArr2[length];
                    if (f7 == 0.0f) {
                        return 0.0f;
                    }
                    return f2 * (f8 / f7);
                }
                if (i3 == -1) {
                    f3 = fArr[0];
                    f5 = fArr2[0];
                    f4 = 0.0f;
                    f6 = 0.0f;
                } else {
                    float f9 = fArr[i3];
                    f3 = fArr[i2];
                    f4 = fArr2[i3];
                    f5 = fArr2[i2];
                    f6 = f9;
                }
                fConstrainedMap = MathUtils.INSTANCE.constrainedMap(f4, f5, f6, f3, fAbs);
            }
            return fSignum * fConstrainedMap;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    public static /* synthetic */ void getMToDpValues$annotations() {
    }
}
