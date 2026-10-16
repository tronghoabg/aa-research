package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class hof extends hdg {
    public static final hnz a = new hnz(6);
    private final String b;
    private final List c;
    private final Bundle d;
    private final PendingIntent e;

    public hof(String str, List list, Bundle bundle, PendingIntent pendingIntent) {
        str.getClass();
        list.getClass();
        this.b = str;
        this.c = list;
        this.d = bundle;
        this.e = pendingIntent;
        hnv hnvVar = hnv.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hof)) {
            return false;
        }
        hof hofVar = (hof) obj;
        return affa.f(this.b, hofVar.b) && affa.f(this.c, hofVar.c) && affa.f(this.d, hofVar.d) && affa.f(this.e, hofVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        Bundle bundle = this.d;
        int iHashCode2 = ((iHashCode * 31) + (bundle == null ? 0 : bundle.hashCode())) * 31;
        PendingIntent pendingIntent = this.e;
        return iHashCode2 + (pendingIntent != null ? pendingIntent.hashCode() : 0);
    }

    public final String toString() {
        return "ShowCardsParams(clientSessionId=" + this.b + ", selectedCardIds=" + this.c + ", liveDataQueryBundle=" + this.d + ", liveDataQueryIntent=" + this.e + ")";
    }
}
