package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ftf extends defpackage.epy implements defpackage.eqg {
    public static final defpackage.ftf b;
    private static final defpackage.ftf c;
    private static final defpackage.epx d;

    static {
        defpackage.ftf ftfVar = new defpackage.ftf();
        b = ftfVar;
        c = ftfVar;
        d = defpackage.epx.e;
    }

    @Override // defpackage.epy
    public final defpackage.epx a() {
        return d;
    }

    @Override // defpackage.epy
    public final void c(defpackage.eqf eqfVar) {
        eqfVar.getClass();
        if (!(eqfVar instanceof defpackage.epl)) {
            java.util.Objects.toString(eqfVar);
            throw new java.lang.IllegalArgumentException(eqfVar.toString().concat(" must implement androidx.lifecycle.DefaultLifecycleObserver."));
        }
        defpackage.epl eplVar = (defpackage.epl) eqfVar;
        eplVar.eD(this);
        eplVar.eG(this);
        eplVar.eF(this);
    }

    @Override // defpackage.epy
    public final void d(defpackage.eqf eqfVar) {
        eqfVar.getClass();
    }

    @Override // defpackage.eqg
    public final /* synthetic */ defpackage.epy getLifecycle() {
        return c;
    }

    public final java.lang.String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
