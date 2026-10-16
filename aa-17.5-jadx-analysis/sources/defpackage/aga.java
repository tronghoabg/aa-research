package defpackage;

/* loaded from: classes.dex */
public final class aga implements bym {
    public final age a;
    public afec b;
    public afec c;
    final /* synthetic */ agb d;

    public aga(agb agbVar, age ageVar, afec afecVar, afec afecVar2) {
        this.d = agbVar;
        this.a = ageVar;
        this.b = afecVar;
        this.c = afecVar2;
    }

    @Override // defpackage.bym
    public final Object a() {
        b(this.d.a.d(), null, null);
        return this.a.a();
    }

    public final void b(agc agcVar, Object obj, aei aeiVar) {
        Object objInvoke = this.c.invoke(agcVar.g());
        if (!this.d.a.w()) {
            this.a.k(objInvoke, (aew) this.b.invoke(agcVar), obj, aeiVar);
        } else {
            this.a.j(this.c.invoke(agcVar.f()), objInvoke, (aew) this.b.invoke(agcVar));
        }
    }
}
