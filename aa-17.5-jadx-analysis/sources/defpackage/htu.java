package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class htu extends hts {
    public final Drawable a;
    private final htx b;

    public htu(htx htxVar, Drawable drawable) {
        this.b = htxVar;
        this.a = drawable;
        int iOrdinal = htxVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return;
        }
        if (iOrdinal == 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iOrdinal != 3) {
            throw new aezs();
        }
    }

    @Override // defpackage.hts
    public final htx a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htu)) {
            return false;
        }
        htu htuVar = (htu) obj;
        return this.b == htuVar.b && affa.f(this.a, htuVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Drawable drawable = this.a;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "Placeholder(status=" + this.b + ", placeholder=" + this.a + ")";
    }
}
