package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class akfr {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public akfr(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            throw new IllegalArgumentException("Unknown mode: " + c);
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    private final long d(akcd akcdVar, long j) {
        int i = this.c;
        if (i >= 0) {
            return ((akcy) akcdVar).k.h(j, i);
        }
        akcy akcyVar = (akcy) akcdVar;
        return akcyVar.k.e(akcyVar.m.e(akcyVar.k.h(j, 1), 1), i);
    }

    public final long a(akcd akcdVar, long j) {
        try {
            return d(akcdVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                akcy akcyVar = (akcy) akcdVar;
                if (akcyVar.n.t(j)) {
                    return this.d(akcdVar, j);
                }
                j = akcyVar.n.e(j, 1);
            }
        }
    }

    public final long b(akcd akcdVar, long j) {
        try {
            return d(akcdVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                akcy akcyVar = (akcy) akcdVar;
                if (akcyVar.n.t(j)) {
                    return this.d(akcdVar, j);
                }
                j = akcyVar.n.e(j, -1);
            }
        }
    }

    public final long c(akcd akcdVar, long j) {
        akcy akcyVar = (akcy) akcdVar;
        int iA = this.d - akcyVar.j.a(j);
        if (iA == 0) {
            return j;
        }
        if (this.e) {
            if (iA < 0) {
                iA += 7;
            }
        } else if (iA > 0) {
            iA -= 7;
        }
        return akcyVar.j.e(j, iA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akfr) {
            akfr akfrVar = (akfr) obj;
            if (this.a == akfrVar.a && this.b == akfrVar.b && this.c == akfrVar.c && this.d == akfrVar.d && this.e == akfrVar.e && this.f == akfrVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Character.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        return "[OfYear]\nMode: " + this.a + "\nMonthOfYear: " + this.b + "\nDayOfMonth: " + this.c + "\nDayOfWeek: " + this.d + "\nAdvanceDayOfWeek: " + this.e + "\nMillisOfDay: " + this.f + "\n";
    }
}
