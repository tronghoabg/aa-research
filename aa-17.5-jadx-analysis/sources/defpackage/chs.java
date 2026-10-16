package defpackage;

/* loaded from: classes2.dex */
public final class chs extends cxt<chv> {
    private final afec a;

    public chs(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new chv(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((chv) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chs) && this.a == ((chs) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
