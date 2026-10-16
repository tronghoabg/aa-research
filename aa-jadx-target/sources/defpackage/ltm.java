package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ltm {
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon a;
    public final boolean b;
    public final defpackage.afer c;

    public ltm(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, boolean z, defpackage.afer aferVar) {
        aferVar.getClass();
        this.a = ghIcon;
        this.b = z;
        this.c = aferVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ltm)) {
            return false;
        }
        defpackage.ltm ltmVar = (defpackage.ltm) obj;
        return defpackage.afga.f(this.a, ltmVar.a) && this.b == ltmVar.b && defpackage.afga.f(this.c, ltmVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + defpackage.a.e(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "MediaAction(icon=" + this.a + ", isEnabled=" + this.b + ", clickAction=" + this.c + ")";
    }
}
