package defpackage;

import android.app.PendingIntent;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class o5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final PendingIntent f;
    public final PendingIntent g;
    public final PendingIntent h;

    public o5(String str, String str2, String str3, String str4, boolean z, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        this.a = str;
        this.b = str2;
        if (str3 != null && !str3.isEmpty()) {
            str2 = str3;
        }
        this.c = str2;
        this.d = str4 == null ? "" : str4;
        this.e = z;
        this.f = pendingIntent;
        this.g = pendingIntent2;
        this.h = pendingIntent3;
    }
}
