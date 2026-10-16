package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nne {
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon a;
    public final android.content.ComponentName b;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon c;
    public final defpackage.gjv d;
    public final boolean e;
    public final defpackage.afer f;

    public nne(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, android.content.ComponentName componentName, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2, defpackage.gjv gjvVar, boolean z, defpackage.afer aferVar) {
        ghIcon.getClass();
        this.a = ghIcon;
        this.b = componentName;
        this.c = ghIcon2;
        this.d = gjvVar;
        this.e = z;
        this.f = aferVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nne)) {
            return false;
        }
        defpackage.nne nneVar = (defpackage.nne) obj;
        return defpackage.afga.f(this.a, nneVar.a) && defpackage.afga.f(this.b, nneVar.b) && defpackage.afga.f(this.c, nneVar.c) && defpackage.afga.f(this.d, nneVar.d) && this.e == nneVar.e && defpackage.afga.f(this.f, nneVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        android.content.ComponentName componentName = this.b;
        int iHashCode2 = (iHashCode + (componentName == null ? 0 : componentName.hashCode())) * 31;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = this.c;
        int iHashCode3 = (iHashCode2 + (ghIcon == null ? 0 : ghIcon.hashCode())) * 31;
        defpackage.gjv gjvVar = this.d;
        return ((((iHashCode3 + (gjvVar != null ? gjvVar.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "HotseatItem(icon=" + this.a + ", componentName=" + this.b + ", badgeIcon=" + this.c + ", imageInfo=" + this.d + ", disabled=" + this.e + ", onClick=" + this.f + ")";
    }
}
