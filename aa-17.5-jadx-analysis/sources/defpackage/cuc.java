package defpackage;

/* loaded from: classes.dex */
public final class cuc extends cxt<cue> {
    private final afec a;

    public cuc(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cue(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((cue) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuc) && this.a == ((cuc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
