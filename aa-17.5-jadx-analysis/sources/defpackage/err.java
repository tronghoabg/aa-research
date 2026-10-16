package defpackage;

/* loaded from: classes.dex */
public class err implements erq {
    public static err c;

    @Override // defpackage.erq
    public erm a(Class cls) {
        return eqy.d(cls);
    }

    @Override // defpackage.erq
    public erm b(Class cls, esc escVar) {
        return a(cls);
    }

    @Override // defpackage.erq
    public final erm c(afhe afheVar, esc escVar) {
        Class<?> jClass = ((afer) afheVar).getJClass();
        jClass.getClass();
        return b(jClass, escVar);
    }
}
