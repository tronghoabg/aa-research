package defpackage;

/* loaded from: classes2.dex */
public final class msp extends mss {
    public final String a;

    public msp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof msp) && affa.f(this.a, ((msp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.mss
    public final String toString() {
        return "NotificationContent(notificationKey=" + this.a + ")";
    }
}
