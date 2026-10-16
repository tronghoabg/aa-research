package defpackage;

import android.os.Bundle;
import j$.time.Instant;

/* loaded from: classes2.dex */
public final class lsb {
    public final String a;
    public final Instant b;
    private final Bundle c;

    public lsb(String str, Bundle bundle, Instant instant) {
        this.a = str;
        this.c = bundle;
        if (instant == null) {
            throw new NullPointerException("Null processedTime");
        }
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsb) {
            lsb lsbVar = (lsb) obj;
            if (this.a.equals(lsbVar.a) && this.c.equals(lsbVar.c) && this.b.equals(lsbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Instant instant = this.b;
        return "MediaSearch{query=" + this.a + ", extras=" + this.c.toString() + ", processedTime=" + instant.toString() + "}";
    }

    public lsb() {
        throw null;
    }
}
