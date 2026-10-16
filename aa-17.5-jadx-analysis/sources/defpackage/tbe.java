package defpackage;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables;

/* loaded from: classes3.dex */
public final class tbe {
    public final tbc a;
    public final NotificationInfoParcelables b;

    public tbe(tbc tbcVar, NotificationInfoParcelables notificationInfoParcelables) {
        this.a = tbcVar;
        this.b = notificationInfoParcelables;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbe)) {
            return false;
        }
        tbe tbeVar = (tbe) obj;
        return affa.f(this.a, tbeVar.a) && affa.f(this.b, tbeVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NotificationInfoWrapper(notificationInfo=" + this.a + ", parcelables=" + this.b + ")";
    }
}
