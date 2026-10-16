package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class azi {
    public final java.util.List a;
    public defpackage.cwu b;
    private int c;
    private final java.util.List d;
    private final java.util.List e;
    private final java.util.List f;
    private final java.util.List g;
    private final defpackage.aau h;
    private final defpackage.aaw i;
    private defpackage.sns j;

    public azi() {
        long[] jArr = defpackage.aav.a;
        this.h = new defpackage.aau(6);
        defpackage.aaw aawVar = defpackage.aax.a;
        this.i = new defpackage.aaw(6);
        this.d = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.a = new java.util.ArrayList();
    }

    static /* synthetic */ void d(defpackage.azi aziVar, defpackage.axp axpVar, int i, boolean z) {
        java.lang.Object objA = aziVar.h.a(axpVar.e);
        objA.getClass();
        k(axpVar, i, (defpackage.azg) objA, z);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[LOOP:0: B:7:0x0013->B:23:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005a A[EDGE_INSN: B:27:0x005a->B:24:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:23:0x0057], SYNTHETIC] */
    private final void f() {
        int i;
        defpackage.aau aauVar = this.h;
        if (aauVar.e()) {
            java.lang.Object[] objArr = aauVar.c;
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
                            if ((255 & j) < 128) {
                                for (defpackage.azf azfVar : ((defpackage.azg) objArr[(i2 << 3) + i4]).a) {
                                    if (azfVar != null) {
                                        azfVar.c();
                                    }
                                }
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            aauVar.k();
        }
    }

    private final void g(java.lang.Object obj) {
        defpackage.azf[] azfVarArr;
        defpackage.azg azgVar = (defpackage.azg) this.h.i(obj);
        if (azgVar == null || (azfVarArr = azgVar.a) == null) {
            return;
        }
        for (defpackage.azf azfVar : azfVarArr) {
            if (azfVar != null) {
                azfVar.c();
            }
        }
    }

    private final void h(defpackage.axp axpVar, boolean z) {
        defpackage.afd afdVar;
        java.lang.Object objA = this.h.a(axpVar.e);
        objA.getClass();
        defpackage.azf[] azfVarArr = ((defpackage.azg) objA).a;
        int length = azfVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            defpackage.azf azfVar = azfVarArr[i];
            int i3 = i2 + 1;
            if (azfVar != null) {
                long jB = axpVar.b(i2);
                long j = azfVar.h;
                if (j != 9223372034707292159L && j != jB && (afdVar = azfVar.d) != null) {
                    long jC = defpackage.dlw.c(azfVar.a(), defpackage.dlw.c(jB, j));
                    azfVar.g(jC);
                    azfVar.f(true);
                    azfVar.f = z;
                    ahoc.d(azfVar.a, (defpackage.afdo) null, 0, new defpackage.aze(azfVar, afdVar, jC, null), 3);
                }
                azfVar.h = jB;
            }
            i++;
            i2 = i3;
        }
    }

    private static final int i(defpackage.axp axpVar, boolean z) {
        long jB = axpVar.b(0);
        return (int) (!z ? 4294967295L & jB : jB >> 32);
    }

    private static final boolean j(defpackage.axp axpVar) {
        java.util.List list = axpVar.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object objG = ((defpackage.cux) list.get(i)).g();
            if ((objG instanceof defpackage.ayt ? (defpackage.ayt) objG : null) != null) {
                return true;
            }
        }
        return false;
    }

    private static final void k(defpackage.axp axpVar, int i, defpackage.azg azgVar, boolean z) {
        int i2 = 0;
        long jB = axpVar.b(0);
        long jF = z ? defpackage.dlw.f(jB, 0, i, 1) : defpackage.dlw.f(jB, i, 0, 2);
        defpackage.azf[] azfVarArr = azgVar.a;
        int length = azfVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            defpackage.azf azfVar = azfVarArr[i2];
            int i4 = i3 + 1;
            if (azfVar != null) {
                azfVar.h = defpackage.dlw.d(jF, defpackage.dlw.c(axpVar.b(i3), jB));
            }
            i2++;
            i3 = i4;
        }
    }

    private static final int l(int[] iArr, defpackage.axp axpVar, boolean z) {
        int iMax = 0;
        for (int i = 0; i <= 0; i++) {
            int iA = iArr[i] + defpackage.azr.a(axpVar, z);
            iArr[i] = iA;
            iMax = java.lang.Math.max(iMax, iA);
        }
        return iMax;
    }

    public final long a() {
        java.util.List list = this.a;
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            defpackage.azf azfVar = (defpackage.azf) list.get(i);
            defpackage.cmq cmqVar = azfVar.k;
            if (cmqVar != null) {
                int iMax = java.lang.Math.max((int) (j >> 32), ((int) (azfVar.h >> 32)) + ((int) (cmqVar.n >> 32)));
                long jMax = ((long) java.lang.Math.max((int) (j & 4294967295L), ((int) (azfVar.h & 4294967295L)) + ((int) (cmqVar.n & 4294967295L)))) & 4294967295L;
                j = jMax | (((long) iMax) << 32);
            }
        }
        return j;
    }

    public final defpackage.azf b(java.lang.Object obj, int i) {
        defpackage.azf[] azfVarArr;
        defpackage.azg azgVar = (defpackage.azg) this.h.a(obj);
        if (azgVar == null || (azfVarArr = azgVar.a) == null) {
            return null;
        }
        return azfVarArr[i];
    }

    public final void c() {
        f();
        this.j = null;
        this.c = -1;
    }

    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v20 ??, new type: axp
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v20 ??, new type: axp
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void e(int r46, int r47, int r48, java.util.List r49, defpackage.sns r50, defpackage.azs r51, boolean r52, boolean r53, boolean r54, int r55, int r56, aiuw r57, defpackage.cjq r58, boolean r59) {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azi.e(int, int, int, java.util.List, sns, azs, boolean, boolean, boolean, int, int, aiuw, cjq, boolean):void");
    }
}
