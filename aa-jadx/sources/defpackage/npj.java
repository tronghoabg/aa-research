package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.afeo
public final class npj implements defpackage.nqd {
    private final java.util.List a;

    @Override // defpackage.nqd
    public final float a() {
        return ((java.lang.Number) this.a.get(4)).floatValue() / 10.0f;
    }

    @Override // defpackage.nqd
    public final float b() {
        return ((java.lang.Number) this.a.get(3)).floatValue() / 10.0f;
    }

    @Override // defpackage.nqd
    public final float c() {
        return ((java.lang.Number) this.a.get(5)).floatValue() / 10.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.npj) && defpackage.afga.f(this.a, ((defpackage.npj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FahrenheitConfigAccessor(config=" + this.a + ")";
    }
}
