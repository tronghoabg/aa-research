package defpackage;

import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public final class thk {
    public final String a;
    public final IconCompat b;
    public final IconCompat c;
    public final Object d;
    public final String e;
    public final afdr f;

    public /* synthetic */ thk(String str, IconCompat iconCompat, IconCompat iconCompat2, Object obj, afdr afdrVar, int i) {
        afdrVar = (i & 32) != 0 ? new nqy(15) : afdrVar;
        int i2 = i & 16;
        int i3 = i & 4;
        int i4 = i & 2;
        String str2 = i2 != 0 ? str : null;
        iconCompat2 = i3 != 0 ? null : iconCompat2;
        iconCompat = i4 != 0 ? null : iconCompat;
        str2.getClass();
        afdrVar.getClass();
        this.a = str;
        this.b = iconCompat;
        this.c = iconCompat2;
        this.d = obj;
        this.e = str2;
        this.f = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thk)) {
            return false;
        }
        thk thkVar = (thk) obj;
        return affa.f(this.a, thkVar.a) && affa.f(this.b, thkVar.b) && affa.f(this.c, thkVar.c) && affa.f(this.d, thkVar.d) && affa.f(this.e, thkVar.e) && affa.f(this.f, thkVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        IconCompat iconCompat = this.b;
        int iHashCode2 = (iHashCode + (iconCompat == null ? 0 : iconCompat.hashCode())) * 31;
        IconCompat iconCompat2 = this.c;
        return ((((((iHashCode2 + (iconCompat2 != null ? iconCompat2.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "TabModel(title=" + this.a + ", inactiveIcon=" + this.b + ", activeIcon=" + this.c + ", content=" + this.d + ", contentId=" + this.e + ", onActiveAction=" + this.f + ")";
    }
}
