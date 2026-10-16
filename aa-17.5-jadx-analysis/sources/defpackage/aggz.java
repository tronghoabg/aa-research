package defpackage;

/* loaded from: classes3.dex */
public abstract class aggz extends aggy implements agbj {
    private final agbi containingDeclaration;
    private final agdx source;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
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
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aggz(agbi agbiVar, agfk agfkVar, ahnj ahnjVar, agdx agdxVar) {
        super(agfkVar, ahnjVar);
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(3);
        }
        this.containingDeclaration = agbiVar;
        this.source = agdxVar;
    }

    public agbi getContainingDeclaration() {
        agbi agbiVar = this.containingDeclaration;
        if (agbiVar == null) {
            $$$reportNull$$$0(5);
        }
        return agbiVar;
    }

    @Override // defpackage.agbl
    public agdx getSource() {
        agdx agdxVar = this.source;
        if (agdxVar == null) {
            $$$reportNull$$$0(6);
        }
        return agdxVar;
    }

    @Override // defpackage.aggy, defpackage.agbi
    public agbl getOriginal() {
        return this;
    }
}
