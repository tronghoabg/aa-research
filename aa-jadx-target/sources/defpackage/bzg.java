package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class bzg {
    public static final void a(defpackage.aau aauVar, java.lang.Object obj, java.lang.Object obj2) {
        int iG = aauVar.g(obj);
        boolean z = iG < 0;
        java.lang.Object obj3 = z ? null : aauVar.c[iG];
        if (obj3 != null) {
            if (obj3 instanceof defpackage.aaw) {
                ((defpackage.aaw) obj3).j(obj2);
            } else if (obj3 != obj2) {
                defpackage.aaw aawVar = new defpackage.aaw(6);
                aawVar.j(obj3);
                aawVar.j(obj2);
                obj2 = aawVar;
            }
            obj2 = obj3;
        }
        if (!z) {
            aauVar.c[iG] = obj2;
            return;
        }
        int i = ~iG;
        aauVar.b[i] = obj;
        aauVar.c[i] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public static final void b(defpackage.aau aauVar, java.lang.Object obj) {
        int i;
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
                        java.lang.Object obj2 = aauVar.b[i5];
                        java.lang.Object obj3 = aauVar.c[i5];
                        if (obj3 instanceof defpackage.aaw) {
                            obj3.getClass();
                            defpackage.aaw aawVar = (defpackage.aaw) obj3;
                            aawVar.l(obj);
                            if (aawVar.b()) {
                                aauVar.j(i5);
                            }
                        } else if (obj3 == obj) {
                            aauVar.j(i5);
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

    public static final boolean c(defpackage.aau aauVar, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objA = aauVar.a(obj);
        if (objA == null) {
            return false;
        }
        if (!(objA instanceof defpackage.aaw)) {
            if (!defpackage.afga.f(objA, obj2)) {
                return false;
            }
            aauVar.i(obj);
            return true;
        }
        defpackage.aaw aawVar = (defpackage.aaw) objA;
        boolean zL = aawVar.l(obj2);
        if (!zL || !aawVar.b()) {
            return zL;
        }
        aauVar.i(obj);
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
