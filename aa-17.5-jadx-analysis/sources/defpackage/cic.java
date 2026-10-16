package defpackage;

/* loaded from: classes.dex */
public final class cic {
    public final cix a;
    public final chx c;
    private final cym f;
    private ciu g;
    private zq h;
    public final ciu b = new ciu(2, false, null, 14);
    public final cfy d = new cxt<ciu>() { // from class: cic.1
        @Override // defpackage.cxt
        public final /* bridge */ /* synthetic */ cfx d() {
            return cic.this.b;
        }

        @Override // defpackage.cxt
        public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return cic.this.b.hashCode();
        }
    };
    public final aag e = new aag(1);

    public cic(cix cixVar, cym cymVar) {
        this.a = cixVar;
        this.f = cymVar;
        this.c = new chx(this, cymVar);
    }

    private final void n() {
        cxx cxxVar;
        if (b() == null) {
            return;
        }
        ciu ciuVarB = b();
        g(null);
        if (ciuVarB != null) {
            cis cisVar = cis.a;
            cis cisVar2 = cis.d;
            ciuVarB.l(cisVar, cisVar2);
            if (!ciuVarB.q.A) {
                crt.c("visitAncestors called on an unattached node");
            }
            cfx cfxVar = ciuVarB.q.t;
            cxb cxbVarQ = bzi.q(ciuVarB);
            while (cxbVarQ != null) {
                if ((cxbVarQ.v.f.s & 1024) != 0) {
                    while (cfxVar != null) {
                        if ((cfxVar.r & 1024) != 0) {
                            cfx cfxVarN = cfxVar;
                            byw bywVar = null;
                            while (cfxVarN != null) {
                                if (cfxVarN instanceof ciu) {
                                    ((ciu) cfxVarN).l(cis.b, cisVar2);
                                } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                    int i = 0;
                                    for (cfx cfxVar2 = ((cwe) cfxVarN).C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
                                        if ((cfxVar2.r & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cfxVarN = cfxVar2;
                                            } else {
                                                if (bywVar == null) {
                                                    bywVar = new byw(new cfx[16]);
                                                }
                                                if (cfxVarN != null) {
                                                    bywVar.n(cfxVarN);
                                                }
                                                bywVar.n(cfxVar2);
                                                cfxVarN = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cfxVarN = bzi.n(bywVar);
                            }
                        }
                        cfxVar = cfxVar.t;
                    }
                }
                cxbVarQ = cxbVarQ.l();
                cfxVar = (cxbVarQ == null || (cxxVar = cxbVarQ.v) == null) ? null : cxxVar.e;
            }
        }
    }

    public final ciu a() {
        return mt.o(this.b);
    }

    public final ciu b() {
        ciu ciuVar = this.g;
        if (ciuVar == null || !ciuVar.A) {
            return null;
        }
        return ciuVar;
    }

    public final cjb c() {
        ciu ciuVarA = a();
        if (ciuVarA != null) {
            return mt.q(ciuVarA);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0153, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Type inference failed for: r1v4, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [cfx] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r2v11, types: [ciu] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [cfx] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v11, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v9, types: [cfx] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [byw] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [byw] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean d(int r19, defpackage.cjb r20, defpackage.afec r21) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cic.d(int, cjb, afec):java.lang.Boolean");
    }

    public final void e() {
        this.a.h();
    }

    public final void f() {
        this.c.a();
    }

    public final void g(ciu ciuVar) {
        ciu ciuVar2 = this.g;
        this.g = ciuVar;
        aag aagVar = this.e;
        Object[] objArr = aagVar.a;
        int i = aagVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((chy) objArr[i2]).eP(ciuVar2, ciuVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (((((~r12) << 6) & r12) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        r3 = r6.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
    
        if (r6.e != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        if (((r6.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00da, code lost:
    
        r3 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        if (r3 <= 8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f6, code lost:
    
        if (java.lang.Long.compare((r6.d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fa, code lost:
    
        r3 = r6.a;
        r7 = r6.c;
        r8 = r6.b;
        r9 = (r7 + 7) >> 3;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0106, code lost:
    
        if (r10 >= r9) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0108, code lost:
    
        r12 = r3[r10] & (-9187201950435737472L);
        r3[r10] = ((~r12) + (r12 >>> 7)) & (-72340172838076674L);
        r10 = r10 + 1;
        r8 = r8;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0123, code lost:
    
        r30 = r8;
        r8 = defpackage.woy.cM(r3);
        r9 = r8 - 1;
        r3[r9] = (r3[r9] & 72057594037927935L) | (-72057594037927936L);
        r3[r8] = r3[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0140, code lost:
    
        if (r8 == r7) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0142, code lost:
    
        r9 = r8 >> 3;
        r10 = (r8 & 7) << 3;
        r12 = (r3[r9] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014f, code lost:
    
        if (r12 != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0151, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0156, code lost:
    
        if (r12 == 254) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0159, code lost:
    
        r12 = r30[r8];
        r12 = ((int) (r12 ^ (r12 >>> 32))) * r29;
        r12 = r12 ^ (r12 << 16);
        r13 = r12 >>> 7;
        r36 = r6.b(r13);
        r13 = r13 & r7;
        r38 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0179, code lost:
    
        if ((((r36 - r13) & r7) / 8) != (((r8 - r13) & r7) / 8)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017b, code lost:
    
        r37 = r7;
        r3[r9] = ((~(255 << r10)) & r3[r9]) | ((r12 & 127) << r10);
        r3[defpackage.woy.cM(r3)] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019f, code lost:
    
        r7 = r37;
        r11 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a4, code lost:
    
        r37 = r7;
        r39 = r8;
        r7 = r36 >> 3;
        r8 = r3[r7];
        r10 = r12 & 127;
        r11 = (r36 & 7) << 3;
        r12 = ~(255 << r11);
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c4, code lost:
    
        if (((r8 >> r11) & 255) != 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:
    
        r3[r7] = (r7 << r11) | (r8 & r12);
        r3[r9] = (r3[r9] & (~(255 << r10))) | (128 << r10);
        r30[r36] = r30[r39];
        r30[r39] = 0;
        r8 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e0, code lost:
    
        r3[r7] = (r7 << r11) | (r8 & r12);
        r7 = r30[r36];
        r30[r36] = r30[r39];
        r30[r39] = r7;
        r8 = r39 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f0, code lost:
    
        r3[defpackage.woy.cM(r3)] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ff, code lost:
    
        r6.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0204, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0206, code lost:
    
        r3 = defpackage.aao.b(r6.c);
        r7 = r6.a;
        r8 = r6.b;
        r9 = r6.c;
        r6.d(r3);
        r3 = r6.a;
        r10 = r6.b;
        r11 = r6.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021d, code lost:
    
        if (r12 >= r9) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x022d, code lost:
    
        if (((r7[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r23) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x022f, code lost:
    
        r21 = r8[r12];
        r13 = r7;
        r30 = r8;
        r7 = ((int) (r21 ^ (r21 >>> 32))) * r29;
        r8 = r6.b((r7 ^ (r7 << 16)) >>> 7);
        r27 = r8 >> 3;
        r28 = (r8 & 7) << 3;
        r7 = (r3[r27] & (~(255 << r28))) | ((r7 & 127) << r28);
        r3[r27] = r7;
        r3[(((r8 - 7) & r11) + (r11 & 7)) >> 3] = r7;
        r10[r8] = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x026d, code lost:
    
        r13 = r7;
        r30 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0270, code lost:
    
        r12 = r12 + 1;
        r7 = r13;
        r8 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0276, code lost:
    
        r30 = r6.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x027d, code lost:
    
        r23 = 128;
        r30 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0281, code lost:
    
        r6.d++;
        r2 = r6.e;
        r3 = r6.a;
        r7 = r30 >> 3;
        r8 = r3[r7];
        r10 = (r30 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0299, code lost:
    
        if (((r8 >> r10) & 255) != r23) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x029b, code lost:
    
        r11 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x029e, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a0, code lost:
    
        r6.e = r2 - r11;
        r2 = r6.c;
        r8 = (r8 & (~(255 << r10))) | (r14 << r10);
        r3[r7] = r8;
        r3[(((r30 - 7) & r2) + (r2 & 7)) >> 3] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0351, code lost:
    
        if (((r11 & ((~r11) << 6)) & (-9187201950435737472L)) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0353, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x054e A[PHI: r9
  0x054e: PHI (r9v29 byw) = (r9v28 byw), (r9v28 byw), (r9v28 byw), (r9v31 byw) binds: [B:226:0x0514, B:228:0x051a, B:230:0x051e, B:245:0x054c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v11, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v16, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [byw] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43, types: [byw] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r7v126 */
    /* JADX WARN: Type inference failed for: r7v127 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [cfx] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [cfx] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10, types: [byw] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [byw] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v86 */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [byw] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [byw] */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.view.KeyEvent r47, defpackage.afdr r48) {
        /*
            Method dump skipped, instructions count: 1621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cic.h(android.view.KeyEvent, afdr):boolean");
    }

    public final boolean i(int i, boolean z) {
        Boolean boolD;
        ciu ciuVarB = b();
        int i2 = 1;
        if (ciuVarB != null && ciuVarB.a && this.a.i(i)) {
            return true;
        }
        affv affvVar = new affv();
        affvVar.a = false;
        ciu ciuVarB2 = b();
        Boolean boolD2 = d(i, this.a.g(), new aia(affvVar, i, 5));
        if (affa.f(boolD2, true) && ciuVarB2 != b()) {
            return true;
        }
        if (boolD2 != null && affvVar.a != null) {
            if (boolD2.booleanValue() && ((Boolean) affvVar.a).booleanValue()) {
                return true;
            }
            if (lv.q(i) && z && k(false, false, i) && (boolD = d(i, null, new cia(i, i2))) != null && boolD.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(int i) {
        Object[] objArr = 0;
        if (!k(false, false, i)) {
            return false;
        }
        Boolean boolD = d(i, null, new cia(i, objArr == true ? 1 : 0));
        boolean zBooleanValue = boolD != null ? boolD.booleanValue() : false;
        if (!zBooleanValue) {
            e();
        }
        return zBooleanValue;
    }

    public final boolean k(boolean z, boolean z2, int i) {
        boolean z3;
        if (z) {
            n();
        } else {
            int iU = mt.u(this.b, i);
            int i2 = iU - 1;
            if (iU == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new aezs();
                }
                z3 = false;
                if (z3 || !z2) {
                    return z3;
                }
                e();
                return true;
            }
            n();
        }
        z3 = true;
        if (z3) {
        }
        return z3;
    }

    public final cis l() {
        return this.b.g();
    }

    public final boolean m() {
        return this.a.j();
    }
}
