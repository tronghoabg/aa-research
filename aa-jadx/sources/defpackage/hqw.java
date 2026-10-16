package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hqw {
    public final java.lang.String a;
    public final java.lang.String b;

    public hqw(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.hqw hqwVar = (defpackage.hqw) obj;
            if (android.text.TextUtils.equals(this.a, hqwVar.a) && android.text.TextUtils.equals(this.b, hqwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + "]";
    }
}
