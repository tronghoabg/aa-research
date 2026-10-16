package defpackage;

/* loaded from: classes.dex */
public final class buk extends ccp {
    public aitf a;
    public afec b;

    public buk(afec afecVar, aitf aitfVar) {
        this.a = aitfVar;
        this.b = afecVar;
    }

    @Override // defpackage.ccp
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.ccp
    public final void b(Throwable th) {
        aitf aitfVar = this.a;
        if (aitfVar != null) {
            aitfVar.w(new aezv(th));
        }
    }
}
