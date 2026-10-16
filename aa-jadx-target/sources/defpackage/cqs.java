package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cqs extends defpackage.cqt {
    public final defpackage.cge a;
    private defpackage.ctc g;
    private defpackage.cqu h;
    private boolean i;
    public final ajot c = new ajot((char[]) null, (char[]) null);
    private final defpackage.zz f = new defpackage.zz(2);
    public boolean b = true;
    private boolean j = true;

    public cqs(defpackage.cge cgeVar) {
        this.a = cgeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [bzc] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [bzc] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [cge] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cge] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void a() {
        defpackage.bzc bzcVar = this.d;
        java.lang.Object[] objArr = bzcVar.a;
        int i = bzcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cqs) objArr[i2]).a();
        }
        ?? O = this.a;
        ?? bzcVar2 = 0;
        while (O != 0) {
            if (O instanceof defpackage.cza) {
                ((defpackage.cza) O).o();
            } else if ((O.r & 16) != 0 && (O instanceof defpackage.cwo)) {
                defpackage.cge cgeVar = ((defpackage.cwo) O).C;
                int i3 = 0;
                bzcVar2 = bzcVar2;
                O = O;
                while (cgeVar != null) {
                    if ((cgeVar.r & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            bzcVar2 = bzcVar2;
                            O = cgeVar;
                        } else {
                            if (bzcVar2 == 0) {
                                bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                            }
                            if (O != 0) {
                                bzcVar2.n(O);
                            }
                            bzcVar2.n(cgeVar);
                            O = 0;
                        }
                    }
                    cgeVar = cgeVar.u;
                    bzcVar2 = bzcVar2;
                    O = O;
                }
                if (i3 != 1) {
                }
            }
            O = defpackage.cjv.o(bzcVar2);
        }
    }

    public final void b(long j, defpackage.aan aanVar) {
        ajot ajotVar = this.c;
        if (ajotVar.q(j) && !aanVar.e(this)) {
            ajotVar.s(j);
            this.f.h(j);
        }
        defpackage.bzc bzcVar = this.d;
        java.lang.Object[] objArr = bzcVar.a;
        int i = bzcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cqs) objArr[i2]).b(j, aanVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cqt
    public final boolean c(defpackage.zz zzVar, defpackage.ctc ctcVar, defpackage.xh xhVar, boolean z) {
        java.lang.Object obj;
        int i;
        int i2;
        super.c(zzVar, ctcVar, xhVar, z);
        ?? O = this.a;
        boolean z2 = true;
        if (O.A) {
            ?? bzcVar = 0;
            while (O != 0) {
                if (O instanceof defpackage.cza) {
                    this.g = defpackage.cjv.s((defpackage.cza) O, 16);
                } else if ((O.r & 16) != 0 && (O instanceof defpackage.cwo)) {
                    defpackage.cge cgeVar = ((defpackage.cwo) O).C;
                    int i3 = 0;
                    while (cgeVar != null) {
                        if ((cgeVar.r & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                O = O;
                                bzcVar = bzcVar;
                                bzcVar = bzcVar;
                                O = cgeVar;
                            } else {
                                if (bzcVar == 0) {
                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                }
                                if (O != 0) {
                                    bzcVar.n(O);
                                }
                                bzcVar.n(cgeVar);
                                O = 0;
                            }
                        } else {
                            O = O;
                            bzcVar = bzcVar;
                        }
                        cgeVar = cgeVar.u;
                        O = O;
                        bzcVar = bzcVar;
                    }
                    if (i3 != 1) {
                        O = O;
                        bzcVar = bzcVar;
                    } else {
                        O = O;
                        bzcVar = bzcVar;
                    }
                }
                O = defpackage.cjv.o(bzcVar);
            }
            if (this.g != null) {
                int i4 = 0;
                for (int iB = zzVar.b(); i4 < iB; iB = iB) {
                    long jC = zzVar.c(i4);
                    defpackage.crd crdVar = (defpackage.crd) zzVar.e(i4);
                    if (this.c.q(jC)) {
                        long j = crdVar.g;
                        long j2 = crdVar.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(crdVar.a().size());
                            java.util.List listA = crdVar.a();
                            int size = listA.size();
                            int i5 = 0;
                            while (i5 < size) {
                                int i6 = i5;
                                defpackage.cqm cqmVar = (defpackage.cqm) listA.get(i5);
                                java.util.List list = listA;
                                int i7 = i4;
                                long j3 = cqmVar.b;
                                long j4 = jC;
                                int i8 = size;
                                if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = cqmVar.a;
                                    defpackage.ctc ctcVar2 = this.g;
                                    ctcVar2.getClass();
                                    arrayList.add(new defpackage.cqm(j5, ctcVar2.i(ctcVar, j3), cqmVar.c, cqmVar.d, cqmVar.e));
                                }
                                i5 = i6 + 1;
                                size = i8;
                                listA = list;
                                i4 = i7;
                                jC = j4;
                            }
                            i2 = i4;
                            long j6 = jC;
                            defpackage.zz zzVar2 = this.f;
                            defpackage.ctc ctcVar3 = this.g;
                            ctcVar3.getClass();
                            long jI = ctcVar3.i(ctcVar, j);
                            defpackage.ctc ctcVar4 = this.g;
                            ctcVar4.getClass();
                            defpackage.crd crdVar2 = new defpackage.crd(crdVar.a, crdVar.b, ctcVar4.i(ctcVar, j2), crdVar.d, crdVar.e, crdVar.f, jI, crdVar.h, crdVar.i, arrayList, crdVar.j, crdVar.k, crdVar.l, crdVar.m);
                            defpackage.crd crdVar3 = crdVar.n;
                            if (crdVar3 == null) {
                                crdVar3 = crdVar;
                            }
                            crdVar2.n = crdVar3;
                            defpackage.crd crdVar4 = crdVar.n;
                            if (crdVar4 != null) {
                                crdVar = crdVar4;
                            }
                            crdVar2.n = crdVar;
                            zzVar2.g(j6, crdVar2);
                        } else {
                            i2 = i4;
                        }
                    } else {
                        i2 = i4;
                    }
                    i4 = i2 + 1;
                    z2 = z2;
                }
                boolean z3 = z2;
                defpackage.zz zzVar3 = this.f;
                boolean zJ = zzVar3.j();
                ajot ajotVar = this.c;
                if (zJ) {
                    ajotVar.a = 0;
                    this.d.g();
                    return z3;
                }
                int i9 = ajotVar.a;
                while (true) {
                    i9--;
                    if (i9 < 0) {
                        break;
                    }
                    if (!zzVar.i(((long[]) ajotVar.b)[i9]) && i9 < (i = ajotVar.a)) {
                        int i10 = i - 1;
                        int i11 = i9;
                        while (i11 < i10) {
                            int i12 = i11 + 1;
                            long[] jArr = (long[]) ajotVar.b;
                            jArr[i11] = jArr[i12];
                            i11 = i12;
                        }
                        ajotVar.a--;
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(zzVar3.b());
                int iB2 = zzVar3.b();
                for (int i13 = 0; i13 < iB2; i13++) {
                    arrayList2.add(zzVar3.e(i13));
                }
                defpackage.cqu cquVar = new defpackage.cqu(arrayList2, xhVar);
                java.util.List list2 = cquVar.a;
                int size2 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size2) {
                        obj = null;
                        break;
                    }
                    java.lang.Object obj2 = list2.get(i14);
                    if (xhVar.b(((defpackage.crd) obj2).a)) {
                        obj = obj2;
                        break;
                    }
                    i14++;
                }
                defpackage.crd crdVar5 = (defpackage.crd) obj;
                if (crdVar5 != null) {
                    if (!z) {
                        this.b = false;
                    } else if (!this.b && (crdVar5.d || crdVar5.h || xhVar.c() == 5)) {
                        defpackage.ctc ctcVar5 = this.g;
                        ctcVar5.getClass();
                        long j7 = crdVar5.c;
                        long jH = ctcVar5.h();
                        long j8 = jH >> 32;
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j7 >> 32));
                        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j7 & 4294967295L));
                        this.b = !((fIntBitsToFloat < 0.0f ? z3 : false) | (fIntBitsToFloat > ((float) ((int) j8)) ? z3 : false) | (fIntBitsToFloat2 < 0.0f ? z3 : false) | (fIntBitsToFloat2 > ((float) ((int) (jH & 4294967295L))) ? z3 : false));
                    }
                    int i15 = cquVar.e;
                    boolean z4 = (i15 == 10 || i15 == 11 || i15 == 12) ? z3 : false;
                    boolean z5 = this.b;
                    boolean z6 = this.i;
                    if (z5 != z6 && (i15 == 3 || i15 == 4 || i15 == 5 || z4)) {
                        cquVar.e = z3 == z5 ? 4 : 5;
                    } else if ((i15 == 4 && z6 && !this.j) || (i15 == 5 && z5 && crdVar5.d)) {
                        cquVar.e = 3;
                    }
                }
                this.h = cquVar;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [cge] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v5 */
    public final boolean d(defpackage.xh xhVar) {
        defpackage.cyl cylVar;
        defpackage.cxl cxlVar;
        boolean z;
        android.view.MotionEvent motionEventA;
        defpackage.zz zzVar = this.f;
        if (zzVar.j()) {
            z = false;
        } else {
            defpackage.cge cgeVar = this.a;
            if (cgeVar.A && (cylVar = cgeVar.w) != null && (cxlVar = cylVar.t) != null && cxlVar.an()) {
                defpackage.cqu cquVar = this.h;
                cquVar.getClass();
                defpackage.ctc ctcVar = this.g;
                ctcVar.getClass();
                long jH = ctcVar.h();
                ?? O = cgeVar;
                ?? bzcVar = 0;
                while (O != 0) {
                    if (O instanceof defpackage.cza) {
                        ((defpackage.cza) O).s(cquVar, defpackage.cqv.c, jH);
                    } else if ((O.r & 16) != 0 && (O instanceof defpackage.cwo)) {
                        defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                        int i = 0;
                        while (cgeVar2 != null) {
                            if ((cgeVar2.r & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    O = O;
                                    bzcVar = bzcVar;
                                    bzcVar = bzcVar;
                                    O = cgeVar2;
                                } else {
                                    if (bzcVar == 0) {
                                        bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                    }
                                    if (O != 0) {
                                        bzcVar.n(O);
                                    }
                                    bzcVar.n(cgeVar2);
                                    O = 0;
                                }
                            } else {
                                O = O;
                                bzcVar = bzcVar;
                            }
                            cgeVar2 = cgeVar2.u;
                            O = O;
                            bzcVar = bzcVar;
                        }
                        if (i != 1) {
                            O = O;
                            bzcVar = bzcVar;
                        } else {
                            O = O;
                            bzcVar = bzcVar;
                        }
                    }
                    O = defpackage.cjv.o(bzcVar);
                }
                if (cgeVar.A) {
                    defpackage.bzc bzcVar2 = this.d;
                    java.lang.Object[] objArr = bzcVar2.a;
                    int i2 = bzcVar2.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((defpackage.cqs) objArr[i3]).d(xhVar);
                    }
                }
                z = true;
            } else {
                z = false;
            }
        }
        super.f();
        defpackage.cqu cquVar2 = this.h;
        if (cquVar2 != null) {
            this.i = this.b;
            java.util.List list = cquVar2.a;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                defpackage.crd crdVar = (defpackage.crd) list.get(i4);
                boolean z2 = crdVar.d;
                long j = crdVar.a;
                boolean z3 = (z2 || (xhVar.b(j) && this.b)) ? false : true;
                int iC = xhVar.c();
                boolean z4 = xhVar.c() != 1 && ((motionEventA = xhVar.a()) == null || xhVar.c() == 1 || motionEventA.getActionMasked() != 1);
                if (z3 && (iC == 5 || !z4)) {
                    this.c.s(j);
                }
            }
            this.b = false;
            this.j = cquVar2.e == 5;
        }
        zzVar.f();
        this.g = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [bzc] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [bzc] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(defpackage.xh xhVar, boolean z) {
        defpackage.cyl cylVar;
        defpackage.cxl cxlVar;
        if (this.f.j()) {
            return false;
        }
        ?? O = this.a;
        if (!O.A || (cylVar = O.w) == null || (cxlVar = cylVar.t) == null || !cxlVar.an()) {
            return false;
        }
        defpackage.cqu cquVar = this.h;
        cquVar.getClass();
        defpackage.ctc ctcVar = this.g;
        ctcVar.getClass();
        long jH = ctcVar.h();
        ?? O2 = O;
        ?? bzcVar = 0;
        while (O2 != 0) {
            if (O2 instanceof defpackage.cza) {
                ((defpackage.cza) O2).s(cquVar, defpackage.cqv.a, jH);
            } else if ((O2.r & 16) != 0 && (O2 instanceof defpackage.cwo)) {
                defpackage.cge cgeVar = ((defpackage.cwo) O2).C;
                int i = 0;
                while (cgeVar != null) {
                    if ((cgeVar.r & 16) != 0) {
                        i++;
                        if (i == 1) {
                            O2 = O2;
                            bzcVar = bzcVar;
                            bzcVar = bzcVar;
                            O2 = cgeVar;
                        } else {
                            if (bzcVar == 0) {
                                bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                            }
                            if (O2 != 0) {
                                bzcVar.n(O2);
                            }
                            bzcVar.n(cgeVar);
                            O2 = 0;
                        }
                    } else {
                        O2 = O2;
                        bzcVar = bzcVar;
                    }
                    cgeVar = cgeVar.u;
                    O2 = O2;
                    bzcVar = bzcVar;
                }
                if (i != 1) {
                    O2 = O2;
                    bzcVar = bzcVar;
                } else {
                    O2 = O2;
                    bzcVar = bzcVar;
                }
            }
            O2 = defpackage.cjv.o(bzcVar);
        }
        if (O.A) {
            defpackage.bzc bzcVar2 = this.d;
            java.lang.Object[] objArr = bzcVar2.a;
            int i2 = bzcVar2.b;
            for (int i3 = 0; i3 < i2; i3++) {
                defpackage.cqs cqsVar = (defpackage.cqs) objArr[i3];
                this.g.getClass();
                cqsVar.e(xhVar, z);
            }
        }
        if (O.A) {
            ?? bzcVar3 = 0;
            while (O != 0) {
                if (O instanceof defpackage.cza) {
                    ((defpackage.cza) O).s(cquVar, defpackage.cqv.b, jH);
                } else if ((O.r & 16) != 0 && (O instanceof defpackage.cwo)) {
                    defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                    int i4 = 0;
                    while (cgeVar2 != null) {
                        if ((cgeVar2.r & 16) != 0) {
                            i4++;
                            if (i4 == 1) {
                                O = O;
                                bzcVar3 = bzcVar3;
                                bzcVar3 = bzcVar3;
                                O = cgeVar2;
                            } else {
                                if (bzcVar3 == 0) {
                                    bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                }
                                if (O != 0) {
                                    bzcVar3.n(O);
                                }
                                bzcVar3.n(cgeVar2);
                                O = 0;
                            }
                        } else {
                            O = O;
                            bzcVar3 = bzcVar3;
                        }
                        cgeVar2 = cgeVar2.u;
                        O = O;
                        bzcVar3 = bzcVar3;
                    }
                    if (i4 != 1) {
                        O = O;
                        bzcVar3 = bzcVar3;
                    } else {
                        O = O;
                        bzcVar3 = bzcVar3;
                    }
                }
                O = defpackage.cjv.o(bzcVar3);
            }
        }
        return true;
    }

    public final java.lang.String toString() {
        return "Node(modifierNode=" + this.a + ", children=" + this.d + ", pointerIds=" + this.c + ")";
    }
}
