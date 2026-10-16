package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agvv {
    private final boolean hasStableParameterNames;
    private final defpackage.aihl receiverType;
    private final defpackage.aihl returnType;
    private final java.util.List<java.lang.String> signatureErrors;
    private final java.util.List<defpackage.agfe> typeParameters;
    private final java.util.List<defpackage.agfl> valueParameters;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public agvv(defpackage.aihl aihlVar, defpackage.aihl aihlVar2, java.util.List<defpackage.agfl> list, java.util.List<defpackage.agfe> list2, java.util.List<java.lang.String> list3, boolean z) {
        if (aihlVar == null) {
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
        this.returnType = aihlVar;
        this.receiverType = aihlVar2;
        this.valueParameters = list;
        this.typeParameters = list2;
        this.signatureErrors = list3;
        this.hasStableParameterNames = z;
    }

    public java.util.List<java.lang.String> getErrors() {
        java.util.List<java.lang.String> list = this.signatureErrors;
        if (list == null) {
            $$$reportNull$$$0(7);
        }
        return list;
    }

    public defpackage.aihl getReceiverType() {
        return this.receiverType;
    }

    public defpackage.aihl getReturnType() {
        defpackage.aihl aihlVar = this.returnType;
        if (aihlVar == null) {
            $$$reportNull$$$0(4);
        }
        return aihlVar;
    }

    public java.util.List<defpackage.agfe> getTypeParameters() {
        java.util.List<defpackage.agfe> list = this.typeParameters;
        if (list == null) {
            $$$reportNull$$$0(6);
        }
        return list;
    }

    public java.util.List<defpackage.agfl> getValueParameters() {
        java.util.List<defpackage.agfl> list = this.valueParameters;
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        return list;
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames;
    }
}
