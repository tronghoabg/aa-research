package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes.dex */
public final class nmj {
    public final GhIcon a;
    public final ComponentName b;
    public final GhIcon c;
    public final gjo d;
    public final boolean e;
    public final afdr f;

    public nmj(GhIcon ghIcon, ComponentName componentName, GhIcon ghIcon2, gjo gjoVar, boolean z, afdr afdrVar) {
        ghIcon.getClass();
        this.a = ghIcon;
        this.b = componentName;
        this.c = ghIcon2;
        this.d = gjoVar;
        this.e = z;
        this.f = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmj)) {
            return false;
        }
        nmj nmjVar = (nmj) obj;
        return affa.f(this.a, nmjVar.a) && affa.f(this.b, nmjVar.b) && affa.f(this.c, nmjVar.c) && affa.f(this.d, nmjVar.d) && this.e == nmjVar.e && affa.f(this.f, nmjVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ComponentName componentName = this.b;
        int iHashCode2 = (iHashCode + (componentName == null ? 0 : componentName.hashCode())) * 31;
        GhIcon ghIcon = this.c;
        int iHashCode3 = (iHashCode2 + (ghIcon == null ? 0 : ghIcon.hashCode())) * 31;
        gjo gjoVar = this.d;
        return ((((iHashCode3 + (gjoVar != null ? gjoVar.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "HotseatItem(icon=" + this.a + ", componentName=" + this.b + ", badgeIcon=" + this.c + ", imageInfo=" + this.d + ", disabled=" + this.e + ", onClick=" + this.f + ")";
    }
}
