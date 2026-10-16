package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class tzv {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/indoor/model/IndoorBuilding");
    public final tob b;
    public final yfq c;
    public final boolean d;
    public final int e;
    public final toh f;
    public final tzv g;

    public tzv(tob tobVar, yfq yfqVar, int i, boolean z, toh tohVar, tzv tzvVar) {
        this.b = tobVar;
        this.c = yfqVar;
        this.e = i;
        this.d = z;
        this.f = tohVar;
        this.g = tzvVar;
    }

    public final tzx a() {
        return b(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tzx b(int i) {
        if (i < 0) {
            return null;
        }
        yfq yfqVar = this.c;
        if (i >= ((yls) yfqVar).c) {
            return null;
        }
        return (tzx) yfqVar.get(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tzv)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        tzv tzvVar = (tzv) obj;
        return Objects.equals(this.f, tzvVar.f) && Objects.equals(this.c, tzvVar.c) && Objects.equals(this.b, tzvVar.b) && this.e == tzvVar.e && this.d == tzvVar.d;
    }

    public final int hashCode() {
        return Objects.hash(this.f, this.c, Integer.valueOf(this.e), this.b, Boolean.valueOf(this.d));
    }

    public final String toString() {
        return "[Building: " + this.b.f() + "]";
    }
}
