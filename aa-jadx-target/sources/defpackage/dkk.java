package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkk {
    public final java.util.Locale a;

    public dkk(java.util.Locale locale) {
        this.a = locale;
    }

    public final java.lang.String a() {
        return this.a.toLanguageTag();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.dkk)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return defpackage.afga.f(a(), ((defpackage.dkk) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final java.lang.String toString() {
        return a();
    }
}
