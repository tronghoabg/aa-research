package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class fzp implements hju {
    public final Drawable a;
    public final Uri b;
    public final hjw c;

    public fzp(Drawable drawable, Uri uri, hjw hjwVar) {
        this.a = drawable;
        this.b = uri;
        this.c = hjwVar;
        if (drawable != null && uri != null) {
            throw new IllegalStateException(a.bt(uri, drawable, "imageUri and drawable cannot both be set. Drawable: ", ", imageUri: "));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzp)) {
            return false;
        }
        fzp fzpVar = (fzp) obj;
        return affa.f(this.a, fzpVar.a) && affa.f(this.b, fzpVar.b) && affa.f(this.c, fzpVar.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        Uri uri = this.b;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        int i = iHashCode * 31;
        hjw hjwVar = this.c;
        return ((i + iHashCode2) * 31) + (hjwVar != null ? hjwVar.hashCode() : 0);
    }

    public final String toString() {
        return "CarImageUiModel(drawable=" + this.a + ", imageUri=" + this.b + ", tint=" + this.c + ")";
    }

    public fzp() {
        this(null, null, null);
    }
}
