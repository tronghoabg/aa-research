package defpackage;

/* loaded from: classes.dex */
public final class kfm extends err {
    private final Class a;
    private final afdr b;

    public kfm(Class cls, afdr afdrVar) {
        afdrVar.getClass();
        this.a = cls;
        this.b = afdrVar;
    }

    @Override // defpackage.err, defpackage.erq
    public final erm a(Class cls) {
        if (!this.a.isAssignableFrom(cls)) {
            return eqy.d(cls);
        }
        Object objInvoke = this.b.invoke();
        objInvoke.getClass();
        return (erm) objInvoke;
    }
}
