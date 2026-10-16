package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class hvu implements hui {
    private final hui b;
    private final hui c;

    public hvu(hui huiVar, hui huiVar2) {
        this.b = huiVar;
        this.c = huiVar2;
    }

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        if (obj instanceof hvu) {
            hvu hvuVar = (hvu) obj;
            if (this.b.equals(hvuVar.b) && this.c.equals(hvuVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        hui huiVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(huiVar) + "}";
    }
}
