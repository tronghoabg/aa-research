package defpackage;

/* loaded from: classes2.dex */
public final class aiwp extends ajcw {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public aiwp(afco afcoVar, afck afckVar) {
        aiwq aiwqVar = aiwq.a;
        super(afcoVar.get(aiwqVar) == null ? afcoVar.plus(aiwqVar) : afcoVar, afckVar);
        this.b = new ThreadLocal();
        if (afckVar.hH().get(afcl.k) instanceof aitu) {
            return;
        }
        Object objB = ajdb.b(afcoVar, null);
        ajdb.c(afcoVar, objB);
        R(afcoVar, objB);
    }

    private final void T() {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.b;
            aezu aezuVar = (aezu) threadLocal.get();
            if (aezuVar != null) {
                ajdb.c((afco) aezuVar.a, aezuVar.b);
            }
            threadLocal.remove();
        }
    }

    public final void R(afco afcoVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new aezu(afcoVar, obj));
    }

    public final boolean S() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.ajcw, defpackage.aisz
    protected final void f(Object obj) {
        T();
        afck afckVar = this.c;
        Object objA = ahng.a(obj, afckVar);
        afco afcoVarHH = afckVar.hH();
        Object objB = ajdb.b(afcoVarHH, null);
        aiwp aiwpVarC = objB != ajdb.a ? aits.c(afckVar, afcoVarHH, objB) : null;
        try {
            afckVar.w(objA);
            if (aiwpVarC == null || aiwpVarC.S()) {
                ajdb.c(afcoVarHH, objB);
            }
        } catch (Throwable th) {
            if (aiwpVarC == null || aiwpVarC.S()) {
                ajdb.c(afcoVarHH, objB);
            }
            throw th;
        }
    }

    @Override // defpackage.ajcw
    public final void k() {
        T();
    }
}
