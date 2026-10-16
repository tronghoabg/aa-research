package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class tpq {
    public final abes a;
    public final Bitmap b;
    public final Bitmap c;
    public final Bitmap d;

    public tpq(abes abesVar, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        abesVar.getClass();
        this.a = abesVar;
        this.b = bitmap;
        this.c = bitmap2;
        this.d = bitmap3;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tpq) {
            tpq tpqVar = (tpq) obj;
            if (this.a.equals(tpqVar.a) && ((bitmap = this.b) != null ? bitmap.equals(tpqVar.b) : tpqVar.b == null) && ((bitmap2 = this.c) != null ? bitmap2.equals(tpqVar.c) : tpqVar.c == null) && ((bitmap3 = this.d) != null ? bitmap3.equals(tpqVar.d) : tpqVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Bitmap bitmap = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        Bitmap bitmap2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (bitmap2 == null ? 0 : bitmap2.hashCode())) * 1000003;
        Bitmap bitmap3 = this.d;
        return iHashCode3 ^ (bitmap3 != null ? bitmap3.hashCode() : 0);
    }

    public final String toString() {
        Bitmap bitmap = this.d;
        Bitmap bitmap2 = this.c;
        Bitmap bitmap3 = this.b;
        return "{" + this.a.toString() + ", " + String.valueOf(bitmap3) + ", " + String.valueOf(bitmap2) + ", " + String.valueOf(bitmap) + "}";
    }

    public tpq() {
        throw null;
    }
}
