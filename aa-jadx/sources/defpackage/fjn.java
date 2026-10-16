package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fjn {
    public final int a;
    public final int b;
    public final android.app.Notification c;

    public fjn(int i, android.app.Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.fjn fjnVar = (defpackage.fjn) obj;
        if (this.a == fjnVar.a && this.b == fjnVar.b) {
            return this.c.equals(fjnVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
