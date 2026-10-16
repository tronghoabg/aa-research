package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zol {
    public final zpd a;
    private final int b;
    private final String c;

    public zol(int i, String str, zpd zpdVar) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        }
        if (str == null || zpdVar == null) {
            throw null;
        }
        this.b = i;
        this.c = str;
        this.a = zpdVar;
    }

    public final int a() {
        return this.b + this.c.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zol)) {
            return false;
        }
        zol zolVar = (zol) obj;
        return this.c.equals(zolVar.c) && this.b == zolVar.b && this.a.equals(zolVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.a});
    }

    public final String toString() {
        return "PhoneNumberMatch [" + this.b + "," + a() + ") " + this.c;
    }
}
