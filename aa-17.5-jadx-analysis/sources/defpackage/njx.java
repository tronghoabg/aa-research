package defpackage;

/* loaded from: classes.dex */
public final class njx implements erq {
    private final /* synthetic */ int a;
    private final Object b;

    public njx(eqj eqjVar, int i) {
        this.a = i;
        this.b = eqjVar;
    }

    @Override // defpackage.erq
    public final erm a(Class cls) {
        int i = this.a;
        if (i == 0) {
            return new njw((qrn) this.b);
        }
        if (i == 1) {
            if (cls.isAssignableFrom(njs.class)) {
                return new njs((qrn) this.b);
            }
            throw new IllegalArgumentException("unknown ViewModel class: ".concat(String.valueOf(cls.getName())));
        }
        if (cls.isAssignableFrom(nms.class)) {
            return new nms((eqj) this.b);
        }
        if (cls.isAssignableFrom(nnu.class)) {
            return new nnu((eqj) this.b);
        }
        throw new IllegalArgumentException("unknown ViewModel class: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.erq
    public final /* synthetic */ erm b(Class cls, esc escVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? a(cls) : a(cls) : a(cls);
    }

    @Override // defpackage.erq
    public final /* synthetic */ erm c(afhe afheVar, esc escVar) {
        int i = this.a;
        if (i == 0) {
            Class<?> jClass = ((afer) afheVar).getJClass();
            jClass.getClass();
            return a(jClass);
        }
        if (i != 1) {
            Class<?> jClass2 = ((afer) afheVar).getJClass();
            jClass2.getClass();
            return a(jClass2);
        }
        Class<?> jClass3 = ((afer) afheVar).getJClass();
        jClass3.getClass();
        return a(jClass3);
    }

    public njx(qrn qrnVar, int i) {
        this.a = i;
        this.b = qrnVar;
    }
}
