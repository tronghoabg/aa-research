package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akgr {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public akgr(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            throw new java.lang.IllegalArgumentException("Unknown mode: " + c);
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    private final long d(defpackage.akdd akddVar, long j) {
        int i = this.c;
        if (i >= 0) {
            return ((defpackage.akdy) akddVar).k.h(j, i);
        }
        defpackage.akdy akdyVar = (defpackage.akdy) akddVar;
        return akdyVar.k.e(akdyVar.m.e(akdyVar.k.h(j, 1), 1), i);
    }

    public final long a(defpackage.akdd akddVar, long j) {
        try {
            return d(akddVar, j);
        } catch (java.lang.IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                defpackage.akdy akdyVar = (defpackage.akdy) akddVar;
                if (akdyVar.n.t(j)) {
                    return d(akddVar, j);
                }
                j = akdyVar.n.e(j, 1);
            }
        }
    }

    public final long b(defpackage.akdd akddVar, long j) {
        try {
            return d(akddVar, j);
        } catch (java.lang.IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                defpackage.akdy akdyVar = (defpackage.akdy) akddVar;
                if (akdyVar.n.t(j)) {
                    return d(akddVar, j);
                }
                j = akdyVar.n.e(j, -1);
            }
        }
    }

    public final long c(defpackage.akdd akddVar, long j) {
        defpackage.akdy akdyVar = (defpackage.akdy) akddVar;
        int iA = this.d - akdyVar.j.a(j);
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
        return akdyVar.j.e(j, iA);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akgr) {
            defpackage.akgr akgrVar = (defpackage.akgr) obj;
            if (this.a == akgrVar.a && this.b == akgrVar.b && this.c == akgrVar.c && this.d == akgrVar.d && this.e == akgrVar.e && this.f == akgrVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Character.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Boolean.valueOf(this.e), java.lang.Integer.valueOf(this.f)});
    }

    public final java.lang.String toString() {
        return "[OfYear]\nMode: " + this.a + "\nMonthOfYear: " + this.b + "\nDayOfMonth: " + this.c + "\nDayOfWeek: " + this.d + "\nAdvanceDayOfWeek: " + this.e + "\nMillisOfDay: " + this.f + "\n";
    }
}
