package defpackage;

/* loaded from: classes3.dex */
public final class aghn extends aggj {
    private final agba descriptor;
    private final ahxy receiverValue;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghn(agba agbaVar) {
        super(agfk.Companion.getEMPTY());
        if (agbaVar == null) {
            $$$reportNull$$$0(0);
        }
        this.descriptor = agbaVar;
        this.receiverValue = new ahxy(agbaVar, null);
    }

    @Override // defpackage.agbi
    public agbi getContainingDeclaration() {
        agba agbaVar = this.descriptor;
        if (agbaVar == null) {
            $$$reportNull$$$0(2);
        }
        return agbaVar;
    }

    @Override // defpackage.agdq
    public ahya getValue() {
        ahxy ahxyVar = this.receiverValue;
        if (ahxyVar == null) {
            $$$reportNull$$$0(1);
        }
        return ahxyVar;
    }

    @Override // defpackage.aggy
    public String toString() {
        return "class " + this.descriptor.getName() + "::this";
    }
}
