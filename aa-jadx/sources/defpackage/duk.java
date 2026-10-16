package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class duk {
    final java.lang.String a;
    final int b;
    final java.lang.String c;
    final android.app.Notification d;

    public duk(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final java.lang.String toString() {
        return "NotifyTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + "]";
    }
}
