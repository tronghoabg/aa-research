package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afon extends defpackage.afvl {
    private final defpackage.afol callable;
    private final int index;
    private final java.lang.reflect.Method method;
    private final defpackage.afar type$delegate;

    public afon(defpackage.afol afolVar, java.lang.reflect.Method method, int i) {
        afolVar.getClass();
        method.getClass();
        this.callable = afolVar;
        this.method = method;
        this.index = i;
        this.type$delegate = defpackage.afga.cB(2, new defpackage.afom(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afjb type_delegate$lambda$0(defpackage.afon afonVar) {
        java.lang.reflect.Type genericReturnType = afonVar.method.getGenericReturnType();
        genericReturnType.getClass();
        return defpackage.afks.toKType$default(genericReturnType, defpackage.afcf.a, defpackage.afwo.NOT_NULL, true, false, null, 24, null);
    }

    @Override // defpackage.afvl, defpackage.afic
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return defpackage.afce.a;
    }

    @Override // defpackage.afvl
    public boolean getDeclaresDefaultValue() {
        return isOptional();
    }

    @Override // defpackage.afir
    public int getIndex() {
        return this.index;
    }

    @Override // defpackage.afir
    public defpackage.afiq getKind() {
        return defpackage.afiq.d;
    }

    @Override // defpackage.afir
    public java.lang.String getName() {
        java.lang.String name = this.method.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.afir
    public defpackage.afjb getType() {
        return (defpackage.afjb) this.type$delegate.a();
    }

    @Override // defpackage.afir
    public boolean isOptional() {
        return this.method.getDefaultValue() != null;
    }

    @Override // defpackage.afir
    public boolean isVararg() {
        return defpackage.afga.f(getName(), "value") && this.method.getReturnType().isArray();
    }

    @Override // defpackage.afvl
    public defpackage.afol getCallable() {
        return this.callable;
    }
}
