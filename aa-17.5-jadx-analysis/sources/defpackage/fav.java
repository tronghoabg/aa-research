package defpackage;

/* loaded from: classes2.dex */
public final class fav {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r4
  0x0063: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v3 int), (r4v3 int), (r4v3 int) binds: [B:6:0x002a, B:8:0x0032, B:10:0x003a, B:16:0x004e, B:18:0x0056, B:20:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fav(java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.String r5, int r6) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r2.toUpperCase(r1)
            r1.getClass()
            java.lang.String r2 = "INT"
            r3 = 0
            boolean r2 = defpackage.afyh.u(r1, r2, r3)
            if (r2 == 0) goto L23
            r1 = 3
            goto L64
        L23:
            java.lang.String r2 = "CHAR"
            boolean r2 = defpackage.afyh.u(r1, r2, r3)
            r4 = 2
            if (r2 != 0) goto L63
            java.lang.String r2 = "CLOB"
            boolean r2 = defpackage.afyh.u(r1, r2, r3)
            if (r2 != 0) goto L63
            java.lang.String r2 = "TEXT"
            boolean r2 = defpackage.afyh.u(r1, r2, r3)
            if (r2 == 0) goto L3d
            goto L63
        L3d:
            java.lang.String r2 = "BLOB"
            boolean r2 = defpackage.afyh.u(r1, r2, r3)
            if (r2 == 0) goto L47
            r1 = 5
            goto L64
        L47:
            java.lang.String r2 = "REAL"
            boolean r2 = defpackage.afyh.u(r1, r2, r3)
            r4 = 4
            if (r2 != 0) goto L63
            java.lang.String r2 = "FLOA"
            boolean r2 = defpackage.afyh.u(r1, r2, r3)
            if (r2 != 0) goto L63
            java.lang.String r2 = "DOUB"
            boolean r1 = defpackage.afyh.u(r1, r2, r3)
            if (r1 == 0) goto L61
            goto L63
        L61:
            r1 = 1
            goto L64
        L63:
            r1 = r4
        L64:
            r0.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fav.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String, int):void");
    }

    public final boolean a() {
        return this.d > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fav)) {
            return false;
        }
        fav favVar = (fav) obj;
        if (a() != favVar.a() || !affa.f(this.a, favVar.a) || this.c != favVar.c) {
            return false;
        }
        String str = this.e;
        String str2 = favVar.e;
        int i = this.f;
        if (i == 1 && favVar.f == 2 && str != null && !crt.o(str, str2)) {
            return false;
        }
        if (i == 2 && favVar.f == 1 && str2 != null && !crt.o(str2, str)) {
            return false;
        }
        if (i == favVar.f) {
            if (str != null) {
                if (!crt.o(str, str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return this.g == favVar.g;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return afyh.H(afyh.Q(sb.toString()));
    }
}
