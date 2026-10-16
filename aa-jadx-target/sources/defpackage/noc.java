package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class noc {
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon a;
    public final defpackage.afer b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ noc(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, defpackage.afer aferVar, int i) {
        aferVar = (i & 4) != 0 ? new defpackage.nhn(8) : aferVar;
        this(1 == (i & 1) ? null : ghIcon, (i & 2) != 0 ? 1 : 0, aferVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.noc)) {
            return false;
        }
        defpackage.noc nocVar = (defpackage.noc) obj;
        return defpackage.afga.f(this.a, nocVar.a) && this.c == nocVar.c && defpackage.afga.f(this.b, nocVar.b);
    }

    public final int hashCode() {
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = this.a;
        return ((((ghIcon == null ? 0 : ghIcon.hashCode()) * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Action(icon=" + this.a + ", semanticType=" + ((java.lang.Object) defpackage.edd.z(this.c)) + ", action=" + this.b + ")";
    }

    public noc(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, int i, defpackage.afer aferVar) {
        if (i == 0) {
            throw null;
        }
        aferVar.getClass();
        this.a = ghIcon;
        this.c = i;
        this.b = aferVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public noc() {
        this((com.google.android.apps.auto.components.graphics.icon.GhIcon) null, (defpackage.afer) (0 == true ? 1 : 0), 7);
    }
}
