package defpackage;

/* loaded from: classes.dex */
public final class akb extends cxt<ake> {
    private final asf a;

    public akb(asf asfVar) {
        this.a = asfVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ake(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ake akeVar = (ake) cfxVar;
        asf asfVar = akeVar.a;
        asf asfVar2 = this.a;
        if (affa.f(asfVar, asfVar2)) {
            return;
        }
        akeVar.p();
        akeVar.a = asfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akb) && affa.f(((akb) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
