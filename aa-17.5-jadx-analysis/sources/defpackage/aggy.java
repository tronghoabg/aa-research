package defpackage;

/* loaded from: classes3.dex */
public abstract class aggy extends agfa implements agbi {
    private final ahnj name;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
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
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggy(agfk agfkVar, ahnj ahnjVar) {
        super(agfkVar);
        if (agfkVar == null) {
            $$$reportNull$$$0(0);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(1);
        }
        this.name = ahnjVar;
    }

    public static String toString(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(4);
        }
        try {
            return ahre.DEBUG_TEXT.render(agbiVar) + "[" + agbiVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(agbiVar)) + "]";
        } catch (Throwable unused) {
            return agbiVar.getClass().getSimpleName() + " " + agbiVar.getName();
        }
    }

    @Override // defpackage.agcw
    public ahnj getName() {
        ahnj ahnjVar = this.name;
        if (ahnjVar == null) {
            $$$reportNull$$$0(2);
        }
        return ahnjVar;
    }

    public agbi getOriginal() {
        return this;
    }

    public String toString() {
        return toString(this);
    }
}
