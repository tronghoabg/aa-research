package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class aguu implements aguw {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        if (i == 5 || i == 6) {
            objArr[2] = "reportSignatureErrors";
        } else {
            objArr[2] = "resolvePropagatedSignature";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.aguw
    public void reportSignatureErrors(agax agaxVar, List<String> list) {
        if (agaxVar == null) {
            $$$reportNull$$$0(5);
        }
        if (list == null) {
            $$$reportNull$$$0(6);
        }
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // defpackage.aguw
    public aguv resolvePropagatedSignature(agzr agzrVar, agba agbaVar, aigl aiglVar, aigl aiglVar2, List<agel> list, List<agee> list2) {
        if (agzrVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(1);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(2);
        }
        if (list == null) {
            $$$reportNull$$$0(3);
        }
        if (list2 == null) {
            $$$reportNull$$$0(4);
        }
        return new aguv(aiglVar, aiglVar2, list, list2, Collections.EMPTY_LIST, false);
    }
}
