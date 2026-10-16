package defpackage;

/* loaded from: classes.dex */
public final class afch implements afcn {
    private final afec a;
    private final afcn b;

    public afch(afcn afcnVar, afec afecVar) {
        this.a = afecVar;
        this.b = afcnVar instanceof afch ? ((afch) afcnVar).b : afcnVar;
    }

    public final afcm a(afcm afcmVar) {
        return (afcm) this.a.invoke(afcmVar);
    }

    public final boolean b(afcn afcnVar) {
        afcnVar.getClass();
        return afcnVar == this || this.b == afcnVar;
    }

    public afch() {
        this(afcl.k, new aitt(0));
    }
}
