package defpackage;

/* loaded from: classes.dex */
public final class aws extends cxt<avz> {
    private final izj a;

    public aws(izj izjVar) {
        this.a = izjVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new avz(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((avz) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        aws awsVar = obj instanceof aws ? (aws) obj : null;
        return awsVar != null && this.a == awsVar.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
