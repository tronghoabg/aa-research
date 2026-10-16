package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nyi {
    public final boolean a;
    public final int b;
    public final boolean c;
    private final int d;

    public nyi(boolean z, int i, int i2, boolean z2) {
        this.a = z;
        this.b = i;
        this.d = i2;
        this.c = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nyi)) {
            return false;
        }
        defpackage.nyi nyiVar = (defpackage.nyi) obj;
        return this.a == nyiVar.a && this.b == nyiVar.b && this.d == nyiVar.d && this.c == nyiVar.c;
    }

    public final int hashCode() {
        return (((((defpackage.a.e(this.a) * 31) + this.b) * 31) + this.d) * 31) + defpackage.a.e(this.c);
    }

    public final java.lang.String toString() {
        return "NotificationCenterState(isOpen=" + this.a + ", badgeCount=" + this.b + ", notificationCount=" + this.d + ", hasAutomationNotifications=" + this.c + ")";
    }
}
