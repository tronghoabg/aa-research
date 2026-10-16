package defpackage;

import android.graphics.Bitmap;
import j$.time.Instant;

/* loaded from: classes2.dex */
public final class hpy {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final Double f;
    private final Double g;
    private final String h;
    private final Instant i;
    private final Instant j;
    private final String k;
    private final Bitmap l;

    public hpy(String str, String str2, String str3, int i, String str4, Double d, Double d2, String str5, Instant instant, Instant instant2, String str6, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = d;
        this.g = d2;
        this.h = str5;
        this.i = instant;
        this.j = instant2;
        this.k = str6;
        this.l = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpy)) {
            return false;
        }
        hpy hpyVar = (hpy) obj;
        return affa.f(this.a, hpyVar.a) && affa.f(this.b, hpyVar.b) && affa.f(this.c, hpyVar.c) && this.d == hpyVar.d && affa.f(this.e, hpyVar.e) && affa.f(this.f, hpyVar.f) && affa.f(this.g, hpyVar.g) && affa.f(this.h, hpyVar.h) && affa.f(this.i, hpyVar.i) && affa.f(this.j, hpyVar.j) && affa.f(this.k, hpyVar.k) && affa.f(this.l, hpyVar.l);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.e;
        int iHashCode2 = ((((iHashCode * 31) + this.d) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.g;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant = this.i;
        int iHashCode6 = (iHashCode5 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.j;
        int iHashCode7 = (iHashCode6 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Bitmap bitmap = this.l;
        return iHashCode8 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "ChipContent(title=" + this.a + ", subtitle=" + this.b + ", locationName=" + this.c + ", elementType=" + this.d + ", source=" + this.e + ", latitude=" + this.f + ", longitude=" + this.g + ", sourceL1DataId=" + this.h + ", startTime=" + this.i + ", endTime=" + this.j + ", eventTitle=" + this.k + ", image=" + this.l + ")";
    }
}
