package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aguv {
    private final boolean hasStableParameterNames;
    private final aigl receiverType;
    private final aigl returnType;
    private final List<String> signatureErrors;
    private final List<agee> typeParameters;
    private final List<agel> valueParameters;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "valueParameters";
                break;
            case 2:
                objArr[0] = "typeParameters";
                break;
            case 3:
                objArr[0] = "signatureErrors";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                break;
            default:
                objArr[0] = "returnType";
                break;
        }
        if (i == 4) {
            objArr[1] = "getReturnType";
        } else if (i == 5) {
            objArr[1] = "getValueParameters";
        } else if (i == 6) {
            objArr[1] = "getTypeParameters";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
        } else {
            objArr[1] = "getErrors";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public aguv(aigl aiglVar, aigl aiglVar2, List<agel> list, List<agee> list2, List<String> list3, boolean z) {
        if (aiglVar == null) {
            $$$reportNull$$$0(0);
        }
        if (list == null) {
            $$$reportNull$$$0(1);
        }
        if (list2 == null) {
            $$$reportNull$$$0(2);
        }
        if (list3 == null) {
            $$$reportNull$$$0(3);
        }
        this.returnType = aiglVar;
        this.receiverType = aiglVar2;
        this.valueParameters = list;
        this.typeParameters = list2;
        this.signatureErrors = list3;
        this.hasStableParameterNames = z;
    }

    public List<String> getErrors() {
        List<String> list = this.signatureErrors;
        if (list == null) {
            $$$reportNull$$$0(7);
        }
        return list;
    }

    public aigl getReceiverType() {
        return this.receiverType;
    }

    public aigl getReturnType() {
        aigl aiglVar = this.returnType;
        if (aiglVar == null) {
            $$$reportNull$$$0(4);
        }
        return aiglVar;
    }

    public List<agee> getTypeParameters() {
        List<agee> list = this.typeParameters;
        if (list == null) {
            $$$reportNull$$$0(6);
        }
        return list;
    }

    public List<agel> getValueParameters() {
        List<agel> list = this.valueParameters;
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        return list;
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames;
    }
}
