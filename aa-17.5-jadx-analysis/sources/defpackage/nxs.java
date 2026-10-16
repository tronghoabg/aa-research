package defpackage;

/* loaded from: classes.dex */
public final class nxs {
    public final boolean a;
    public final int b;
    public final boolean c;
    private final int d;

    public nxs(boolean z, int i, int i2, boolean z2) {
        this.a = z;
        this.b = i;
        this.d = i2;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxs)) {
            return false;
        }
        nxs nxsVar = (nxs) obj;
        return this.a == nxsVar.a && this.b == nxsVar.b && this.d == nxsVar.d && this.c == nxsVar.c;
    }

    public final int hashCode() {
        return (((((a.f(this.a) * 31) + this.b) * 31) + this.d) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "NotificationCenterState(isOpen=" + this.a + ", badgeCount=" + this.b + ", notificationCount=" + this.d + ", hasAutomationNotifications=" + this.c + ")";
    }
}
