package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class tly {
    public final String a;
    public final String b;
    public final Drawable c;
    public final String d;
    public final int e;
    public final String f;
    public final Drawable g;
    public final Integer h;
    public final Long i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final tlx m;
    public final tlx n;
    public final tlx o;

    public tly(String str, String str2, Drawable drawable, String str3, int i, String str4, Drawable drawable2, Integer num, Long l, Boolean bool, Boolean bool2, Boolean bool3, tlx tlxVar, tlx tlxVar2, tlx tlxVar3) {
        str2.getClass();
        drawable.getClass();
        this.a = str;
        this.b = str2;
        this.c = drawable;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = drawable2;
        this.h = num;
        this.i = l;
        this.j = bool;
        this.k = bool2;
        this.l = bool3;
        this.m = tlxVar;
        this.n = tlxVar2;
        this.o = tlxVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tly)) {
            return false;
        }
        tly tlyVar = (tly) obj;
        return affa.f(this.a, tlyVar.a) && affa.f(this.b, tlyVar.b) && affa.f(this.c, tlyVar.c) && affa.f(this.d, tlyVar.d) && this.e == tlyVar.e && affa.f(this.f, tlyVar.f) && affa.f(this.g, tlyVar.g) && affa.f(this.h, tlyVar.h) && affa.f(this.i, tlyVar.i) && affa.f(this.j, tlyVar.j) && affa.f(this.k, tlyVar.k) && affa.f(this.l, tlyVar.l) && affa.f(this.m, tlyVar.m) && affa.f(this.n, tlyVar.n) && affa.f(this.o, tlyVar.o);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        String str = this.f;
        int iHashCode2 = ((((iHashCode * 31) + this.e) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.g;
        int iHashCode3 = (((((((((((iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31;
        tlx tlxVar = this.m;
        int iHashCode4 = (iHashCode3 + (tlxVar == null ? 0 : tlxVar.hashCode())) * 31;
        tlx tlxVar2 = this.n;
        int iHashCode5 = (iHashCode4 + (tlxVar2 == null ? 0 : tlxVar2.hashCode())) * 31;
        tlx tlxVar3 = this.o;
        return iHashCode5 + (tlxVar3 != null ? tlxVar3.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteNotification(key=" + this.a + ", title=" + this.b + ", smallIcon=" + this.c + ", appName=" + this.d + ", importance=" + this.e + ", text=" + this.f + ", largeIcon=" + this.g + ", color=" + this.h + ", timestamp=" + this.i + ", showTimestamp=" + this.j + ", onlyAlertOnce=" + this.k + ", ongoing=" + this.l + ", action1=" + this.m + ", action2=" + this.n + ", action3=" + this.o + ")";
    }
}
