package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class luj implements Serializable {
    public final ComponentName a;
    public final String b;
    public final GhIcon c;
    public final int d;

    public luj(ComponentName componentName, String str, GhIcon ghIcon, int i) {
        this.a = componentName;
        this.b = str;
        this.c = ghIcon;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luj) {
            luj lujVar = (luj) obj;
            if (this.a.equals(lujVar.a) && this.b.equals(lujVar.b) && this.c.equals(lujVar.c) && this.d == lujVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        GhIcon ghIcon = this.c;
        return "MessagingAppMetadata{componentName=" + String.valueOf(this.a) + ", appDisplayName=" + this.b + ", icon=" + String.valueOf(ghIcon) + ", accentColor=" + this.d + "}";
    }

    public luj() {
        throw null;
    }
}
