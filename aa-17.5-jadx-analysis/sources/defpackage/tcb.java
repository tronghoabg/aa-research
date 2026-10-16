package defpackage;

/* loaded from: classes3.dex */
public final class tcb implements zge {
    final /* synthetic */ eqa a;
    final /* synthetic */ epf b;
    final /* synthetic */ eqj c;
    final /* synthetic */ eqn d;

    public tcb(eqa eqaVar, epf epfVar, eqj eqjVar, eqn eqnVar) {
        this.a = eqaVar;
        this.b = epfVar;
        this.c = eqjVar;
        this.d = eqnVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        this.a.getLifecycle().d(this.b);
        this.c.k(this.d);
    }

    @Override // defpackage.zge
    public final void b(Object obj) {
        this.a.getLifecycle().d(this.b);
        this.c.k(this.d);
    }
}
