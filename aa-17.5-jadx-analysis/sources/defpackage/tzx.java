package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class tzx {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/indoor/model/IndoorLevel");
    public static final tob b = new tob(0, 0);
    public final yfq c;
    public final String d;
    public final String e;
    public final tzy f;
    private final int g;
    private final tpk h;

    public tzx(tob tobVar, yfq yfqVar, String str, String str2, int i, int i2, tpk tpkVar) {
        this.c = yfqVar;
        this.d = str;
        this.e = str2;
        this.g = i;
        this.f = new tzy(tobVar, i2);
        this.h = tpkVar;
    }

    public final tob a() {
        return this.f.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tzx)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        tzx tzxVar = (tzx) obj;
        return yrm.W(this.c, tzxVar.c) && this.d.equals(tzxVar.d) && this.e.equals(tzxVar.e) && this.g == tzxVar.g && this.f.equals(tzxVar.f) && Objects.equals(this.h, tzxVar.h);
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Integer.valueOf(this.g), this.f, this.h);
    }

    public final String toString() {
        return "[Level: " + this.f.toString() + "]";
    }
}
