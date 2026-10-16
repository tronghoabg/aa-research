package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aghy extends defpackage.agga implements defpackage.agci {
    private final defpackage.ahoj name;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghy(defpackage.aggk aggkVar, defpackage.ahoj ahojVar) {
        super(aggkVar);
        if (aggkVar == null) {
            $$$reportNull$$$0(0);
        }
        if (ahojVar == null) {
            $$$reportNull$$$0(1);
        }
        this.name = ahojVar;
    }

    public static java.lang.String toString(defpackage.agci agciVar) {
        if (agciVar == null) {
            $$$reportNull$$$0(4);
        }
        try {
            return defpackage.ahse.DEBUG_TEXT.render(agciVar) + "[" + agciVar.getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(agciVar)) + "]";
        } catch (java.lang.Throwable unused) {
            return agciVar.getClass().getSimpleName() + " " + agciVar.getName();
        }
    }

    @Override // defpackage.agdw
    public defpackage.ahoj getName() {
        defpackage.ahoj ahojVar = this.name;
        if (ahojVar == null) {
            $$$reportNull$$$0(2);
        }
        return ahojVar;
    }

    public defpackage.agci getOriginal() {
        return this;
    }

    public java.lang.String toString() {
        return toString(this);
    }
}
