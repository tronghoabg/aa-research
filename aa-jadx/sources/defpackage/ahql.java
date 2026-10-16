package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahql {
    private final java.util.Stack<defpackage.ahpa> prefixesStack;

    private ahql() {
        this.prefixesStack = new java.util.Stack<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public defpackage.ahpa balance(defpackage.ahpa ahpaVar, defpackage.ahpa ahpaVar2) {
        doBalance(ahpaVar);
        doBalance(ahpaVar2);
        defpackage.ahpa ahpaVarPop = this.prefixesStack.pop();
        while (!this.prefixesStack.isEmpty()) {
            ahpaVarPop = new defpackage.ahqp(this.prefixesStack.pop(), ahpaVarPop);
        }
        return ahpaVarPop;
    }

    private void doBalance(defpackage.ahpa ahpaVar) {
        if (ahpaVar.isBalanced()) {
            insert(ahpaVar);
            return;
        }
        if (!(ahpaVar instanceof defpackage.ahqp)) {
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(ahpaVar.getClass()));
            strValueOf.length();
            throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(java.lang.String.valueOf(strValueOf)));
        }
        defpackage.ahqp ahqpVar = (defpackage.ahqp) ahpaVar;
        doBalance(ahqpVar.left);
        doBalance(ahqpVar.right);
    }

    private int getDepthBinForLength(int i) {
        int iBinarySearch = java.util.Arrays.binarySearch(defpackage.ahqp.minLengthByDepth, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    private void insert(defpackage.ahpa ahpaVar) {
        defpackage.ahqk ahqkVar;
        int depthBinForLength = getDepthBinForLength(ahpaVar.size());
        int i = defpackage.ahqp.minLengthByDepth[depthBinForLength + 1];
        if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= i) {
            this.prefixesStack.push(ahpaVar);
            return;
        }
        int i2 = defpackage.ahqp.minLengthByDepth[depthBinForLength];
        defpackage.ahpa ahpaVarPop = this.prefixesStack.pop();
        while (true) {
            ahqkVar = null;
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= i2) {
                break;
            } else {
                ahpaVarPop = new defpackage.ahqp(this.prefixesStack.pop(), ahpaVarPop);
            }
        }
        defpackage.ahqp ahqpVar = new defpackage.ahqp(ahpaVarPop, ahpaVar);
        while (!this.prefixesStack.isEmpty()) {
            if (this.prefixesStack.peek().size() >= defpackage.ahqp.minLengthByDepth[getDepthBinForLength(ahqpVar.size()) + 1]) {
                break;
            } else {
                ahqpVar = new defpackage.ahqp(this.prefixesStack.pop(), ahqpVar);
            }
        }
        this.prefixesStack.push(ahqpVar);
    }
}
