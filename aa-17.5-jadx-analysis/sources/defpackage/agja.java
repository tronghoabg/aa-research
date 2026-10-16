package defpackage;

/* loaded from: classes3.dex */
public abstract class agja extends agiz {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected aied<ahuh<?>> compileTimeInitializer;
    protected afdr<aied<ahuh<?>>> compileTimeInitializerFactory;
    private final boolean isVar;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agja(agbi agbiVar, agfk agfkVar, ahnj ahnjVar, aigl aiglVar, boolean z, agdx agdxVar) {
        super(agbiVar, agfkVar, ahnjVar, aiglVar, agdxVar);
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
        this.isVar = z;
    }

    @Override // defpackage.agem
    public ahuh<?> getCompileTimeInitializer() {
        aied<ahuh<?>> aiedVar = this.compileTimeInitializer;
        if (aiedVar != null) {
            return aiedVar.invoke();
        }
        return null;
    }

    @Override // defpackage.agem
    public boolean isVar() {
        return this.isVar;
    }

    public void setCompileTimeInitializer(aied<ahuh<?>> aiedVar, afdr<aied<ahuh<?>>> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(5);
        }
        this.compileTimeInitializerFactory = afdrVar;
        if (aiedVar == null) {
            aiedVar = afdrVar.invoke();
        }
        this.compileTimeInitializer = aiedVar;
    }

    public void setCompileTimeInitializerFactory(afdr<aied<ahuh<?>>> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(4);
        }
        setCompileTimeInitializer(null, afdrVar);
    }
}
