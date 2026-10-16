package defpackage;

import java.util.Arrays;
import java.util.Stack;

/* loaded from: classes3.dex */
final class ahpl {
    private final Stack<ahoa> prefixesStack;

    private ahpl() {
        this.prefixesStack = new Stack<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ahoa balance(ahoa ahoaVar, ahoa ahoaVar2) {
        doBalance(ahoaVar);
        doBalance(ahoaVar2);
        ahoa ahoaVarPop = this.prefixesStack.pop();
        while (!this.prefixesStack.isEmpty()) {
            ahoaVarPop = new ahpp(this.prefixesStack.pop(), ahoaVarPop);
        }
        return ahoaVarPop;
    }

    private void doBalance(ahoa ahoaVar) {
        if (ahoaVar.isBalanced()) {
            insert(ahoaVar);
            return;
        }
        if (!(ahoaVar instanceof ahpp)) {
            String strValueOf = String.valueOf(String.valueOf(ahoaVar.getClass()));
            strValueOf.length();
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(strValueOf)));
        }
        ahpp ahppVar = (ahpp) ahoaVar;
        doBalance(ahppVar.left);
        doBalance(ahppVar.right);
    }

    private int getDepthBinForLength(int i) {
        int iBinarySearch = Arrays.binarySearch(ahpp.minLengthByDepth, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    private void insert(ahoa ahoaVar) {
        ahpk ahpkVar;
        int depthBinForLength = getDepthBinForLength(ahoaVar.size());
        int i = ahpp.minLengthByDepth[depthBinForLength + 1];
        if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= i) {
            this.prefixesStack.push(ahoaVar);
            return;
        }
        int i2 = ahpp.minLengthByDepth[depthBinForLength];
        ahoa ahoaVarPop = this.prefixesStack.pop();
        while (true) {
            ahpkVar = null;
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= i2) {
                break;
            } else {
                ahoaVarPop = new ahpp(this.prefixesStack.pop(), ahoaVarPop);
            }
        }
        ahpp ahppVar = new ahpp(ahoaVarPop, ahoaVar);
        while (!this.prefixesStack.isEmpty()) {
            if (this.prefixesStack.peek().size() >= ahpp.minLengthByDepth[getDepthBinForLength(ahppVar.size()) + 1]) {
                break;
            } else {
                ahppVar = new ahpp(this.prefixesStack.pop(), ahppVar);
            }
        }
        this.prefixesStack.push(ahppVar);
    }
}
