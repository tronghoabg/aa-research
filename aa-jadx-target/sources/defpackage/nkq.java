package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nkq implements defpackage.erw {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public nkq(defpackage.eqp eqpVar, int i) {
        this.a = i;
        this.b = eqpVar;
    }

    @Override // defpackage.erw
    public final defpackage.ers a(java.lang.Class cls) {
        int i = this.a;
        if (i == 0) {
            return new defpackage.nkp((defpackage.qsh) this.b);
        }
        if (i == 1) {
            if (cls.isAssignableFrom(defpackage.nkl.class)) {
                return new defpackage.nkl((defpackage.qsh) this.b);
            }
            throw new java.lang.IllegalArgumentException("unknown ViewModel class: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        if (cls.isAssignableFrom(defpackage.nnl.class)) {
            return new defpackage.nnl((defpackage.eqp) this.b);
        }
        if (cls.isAssignableFrom(defpackage.non.class)) {
            return new defpackage.non((defpackage.eqp) this.b);
        }
        throw new java.lang.IllegalArgumentException("unknown ViewModel class: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    @Override // defpackage.erw
    public final /* synthetic */ defpackage.ers b(java.lang.Class cls, defpackage.esi esiVar) {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? a(cls) : a(cls);
        }
        return a(cls);
    }

    @Override // defpackage.erw
    public final /* synthetic */ defpackage.ers c(defpackage.afie afieVar, defpackage.esi esiVar) {
        int i = this.a;
        if (i == 0) {
            java.lang.Class<?> jClass = ((defpackage.affr) afieVar).getJClass();
            jClass.getClass();
            return a(jClass);
        }
        if (i != 1) {
            java.lang.Class<?> jClass2 = ((defpackage.affr) afieVar).getJClass();
            jClass2.getClass();
            return a(jClass2);
        }
        java.lang.Class<?> jClass3 = ((defpackage.affr) afieVar).getJClass();
        jClass3.getClass();
        return a(jClass3);
    }

    public nkq(defpackage.qsh qshVar, int i) {
        this.a = i;
        this.b = qshVar;
    }
}
