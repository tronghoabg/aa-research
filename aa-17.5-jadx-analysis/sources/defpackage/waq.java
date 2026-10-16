package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
final class waq {
    public final Context a;
    public final xyc b;

    public waq(Context context, xyc xycVar) {
        this.a = context;
        this.b = xycVar;
    }

    public final boolean equals(Object obj) {
        xyc xycVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof waq) {
            waq waqVar = (waq) obj;
            if (this.a.equals(waqVar.a) && ((xycVar = this.b) != null ? xycVar.equals(waqVar.b) : waqVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        xyc xycVar = this.b;
        return (xycVar == null ? 0 : xycVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        xyc xycVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + String.valueOf(xycVar) + "}";
    }

    public waq() {
        throw null;
    }
}
