package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ddz implements java.lang.Iterable, defpackage.dek, defpackage.afhc {
    public boolean a;
    public boolean b;
    public final defpackage.aau c;
    private java.util.Map d;

    public ddz() {
        long[] jArr = defpackage.aav.a;
        this.c = new defpackage.aau(6);
    }

    @Override // defpackage.dek
    public final void a(defpackage.dej dejVar, java.lang.Object obj) {
        if (!(obj instanceof defpackage.ddn) || !f(dejVar)) {
            this.c.m(dejVar, obj);
            return;
        }
        defpackage.aau aauVar = this.c;
        java.lang.Object objA = aauVar.a(dejVar);
        objA.getClass();
        defpackage.ddn ddnVar = (defpackage.ddn) objA;
        defpackage.ddn ddnVar2 = (defpackage.ddn) obj;
        java.lang.String str = ddnVar2.a;
        if (str == null) {
            str = ddnVar.a;
        }
        aauVar.m(dejVar, new defpackage.ddn(str, ddnVar2.b));
    }

    public final defpackage.ddz b() {
        defpackage.ddz ddzVar = new defpackage.ddz();
        ddzVar.a = this.a;
        ddzVar.b = this.b;
        ddzVar.c.l(this.c);
        return ddzVar;
    }

    public final java.lang.Object c(defpackage.dej dejVar) {
        java.lang.Object objA = this.c.a(dejVar);
        if (objA != null) {
            return objA;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(dejVar, "Key not present: ", " - consider getOrElse or getOrNull"));
    }

    public final java.lang.Object d(defpackage.dej dejVar, defpackage.afer aferVar) {
        java.lang.Object objA = this.c.a(dejVar);
        return objA == null ? aferVar.invoke() : objA;
    }

    public final void e(defpackage.ddz ddzVar) {
        int i;
        defpackage.aau aauVar = ddzVar.c;
        java.lang.Object[] objArr = aauVar.b;
        java.lang.Object[] objArr2 = aauVar.c;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        java.lang.Object obj = objArr[i5];
                        java.lang.Object obj2 = objArr2[i5];
                        defpackage.dej dejVar = (defpackage.dej) obj;
                        defpackage.aau aauVar2 = this.c;
                        java.lang.Object objA = aauVar2.a(dejVar);
                        dejVar.getClass();
                        java.lang.Object objInvoke = dejVar.b.invoke(objA, obj2);
                        if (objInvoke != null) {
                            aauVar2.m(dejVar, objInvoke);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ddz)) {
            return false;
        }
        defpackage.ddz ddzVar = (defpackage.ddz) obj;
        return defpackage.afga.f(this.c, ddzVar.c) && this.a == ddzVar.a && this.b == ddzVar.b;
    }

    public final boolean f(defpackage.dej dejVar) {
        return defpackage.aau.f(this.c, dejVar);
    }

    public final java.lang.Object g(defpackage.dej dejVar) {
        java.lang.Object objA = this.c.a(dejVar);
        if (objA == null) {
            return null;
        }
        return objA;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + (true != this.a ? 1237 : 1231)) * 31) + (true == this.b ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<defpackage.dej<?>, java.lang.Object>> iterator() {
        java.util.Map mapB = this.d;
        if (mapB == null) {
            mapB = this.c.b();
            this.d = mapB;
        }
        return mapB.entrySet().iterator();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[DONT_INVERT, PHI: r2
  0x0079: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[LOOP:0: B:12:0x0031->B:23:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[EDGE_INSN: B:27:0x007e->B:24:0x007e BREAK  A[LOOP:0: B:12:0x0031->B:23:0x007b], SYNTHETIC] */
    public final java.lang.String toString() {
        java.lang.String str;
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.b) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        defpackage.aau aauVar = this.c;
        java.lang.Object[] objArr = aauVar.b;
        java.lang.Object[] objArr2 = aauVar.c;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            java.lang.Object obj = objArr[i5];
                            java.lang.Object obj2 = objArr2[i5];
                            sb.append(str);
                            sb.append(((defpackage.dej) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return defpackage.dbc.f(this) + "{ " + ((java.lang.Object) sb) + " }";
    }
}
