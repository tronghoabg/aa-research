package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lup implements java.io.Serializable {
    public final android.content.ComponentName a;
    public final java.lang.String b;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon c;
    public final int d;

    public lup(android.content.ComponentName componentName, java.lang.String str, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, int i) {
        this.a = componentName;
        this.b = str;
        this.c = ghIcon;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lup) {
            defpackage.lup lupVar = (defpackage.lup) obj;
            if (this.a.equals(lupVar.a) && this.b.equals(lupVar.b) && this.c.equals(lupVar.c) && this.d == lupVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final java.lang.String toString() {
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = this.c;
        return "MessagingAppMetadata{componentName=" + java.lang.String.valueOf(this.a) + ", appDisplayName=" + this.b + ", icon=" + java.lang.String.valueOf(ghIcon) + ", accentColor=" + this.d + "}";
    }

    public lup() {
        throw null;
    }
}
