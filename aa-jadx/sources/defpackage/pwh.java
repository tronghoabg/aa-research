package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pwh {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;

    private final java.lang.Object[] a() {
        return new java.lang.Object[]{java.lang.Long.valueOf(this.a), java.lang.Long.valueOf(this.b), java.lang.Long.valueOf(this.c), java.lang.Long.valueOf(this.d), java.lang.Long.valueOf(this.e)};
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.pwh) && java.util.Arrays.deepEquals(a(), ((defpackage.pwh) obj).a());
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(a());
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.g("receivedBytes", this.a);
        xymVarBy.g("sentBytes", this.b);
        xymVarBy.g("sentCompressedBytes", this.c);
        xymVarBy.g("sentGmmMessages", this.d);
        xymVarBy.g("sentCompressedGmmMessages", this.e);
        return xymVarBy.toString();
    }
}
