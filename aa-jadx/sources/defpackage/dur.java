package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dur {
    public final java.lang.CharSequence a;
    public final androidx.core.graphics.drawable.IconCompat b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;
    public final boolean f;

    public dur(defpackage.duq duqVar) {
        this.a = duqVar.a;
        this.b = duqVar.b;
        this.c = duqVar.c;
        this.d = duqVar.d;
        this.e = duqVar.e;
        this.f = duqVar.f;
    }

    public static defpackage.dur b(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("icon");
        defpackage.duq duqVar = new defpackage.duq();
        duqVar.a = bundle.getCharSequence("name");
        duqVar.b = bundle2 != null ? androidx.core.graphics.drawable.IconCompat.h(bundle2) : null;
        duqVar.c = bundle.getString("uri");
        duqVar.d = bundle.getString("key");
        duqVar.e = bundle.getBoolean("isBot");
        duqVar.f = bundle.getBoolean("isImportant");
        return new defpackage.dur(duqVar);
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("name", this.a);
        androidx.core.graphics.drawable.IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.g() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.dur)) {
            return false;
        }
        defpackage.dur durVar = (defpackage.dur) obj;
        java.lang.String str = this.d;
        java.lang.String str2 = durVar.d;
        if (str != null || str2 != null) {
            return j$.util.Objects.equals(str, str2);
        }
        if (j$.util.Objects.equals(j$.util.Objects.toString(this.a), j$.util.Objects.toString(durVar.a)) && j$.util.Objects.equals(this.c, durVar.c)) {
            if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(durVar.e))) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.f), java.lang.Boolean.valueOf(durVar.f))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.d;
        return str != null ? str.hashCode() : j$.util.Objects.hash(this.a, this.c, java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(this.f));
    }
}
