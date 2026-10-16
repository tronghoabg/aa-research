package defpackage;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class tkl {
    public final String a;
    public final Uri b;

    public tkl(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkl)) {
            return false;
        }
        tkl tklVar = (tkl) obj;
        return affa.f(this.a, tklVar.a) && affa.f(this.b, tklVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Key(id=" + this.a + ", encodedDelegateKey=" + this.b + ")";
    }
}
