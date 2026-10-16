package defpackage;

/* loaded from: classes2.dex */
public final class gji extends cxt<gjj> {
    private final afec a;

    public gji(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new gjj(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((gjj) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gji) && affa.f(this.a, ((gji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TouchpadEventElement(callback=" + this.a + ")";
    }
}
