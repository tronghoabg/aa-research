package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class gjl {
    private final Uri a;
    private final Object b;

    public gjl(Uri uri, Object obj) {
        this.a = uri;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjl)) {
            return false;
        }
        gjl gjlVar = (gjl) obj;
        return affa.f(this.a, gjlVar.a) && affa.f(this.b, gjlVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "CacheKey(uri=" + this.a + ", signature=" + this.b + ")";
    }
}
