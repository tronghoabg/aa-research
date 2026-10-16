package defpackage;

/* loaded from: classes.dex */
public final class auz extends cxt<ava> {
    private final int a;

    public auz(int i) {
        this.a = i;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ava(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ava avaVar = (ava) cfxVar;
        avaVar.b = this.a;
        avaVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        auz auzVar = obj instanceof auz ? (auz) obj : null;
        return auzVar != null && this.a == auzVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }
}
