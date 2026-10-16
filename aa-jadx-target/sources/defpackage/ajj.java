package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajj extends defpackage.cwo implements defpackage.czc {
    public defpackage.aje a;
    public float b;
    public defpackage.cka c;
    public defpackage.cld d;
    public final defpackage.chf e;

    public ajj(float f, defpackage.cka ckaVar, defpackage.cld cldVar) {
        this.b = f;
        this.c = ckaVar;
        this.d = cldVar;
        defpackage.chf chfVar = new defpackage.chf(new defpackage.chg(), new defpackage.affc() { // from class: aji
            /* JADX WARN: Code duplicated, block: B:35:0x015c  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v10, types: [cmj, cml] */
            /* JADX WARN: Type inference failed for: r1v19, types: [float] */
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
            @Override // defpackage.affc
            public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.Throwable {
                boolean z;
                final defpackage.dai cmoVar;
                byte[] bArr;
                defpackage.cjx cjxVar;
                int i;
                boolean z2;
                defpackage.ckc ckcVarB;
                defpackage.chg chgVar = (defpackage.chg) obj;
                defpackage.ajj ajjVar = this.a;
                if (ajjVar.b * chgVar.a() < 0.0f || defpackage.cjl.b(chgVar.n()) <= 0.0f) {
                    return chgVar.q(new defpackage.ajg(0));
                }
                final float fMin = java.lang.Math.min(java.lang.Float.compare(ajjVar.b, 0.0f) == 0 ? 1.0f : (float) java.lang.Math.ceil(ajjVar.b * chgVar.a()), (float) java.lang.Math.ceil(defpackage.cjl.b(chgVar.n()) / 2.0f));
                final float f2 = fMin / 2.0f;
                long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2);
                long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f2);
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (chgVar.n() >> 32)) - fMin;
                float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (chgVar.n() & 4294967295L)) - fMin;
                long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
                long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat2);
                float f3 = fMin + fMin;
                final boolean z3 = f3 > defpackage.cjl.b(chgVar.n());
                defpackage.cku ckuVarA = ajjVar.d.a(chgVar.n(), chgVar.o(), chgVar);
                if (!(ckuVarA instanceof defpackage.ckr)) {
                    final long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
                    final long j2 = (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L);
                    if (!(ckuVarA instanceof defpackage.ckt)) {
                        if (!(ckuVarA instanceof defpackage.cks)) {
                            throw new defpackage.afas();
                        }
                        final defpackage.cka ckaVar2 = ajjVar.c;
                        if (z3) {
                            j = 0;
                            z = true;
                        } else {
                            z = false;
                        }
                        final long j3 = j;
                        final long jN = z ? chgVar.n() : j2;
                        if (z) {
                            cmoVar = defpackage.cmn.a;
                        } else {
                            cmoVar = new defpackage.cmo(fMin, 0.0f, 0, 0, 30);
                        }
                        return chgVar.q(new defpackage.affc() { // from class: ajf
                            @Override // defpackage.affc
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                defpackage.cxn cxnVar = (defpackage.cxn) obj2;
                                cxnVar.q();
                                defpackage.dai.aI(cxnVar, ckaVar2, j3, jN, cmoVar, 0, 104);
                                return defpackage.afbk.a;
                            }
                        });
                    }
                    final defpackage.cka ckaVar3 = ajjVar.c;
                    defpackage.cjk cjkVar = ((defpackage.ckt) ckuVarA).a;
                    if (defpackage.bzo.B(cjkVar)) {
                        final long j4 = cjkVar.e;
                        final defpackage.cmo cmoVar2 = new defpackage.cmo(fMin, 0.0f, 0, 0, 30);
                        return chgVar.q(new defpackage.affc() { // from class: ajh
                            @Override // defpackage.affc
                            public final java.lang.Object invoke(java.lang.Object obj2) throws java.lang.Throwable {
                                long j5;
                                defpackage.cxn cxnVar = (defpackage.cxn) obj2;
                                cxnVar.q();
                                long j6 = j4;
                                defpackage.cka ckaVar4 = ckaVar3;
                                if (z3) {
                                    defpackage.dai.aE(cxnVar, ckaVar4, 0L, 0L, j6, null, 246);
                                } else {
                                    float f4 = f2;
                                    if (java.lang.Float.intBitsToFloat((int) (j6 >> 32)) < f4) {
                                        float f5 = fMin;
                                        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32)) - f5;
                                        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (cxnVar.o() & 4294967295L)) - f5;
                                        defpackage.cmi cmiVarR = cxnVar.r();
                                        long jA = cmiVarR.a();
                                        cmiVarR.b().g();
                                        try {
                                            cmiVarR.c.h(f5, f5, fIntBitsToFloat3, fIntBitsToFloat4, 0);
                                            j5 = jA;
                                            try {
                                                defpackage.dai.aE(cxnVar, ckaVar4, 0L, 0L, j6, null, 246);
                                                cmiVarR.b().e();
                                                cmiVarR.h(j5);
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                cmiVarR.b().e();
                                                cmiVarR.h(j5);
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            j5 = jA;
                                        }
                                    } else {
                                        defpackage.cmo cmoVar3 = cmoVar2;
                                        defpackage.dai.aE(cxnVar, ckaVar4, j, j2, defpackage.afw.C(j6, f4), cmoVar3, 208);
                                    }
                                }
                                return defpackage.afbk.a;
                            }
                        });
                    }
                    if (ajjVar.a == null) {
                        bArr = null;
                        ajjVar.a = new defpackage.aje(null);
                    } else {
                        bArr = null;
                    }
                    defpackage.aje ajeVar = ajjVar.a;
                    ajeVar.getClass();
                    defpackage.cju cjuVarA = ajeVar.a();
                    cjuVarA.k();
                    cjuVarA.r(cjkVar);
                    if (!z3) {
                        defpackage.cju cjuVar = new defpackage.cju(bArr);
                        cjuVar.r(new defpackage.cjk(fMin, fMin, cjkVar.b() - fMin, cjkVar.a() - fMin, defpackage.afw.C(cjkVar.e, fMin), defpackage.afw.C(cjkVar.f, fMin), defpackage.afw.C(cjkVar.g, fMin), defpackage.afw.C(cjkVar.h, fMin)));
                        cjuVarA.o(cjuVarA, cjuVar, 0);
                    }
                    return chgVar.q(new defpackage.abp(cjuVarA, ckaVar3, 20, bArr));
                }
                defpackage.cka ckaVar4 = ajjVar.c;
                defpackage.ckr ckrVar = (defpackage.ckr) ckuVarA;
                if (z3) {
                    return chgVar.q(new defpackage.ajy(ckrVar, ckaVar4, 1));
                }
                if (ckaVar4 instanceof defpackage.clf) {
                    long j5 = ((defpackage.clf) ckaVar4).a;
                    float fD = defpackage.ckd.d(j5);
                    float fC = defpackage.ckd.c(j5);
                    float fB = defpackage.ckd.b(j5);
                    float[] fArr = defpackage.clr.a;
                    cjxVar = new defpackage.cjx(defpackage.cjv.k(fD, fC, fB, 1.0f, defpackage.clr.y[(int) (j5 & 63)]), 5);
                    i = 1;
                } else {
                    cjxVar = null;
                    i = 0;
                }
                defpackage.cju cjuVar2 = ckrVar.a;
                defpackage.cjj cjjVarB = cjuVar2.b();
                if (ajjVar.a == null) {
                    ajjVar.a = new defpackage.aje(null);
                }
                defpackage.aje ajeVar2 = ajjVar.a;
                ajeVar2.getClass();
                defpackage.cju cjuVarA2 = ajeVar2.a();
                cjuVarA2.k();
                cjuVarA2.q(cjjVarB);
                cjuVarA2.o(cjuVarA2, cjuVar2, 0);
                defpackage.afgv afgvVar = new defpackage.afgv();
                float f4 = cjjVarB.d;
                float f5 = cjjVarB.b;
                float fCeil = (float) java.lang.Math.ceil(f4 - f5);
                float f6 = cjjVarB.e;
                float f7 = cjjVarB.c;
                long j6 = ((long) ((int) fCeil)) << 32;
                int iCeil = (int) java.lang.Math.ceil(f6 - f7);
                int i2 = i;
                long j7 = ((long) iCeil) & 4294967295L;
                defpackage.aje ajeVar3 = ajjVar.a;
                ajeVar3.getClass();
                defpackage.cjr cjrVarF = ajeVar3.c;
                defpackage.ckc ckcVar = ajeVar3.a;
                defpackage.ckm ckmVar = cjrVarF != null ? new defpackage.ckm(cjrVarF.a()) : null;
                if (ckmVar != null && ckmVar.a == 0) {
                    z2 = true;
                } else {
                    if (defpackage.ckm.a(i2, cjrVarF != null ? new defpackage.ckm(cjrVarF.a()) : null)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                long j8 = j6 | j7;
                if (cjrVarF == null || ckcVar == 0 || java.lang.Float.intBitsToFloat((int) (chgVar.n() >> 32)) > cjrVarF.c() || java.lang.Float.intBitsToFloat((int) (chgVar.n() & 4294967295L)) > cjrVarF.b() || !z2) {
                    cjrVarF = defpackage.cjv.f((int) (j8 >> 32), (int) (j8 & 4294967295L), i2, 24);
                    ajeVar3.c = cjrVarF;
                    ckcVarB = defpackage.cjn.b(cjrVarF);
                    ajeVar3.a = ckcVarB;
                } else {
                    ckcVarB = ckcVar;
                }
                defpackage.cmj cmjVar = ajeVar3.b;
                if (cmjVar == null) {
                    cmjVar = new defpackage.cmj();
                    ajeVar3.b = cmjVar;
                }
                long jF = defpackage.dlv.f(j8);
                defpackage.dlz dlzVarO = chgVar.o();
                defpackage.cmh cmhVar = cmjVar.a;
                defpackage.dlo dloVar = cmhVar.a;
                defpackage.dlz dlzVar = cmhVar.b;
                defpackage.cmj cmjVar2 = cmjVar;
                defpackage.ckc ckcVar2 = cmhVar.c;
                long j9 = cmhVar.d;
                cmhVar.a = chgVar;
                cmhVar.b = dlzVarO;
                cmhVar.c = ckcVarB;
                cmhVar.d = jF;
                ckcVarB.g();
                defpackage.dai.U(cmjVar2, -72057594037927936L, 0L, jF, 0.0f, null, 58);
                defpackage.cmj cmjVarIntBitsToFloat = cmjVar2;
                float f8 = -f5;
                float f9 = -f7;
                defpackage.cmi cmiVar = cmjVarIntBitsToFloat.b;
                defpackage.izq izqVar = cmiVar.c;
                izqVar.l(f8, f9);
                float f10 = -f9;
                float f11 = -f8;
                try {
                    try {
                        defpackage.dai.aG(cmjVarIntBitsToFloat, cjuVar2, ckaVar4, 0.0f, new defpackage.cmo(f3, 0.0f, 0, 0, 30), 52);
                        float fIntBitsToFloat3 = (java.lang.Float.intBitsToFloat((int) (cmiVar.a() >> 32)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (cmiVar.a() >> 32));
                        defpackage.cjr cjrVar = cjrVarF;
                        cmjVarIntBitsToFloat = (java.lang.Float.intBitsToFloat((int) (cmiVar.a() & 4294967295L)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (cmiVar.a() & 4294967295L));
                        long jY = defpackage.bzo.y(cmiVar.a());
                        long jA = cmiVar.a();
                        cmiVar.b().g();
                        try {
                            izqVar.k(fIntBitsToFloat3, cmjVarIntBitsToFloat, jY);
                            defpackage.dai.aG(cmjVarIntBitsToFloat, cjuVarA2, ckaVar4, 0.0f, null, 28);
                            cmiVar.b().e();
                            cmiVar.h(jA);
                            cmjVarIntBitsToFloat.b.c.l(f11, f10);
                            ckcVarB.e();
                            defpackage.cmh cmhVar2 = cmjVarIntBitsToFloat.a;
                            cmhVar2.a = dloVar;
                            cmhVar2.b = dlzVar;
                            cmhVar2.c = ckcVar2;
                            cmhVar2.d = j9;
                            cjrVar.d();
                            afgvVar.a = cjrVar;
                            return chgVar.q(new defpackage.dfh(cjjVarB, afgvVar, j8, cjxVar, 1));
                        } catch (java.lang.Throwable th) {
                            cmiVar.b().e();
                            cmiVar.h(jA);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        cmjVarIntBitsToFloat = cmjVarIntBitsToFloat;
                        cmjVarIntBitsToFloat.b.c.l(f11, f10);
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    cmjVarIntBitsToFloat.b.c.l(f11, f10);
                    throw th;
                }
            }
        });
        W(chfVar);
        this.e = chfVar;
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        dekVar.a(defpackage.def.U, this.d);
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final boolean z() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }
}
