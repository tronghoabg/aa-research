package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class peb {
    final defpackage.pap a;
    public int b = 1;

    public peb(defpackage.pap papVar) {
        this.a = papVar;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.util.Locale locale = java.util.Locale.US;
        int i = this.b;
        if (i == 1) {
            str = "PENDING";
        } else if (i != 2) {
            str = i != 3 ? "null" : "DISCONNECTED";
        } else {
            str = "CONNECTED";
        }
        return java.lang.String.format(locale, "NetworkRequester{requestState: %s}", str);
    }
}
