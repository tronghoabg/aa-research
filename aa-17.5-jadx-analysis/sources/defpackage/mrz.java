package defpackage;

import android.content.Intent;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class mrz {
    public final Intent a;
    private final GhIcon b;
    private final CharSequence c;

    public mrz(GhIcon ghIcon, CharSequence charSequence, Intent intent) {
        this.b = ghIcon;
        if (charSequence == null) {
            throw new NullPointerException("Null name");
        }
        this.c = charSequence;
        if (intent == null) {
            throw new NullPointerException("Null launchTarget");
        }
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mrz) {
            mrz mrzVar = (mrz) obj;
            if (this.b.equals(mrzVar.b) && this.c.equals(mrzVar.c) && this.a.equals(mrzVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        return this.a.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Intent intent = this.a;
        return "LauncherItem{appIcon=" + this.b.toString() + ", name=" + ((String) this.c) + ", launchTarget=" + intent.toString() + "}";
    }

    public mrz() {
        throw null;
    }
}
