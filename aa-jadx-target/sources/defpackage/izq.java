package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class izq {
    public final /* synthetic */ java.lang.Object a;

    public izq(java.lang.Object obj) {
        this.a = obj;
    }

    public final void A(int i) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        android.view.View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.B(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public final void B(defpackage.mr mrVar) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        recyclerView.n.aS(mrVar.a, recyclerView.e);
    }

    public final void C(defpackage.mr mrVar, defpackage.euf eufVar, defpackage.euf eufVar2) {
        mrVar.n(false);
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        if (recyclerView.E.j(mrVar, eufVar, eufVar2)) {
            recyclerView.S();
        }
    }

    public final void D(defpackage.mr mrVar, defpackage.euf eufVar, defpackage.euf eufVar2) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        recyclerView.e.l(mrVar);
        recyclerView.t(mrVar);
        mrVar.n(false);
        if (recyclerView.E.l(mrVar, eufVar, eufVar2)) {
            recyclerView.S();
        }
    }

    public final void a(defpackage.zak zakVar) {
        java.lang.Object obj = this.a;
        ((defpackage.izs) obj).s.aF(defpackage.zaj.PROTOCOL_IO_ERROR, zakVar, "io error");
    }

    public final void b(defpackage.oup oupVar) {
        defpackage.irk irkVar = (defpackage.irk) this.a;
        defpackage.jfu jfuVar = irkVar.p;
        if (!jfuVar.a.isEmpty()) {
            byte[] bArrH = oupVar.h();
            defpackage.ysr.aY(bArrH.length <= (android.os.Build.VERSION.SDK_INT >= 30 ? bgp$.ExternalSyntheticApiModelOutline0.m$9() : 65536), "payload length");
            jfuVar.a(bArrH);
        }
        irkVar.y.q(oupVar);
    }

    public final void c(defpackage.ovl ovlVar) {
        f(ovlVar, e());
    }

    public final void d(defpackage.ovl ovlVar) {
        defpackage.abor aborVarE = e();
        defpackage.abor aborVarN = defpackage.ovm.a.n();
        aborVarN.t();
        defpackage.ovm ovmVar = (defpackage.ovm) aborVarN.b;
        ovmVar.b |= 1;
        ovmVar.c = "AudioSourceService";
        aborVarN.t();
        defpackage.ovm ovmVar2 = (defpackage.ovm) aborVarN.b;
        ovmVar2.e = ovlVar.al;
        ovmVar2.b |= 4;
        aborVarN.t();
        defpackage.ovm ovmVar3 = (defpackage.ovm) aborVarN.b;
        defpackage.ovj ovjVar = (defpackage.ovj) aborVarE.q();
        ovjVar.getClass();
        ovmVar3.g = ovjVar;
        ovmVar3.b |= 16;
        ((defpackage.iqj) this.a).k.B(aborVarN);
    }

    public final defpackage.abor e() {
        int iA;
        defpackage.abor aborVarN = defpackage.ovj.a.n();
        defpackage.iqj iqjVar = (defpackage.iqj) this.a;
        boolean z = iqjVar.f;
        aborVarN.t();
        defpackage.ovj ovjVar = (defpackage.ovj) aborVarN.b;
        ovjVar.b |= 1;
        ovjVar.c = z;
        boolean z2 = iqjVar.e != null && ((defpackage.iqd) iqjVar.e).i;
        aborVarN.t();
        defpackage.ovj ovjVar2 = (defpackage.ovj) aborVarN.b;
        ovjVar2.b |= 2;
        ovjVar2.d = z2;
        boolean z3 = iqjVar.e != null && ((defpackage.iqd) iqjVar.e).h;
        aborVarN.t();
        defpackage.ovj ovjVar3 = (defpackage.ovj) aborVarN.b;
        ovjVar3.b |= 4;
        ovjVar3.e = z3;
        boolean z4 = iqjVar.h;
        aborVarN.t();
        defpackage.ovj ovjVar4 = (defpackage.ovj) aborVarN.b;
        ovjVar4.b |= 8;
        ovjVar4.f = z4;
        int i = iqjVar.i.get();
        if (i != 0) {
            defpackage.ovi oviVarAe = defpackage.tna.ae(i);
            aborVarN.t();
            defpackage.ovj ovjVar5 = (defpackage.ovj) aborVarN.b;
            ovjVar5.g = oviVarAe.f;
            ovjVar5.b |= 16;
        }
        defpackage.iqh iqhVar = iqjVar.e == null ? null : ((defpackage.iqd) iqjVar.e).k;
        if (iqhVar != null) {
            int i2 = iqhVar.c;
            defpackage.yqm yqmVar = defpackage.irk.a;
            defpackage.ove oveVarW = defpackage.tna.W(i2);
            aborVarN.t();
            defpackage.ovj ovjVar6 = (defpackage.ovj) aborVarN.b;
            ovjVar6.h = oveVarW.f;
            ovjVar6.b |= 32;
        }
        defpackage.iqh iqhVar2 = (defpackage.iqh) iqjVar.j.get();
        if (iqhVar2 != null) {
            int i3 = iqhVar2.c;
            defpackage.yqm yqmVar2 = defpackage.irk.a;
            defpackage.ove oveVarW2 = defpackage.tna.W(i3);
            aborVarN.t();
            defpackage.ovj ovjVar7 = (defpackage.ovj) aborVarN.b;
            ovjVar7.i = oveVarW2.f;
            ovjVar7.b |= 64;
        }
        if (iqjVar.e != null && (iA = ((defpackage.iqd) iqjVar.e).f.a()) > 0) {
            aborVarN.t();
            defpackage.ovj ovjVar8 = (defpackage.ovj) aborVarN.b;
            ovjVar8.b |= 1024;
            ovjVar8.m = iA;
        }
        return aborVarN;
    }

    public final void f(defpackage.ovl ovlVar, defpackage.abor aborVar) {
        defpackage.abor aborVarN = defpackage.ovm.a.n();
        aborVarN.t();
        defpackage.ovm ovmVar = (defpackage.ovm) aborVarN.b;
        ovmVar.b |= 1;
        ovmVar.c = "AudioSourceService";
        aborVarN.t();
        defpackage.ovm ovmVar2 = (defpackage.ovm) aborVarN.b;
        ovmVar2.e = ovlVar.al;
        ovmVar2.b |= 4;
        aborVarN.t();
        defpackage.ovm ovmVar3 = (defpackage.ovm) aborVarN.b;
        defpackage.ovj ovjVar = (defpackage.ovj) aborVar.q();
        ovjVar.getClass();
        ovmVar3.g = ovjVar;
        ovmVar3.b |= 16;
        ((defpackage.iqj) this.a).k.A(aborVarN);
    }

    public final long g() {
        return ((defpackage.cmi) this.a).a();
    }

    public final void h(float f, float f2, float f3, float f4, int i) {
        ((defpackage.cmi) this.a).b().a(f, f2, f3, f4, i);
    }

    public final void i(float f, float f2, float f3, float f4) {
        defpackage.cmi cmiVar = (defpackage.cmi) this.a;
        defpackage.ckc ckcVarB = cmiVar.b();
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (g() >> 32)) - (f3 + f);
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (g() & 4294967295L)) - (f4 + f2);
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        if (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            defpackage.ckn.a("Width and height must be greater than or equal to zero");
        }
        cmiVar.h(jFloatToRawIntBits);
        ckcVarB.i(f, f2);
    }

    public final void j(float f, long j) {
        defpackage.ckc ckcVarB = ((defpackage.cmi) this.a).b();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        ckcVarB.i(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i));
        ckcVarB.f(f);
        ckcVarB.i(-java.lang.Float.intBitsToFloat(i2), -java.lang.Float.intBitsToFloat(i));
    }

    public final void k(float f, float f2, long j) {
        defpackage.ckc ckcVarB = ((defpackage.cmi) this.a).b();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        ckcVarB.i(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i));
        ckcVarB.h(f, f2);
        ckcVarB.i(-java.lang.Float.intBitsToFloat(i2), -java.lang.Float.intBitsToFloat(i));
    }

    public final void l(float f, float f2) {
        ((defpackage.cmi) this.a).b().i(f, f2);
    }

    public final void m(defpackage.cju cjuVar) {
        ((defpackage.cmi) this.a).b().q(cjuVar);
    }

    public final defpackage.azx n(int i) {
        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
        java.lang.Object obj = this.a;
        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
        try {
            defpackage.axo axoVar = (defpackage.axo) ((defpackage.axx) obj).e.a();
            defpackage.axx axxVar = (defpackage.axx) this.a;
            return axxVar.l.a(i, axoVar.h, axxVar.c, new defpackage.awl(7));
        } finally {
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:110:0x0202  */
    /* JADX WARN: Code duplicated, block: B:112:0x0207  */
    /* JADX WARN: Code duplicated, block: B:114:0x020f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0213  */
    /* JADX WARN: Code duplicated, block: B:117:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x021a  */
    /* JADX WARN: Code duplicated, block: B:122:0x021f  */
    /* JADX WARN: Code duplicated, block: B:127:0x023f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0264  */
    /* JADX WARN: Code duplicated, block: B:149:0x0289  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[PHI: r19 r21
  0x00bd: PHI (r19v2 long) = (r19v1 long), (r19v5 long) binds: [B:52:0x00ea, B:41:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r21v1 float) = (r21v0 float), (r21v2 float) binds: [B:52:0x00ea, B:41:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d A[PHI: r5
  0x012d: PHI (r5v7 float) = (r5v5 float), (r5v9 float) binds: [B:76:0x0157, B:65:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x012f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    /* JADX WARN: Code duplicated, block: B:80:0x016f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d1  */
    public final long o(long j, int i) {
        long j2;
        float fA;
        float fIntBitsToFloat;
        int i2;
        defpackage.ajv ajvVar;
        float fC;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jR;
        long jR2;
        defpackage.ajv ajvVar2;
        boolean z;
        defpackage.ajv ajvVar3;
        boolean zL;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        defpackage.aqp aqpVar = (defpackage.aqp) this.a;
        aqpVar.g = i;
        defpackage.aiz aizVar = aqpVar.j;
        if (aizVar == null || !aqpVar.j()) {
            return aqpVar.c(aqpVar.h, j, i);
        }
        int i5 = aqpVar.g;
        defpackage.affc affcVar = aqpVar.i;
        if (defpackage.cjl.d(aizVar.e)) {
            return ((defpackage.cji) affcVar.invoke(new defpackage.cji(j))).a;
        }
        long j3 = j & 4294967295L;
        long j4 = j >> 32;
        boolean z4 = true;
        if (!aizVar.d) {
            defpackage.ajv ajvVar4 = aizVar.b;
            if (ajvVar4.n()) {
                aizVar.b(0L);
            }
            if (ajvVar4.q()) {
                aizVar.c(0L);
            }
            if (ajvVar4.t()) {
                aizVar.d(0L);
            }
            if (ajvVar4.k()) {
                aizVar.a(0L);
            }
            aizVar.d = true;
        }
        int i6 = defpackage.ajb.a;
        float f = i5 == 2 ? 4.0f : 1.0f;
        long jC = defpackage.cji.c(j, f);
        int i7 = (int) j3;
        if (java.lang.Float.intBitsToFloat(i7) != 0.0f) {
            defpackage.ajv ajvVar5 = aizVar.b;
            if (!ajvVar5.t() || java.lang.Float.intBitsToFloat(i7) >= 0.0f) {
                j2 = 0;
                if (ajvVar5.k() && java.lang.Float.intBitsToFloat(i7) > 0.0f) {
                    long j5 = jC & 4294967295L;
                    fA = aizVar.a(jC);
                    if (!ajvVar5.k()) {
                        ajvVar5.a().finish();
                    }
                    if (fA == java.lang.Float.intBitsToFloat((int) j5)) {
                        fIntBitsToFloat = java.lang.Float.intBitsToFloat(i7);
                    } else {
                        fIntBitsToFloat = fA / f;
                    }
                }
            } else {
                j2 = 0;
                long j6 = jC & 4294967295L;
                fA = aizVar.d(jC);
                if (!ajvVar5.t()) {
                    ajvVar5.g().finish();
                }
                if (fA == java.lang.Float.intBitsToFloat((int) j6)) {
                    fIntBitsToFloat = java.lang.Float.intBitsToFloat(i7);
                } else {
                    fIntBitsToFloat = fA / f;
                }
            }
            i2 = (int) j4;
            if (java.lang.Float.intBitsToFloat(i2) == 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                ajvVar = aizVar.b;
                if (!ajvVar.n() && java.lang.Float.intBitsToFloat(i2) < 0.0f) {
                    long j7 = jC >> 32;
                    fC = aizVar.b(jC);
                    if (!ajvVar.n()) {
                        ajvVar.c().finish();
                    }
                    if (fC == java.lang.Float.intBitsToFloat((int) j7)) {
                        fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
                    } else {
                        fIntBitsToFloat2 = fC / f;
                    }
                } else if (ajvVar.q() || java.lang.Float.intBitsToFloat(i2) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    long j8 = jC >> 32;
                    fC = aizVar.c(jC);
                    if (!ajvVar.q()) {
                        ajvVar.e().finish();
                    }
                    if (fC == java.lang.Float.intBitsToFloat((int) j8)) {
                        fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
                    } else {
                        fIntBitsToFloat2 = fC / f;
                    }
                }
            }
            jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
            if (jFloatToRawIntBits != j2) {
                aizVar.h();
            }
            jR = defpackage.acmj.r(j, jFloatToRawIntBits);
            long j9 = ((defpackage.cji) affcVar.invoke(new defpackage.cji(jR))).a;
            jR2 = defpackage.acmj.r(jR, j9);
            if ((java.lang.Float.intBitsToFloat((int) (jR >> 32)) == 0.0f || java.lang.Float.intBitsToFloat((int) (jR & 4294967295L)) != 0.0f) && (java.lang.Float.intBitsToFloat((int) (j9 >> 32)) != 0.0f || java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)) != 0.0f)) {
                ajvVar2 = aizVar.b;
                if (ajvVar2.n() || ajvVar2.t() || ajvVar2.q() || ajvVar2.k()) {
                    aizVar.g();
                }
            }
            if (i5 == 1) {
                i3 = (int) (jR2 >> 32);
                if (java.lang.Float.intBitsToFloat(i3) > 0.5f) {
                    aizVar.b(jR2);
                } else {
                    if (java.lang.Float.intBitsToFloat(i3) < -0.5f) {
                        aizVar.c(jR2);
                    } else {
                        z2 = false;
                    }
                    i4 = (int) (jR2 & 4294967295L);
                    if (java.lang.Float.intBitsToFloat(i4) > 0.5f) {
                        aizVar.d(jR2);
                    } else {
                        if (java.lang.Float.intBitsToFloat(i4) < -0.5f) {
                            aizVar.a(jR2);
                        } else {
                            z3 = false;
                        }
                        if (!z2 || z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z3 = true;
                    if (z2) {
                    }
                    z = true;
                }
                z2 = true;
                i4 = (int) (jR2 & 4294967295L);
                if (java.lang.Float.intBitsToFloat(i4) > 0.5f) {
                    aizVar.d(jR2);
                } else {
                    if (java.lang.Float.intBitsToFloat(i4) < -0.5f) {
                        aizVar.a(jR2);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            } else {
                z = false;
            }
            if (jR != j2) {
                ajvVar3 = aizVar.b;
                if (ajvVar3.l() || java.lang.Float.intBitsToFloat(i2) >= 0.0f) {
                    zL = false;
                } else {
                    defpackage.ca.bj(ajvVar3.c(), java.lang.Float.intBitsToFloat(i2));
                    zL = ajvVar3.l();
                }
                if (ajvVar3.o() && java.lang.Float.intBitsToFloat(i2) > 0.0f) {
                    defpackage.ca.bj(ajvVar3.e(), java.lang.Float.intBitsToFloat(i2));
                    if (!zL || ajvVar3.o()) {
                        zL = true;
                    } else {
                        zL = false;
                    }
                }
                if (ajvVar3.r() && java.lang.Float.intBitsToFloat(i7) < 0.0f) {
                    defpackage.ca.bj(ajvVar3.g(), java.lang.Float.intBitsToFloat(i7));
                    if (!zL || ajvVar3.r()) {
                        zL = true;
                    } else {
                        zL = false;
                    }
                }
                if (ajvVar3.i() && java.lang.Float.intBitsToFloat(i7) > 0.0f) {
                    defpackage.ca.bj(ajvVar3.a(), java.lang.Float.intBitsToFloat(i7));
                    if (!zL || ajvVar3.i()) {
                        zL = true;
                    } else {
                        zL = false;
                    }
                }
                if (!zL && !z) {
                    z4 = false;
                }
            } else {
                z4 = z;
            }
            if (z4) {
                aizVar.h();
            }
            return defpackage.a.ah(jFloatToRawIntBits, j9);
        }
        j2 = 0;
        fIntBitsToFloat = 0.0f;
        i2 = (int) j4;
        if (java.lang.Float.intBitsToFloat(i2) == 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            ajvVar = aizVar.b;
            if (!ajvVar.n()) {
                if (ajvVar.q()) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fIntBitsToFloat2 = 0.0f;
                }
            } else if (ajvVar.q()) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        }
        jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        if (jFloatToRawIntBits != j2) {
            aizVar.h();
        }
        jR = defpackage.acmj.r(j, jFloatToRawIntBits);
        long j10 = ((defpackage.cji) affcVar.invoke(new defpackage.cji(jR))).a;
        jR2 = defpackage.acmj.r(jR, j10);
        if (java.lang.Float.intBitsToFloat((int) (jR >> 32)) == 0.0f) {
            ajvVar2 = aizVar.b;
            if (ajvVar2.n()) {
                aizVar.g();
            } else {
                aizVar.g();
            }
        } else {
            ajvVar2 = aizVar.b;
            if (ajvVar2.n()) {
                aizVar.g();
            } else {
                aizVar.g();
            }
        }
        if (i5 == 1) {
            i3 = (int) (jR2 >> 32);
            if (java.lang.Float.intBitsToFloat(i3) > 0.5f) {
                aizVar.b(jR2);
            } else {
                if (java.lang.Float.intBitsToFloat(i3) < -0.5f) {
                    aizVar.c(jR2);
                } else {
                    z2 = false;
                }
                i4 = (int) (jR2 & 4294967295L);
                if (java.lang.Float.intBitsToFloat(i4) > 0.5f) {
                    aizVar.d(jR2);
                } else {
                    if (java.lang.Float.intBitsToFloat(i4) < -0.5f) {
                        aizVar.a(jR2);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i4 = (int) (jR2 & 4294967295L);
            if (java.lang.Float.intBitsToFloat(i4) > 0.5f) {
                aizVar.d(jR2);
            } else {
                if (java.lang.Float.intBitsToFloat(i4) < -0.5f) {
                    aizVar.a(jR2);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (jR != j2) {
            ajvVar3 = aizVar.b;
            if (ajvVar3.l()) {
                zL = false;
            } else {
                zL = false;
            }
            if (ajvVar3.o()) {
                defpackage.ca.bj(ajvVar3.e(), java.lang.Float.intBitsToFloat(i2));
                if (zL) {
                    zL = true;
                } else {
                    zL = true;
                }
            }
            if (ajvVar3.r()) {
                defpackage.ca.bj(ajvVar3.g(), java.lang.Float.intBitsToFloat(i7));
                if (zL) {
                    zL = true;
                } else {
                    zL = true;
                }
            }
            if (ajvVar3.i()) {
                defpackage.ca.bj(ajvVar3.a(), java.lang.Float.intBitsToFloat(i7));
                if (zL) {
                    zL = true;
                } else {
                    zL = true;
                }
            }
            if (!zL) {
                z4 = false;
            }
        } else {
            z4 = z;
        }
        if (z4) {
            aizVar.h();
        }
        return defpackage.a.ah(jFloatToRawIntBits, j10);
    }

    public final long p(long j) {
        defpackage.aqp aqpVar = (defpackage.aqp) this.a;
        return aqpVar.c(aqpVar.h, j, 1);
    }

    public final defpackage.mr q(int i) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        int iB = recyclerView.h.b();
        defpackage.mr mrVar = null;
        for (int i2 = 0; i2 < iB; i2++) {
            defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(recyclerView.h.e(i2));
            if (mrVarK != null && !mrVarK.v() && mrVarK.c == i) {
                if (!recyclerView.h.k(mrVarK.a)) {
                    mrVar = mrVarK;
                    break;
                }
                mrVar = mrVarK;
            }
        }
        if (mrVar == null || recyclerView.h.k(mrVar.a)) {
            return null;
        }
        return mrVar;
    }

    public final void r(iu iuVar) {
        int i = iuVar.a;
        if (i == 1) {
            ((android.support.v7.widget.RecyclerView) this.a).n.y(iuVar.b, iuVar.d);
            return;
        }
        if (i == 2) {
            ((android.support.v7.widget.RecyclerView) this.a).n.B(iuVar.b, iuVar.d);
            return;
        }
        if (i != 4) {
            if (i != 8) {
                return;
            }
            ((android.support.v7.widget.RecyclerView) this.a).n.A(iuVar.b, iuVar.d);
        } else {
            defpackage.mc mcVar = ((android.support.v7.widget.RecyclerView) this.a).n;
            int i2 = iuVar.b;
            int i3 = iuVar.d;
            java.lang.Object obj = iuVar.c;
            mcVar.C(i2, i3);
        }
    }

    public final void s(int i, int i2, java.lang.Object obj) {
        int i3;
        int i4;
        int i5;
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        int iB = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= iB) {
                break;
            }
            android.view.View viewE = recyclerView.h.e(i6);
            defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(viewE);
            if (mrVarK != null && !mrVarK.A() && (i5 = mrVarK.c) >= i && i5 < i3) {
                mrVarK.f(2);
                mrVarK.e(obj);
                ((defpackage.md) viewE.getLayoutParams()).e = true;
            }
            i6++;
        }
        defpackage.mh mhVar = recyclerView.e;
        java.util.ArrayList arrayList = mhVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.P = true;
                return;
            }
            defpackage.mr mrVar = (defpackage.mr) arrayList.get(size);
            if (mrVar != null && (i4 = mrVar.c) >= i && i4 < i3) {
                mrVar.f(2);
                mhVar.h(size);
            }
        }
    }

    public final void t(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        int iB = recyclerView.h.b();
        for (int i3 = 0; i3 < iB; i3++) {
            defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(recyclerView.h.e(i3));
            if (mrVarK != null && !mrVarK.A() && mrVarK.c >= i) {
                mrVarK.k(i2, false);
                recyclerView.N.f = true;
            }
        }
        java.util.ArrayList arrayList = recyclerView.e.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.mr mrVar = (defpackage.mr) arrayList.get(i4);
            if (mrVar != null && mrVar.c >= i) {
                mrVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.O = true;
    }

    public final void u(int i, int i2) {
        int i3;
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        int iB = recyclerView.h.b();
        int i4 = 0;
        while (true) {
            if (i4 >= iB) {
                break;
            }
            defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(recyclerView.h.e(i4));
            if (mrVarK != null) {
                int i5 = i < i2 ? i : i2;
                int i6 = mrVarK.c;
                if (i6 >= i5) {
                    if (i6 <= (i < i2 ? i2 : i)) {
                        if (i6 == i) {
                            mrVarK.k(i2 - i, false);
                        } else {
                            mrVarK.k(i >= i2 ? 1 : -1, false);
                        }
                        recyclerView.N.f = true;
                    }
                }
            }
            i4++;
        }
        defpackage.mh mhVar = recyclerView.e;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        java.util.ArrayList arrayList = mhVar.c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            defpackage.mr mrVar = (defpackage.mr) arrayList.get(i9);
            if (mrVar != null && (i3 = mrVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    mrVar.k(i2 - i, false);
                } else {
                    mrVar.k(i < i2 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.O = true;
    }

    public final void v(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        recyclerView.P(i, i2, true);
        recyclerView.O = true;
        recyclerView.N.c += i2;
    }

    public final int w() {
        return ((android.support.v7.widget.RecyclerView) this.a).getChildCount();
    }

    public final int x(android.view.View view) {
        return ((android.support.v7.widget.RecyclerView) this.a).indexOfChild(view);
    }

    public final android.view.View y(int i) {
        return ((android.support.v7.widget.RecyclerView) this.a).getChildAt(i);
    }

    public final void z(android.view.View view) {
        defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(view);
        if (mrVarK != null) {
            ((android.support.v7.widget.RecyclerView) this.a).ar(mrVarK, mrVarK.o);
            mrVarK.o = 0;
        }
    }

    public /* synthetic */ izq(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }
}
