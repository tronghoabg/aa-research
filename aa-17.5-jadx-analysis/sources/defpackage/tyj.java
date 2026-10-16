package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
final class tyj {
    public final Bitmap a;
    public final usg b;

    public tyj(Bitmap bitmap, usg usgVar) {
        bitmap.getClass();
        this.a = bitmap;
        this.b = usgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tyj) {
            tyj tyjVar = (tyj) obj;
            if (this.a.equals(tyjVar.a) && this.b.equals(tyjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        usg usgVar = this.b;
        return "{" + this.a.toString() + ", " + usgVar.toString() + "}";
    }

    public tyj() {
        throw null;
    }
}
