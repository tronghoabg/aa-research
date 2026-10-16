package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class KeyFrameArray {

    /* compiled from: WazeSource */
    public class CustomArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        CustomAttribute[] mValues = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i2, CustomAttribute customAttribute) {
            if (this.mValues[i2] != null) {
                remove(i2);
            }
            this.mValues[i2] = customAttribute;
            int[] iArr = this.mKeys;
            int i3 = this.mCount;
            this.mCount = i3 + 1;
            iArr[i3] = i2;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: ".concat(String.valueOf(Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)))));
            System.out.print("K: [");
            int i2 = 0;
            while (i2 < this.mCount) {
                PrintStream printStream = System.out;
                String str = i2 == 0 ? "" : ", ";
                CustomAttribute customAttributeValueAt = valueAt(i2);
                Objects.toString(customAttributeValueAt);
                printStream.print(str.concat(String.valueOf(customAttributeValueAt)));
                i2++;
            }
            System.out.println("]");
        }

        public int keyAt(int i2) {
            return this.mKeys[i2];
        }

        public void remove(int i2) {
            this.mValues[i2] = null;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = this.mCount;
                if (i3 >= i5) {
                    this.mCount = i5 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i2 == iArr[i3]) {
                    iArr[i3] = 999;
                    i4++;
                }
                if (i3 != i4) {
                    iArr[i3] = iArr[i4];
                }
                i4++;
                i3++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomAttribute valueAt(int i2) {
            return this.mValues[this.mKeys[i2]];
        }
    }

    /* compiled from: WazeSource */
    public class CustomVar {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        CustomVariable[] mValues = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i2, CustomVariable customVariable) {
            if (this.mValues[i2] != null) {
                remove(i2);
            }
            this.mValues[i2] = customVariable;
            int[] iArr = this.mKeys;
            int i3 = this.mCount;
            this.mCount = i3 + 1;
            iArr[i3] = i2;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: ".concat(String.valueOf(Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)))));
            System.out.print("K: [");
            int i2 = 0;
            while (i2 < this.mCount) {
                PrintStream printStream = System.out;
                String str = i2 == 0 ? "" : ", ";
                CustomVariable customVariableValueAt = valueAt(i2);
                Objects.toString(customVariableValueAt);
                printStream.print(str.concat(String.valueOf(customVariableValueAt)));
                i2++;
            }
            System.out.println("]");
        }

        public int keyAt(int i2) {
            return this.mKeys[i2];
        }

        public void remove(int i2) {
            this.mValues[i2] = null;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = this.mCount;
                if (i3 >= i5) {
                    this.mCount = i5 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i2 == iArr[i3]) {
                    iArr[i3] = 999;
                    i4++;
                }
                if (i3 != i4) {
                    iArr[i3] = iArr[i4];
                }
                i4++;
                i3++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomVariable valueAt(int i2) {
            return this.mValues[this.mKeys[i2]];
        }
    }

    /* compiled from: WazeSource */
    class FloatArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        float[][] mValues = new float[101][];

        FloatArray() {
            clear();
        }

        public void append(int i2, float[] fArr) {
            if (this.mValues[i2] != null) {
                remove(i2);
            }
            this.mValues[i2] = fArr;
            int[] iArr = this.mKeys;
            int i3 = this.mCount;
            this.mCount = i3 + 1;
            iArr[i3] = i2;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: ".concat(String.valueOf(Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)))));
            System.out.print("K: [");
            int i2 = 0;
            while (i2 < this.mCount) {
                System.out.print((i2 == 0 ? "" : ", ").concat(String.valueOf(Arrays.toString(valueAt(i2)))));
                i2++;
            }
            System.out.println("]");
        }

        public int keyAt(int i2) {
            return this.mKeys[i2];
        }

        public void remove(int i2) {
            this.mValues[i2] = null;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = this.mCount;
                if (i3 >= i5) {
                    this.mCount = i5 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i2 == iArr[i3]) {
                    iArr[i3] = 999;
                    i4++;
                }
                if (i3 != i4) {
                    iArr[i3] = iArr[i4];
                }
                i4++;
                i3++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public float[] valueAt(int i2) {
            return this.mValues[this.mKeys[i2]];
        }
    }
}
