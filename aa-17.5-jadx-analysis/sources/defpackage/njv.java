package defpackage;

import android.content.res.Resources;

/* loaded from: classes2.dex */
public final class njv {
    public final Resources a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public njv(Resources resources, int i, int i2, int i3) throws Resources.NotFoundException {
        int integer = resources.getInteger(i);
        boolean z = resources.getBoolean(i2);
        boolean z2 = resources.getBoolean(i3);
        this.a = resources;
        this.b = integer;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njv)) {
            return false;
        }
        njv njvVar = (njv) obj;
        return affa.f(this.a, njvVar.a) && this.b == njvVar.b && this.c == njvVar.c && this.d == njvVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((iHashCode + this.b) * 31) + a.f(this.c)) * 31) + a.f(z);
    }

    public final String toString() {
        return "VerticalRailLayout(resources=" + this.a + ", numberOfHotseatItems=" + this.b + ", hotseatBottomAligned=" + this.c + ", animateNotificationBadge=" + this.d + ")";
    }
}
