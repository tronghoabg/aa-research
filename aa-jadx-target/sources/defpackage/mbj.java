package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mbj {
    private final java.lang.String a;
    private final int b;

    public mbj(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.a;
        java.util.Locale locale = java.util.Locale.US;
        int i = this.b;
        if (i == 1) {
            str = "LISTENER_CONNECTING";
        } else if (i != 2) {
            str = i != 3 ? "LISTENER_DISCONNECTED" : "LISTENER_DISCONNECTING";
        } else {
            str = "LISTENER_CONNECTED";
        }
        return java.lang.String.format(locale, "%s: %s", str2, str);
    }
}
