package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afld extends defpackage.afvl {
    private final defpackage.afvn<?> property;

    public afld(defpackage.afvn<?> afvnVar) {
        afvnVar.getClass();
        this.property = afvnVar;
    }

    @Override // defpackage.afvl, defpackage.afic
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return defpackage.afce.a;
    }

    @Override // defpackage.afvl
    public defpackage.afve<?> getCallable() {
        defpackage.afvn<?> afvnVar = this.property;
        afvnVar.getClass();
        defpackage.afii setter = ((defpackage.afip) afvnVar).getSetter();
        setter.getClass();
        return (defpackage.afve) setter;
    }

    @Override // defpackage.afvl
    public boolean getDeclaresDefaultValue() {
        return false;
    }

    @Override // defpackage.afir
    public int getIndex() {
        return 0;
    }

    @Override // defpackage.afir
    public defpackage.afiq getKind() {
        return defpackage.afiq.d;
    }

    @Override // defpackage.afir
    public java.lang.String getName() {
        return null;
    }

    @Override // defpackage.afir
    public defpackage.afjb getType() {
        return this.property.getReturnType();
    }

    @Override // defpackage.afir
    public boolean isOptional() {
        return false;
    }

    @Override // defpackage.afir
    public boolean isVararg() {
        return false;
    }
}
