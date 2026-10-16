package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.afeo
public final class npi implements defpackage.nqd {
    private final java.util.List a;

    @Override // defpackage.nqd
    public final float a() {
        return ((java.lang.Number) this.a.get(1)).floatValue() / 10.0f;
    }

    @Override // defpackage.nqd
    public final float b() {
        return ((java.lang.Number) this.a.get(0)).floatValue() / 10.0f;
    }

    @Override // defpackage.nqd
    public final float c() {
        return ((java.lang.Number) this.a.get(2)).floatValue() / 10.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.npi) && defpackage.afga.f(this.a, ((defpackage.npi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CelsiusConfigAccessor(config=" + this.a + ")";
    }
}
