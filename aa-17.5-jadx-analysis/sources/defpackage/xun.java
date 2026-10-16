package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class xun {
    public final yfq a;
    public final yfq b;
    public final UUID c;
    public final long d;

    public xun(yfq yfqVar, yfq yfqVar2, UUID uuid) {
        this.a = yfqVar;
        this.b = yfqVar2;
        this.c = uuid;
        this.d = -1L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xun) {
            xun xunVar = (xun) obj;
            if (yrm.W(this.a, xunVar.a) && yrm.W(this.b, xunVar.b) && this.c.equals(xunVar.c) && this.d == xunVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }

    public xun() {
        throw null;
    }
}
