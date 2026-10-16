package defpackage;

import android.app.PendingIntent;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class ncd {
    public final GhIcon a;
    public final CharSequence b;
    public final CharSequence c;
    public final int d;
    public final PendingIntent e;

    public ncd(GhIcon ghIcon, CharSequence charSequence, CharSequence charSequence2, int i, PendingIntent pendingIntent) {
        this.a = ghIcon;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = i;
        this.e = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncd)) {
            return false;
        }
        ncd ncdVar = (ncd) obj;
        return affa.f(this.a, ncdVar.a) && affa.f(this.b, ncdVar.b) && affa.f(this.c, ncdVar.c) && this.d == ncdVar.d && affa.f(this.e, ncdVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        CharSequence charSequence = this.c;
        return (((((iHashCode * 31) + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.d) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "NavigationSuggestionItem(icon=" + this.a + ", name=" + ((Object) this.b) + ", subText=" + ((Object) this.c) + ", subTextColor=" + this.d + ", pendingIntent=" + this.e + ")";
    }
}
