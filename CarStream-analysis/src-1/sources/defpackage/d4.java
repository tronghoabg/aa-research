package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class d4 {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final e4 d;

    public d4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, e4 e4Var) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = e4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return d4Var.c.equals(this.c) && d4Var.b.equals(this.b) && d4Var.a.equals(this.a);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ this.b.hashCode()) ^ this.a.hashCode();
    }
}
