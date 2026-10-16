package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzd {
    public static final void a(java.util.List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            w(i, size);
        }
    }

    public static final void b(java.util.List list, int i, int i2) {
        if (i > i2) {
            z(i, i2);
        }
        if (i < 0) {
            x(i);
        }
        if (i2 > list.size()) {
            y(i2, list.size());
        }
    }

    public static final defpackage.bys c(java.lang.Object obj, defpackage.bve bveVar) {
        java.lang.Object objG = bveVar.g();
        if (objG == defpackage.bvd.a) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, defpackage.bxv.c);
            bveVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG;
        bwxVar.b(obj);
        return bwxVar;
    }

    public static final defpackage.bzh d(defpackage.bzh bzhVar) {
        if (true != (bzhVar instanceof defpackage.bzh)) {
            bzhVar = null;
        }
        if (bzhVar != null) {
            return bzhVar;
        }
        defpackage.bvg.a("Inconsistent composition");
        throw new defpackage.afap();
    }

    public static final boolean e(java.lang.Object obj, java.lang.Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final int f(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final defpackage.cej g() {
        return (defpackage.cej) defpackage.cer.i.j();
    }

    public static final defpackage.cej h(defpackage.cej cejVar) {
        if (cejVar instanceof defpackage.cfh) {
            defpackage.cfh cfhVar = (defpackage.cfh) cejVar;
            if (cfhVar.n == java.lang.Thread.currentThread().getId()) {
                cfhVar.l = null;
                return cejVar;
            }
        }
        if (cejVar instanceof defpackage.cfi) {
            defpackage.cfi cfiVar = (defpackage.cfi) cejVar;
            if (cfiVar.b == java.lang.Thread.currentThread().getId()) {
                cfiVar.a = null;
                return cejVar;
            }
        }
        defpackage.cej cejVarA = defpackage.cer.a(cejVar, null, false);
        cejVarA.w();
        return cejVarA;
    }

    public static final defpackage.ceg i(defpackage.affg affgVar) {
        defpackage.cer.k(defpackage.cer.a);
        synchronized (defpackage.cer.b) {
            defpackage.cer.f = defpackage.afga.aT(defpackage.cer.f, affgVar);
        }
        return new defpackage.cei(affgVar, 1);
    }

    public static final defpackage.ceg j(defpackage.affc affcVar) {
        synchronized (defpackage.cer.b) {
            defpackage.cer.g = defpackage.afga.aT(defpackage.cer.g, affcVar);
        }
        defpackage.cer.k(defpackage.cer.a);
        return new defpackage.cei(affcVar, 0);
    }

    public static final void k(defpackage.cej cejVar, defpackage.cej cejVar2, defpackage.affc affcVar) {
        if (cejVar != cejVar2) {
            defpackage.cer.i.k(cejVar);
            cejVar2.d();
        } else if (cejVar instanceof defpackage.cfh) {
            ((defpackage.cfh) cejVar).l = affcVar;
        } else if (cejVar instanceof defpackage.cfi) {
            ((defpackage.cfi) cejVar).a = affcVar;
        } else {
            java.util.Objects.toString(cejVar);
            throw new java.lang.IllegalStateException("Non-transparent snapshot was reused: ".concat(java.lang.String.valueOf(cejVar)));
        }
    }

    public static final void l() {
        boolean z;
        synchronized (defpackage.cer.b) {
            defpackage.aaw aawVar = defpackage.cer.h.g;
            z = false;
            if (aawVar != null && aawVar.c()) {
                z = true;
            }
        }
        if (z) {
            defpackage.cer.k(defpackage.cer.a);
        }
    }

    public static final defpackage.ced m(defpackage.affc affcVar, defpackage.affc affcVar2) {
        defpackage.ced cedVarA;
        defpackage.cej cejVarB = defpackage.cer.b();
        defpackage.ced cedVar = cejVarB instanceof defpackage.ced ? (defpackage.ced) cejVarB : null;
        if (cedVar == null || (cedVarA = cedVar.a(affcVar, affcVar2)) == null) {
            throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        return cedVarA;
    }

    public static /* synthetic */ void n() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static final defpackage.cjj o(defpackage.cjh cjhVar) {
        return new defpackage.cjj(cjhVar.a, cjhVar.b, cjhVar.c, cjhVar.d);
    }

    public static final java.lang.String p(float f) {
        if (java.lang.Float.isNaN(f)) {
            return "NaN";
        }
        if (java.lang.Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        float fPow = (float) java.lang.Math.pow(10.0d, 1.0d);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        return java.lang.String.valueOf(i / fPow);
    }

    public static final defpackage.cgf q(defpackage.cgf cgfVar, defpackage.cit citVar) {
        return cgfVar.a(new defpackage.ciu(citVar));
    }

    public static final defpackage.cgf r(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.cin(new defpackage.cip(affcVar)));
    }

    public static final defpackage.cgf s(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.chx(affcVar));
    }

    public static /* synthetic */ defpackage.cgf t(defpackage.cgf cgfVar, float f, defpackage.cld cldVar) {
        int iA = defpackage.dlr.a(f, 0.0f);
        int iA2 = defpackage.dlr.a(f, 0.0f);
        boolean z = true;
        boolean z2 = iA > 0;
        if (iA2 > 0) {
            z = z2;
        } else if (!z2) {
            return cgfVar;
        }
        return cgfVar.a(new cht(f, cldVar, z));
    }

    public static final defpackage.cgf u(defpackage.cgf cgfVar, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? cgfVar : defpackage.cjv.h(cgfVar, f, f2, 0.0f, 0.0f, 0.0f, null, false, 0, 1048572);
    }

    public static /* synthetic */ defpackage.cgf v(defpackage.cgf cgfVar, defpackage.cne cneVar, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, int i) {
        if ((i & 4) != 0) {
            cfuVar = defpackage.cfs.e;
        }
        defpackage.cfu cfuVar2 = cfuVar;
        if ((i & 8) != 0) {
            csrVar = defpackage.csq.e;
        }
        defpackage.csr csrVar2 = csrVar;
        boolean z = (i & 2) != 0;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return cgfVar.a(new defpackage.chp(cneVar, z, cfuVar2, csrVar2, f, ckeVar));
    }

    private static final void w(int i, int i2) {
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(i2, i, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void x(int i) {
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bm(i, "fromIndex (", ") is less than 0."));
    }

    private static final void y(int i, int i2) {
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(i2, i, "toIndex (", ") is more than than the list size (", ")"));
    }

    private static final void z(int i, int i2) {
        throw new java.lang.IllegalArgumentException(defpackage.a.bz(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
