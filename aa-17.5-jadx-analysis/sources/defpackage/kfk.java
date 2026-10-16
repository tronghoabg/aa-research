package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class kfk {
    public final Uri a;
    public final yfq b;
    public final String c;
    public final yfq d;
    public final String e;

    public kfk(Uri uri, yfq yfqVar, String str, yfq yfqVar2, String str2) {
        this.a = uri;
        this.b = yfqVar;
        this.c = str;
        this.d = yfqVar2;
        this.e = str2;
    }

    public static wu a() {
        wu wuVar = new wu();
        wuVar.d(new Uri.Builder().build());
        int i = yfq.d;
        yfq yfqVar = yls.a;
        wuVar.b(yfqVar);
        wuVar.c(yfqVar);
        return wuVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kfk) {
            kfk kfkVar = (kfk) obj;
            if (this.a.equals(kfkVar.a) && yrm.W(this.b, kfkVar.b) && ((str = this.c) != null ? str.equals(kfkVar.c) : kfkVar.c == null) && yrm.W(this.d, kfkVar.d) && ((str2 = this.e) != null ? str2.equals(kfkVar.e) : kfkVar.e == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str2 = this.e;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        yfq yfqVar = this.d;
        yfq yfqVar2 = this.b;
        return "Query{uri=" + String.valueOf(this.a) + ", projection=" + String.valueOf(yfqVar2) + ", selection=" + this.c + ", selectionArgs=" + String.valueOf(yfqVar) + ", sortOrder=" + this.e + "}";
    }

    public kfk() {
        throw null;
    }
}
