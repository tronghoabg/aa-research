package defpackage;

import android.app.PendingIntent;

@Deprecated
/* loaded from: classes2.dex */
public final class dtc {
    public final String[] a;
    public final dum b;
    public final PendingIntent c;
    public final PendingIntent d;
    public final long e;
    private final String[] f;

    public dtc(String[] strArr, dum dumVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
        this.a = strArr;
        this.b = dumVar;
        this.d = pendingIntent2;
        this.c = pendingIntent;
        this.f = strArr2;
        this.e = j;
    }

    public final String a() {
        String[] strArr = this.f;
        if (strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }
}
