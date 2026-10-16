package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ond {
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon a;
    public final boolean b;

    public ond(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, boolean z) {
        this.a = ghIcon;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ond) {
            defpackage.ond ondVar = (defpackage.ond) obj;
            com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = this.a;
            if (ghIcon != null ? ghIcon.equals(ondVar.a) : ondVar.a == null) {
                if (this.b == ondVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = this.a;
        return (true != this.b ? 1237 : 1231) ^ (((ghIcon == null ? 0 : ghIcon.hashCode()) ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "LargeIconState{icon=" + java.lang.String.valueOf(this.a) + ", resourceLoading=" + this.b + "}";
    }

    public ond() {
        throw null;
    }
}
