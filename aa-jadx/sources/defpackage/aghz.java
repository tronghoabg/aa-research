package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aghz extends defpackage.aghy implements defpackage.agcj {
    private final defpackage.agci containingDeclaration;
    private final defpackage.agex source;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aghz(defpackage.agci agciVar, defpackage.aggk aggkVar, defpackage.ahoj ahojVar, defpackage.agex agexVar) {
        super(aggkVar, ahojVar);
        if (agciVar == null) {
            $$$reportNull$$$0(0);
        }
        if (aggkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahojVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agexVar == null) {
            $$$reportNull$$$0(3);
        }
        this.containingDeclaration = agciVar;
        this.source = agexVar;
    }

    public defpackage.agci getContainingDeclaration() {
        defpackage.agci agciVar = this.containingDeclaration;
        if (agciVar == null) {
            $$$reportNull$$$0(5);
        }
        return agciVar;
    }

    @Override // defpackage.agcl
    public defpackage.agex getSource() {
        defpackage.agex agexVar = this.source;
        if (agexVar == null) {
            $$$reportNull$$$0(6);
        }
        return agexVar;
    }

    @Override // defpackage.aghy, defpackage.agci
    public defpackage.agcl getOriginal() {
        return this;
    }
}
