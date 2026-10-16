package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class msd {
    public final android.content.Intent a;
    private final com.google.android.apps.auto.components.graphics.icon.GhIcon b;
    private final java.lang.CharSequence c;

    public msd(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, java.lang.CharSequence charSequence, android.content.Intent intent) {
        this.b = ghIcon;
        if (charSequence == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.c = charSequence;
        if (intent == null) {
            throw new java.lang.NullPointerException("Null launchTarget");
        }
        this.a = intent;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.msd) {
            defpackage.msd msdVar = (defpackage.msd) obj;
            if (this.b.equals(msdVar.b) && this.c.equals(msdVar.c) && this.a.equals(msdVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        return this.a.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        android.content.Intent intent = this.a;
        return "LauncherItem{appIcon=" + this.b.toString() + ", name=" + ((java.lang.String) this.c) + ", launchTarget=" + intent.toString() + "}";
    }

    public msd() {
        throw null;
    }
}
