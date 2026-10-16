package defpackage;

/* loaded from: classes.dex */
public final class ayg extends cxt<ayf> {
    public ayf a;
    public aitm b;

    @Override // defpackage.cxt
    public final /* synthetic */ cfx d() {
        return new ayf(this);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final Object f(afck afckVar) throws Throwable {
        aitm aitmVar = this.b;
        if (aitmVar == null) {
            aitmVar = new aitm();
            this.b = aitmVar;
            ayf ayfVar = this.a;
            if (ayfVar != null && ayfVar.A) {
                ayfVar.b();
            }
        }
        Object objHL = aitmVar.hL(afckVar);
        return objHL == afcr.a ? objHL : afak.a;
    }

    public final int hashCode() {
        return 234;
    }
}
