package defpackage;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class afsw extends aful {
    private final afry<?> callable;
    private final int index;
    private final afhq kind;
    private final agoq kmParameter;
    private final String name;
    private final aezr type$delegate;

    public afsw(afry<?> afryVar, agoq agoqVar, int i, afhq afhqVar, afvq afvqVar) {
        afryVar.getClass();
        agoqVar.getClass();
        afhqVar.getClass();
        afvqVar.getClass();
        this.callable = afryVar;
        this.kmParameter = agoqVar;
        this.index = i;
        this.kind = afhqVar;
        String name = agoqVar.getName();
        this.name = true == afyh.g(name, "<", false) ? null : name;
        this.type$delegate = woy.dH(2, new afsu(this, afvqVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aiqc type_delegate$lambda$0(afsw afswVar, afvq afvqVar) {
        return afjz.toKType$default(afswVar.kmParameter.getType(), agkc.getSafeClassLoader(afswVar.getCallable().getContainer().getJClass()), afvqVar, false, new afsv(afswVar), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0$0(afsw afswVar) {
        if ((afswVar.getCallable().getContainer() instanceof afrt) || afuh.isConstructor(afswVar.getCallable())) {
            return afswVar.getCallable().getCaller().getParameterTypes().get(afswVar.getIndex());
        }
        throw new IllegalArgumentException("Only constructors and top-level callables are supported for now: " + afswVar.getCallable().getContainer() + '/' + afswVar.getCallable().getName() + ' ' + afswVar.getName());
    }

    @Override // defpackage.aful
    public boolean getDeclaresDefaultValue() {
        return agmo.getDeclaresDefaultValue(this.kmParameter);
    }

    @Override // defpackage.afhr
    public int getIndex() {
        return this.index;
    }

    @Override // defpackage.afhr
    public afhq getKind() {
        return this.kind;
    }

    public final agoq getKmParameter$kotlin_reflection() {
        return this.kmParameter;
    }

    @Override // defpackage.afhr
    public String getName() {
        return this.name;
    }

    @Override // defpackage.afhr
    public afib getType() {
        return (afib) this.type$delegate.a();
    }

    @Override // defpackage.afhr
    public boolean isOptional() {
        if ((getCallable() instanceof aftr) || (getCallable().getContainer() instanceof afrt) || afuh.isConstructor(getCallable())) {
            return agmo.getDeclaresDefaultValue(this.kmParameter);
        }
        throw new IllegalArgumentException("Only constructors and top-level callables are supported for now: " + getCallable().getContainer() + '/' + getCallable().getName() + ' ' + getName());
    }

    @Override // defpackage.afhr
    public boolean isVararg() {
        return this.kmParameter.getVarargElementType() != null;
    }

    @Override // defpackage.aful
    public afry<?> getCallable() {
        return this.callable;
    }
}
