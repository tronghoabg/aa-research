package androidx.constraintlayout.core;

import androidx.camera.core.processing.util.GLUtils;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ArrayRow implements LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public ArrayRowVariables variables;
    SolverVariable mVariable = null;
    float mConstantValue = 0.0f;
    boolean mUsed = false;
    ArrayList<SolverVariable> mVariablesToUpdate = new ArrayList<>();
    boolean mIsSimpleDefinition = false;

    /* compiled from: WazeSource */
    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f2, boolean z);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f2);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i2);

        float getVariableValue(int i2);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f2);

        float remove(SolverVariable solverVariable, boolean z);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z);
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        return solverVariable.usageInRowCount <= 1;
    }

    private SolverVariable pickPivotInVariables(boolean[] zArr, SolverVariable solverVariable) {
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < currentSize; i2++) {
            float variableValue = this.variables.getVariableValue(i2);
            if (variableValue < 0.0f) {
                SolverVariable variable = this.variables.getVariable(i2);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && ((variable.mType == SolverVariable.Type.SLACK || variable.mType == SolverVariable.Type.ERROR) && variableValue < f2)) {
                    f2 = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        int i2 = solverVariable.strength;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f2);
    }

    ArrayRow addSingleError(SolverVariable solverVariable, int i2) {
        this.variables.put(solverVariable, i2);
        return this;
    }

    boolean chooseSubject(LinearSystem linearSystem) {
        boolean z;
        SolverVariable solverVariableChooseSubjectInVariables = chooseSubjectInVariables(linearSystem);
        if (solverVariableChooseSubjectInVariables == null) {
            z = true;
        } else {
            pivot(solverVariableChooseSubjectInVariables);
            z = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.constraintlayout.core.SolverVariable chooseSubjectInVariables(androidx.constraintlayout.core.LinearSystem r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r2 = r0.variables
            int r2 = r2.getCurrentSize()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r3
            r7 = r6
            r10 = r4
            r11 = r10
            r8 = r5
            r9 = r8
        L13:
            if (r3 >= r2) goto L73
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r12 = r0.variables
            float r12 = r12.getVariableValue(r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r13 = r0.variables
            androidx.constraintlayout.core.SolverVariable r13 = r13.getVariable(r3)
            androidx.constraintlayout.core.SolverVariable$Type r14 = r13.mType
            androidx.constraintlayout.core.SolverVariable$Type r15 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            r16 = 1
            if (r14 != r15) goto L48
            if (r8 != 0) goto L32
            boolean r6 = r0.isNew(r13, r1)
        L2f:
            r10 = r12
            r8 = r13
            goto L70
        L32:
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L3b
            boolean r6 = r0.isNew(r13, r1)
            goto L2f
        L3b:
            if (r6 != 0) goto L70
            boolean r14 = r0.isNew(r13, r1)
            if (r14 == 0) goto L70
            r10 = r12
            r8 = r13
            r6 = r16
            goto L70
        L48:
            if (r8 != 0) goto L70
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 >= 0) goto L6f
            if (r9 != 0) goto L58
            boolean r7 = r0.isNew(r13, r1)
        L54:
            r8 = r5
            r11 = r12
            r9 = r13
            goto L70
        L58:
            int r8 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r8 <= 0) goto L61
            boolean r7 = r0.isNew(r13, r1)
            goto L54
        L61:
            if (r7 != 0) goto L6f
            boolean r8 = r0.isNew(r13, r1)
            if (r8 == 0) goto L6f
            r8 = r5
            r11 = r12
            r9 = r13
            r7 = r16
            goto L70
        L6f:
            r8 = r5
        L70:
            int r3 = r3 + 1
            goto L13
        L73:
            if (r8 == 0) goto L76
            return r8
        L76:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.ArrayRow.chooseSubjectInVariables(androidx.constraintlayout.core.LinearSystem):androidx.constraintlayout.core.SolverVariable");
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.mVariable = null;
        this.mConstantValue = 0.0f;
    }

    ArrayRow createRowCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f2, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3) {
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                this.mConstantValue = (-i2) + i3;
                return this;
            }
        } else {
            if (f2 <= 0.0f) {
                this.variables.put(solverVariable, -1.0f);
                this.variables.put(solverVariable2, 1.0f);
                this.mConstantValue = i2;
                return this;
            }
            ArrayRowVariables arrayRowVariables = this.variables;
            if (f2 >= 1.0f) {
                arrayRowVariables.put(solverVariable4, -1.0f);
                this.variables.put(solverVariable3, 1.0f);
                this.mConstantValue = -i3;
                return this;
            }
            float f3 = 1.0f - f2;
            arrayRowVariables.put(solverVariable, f3);
            this.variables.put(solverVariable2, -f3);
            this.variables.put(solverVariable3, -f2);
            this.variables.put(solverVariable4, f2);
            if (i2 > 0 || i3 > 0) {
                this.mConstantValue = ((-i2) * f3) + (i3 * f2);
                return this;
            }
        }
        return this;
    }

    ArrayRow createRowDefinition(SolverVariable solverVariable, int i2) {
        this.mVariable = solverVariable;
        float f2 = i2;
        solverVariable.computedValue = f2;
        this.mConstantValue = f2;
        this.mIsSimpleDefinition = true;
        return this;
    }

    ArrayRow createRowDimensionPercent(SolverVariable solverVariable, SolverVariable solverVariable2, float f2) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, f2);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f2);
        this.variables.put(solverVariable4, -f2);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f2, float f3, float f4, SolverVariable solverVariable, int i2, SolverVariable solverVariable2, int i3, SolverVariable solverVariable3, int i4, SolverVariable solverVariable4, int i5) {
        int i6 = (-i2) - i3;
        if (f3 == 0.0f || f2 == f4) {
            this.mConstantValue = i6 + i4 + i5;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        float f5 = (f2 / f3) / (f4 / f3);
        this.mConstantValue = i6 + (i4 * f5) + (i5 * f5);
        this.variables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        this.variables.put(solverVariable4, f5);
        this.variables.put(solverVariable3, -f5);
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f2, float f3, float f4, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.mConstantValue = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        if (f2 == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            return this;
        }
        ArrayRowVariables arrayRowVariables = this.variables;
        if (f4 == 0.0f) {
            arrayRowVariables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
            return this;
        }
        arrayRowVariables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        float f5 = (f2 / f3) / (f4 / f3);
        this.variables.put(solverVariable4, f5);
        this.variables.put(solverVariable3, -f5);
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i2) {
        boolean z;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = -i2;
                z = true;
            } else {
                z = false;
            }
            this.mConstantValue = i2;
            if (z) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                return this;
            }
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = -i2;
                z = true;
            } else {
                z = false;
            }
            this.mConstantValue = i2;
            if (z) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable3, -1.0f);
                return this;
            }
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, 1.0f);
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = -i2;
                z = true;
            } else {
                z = false;
            }
            this.mConstantValue = i2;
            if (z) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable3, 1.0f);
                return this;
            }
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, -1.0f);
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.mConstantValue = -f2;
        return this;
    }

    void ensurePositiveConstant() {
        float f2 = this.mConstantValue;
        if (f2 < 0.0f) {
            this.mConstantValue = -f2;
            this.variables.invert();
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.mVariable;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    boolean hasKeyVariable() {
        SolverVariable solverVariable = this.mVariable;
        if (solverVariable != null) {
            return solverVariable.mType == SolverVariable.Type.UNRESTRICTED || this.mConstantValue >= 0.0f;
        }
        return false;
    }

    boolean hasVariable(SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.mVariable = null;
            this.variables.clear();
            for (int i2 = 0; i2 < arrayRow.variables.getCurrentSize(); i2++) {
                this.variables.add(arrayRow.variables.getVariable(i2), arrayRow.variables.getVariableValue(i2), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.mVariable == null && this.mConstantValue == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        return pickPivotInVariables(null, solverVariable);
    }

    void pivot(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.mVariable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.mVariable.mDefinitionId = -1;
            this.mVariable = null;
        }
        float f2 = -this.variables.remove(solverVariable, true);
        this.mVariable = solverVariable;
        if (f2 == 1.0f) {
            return;
        }
        this.mConstantValue /= f2;
        this.variables.divideByAmount(f2);
    }

    public void reset() {
        this.mVariable = null;
        this.variables.clear();
        this.mConstantValue = 0.0f;
        this.mIsSimpleDefinition = false;
    }

    int sizeInBytes() {
        return (this.mVariable != null ? 4 : 0) + 8 + this.variables.sizeInBytes();
    }

    String toReadableString() {
        String strConcat;
        boolean z;
        String str;
        if (this.mVariable == null) {
            strConcat = "0";
        } else {
            SolverVariable solverVariable = this.mVariable;
            Objects.toString(solverVariable);
            strConcat = "".concat(String.valueOf(solverVariable));
        }
        float f2 = this.mConstantValue;
        String strConcat2 = strConcat.concat(" = ");
        if (f2 != 0.0f) {
            strConcat2 = strConcat2 + this.mConstantValue;
            z = true;
        } else {
            z = false;
        }
        int currentSize = this.variables.getCurrentSize();
        for (int i2 = 0; i2 < currentSize; i2++) {
            SolverVariable variable = this.variables.getVariable(i2);
            if (variable != null) {
                float variableValue = this.variables.getVariableValue(i2);
                if (variableValue != 0.0f) {
                    String string = variable.toString();
                    if (z) {
                        if (variableValue > 0.0f) {
                            str = " + ";
                        } else {
                            variableValue = -variableValue;
                            str = " - ";
                        }
                        strConcat2 = strConcat2.concat(str);
                    } else if (variableValue < 0.0f) {
                        variableValue = -variableValue;
                        strConcat2 = strConcat2.concat("- ");
                    }
                    strConcat2 = variableValue == 1.0f ? strConcat2.concat(String.valueOf(string)) : strConcat2 + variableValue + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat2.concat(GLUtils.VERSION_UNKNOWN) : strConcat2;
    }

    public String toString() {
        return toReadableString();
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.isFinalValue) {
            return;
        }
        this.mConstantValue += solverVariable.computedValue * this.variables.get(solverVariable);
        this.variables.remove(solverVariable, z);
        if (z) {
            solverVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        this.mConstantValue += arrayRow.mConstantValue * this.variables.use(arrayRow, z);
        if (z) {
            arrayRow.mVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.mIsSynonym) {
            return;
        }
        float f2 = this.variables.get(solverVariable);
        this.mConstantValue += solverVariable.mSynonymDelta * f2;
        this.variables.remove(solverVariable, z);
        if (z) {
            solverVariable.removeFromRow(this);
        }
        this.variables.add(linearSystem.mCache.mIndexedVariables[solverVariable.mSynonym], f2, z);
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(LinearSystem linearSystem) {
        ArrayList<SolverVariable> arrayList;
        if (linearSystem.mRows.length != 0) {
            boolean z = false;
            while (!z) {
                int currentSize = this.variables.getCurrentSize();
                for (int i2 = 0; i2 < currentSize; i2++) {
                    SolverVariable variable = this.variables.getVariable(i2);
                    if (variable.mDefinitionId != -1 || variable.isFinalValue || variable.mIsSynonym) {
                        this.mVariablesToUpdate.add(variable);
                    }
                }
                int size = this.mVariablesToUpdate.size();
                if (size > 0) {
                    int i3 = 0;
                    while (true) {
                        arrayList = this.mVariablesToUpdate;
                        if (i3 >= size) {
                            break;
                        }
                        SolverVariable solverVariable = arrayList.get(i3);
                        if (solverVariable.isFinalValue) {
                            updateFromFinalVariable(linearSystem, solverVariable, true);
                        } else if (solverVariable.mIsSynonym) {
                            updateFromSynonymVariable(linearSystem, solverVariable, true);
                        } else {
                            updateFromRow(linearSystem, linearSystem.mRows[solverVariable.mDefinitionId], true);
                        }
                        i3++;
                    }
                    arrayList.clear();
                } else {
                    z = true;
                }
            }
            if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
                this.mIsSimpleDefinition = true;
                linearSystem.hasSimpleDefinition = true;
            }
        }
    }

    public ArrayRow() {
    }

    public ArrayRow addError(LinearSystem linearSystem, int i2) {
        this.variables.put(linearSystem.createErrorVariable(i2, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i2, "em"), -1.0f);
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i2) {
        if (i2 < 0) {
            this.mConstantValue = -i2;
            this.variables.put(solverVariable, 1.0f);
            return this;
        }
        this.mConstantValue = i2;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i2, SolverVariable solverVariable2) {
        this.mConstantValue = i2;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }
}
