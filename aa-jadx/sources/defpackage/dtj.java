package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class dtj {
    public final java.lang.String[] a;
    public final defpackage.dut b;
    public final android.app.PendingIntent c;
    public final android.app.PendingIntent d;
    public final long e;
    private final java.lang.String[] f;

    public dtj(java.lang.String[] strArr, defpackage.dut dutVar, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2, java.lang.String[] strArr2, long j) {
        this.a = strArr;
        this.b = dutVar;
        this.d = pendingIntent2;
        this.c = pendingIntent;
        this.f = strArr2;
        this.e = j;
    }

    public final java.lang.String a() {
        java.lang.String[] strArr = this.f;
        if (strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }
}
