package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes.dex */
public final class ltg {
    public final GhIcon a;
    public final boolean b;
    public final afdr c;

    public ltg(GhIcon ghIcon, boolean z, afdr afdrVar) {
        afdrVar.getClass();
        this.a = ghIcon;
        this.b = z;
        this.c = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltg)) {
            return false;
        }
        ltg ltgVar = (ltg) obj;
        return affa.f(this.a, ltgVar.a) && this.b == ltgVar.b && affa.f(this.c, ltgVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.f(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MediaAction(icon=" + this.a + ", isEnabled=" + this.b + ", clickAction=" + this.c + ")";
    }
}
