package defpackage;

/* loaded from: classes.dex */
public final class avq extends cxt<avs> {
    private final avp a;

    public avq(avp avpVar) {
        this.a = avpVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new avs(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((avs) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        avq avqVar = obj instanceof avq ? (avq) obj : null;
        if (avqVar == null) {
            return false;
        }
        return affa.f(this.a, avqVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
