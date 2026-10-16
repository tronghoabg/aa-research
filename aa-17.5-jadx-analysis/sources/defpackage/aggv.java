package defpackage;

/* loaded from: classes3.dex */
public abstract class aggv extends aggh {
    private final agbi containingDeclaration;
    private final boolean isExternal;
    private final agdx source;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aggv(aiei aieiVar, agbi agbiVar, ahnj ahnjVar, agdx agdxVar, boolean z) {
        super(aieiVar, ahnjVar);
        if (aieiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbiVar == null) {
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
        this.isExternal = z;
    }

    @Override // defpackage.agba, defpackage.agbj, defpackage.agbi
    public agbi getContainingDeclaration() {
        agbi agbiVar = this.containingDeclaration;
        if (agbiVar == null) {
            $$$reportNull$$$0(4);
        }
        return agbiVar;
    }

    @Override // defpackage.agbl
    public agdx getSource() {
        agdx agdxVar = this.source;
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        return agdxVar;
    }

    public boolean isExternal() {
        return this.isExternal;
    }
}
