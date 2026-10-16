package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class c4 {
    public BigInteger a;
    public BigInteger b;
    public BigInteger c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        BigInteger bigInteger = c4Var.c;
        BigInteger bigInteger2 = this.c;
        if (bigInteger2 != null) {
            if (!bigInteger2.equals(bigInteger)) {
                return false;
            }
        } else if (bigInteger != null) {
            return false;
        }
        return c4Var.b.equals(this.b) && c4Var.a.equals(this.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        return iHashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}
