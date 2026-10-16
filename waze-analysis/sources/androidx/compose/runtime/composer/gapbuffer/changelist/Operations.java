package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import h.a.c;
import h.a.i;
import h.ab;
import h.g.a;
import h.g.a.l;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Operations extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    public int intArgsSize;
    public int objectArgsSize;
    public int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;
    public Operation[] opCodes = new Operation[16];
    public int[] intArgs = new int[16];
    public Object[] objectArgs = new Object[16];

    /* compiled from: WazeSource */
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        public final String currentOperationDebugString() {
            return "operation[" + this.opIdx + "] = " + Operations.this.currentOpToDebugString(this, "");
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationArgContainer
        public int getInt(int i2) {
            return Operations.this.intArgs[this.intIdx + i2];
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationArgContainer
        /* renamed from: getObject-PtL-UHM */
        public <T> T mo7477getObjectPtLUHM(int i2) {
            return (T) Operations.this.objectArgs[this.objIdx + i2];
        }

        public final Operation getOperation() {
            return Operations.this.opCodes[this.opIdx];
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation = getOperation();
            this.intIdx += operation.getInts();
            this.objIdx += operation.getObjects();
            int i2 = this.opIdx + 1;
            this.opIdx = i2;
            return i2 < Operations.this.opCodesSize;
        }
    }

    private final int createExpectedArgMask(int i2) {
        return (i2 == 0 ? 0 : -1) >>> (32 - i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String currentOpToDebugString(OpIterator opIterator, String str) {
        Operation operation = opIterator.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(operation.getName());
        sb.append('(');
        String strIndent = indent(str);
        int ints = operation.getInts();
        boolean z = true;
        int i2 = 0;
        while (i2 < ints) {
            String strIntParamName = operation.intParamName(i2);
            if (!z) {
                sb.append(", ");
            }
            sb.append('\n');
            sb.append(strIndent);
            sb.append(strIntParamName);
            sb.append(" = ");
            sb.append(opIterator.getInt(i2));
            i2++;
            z = false;
        }
        int objects = operation.getObjects();
        int i3 = 0;
        while (i3 < objects) {
            String strMo7431objectParamNamePtLUHM = operation.mo7431objectParamNamePtLUHM(i3);
            if (!z) {
                sb.append(", ");
            }
            sb.append('\n');
            sb.append(strIndent);
            sb.append(strMo7431objectParamNamePtLUHM);
            sb.append(" = ");
            sb.append(formatOpArgumentToString(opIterator.mo7477getObjectPtLUHM(i3), strIndent));
            i3++;
            z = false;
        }
        sb.append('\n');
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    private final int determineNewSize(int i2, int i3) {
        int i4 = i2 + (i2 <= 1024 ? i2 : 1024);
        return i4 < i3 ? i3 : i4;
    }

    private final void ensureIntArgsSizeAtLeast(int i2) {
        int length = this.intArgs.length;
        if (i2 > length) {
            resizeIntArgs(length, i2);
        }
    }

    private final void ensureObjectArgsSizeAtLeast(int i2) {
        int length = this.objectArgs.length;
        if (i2 > length) {
            resizeObjectArgs(length, i2);
        }
    }

    private final String exceptionMessageForOperationPushNoScope(Operation operation) {
        return "Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.";
    }

    private final String exceptionMessageForOperationPushWithScope(Operation operation) {
        StringBuilder sb = new StringBuilder();
        int ints = operation.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & this.pushedIntMask) == 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(operation.intParamName(i3));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        int objects = operation.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & this.pushedObjectMask) == 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(operation.mo7431objectParamNamePtLUHM(i5));
                i4++;
            }
        }
        return "Error while pushing " + operation + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + sb2.toString() + ").";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        return obj == null ? "null" : obj instanceof Object[] ? toCollectionString(c.L((Object[]) obj), str) : obj instanceof int[] ? toCollectionString(c.J((int[]) obj), str) : obj instanceof long[] ? toCollectionString(c.K((long[]) obj), str) : obj instanceof float[] ? toCollectionString(c.I((float[]) obj), str) : obj instanceof double[] ? toCollectionString(c.H((double[]) obj), str) : obj instanceof Iterable ? toCollectionString((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
    }

    private final String indent(String str) {
        return String.valueOf(str).concat("    ");
    }

    private final Operation peekOperation() {
        return this.opCodes[this.opCodesSize - 1];
    }

    private final void resizeIntArgs(int i2, int i3) {
        int[] iArr = new int[determineNewSize(i2, i3)];
        c.ar(this.intArgs, iArr, 0, 0, i2);
        this.intArgs = iArr;
    }

    private final void resizeObjectArgs(int i2, int i3) {
        Object[] objArr = new Object[determineNewSize(i2, i3)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, i2);
        this.objectArgs = objArr;
    }

    private final void resizeOpCodes() {
        int i2 = this.opCodesSize;
        Operation[] operationArr = new Operation[(i2 <= 1024 ? i2 : 1024) + i2];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i2);
        this.opCodes = operationArr;
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, final String str) {
        return i.aM(iterable, ", ", "[", "]", 0, new l() { // from class: androidx.compose.runtime.composer.gapbuffer.changelist.Operations$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return this.f$0.formatOpArgumentToString(obj, str);
            }
        }, 24);
    }

    private final int topIntIndexOf(int i2) {
        return (this.intArgsSize - this.opCodes[this.opCodesSize - 1].getInts()) + i2;
    }

    /* renamed from: topObjectIndexOf-PtL-UHM, reason: not valid java name */
    private final int m7478topObjectIndexOfPtLUHM(int i2) {
        return (this.objectArgsSize - this.opCodes[this.opCodesSize - 1].getObjects()) + i2;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        Object[] objArr = this.objectArgs;
        int i2 = this.objectArgsSize;
        x.f(objArr, "<this>");
        Arrays.fill(objArr, 0, i2, (Object) null);
        this.objectArgsSize = 0;
    }

    public final void drain(l<? super OpIterator, ab> lVar) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                lVar.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void ensureAllArgumentsPushedFor(Operation operation) {
        int i2 = this.pushedIntMask;
        int ints = operation.getInts();
        if (i2 == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void executeAndFlushAllPendingOperations(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            while (true) {
                Applier<?> applier2 = applier;
                SlotWriter slotWriter2 = slotWriter;
                RememberManager rememberManager2 = rememberManager;
                OperationErrorContext operationErrorContext2 = operationErrorContext;
                opIterator.getOperation().executeWithComposeStackTrace(opIterator, applier2, slotWriter2, rememberManager2, operationErrorContext2);
                if (!opIterator.next()) {
                    break;
                }
                applier = applier2;
                slotWriter = slotWriter2;
                rememberManager = rememberManager2;
                operationErrorContext = operationErrorContext2;
            }
        }
        clear();
    }

    public final void forEach(l<? super OpIterator, ab> lVar) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                lVar.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    public final int getSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final void pop() {
        Operation[] operationArr = this.opCodes;
        int i2 = this.opCodesSize - 1;
        this.opCodesSize = i2;
        Operation operation = operationArr[i2];
        operationArr[i2] = null;
        int objects = operation.getObjects();
        for (int i3 = 0; i3 < objects; i3++) {
            Object[] objArr = this.objectArgs;
            int i4 = this.objectArgsSize - 1;
            this.objectArgsSize = i4;
            objArr[i4] = null;
        }
        this.intArgsSize -= operation.getInts();
    }

    public final void popInto(Operations operations) {
        Operation[] operationArr = this.opCodes;
        int i2 = this.opCodesSize - 1;
        this.opCodesSize = i2;
        Operation operation = operationArr[i2];
        operationArr[i2] = null;
        operations.pushOp(operation);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = operations.objectArgs;
        int objects = operations.objectArgsSize - operation.getObjects();
        int objects2 = this.objectArgsSize - operation.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        Object[] objArr3 = this.objectArgs;
        int objects3 = this.objectArgsSize - operation.getObjects();
        int i3 = this.objectArgsSize;
        x.f(objArr3, "<this>");
        Arrays.fill(objArr3, objects3, i3, (Object) null);
        c.ar(this.intArgs, operations.intArgs, operations.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgsSize);
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    public final void push(Operation operation, l<? super WriteScope, ab> lVar) {
        pushOp(operation);
        lVar.invoke(WriteScope.m7479boximpl(this));
        ensureAllArgumentsPushedFor(operation);
    }

    public final void pushOp(Operation operation) {
        if (this.opCodesSize == this.opCodes.length) {
            resizeOpCodes();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            resizeIntArgs(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            resizeObjectArgs(length2, objects);
        }
        Operation[] operationArr = this.opCodes;
        int i2 = this.opCodesSize;
        this.opCodesSize = i2 + 1;
        operationArr[i2] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i2 = 0;
            while (true) {
                sb.append(str);
                sb.append(i2);
                sb.append(". ");
                sb.append(currentOpToDebugString(opIterator, str));
                sb.append('\n');
                if (!opIterator.next()) {
                    break;
                }
                i2++;
            }
        }
        return sb.toString();
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ void getOpCodes$runtime$annotations() {
    }

    public final void push(Operation operation) {
        pushOp(operation);
    }

    /* compiled from: WazeSource */
    @a
    public final class WriteScope {
        private final Operations stack;

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m7479boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7481equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && x.n(operations, ((WriteScope) obj).m7493unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7482equalsimpl0(Operations operations, Operations operations2) {
            return x.n(operations, operations2);
        }

        /* renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m7483getOperationimpl(Operations operations) {
            return operations.opCodes[operations.opCodesSize - 1];
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7484hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: setInt-impl, reason: not valid java name */
        public static final void m7485setIntimpl(Operations operations, int i2, int i3) {
            operations.intArgs[(operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()) + i2] = i3;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m7487setIntsimpl(Operations operations, int i2, int i3, int i4, int i5, int i6, int i7) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i2 + ints] = i3;
            iArr[i4 + ints] = i5;
            iArr[ints + i6] = i7;
        }

        /* renamed from: setObject-sGr0YRc, reason: not valid java name */
        public static final <T> void m7488setObjectsGr0YRc(Operations operations, int i2, T t) {
            operations.objectArgs[(operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects()) + i2] = t;
        }

        /* renamed from: setObjects-EsEZvaA, reason: not valid java name */
        public static final <T, U> void m7489setObjectsEsEZvaA(Operations operations, int i2, T t, int i3, U u) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i2 + objects] = t;
            objArr[objects + i3] = u;
        }

        /* renamed from: setObjects-JOGOPjs, reason: not valid java name */
        public static final <T, U, V> void m7490setObjectsJOGOPjs(Operations operations, int i2, T t, int i3, U u, int i4, V v) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i2 + objects] = t;
            objArr[i3 + objects] = u;
            objArr[objects + i4] = v;
        }

        /* renamed from: setObjects-fiWQlIY, reason: not valid java name */
        public static final <T, U, V, W> void m7491setObjectsfiWQlIY(Operations operations, int i2, T t, int i3, U u, int i4, V v, int i5, W w) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i2 + objects] = t;
            objArr[i3 + objects] = u;
            objArr[i4 + objects] = v;
            objArr[objects + i5] = w;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7492toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m7481equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m7484hashCodeimpl(this.stack);
        }

        public String toString() {
            return m7492toStringimpl(this.stack);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Operations m7493unboximpl() {
            return this.stack;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Operations m7480constructorimpl(Operations operations) {
            return operations;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m7486setIntsimpl(Operations operations, int i2, int i3, int i4, int i5) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i2 + ints] = i3;
            iArr[ints + i4] = i5;
        }
    }
}
