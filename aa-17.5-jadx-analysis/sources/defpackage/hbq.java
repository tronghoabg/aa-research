package defpackage;

/* loaded from: classes2.dex */
final class hbq extends cxt<hbr> {
    private final afdr a;

    public hbq(afdr afdrVar) {
        afdrVar.getClass();
        this.a = afdrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new hbr(((Number) this.a.invoke()).floatValue());
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((hbr) cfxVar).a = ((Number) this.a.invoke()).floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbq) && affa.f(this.a, ((hbq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusOffsetElement(overlayHeightPxProvider=" + this.a + ")";
    }
}
