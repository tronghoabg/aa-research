package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class omk {
    public final GhIcon a;
    public final boolean b;

    public omk(GhIcon ghIcon, boolean z) {
        this.a = ghIcon;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof omk) {
            omk omkVar = (omk) obj;
            GhIcon ghIcon = this.a;
            if (ghIcon != null ? ghIcon.equals(omkVar.a) : omkVar.a == null) {
                if (this.b == omkVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        GhIcon ghIcon = this.a;
        return (true != this.b ? 1237 : 1231) ^ (((ghIcon == null ? 0 : ghIcon.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LargeIconState{icon=" + String.valueOf(this.a) + ", resourceLoading=" + this.b + "}";
    }

    public omk() {
        throw null;
    }
}
