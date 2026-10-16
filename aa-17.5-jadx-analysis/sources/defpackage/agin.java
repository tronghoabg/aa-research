package defpackage;

/* loaded from: classes3.dex */
public final class agin extends aggj {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final agbi containingDeclaration;
    private ahya value;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agin(agbi agbiVar, ahya ahyaVar, agfk agfkVar, ahnj ahnjVar) {
        super(agfkVar, ahnjVar);
        if (agbiVar == null) {
            $$$reportNull$$$0(3);
        }
        if (ahyaVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(5);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(6);
        }
        this.containingDeclaration = agbiVar;
        this.value = ahyaVar;
    }

    @Override // defpackage.agbi
    public agbi getContainingDeclaration() {
        agbi agbiVar = this.containingDeclaration;
        if (agbiVar == null) {
            $$$reportNull$$$0(8);
        }
        return agbiVar;
    }

    @Override // defpackage.agdq
    public ahya getValue() {
        ahya ahyaVar = this.value;
        if (ahyaVar == null) {
            $$$reportNull$$$0(7);
        }
        return ahyaVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agin(agbi agbiVar, ahya ahyaVar, agfk agfkVar) {
        this(agbiVar, ahyaVar, agfkVar, ahnm.THIS);
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (ahyaVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(2);
        }
    }
}
