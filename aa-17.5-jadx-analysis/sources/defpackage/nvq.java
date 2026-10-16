package defpackage;

import android.app.PendingIntent;

/* loaded from: classes2.dex */
public final class nvq implements nuq {
    public static final yph a = yph.c("GH.Notif.CallStyle");
    public final int b;
    public final PendingIntent c;
    public final PendingIntent d;
    public final PendingIntent e;
    private final duk f;

    public nvq(int i, duk dukVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        this.b = i;
        this.f = dukVar;
        this.c = pendingIntent;
        this.d = pendingIntent2;
        this.e = pendingIntent3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvq)) {
            return false;
        }
        nvq nvqVar = (nvq) obj;
        return this.b == nvqVar.b && affa.f(this.f, nvqVar.f) && affa.f(this.c, nvqVar.c) && affa.f(this.d, nvqVar.d) && affa.f(this.e, nvqVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b * 31) + this.f.hashCode();
        PendingIntent pendingIntent = this.c;
        int iHashCode2 = ((iHashCode * 31) + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31;
        PendingIntent pendingIntent2 = this.d;
        int iHashCode3 = (iHashCode2 + (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 31;
        PendingIntent pendingIntent3 = this.e;
        return iHashCode3 + (pendingIntent3 != null ? pendingIntent3.hashCode() : 0);
    }

    public final String toString() {
        return "CallStyle(callType=" + this.b + ", person=" + this.f + ", answerIntent=" + this.c + ", declineIntent=" + this.d + ", hangupIntent=" + this.e + ")";
    }
}
