package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mbv {
    public final android.service.notification.StatusBarNotification a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public mbv(android.service.notification.StatusBarNotification statusBarNotification, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = statusBarNotification;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.mbv)) {
            return false;
        }
        defpackage.mbv mbvVar = (defpackage.mbv) obj;
        return this.a == mbvVar.a && this.b == mbvVar.b && this.c == mbvVar.c && this.d == mbvVar.d && this.e == mbvVar.e;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, java.lang.Boolean.valueOf(this.b), java.lang.Boolean.valueOf(this.c), java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(this.e));
    }
}
