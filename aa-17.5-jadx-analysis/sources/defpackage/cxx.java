package defpackage;

/* loaded from: classes.dex */
public final class cxx {
    public final cxb a;
    public final cxw b;
    public final cwq c;
    public cyc d;
    public final cfx e;
    public cfx f;
    public aag g;
    public aag h;
    public aag i;
    private cxv j;

    public cxx(cxb cxbVar) {
        this.a = cxbVar;
        cxw cxwVar = new cxw();
        cxwVar.s = -1;
        this.b = cxwVar;
        cwq cwqVar = new cwq(cxbVar);
        this.c = cwqVar;
        this.d = cwqVar;
        cyx cyxVar = cwqVar.f;
        this.e = cyxVar;
        this.f = cyxVar;
        this.g = new aag(16);
    }

    public static final cfx k(cfw cfwVar, cfx cfxVar) {
        cfx cvyVar;
        if (cfwVar instanceof cxt) {
            cvyVar = ((cxt) cfwVar).d();
            cvyVar.r = cyd.c(cvyVar);
        } else {
            cvyVar = new cvy(cfwVar);
        }
        if (cvyVar.A) {
            crt.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cvyVar.x = true;
        cfx cfxVar2 = cfxVar.u;
        if (cfxVar2 != null) {
            cfxVar2.t = cvyVar;
            cvyVar.u = cfxVar2;
        }
        cfxVar.u = cvyVar;
        cvyVar.t = cfxVar;
        return cvyVar;
    }

    public static final cfx l(cfx cfxVar) {
        if (cfxVar.A) {
            cyd.f(cfxVar);
            cfxVar.S();
            cfxVar.P();
        }
        cfx cfxVar2 = cfxVar.u;
        cfx cfxVar3 = cfxVar.t;
        if (cfxVar2 != null) {
            cfxVar2.t = cfxVar3;
            cfxVar.u = null;
        }
        if (cfxVar3 != null) {
            cfxVar3.u = cfxVar2;
            cfxVar.t = null;
        }
        cfxVar3.getClass();
        return cfxVar3;
    }

    public static final void m(cfw cfwVar, cfw cfwVar2, cfx cfxVar) {
        if ((cfwVar instanceof cxt) && (cfwVar2 instanceof cxt)) {
            cfxVar.getClass();
            ((cxt) cfwVar2).e(cfxVar);
            if (cfxVar.A) {
                cyd.g(cfxVar);
                return;
            } else {
                cfxVar.y = true;
                return;
            }
        }
        if (!(cfxVar instanceof cvy)) {
            crt.c("Unknown Modifier.Node type");
            return;
        }
        cvy cvyVar = (cvy) cfxVar;
        if (cvyVar.A) {
            cvyVar.u();
        }
        cvyVar.a = cfwVar2;
        cvyVar.r = cyd.a(cfwVar2);
        if (cvyVar.A) {
            cvyVar.r(false);
        }
        if (cfxVar.A) {
            cyd.g(cfxVar);
        } else {
            cfxVar.y = true;
        }
    }

    public final int a() {
        return this.f.s;
    }

    public final void b() {
        for (cfx cfxVar = this.f; cfxVar != null; cfxVar = cfxVar.u) {
            cfxVar.O();
        }
    }

    public final void c() {
        for (cfx cfxVar = this.e; cfxVar != null; cfxVar = cfxVar.t) {
            if (cfxVar.A) {
                cfxVar.P();
            }
        }
    }

    public final void d(cfx cfxVar, cyc cycVar) {
        for (cfx cfxVar2 = cfxVar.t; cfxVar2 != null; cfxVar2 = cfxVar2.t) {
            if (cfxVar2 == this.b) {
                cxb cxbVarL = this.a.l();
                cycVar.x = cxbVarL != null ? cxbVarL.p() : null;
                this.d = cycVar;
                return;
            } else {
                if ((cfxVar2.r & 2) != 0) {
                    return;
                }
                cfxVar2.U(cycVar);
            }
        }
    }

    public final void e() {
        for (cfx cfxVar = this.f; cfxVar != null; cfxVar = cfxVar.u) {
            cfxVar.R();
            if (cfxVar.x) {
                cyd.d(cfxVar);
            }
            if (cfxVar.y) {
                cyd.g(cfxVar);
            }
            cfxVar.x = false;
            cfxVar.y = false;
        }
    }

    public final void f() {
        for (cfx cfxVar = this.e; cfxVar != null; cfxVar = cfxVar.t) {
            if (cfxVar.A) {
                cfxVar.S();
            }
        }
    }

    public final void g() {
        int i = 0;
        for (cfx cfxVar = this.e.t; cfxVar != null && cfxVar != this.b; cfxVar = cfxVar.t) {
            i |= cfxVar.r;
            cfxVar.s = i;
        }
    }

    public final void h() {
        cyc cycVar;
        cyc cycVar2 = this.c;
        for (cfx cfxVar = this.e.t; cfxVar != null; cfxVar = cfxVar.t) {
            cwu cwuVarP = bzi.p(cfxVar);
            if (cwuVarP != null) {
                cyc cycVar3 = cfxVar.w;
                if (cycVar3 != null) {
                    cwx cwxVar = (cwx) cycVar3;
                    cwu cwuVar = cwxVar.f;
                    cwxVar.H(cwuVarP);
                    cycVar = cwxVar;
                    if (cwuVar != cfxVar) {
                        cwxVar.am();
                        cycVar = cwxVar;
                    }
                } else {
                    cyc cwxVar2 = new cwx(this.a, cwuVarP);
                    cfxVar.U(cwxVar2);
                    cycVar = cwxVar2;
                }
                cycVar2.x = cycVar;
                cycVar.w = cycVar2;
                cycVar2 = cycVar;
            } else {
                cfxVar.U(cycVar2);
            }
        }
        cxb cxbVarL = this.a.l();
        cycVar2.x = cxbVarL != null ? cxbVarL.p() : null;
        this.d = cycVar2;
    }

    public final boolean i(int i) {
        return (a() & i) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        r25 = r11;
        r29 = r12;
        r10 = r13;
        r11 = r15;
        r12 = 3;
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0137, code lost:
    
        if (r13 > r2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0139, code lost:
    
        if (r13 == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        r15 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013d, code lost:
    
        if (r13 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013f, code lost:
    
        r33 = r12;
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014d, code lost:
    
        if (r25[(r13 + 1) + r18] >= r25[r15 + r18]) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0150, code lost:
    
        r33 = r12;
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0154, code lost:
    
        r12 = r25[r15 + r18];
        r13 = r12 - 1;
        r15 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
    
        r33 = r12;
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        r13 = r25[(r22 + 1) + r18];
        r15 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0168, code lost:
    
        r12 = r10 - ((r7 - r13) - r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        if (r2 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0170, code lost:
    
        r20 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0173, code lost:
    
        r20 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0175, code lost:
    
        if (r13 != r15) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r23 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        r23 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017c, code lost:
    
        r24 = r14;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:
    
        if (r13 <= r6) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:
    
        if (r14 <= r11) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0183, code lost:
    
        r26 = r12;
        r12 = r13 - 1;
        r27 = r14;
        r14 = r27 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r0.a(r12, r14) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r13 = r12;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0195, code lost:
    
        r26 = r12;
        r27 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0199, code lost:
    
        r12 = (r19 & 1) ^ 1;
        r25[r22 + r18] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a1, code lost:
    
        if (r12 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a3, code lost:
    
        r12 = r19 - r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a5, code lost:
    
        if (r12 < r3) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a7, code lost:
    
        if (r12 > r2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ad, code lost:
    
        if (r21[r12 + r18] < r13) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01af, code lost:
    
        defpackage.ty.h(r13, r27, r15, r26 + (r20 & r23), true, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020a, code lost:
    
        r13 = r22 + 2;
        r12 = r33;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0212, code lost:
    
        r2 = r2 + 1;
        r3 = r35;
        r13 = r10;
        r15 = r11;
        r10 = r21;
        r11 = r25;
        r12 = r29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r31, defpackage.aag r32, defpackage.aag r33, defpackage.cfx r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxx.j(int, aag, aag, cfx, boolean):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        cfx cfxVar = this.f;
        cfx cfxVar2 = this.e;
        if (cfxVar == cfxVar2) {
            sb.append("]");
        } else {
            while (true) {
                if (cfxVar == null || cfxVar == cfxVar2) {
                    break;
                }
                sb.append(cfxVar.toString());
                if (cfxVar.u == cfxVar2) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                cfxVar = cfxVar.u;
            }
        }
        return sb.toString();
    }
}
