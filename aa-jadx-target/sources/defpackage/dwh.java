package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dwh {
    public static final defpackage.dwh a = b(new java.util.Locale[0]);
    private final defpackage.dwi b;

    public dwh(defpackage.dwi dwiVar) {
        this.b = dwiVar;
    }

    public static defpackage.dwh b(java.util.Locale... localeArr) {
        return new defpackage.dwh(new defpackage.dwi(new android.os.LocaleList(localeArr)));
    }

    public static defpackage.dwh c(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        java.lang.String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        java.util.Locale[] localeArr = new java.util.Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = java.util.Locale.forLanguageTag(strArrSplit[i]);
        }
        return new defpackage.dwh(new defpackage.dwi(new android.os.LocaleList(localeArr)));
    }

    public final int a() {
        return a$.ExternalSyntheticApiModelOutline2.m(this.b.a);
    }

    public final java.lang.String d() {
        return a$.ExternalSyntheticApiModelOutline2.m(this.b.a);
    }

    public final java.util.Locale e(int i) {
        return a$.ExternalSyntheticApiModelOutline2.m(this.b.a, i);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dwh) && this.b.equals(((defpackage.dwh) obj).b);
    }

    public final boolean f() {
        return a$.ExternalSyntheticApiModelOutline2.m(this.b.a);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}
