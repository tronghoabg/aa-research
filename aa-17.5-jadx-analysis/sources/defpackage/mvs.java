package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class mvs {
    public final String a;
    public final GhIcon b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final aisq f;
    public final float g;
    public final afdr h;

    public /* synthetic */ mvs(String str, GhIcon ghIcon, boolean z, boolean z2, long j, aisq aisqVar, float f, afdr afdrVar, int i) {
        j = (i & 16) != 0 ? cjn.n() : j;
        aisqVar = (i & 32) != 0 ? null : aisqVar;
        f = (i & 64) != 0 ? Float.NaN : f;
        int i2 = i & 4;
        int i3 = i & 8;
        boolean z3 = i2 == 0;
        boolean z4 = i3 == 0;
        afdrVar.getClass();
        this.a = str;
        this.b = ghIcon;
        this.c = z | (!z3);
        this.d = z2 & z4;
        this.e = j;
        this.f = aisqVar;
        this.g = f;
        this.h = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvs)) {
            return false;
        }
        mvs mvsVar = (mvs) obj;
        return affa.f(this.a, mvsVar.a) && affa.f(this.b, mvsVar.b) && this.c == mvsVar.c && this.d == mvsVar.d && a.j(this.e, mvsVar.e) && affa.f(this.f, mvsVar.f) && dlj.c(this.g, mvsVar.g) && affa.f(this.h, mvsVar.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        GhIcon ghIcon = this.b;
        int iHashCode2 = ghIcon == null ? 0 : ghIcon.hashCode();
        int i = iHashCode * 31;
        boolean z = this.c;
        boolean z2 = this.d;
        long j = this.e;
        aisq aisqVar = this.f;
        int i2 = i + iHashCode2;
        return (((((((((((i2 * 31) + a.f(z)) * 31) + a.f(z2)) * 31) + a.g(j)) * 31) + (aisqVar != null ? a.g(aisqVar.c) : 0)) * 31) + Float.floatToIntBits(this.g)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        float f = this.g;
        return "CardAction(label=" + this.a + ", icon=" + this.b + ", enabled=" + this.c + ", active=" + this.d + ", tint=" + cjv.g(this.e) + ", duration=" + this.f + ", width=" + dlj.b(f) + ", clickAction=" + this.h + ")";
    }
}
