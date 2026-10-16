package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    static final int NONE = -1;
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    int mCurrentSize = 0;
    private int mRowSize = 8;
    private SolverVariable mCandidate = null;
    private int[] mArrayIndices = new int[8];
    private int[] mArrayNextIndices = new int[8];
    private float[] mArrayValues = new float[8];
    private int mHead = -1;
    private int mLast = -1;
    private boolean mDidFillOnce = false;

    ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f2, boolean z) {
        int[] iArr;
        float f3 = sEpsilon;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.mHead;
            if (i2 == -1) {
                this.mHead = 0;
                this.mArrayValues[0] = f2;
                this.mArrayIndices[0] = solverVariable.id;
                this.mArrayNextIndices[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.mCurrentSize++;
                if (this.mDidFillOnce) {
                    return;
                }
                int i3 = this.mLast + 1;
                this.mLast = i3;
                int length = this.mArrayIndices.length;
                if (i3 >= length) {
                    this.mDidFillOnce = true;
                    this.mLast = length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.mCurrentSize; i5++) {
                int i6 = this.mArrayIndices[i2];
                int i7 = solverVariable.id;
                if (i6 == i7) {
                    float[] fArr = this.mArrayValues;
                    float f4 = fArr[i2] + f2;
                    float f5 = sEpsilon;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        int i8 = this.mHead;
                        int[] iArr2 = this.mArrayNextIndices;
                        if (i2 == i8) {
                            this.mHead = iArr2[i2];
                        } else {
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z) {
                            solverVariable.removeFromRow(this.mRow);
                        }
                        if (this.mDidFillOnce) {
                            this.mLast = i2;
                        }
                        solverVariable.usageInRowCount--;
                        this.mCurrentSize--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.mArrayNextIndices[i2];
            }
            int length2 = this.mLast;
            int i9 = length2 + 1;
            if (this.mDidFillOnce) {
                int[] iArr3 = this.mArrayIndices;
                if (iArr3[length2] != -1) {
                    length2 = iArr3.length;
                }
            } else {
                length2 = i9;
            }
            int[] iArr4 = this.mArrayIndices;
            int length3 = iArr4.length;
            if (length2 >= length3 && this.mCurrentSize < length3) {
                int i10 = 0;
                while (true) {
                    iArr = this.mArrayIndices;
                    if (i10 >= iArr.length) {
                        iArr4 = iArr;
                        break;
                    } else {
                        if (iArr[i10] == -1) {
                            length2 = i10;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                iArr = iArr4;
            }
            int length4 = iArr.length;
            if (length2 >= length4) {
                int i11 = this.mRowSize;
                int i12 = i11 + i11;
                this.mRowSize = i12;
                this.mDidFillOnce = false;
                this.mLast = length4 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i12);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
                length2 = length4;
            }
            this.mArrayIndices[length2] = solverVariable.id;
            this.mArrayValues[length2] = f2;
            int[] iArr5 = this.mArrayNextIndices;
            if (i4 != -1) {
                iArr5[length2] = iArr5[i4];
                iArr5[i4] = length2;
            } else {
                iArr5[length2] = this.mHead;
                this.mHead = length2;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.mCurrentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            int i13 = this.mLast;
            int length5 = this.mArrayIndices.length;
            if (i13 >= length5) {
                this.mDidFillOnce = true;
                this.mLast = length5 - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i2 = this.mHead;
        for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i2 = this.mArrayNextIndices[i2];
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.mCurrentSize = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        int i2 = this.mHead;
        if (i2 != -1) {
            for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
                if (this.mArrayIndices[i2] == solverVariable.id) {
                    return true;
                }
                i2 = this.mArrayNextIndices[i2];
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i2 = this.mCurrentSize;
        System.out.print("{ ");
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable variable = getVariable(i3);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i3) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f2) {
        int i2 = this.mHead;
        for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
            float[] fArr = this.mArrayValues;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.mArrayNextIndices[i2];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable solverVariable) {
        int i2 = this.mHead;
        for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
            if (this.mArrayIndices[i2] == solverVariable.id) {
                return this.mArrayValues[i2];
            }
            i2 = this.mArrayNextIndices[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCurrentSize;
    }

    public int getHead() {
        return this.mHead;
    }

    public final int getId(int i2) {
        return this.mArrayIndices[i2];
    }

    public final int getNextIndice(int i2) {
        return this.mArrayNextIndices[i2];
    }

    SolverVariable getPivotCandidate() {
        SolverVariable solverVariable = this.mCandidate;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i2 = this.mHead;
        SolverVariable solverVariable2 = null;
        for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
            if (this.mArrayValues[i2] < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
                if (solverVariable2 == null || solverVariable2.strength < solverVariable3.strength) {
                    solverVariable2 = solverVariable3;
                }
            }
            i2 = this.mArrayNextIndices[i2];
        }
        return solverVariable2;
    }

    public final float getValue(int i2) {
        return this.mArrayValues[i2];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i2) {
        int i3 = this.mHead;
        for (int i4 = 0; i3 != -1 && i4 < this.mCurrentSize; i4++) {
            if (i4 == i2) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i3]];
            }
            i3 = this.mArrayNextIndices[i3];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i2) {
        int i3 = this.mHead;
        for (int i4 = 0; i3 != -1 && i4 < this.mCurrentSize; i4++) {
            if (i4 == i2) {
                return this.mArrayValues[i3];
            }
            i3 = this.mArrayNextIndices[i3];
        }
        return 0.0f;
    }

    boolean hasAtLeastOnePositiveVariable() {
        int i2 = this.mHead;
        for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
            if (this.mArrayValues[i2] > 0.0f) {
                return true;
            }
            i2 = this.mArrayNextIndices[i2];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        int i2 = this.mHead;
        if (i2 != -1) {
            for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
                if (this.mArrayIndices[i2] == solverVariable.id) {
                    return i2;
                }
                i2 = this.mArrayNextIndices[i2];
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i2 = this.mHead;
        for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
            float[] fArr = this.mArrayValues;
            fArr[i2] = -fArr[i2];
            i2 = this.mArrayNextIndices[i2];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable solverVariable, float f2) {
        int[] iArr;
        if (f2 == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i2 = this.mHead;
        if (i2 == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = f2;
            this.mArrayIndices[0] = solverVariable.id;
            this.mArrayNextIndices[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.mCurrentSize++;
            if (this.mDidFillOnce) {
                return;
            }
            int i3 = this.mLast + 1;
            this.mLast = i3;
            int length = this.mArrayIndices.length;
            if (i3 >= length) {
                this.mDidFillOnce = true;
                this.mLast = length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.mCurrentSize; i5++) {
            int i6 = this.mArrayIndices[i2];
            int i7 = solverVariable.id;
            if (i6 == i7) {
                this.mArrayValues[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.mArrayNextIndices[i2];
        }
        int length2 = this.mLast;
        int i8 = length2 + 1;
        if (this.mDidFillOnce) {
            int[] iArr2 = this.mArrayIndices;
            if (iArr2[length2] != -1) {
                length2 = iArr2.length;
            }
        } else {
            length2 = i8;
        }
        int[] iArr3 = this.mArrayIndices;
        int length3 = iArr3.length;
        if (length2 >= length3 && this.mCurrentSize < length3) {
            int i9 = 0;
            while (true) {
                iArr = this.mArrayIndices;
                if (i9 >= iArr.length) {
                    iArr3 = iArr;
                    break;
                } else {
                    if (iArr[i9] == -1) {
                        length2 = i9;
                        break;
                    }
                    i9++;
                }
            }
        } else {
            iArr = iArr3;
        }
        int length4 = iArr.length;
        if (length2 >= length4) {
            int i10 = this.mRowSize;
            int i11 = i10 + i10;
            this.mRowSize = i11;
            this.mDidFillOnce = false;
            this.mLast = length4 - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, i11);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
            length2 = length4;
        }
        this.mArrayIndices[length2] = solverVariable.id;
        this.mArrayValues[length2] = f2;
        int[] iArr4 = this.mArrayNextIndices;
        if (i4 != -1) {
            iArr4[length2] = iArr4[i4];
            iArr4[i4] = length2;
        } else {
            iArr4[length2] = this.mHead;
            this.mHead = length2;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.mRow);
        int i12 = this.mCurrentSize + 1;
        this.mCurrentSize = i12;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int length5 = this.mArrayIndices.length;
        if (i12 >= length5) {
            this.mDidFillOnce = true;
        }
        if (this.mLast >= length5) {
            this.mDidFillOnce = true;
            this.mLast = length5 - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable solverVariable, boolean z) {
        if (this.mCandidate == solverVariable) {
            this.mCandidate = null;
        }
        int i2 = this.mHead;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.mCurrentSize) {
            if (this.mArrayIndices[i2] == solverVariable.id) {
                int i5 = this.mHead;
                int[] iArr = this.mArrayNextIndices;
                if (i2 == i5) {
                    this.mHead = iArr[i2];
                } else {
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    solverVariable.removeFromRow(this.mRow);
                }
                solverVariable.usageInRowCount--;
                this.mCurrentSize--;
                this.mArrayIndices[i2] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i2;
                }
                return this.mArrayValues[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.mArrayNextIndices[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return (this.mArrayIndices.length * 12) + 36;
    }

    public String toString() {
        int i2 = this.mHead;
        String strConcat = "";
        for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
            String str = strConcat.concat(" -> ") + this.mArrayValues[i2] + " : ";
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
            Objects.toString(solverVariable);
            strConcat = str.concat(String.valueOf(solverVariable));
            i2 = this.mArrayNextIndices[i2];
        }
        return strConcat;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z) {
        float f2 = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i2 = 0; i2 < currentSize; i2++) {
            SolverVariable variable = arrayRowVariables.getVariable(i2);
            add(variable, arrayRowVariables.get(variable) * f2, z);
        }
        return f2;
    }
}
