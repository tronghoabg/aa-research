package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class mef {
    public final Uri a;
    public final String b;
    public final String c;

    public mef(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mef)) {
            return false;
        }
        mef mefVar = (mef) obj;
        return affa.f(this.a, mefVar.a) && affa.f(this.b, mefVar.b) && affa.f(this.c, mefVar.c);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        String str = this.b;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Key(contactPhotoUri=" + this.a + ", name=" + this.b + ", number=" + this.c + ")";
    }
}
