package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class pvo {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;

    private final Object[] a() {
        return new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pvo) && Arrays.deepEquals(a(), ((pvo) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(a());
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.g("receivedBytes", this.a);
        xxgVarAo.g("sentBytes", this.b);
        xxgVarAo.g("sentCompressedBytes", this.c);
        xxgVarAo.g("sentGmmMessages", this.d);
        xxgVarAo.g("sentCompressedGmmMessages", this.e);
        return xxgVarAo.toString();
    }
}
