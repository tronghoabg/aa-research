package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class afl implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ afl(defpackage.aeb aebVar, defpackage.aek aekVar, defpackage.affc affcVar, defpackage.afgq afgqVar, int i) {
        this.e = i;
        this.b = aebVar;
        this.a = aekVar;
        this.c = affcVar;
        this.d = afgqVar;
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23, types: [bam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [apw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [affc, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.e;
        if (i == 0) {
            long jLongValue = ((java.lang.Long) obj).longValue();
            defpackage.bys bysVar = (defpackage.bys) this.a.a();
            long jLongValue2 = bysVar != null ? ((java.lang.Number) bysVar.a()).longValue() : jLongValue;
            ?? r12 = this.d;
            java.lang.Object obj2 = this.c;
            defpackage.afo afoVar = (defpackage.afo) this.b;
            if (afoVar.b == Long.MIN_VALUE || ((afgs) obj2).a != defpackage.afw.c(r12.c())) {
                afoVar.b = jLongValue;
                defpackage.bzc bzcVar = afoVar.a;
                java.lang.Object[] objArr = bzcVar.a;
                int i2 = bzcVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((defpackage.afk) objArr[i3]).f = true;
                }
                ((afgs) obj2).a = defpackage.afw.c(r12.c());
            }
            float f = ((afgs) obj2).a;
            if (f == 0.0f) {
                defpackage.bzc bzcVar2 = afoVar.a;
                java.lang.Object[] objArr2 = bzcVar2.a;
                int i4 = bzcVar2.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    defpackage.afk afkVar = (defpackage.afk) objArr2[i5];
                    afkVar.b(afkVar.d.a);
                    afkVar.f = true;
                }
            } else {
                float f2 = (jLongValue2 - afoVar.b) / f;
                defpackage.bzc bzcVar3 = afoVar.a;
                java.lang.Object[] objArr3 = bzcVar3.a;
                int i6 = bzcVar3.b;
                boolean z = true;
                for (int i7 = 0; i7 < i6; i7++) {
                    defpackage.afk afkVar2 = (defpackage.afk) objArr3[i7];
                    boolean zH = afkVar2.e;
                    if (!zH) {
                        long j = (long) f2;
                        afkVar2.h.b(false);
                        if (afkVar2.f) {
                            afkVar2.f = false;
                            afkVar2.g = j;
                        }
                        long j2 = j - afkVar2.g;
                        afkVar2.b(afkVar2.d.c(j2));
                        zH = defpackage.ca.H(afkVar2.d, j2);
                        afkVar2.e = zH;
                    }
                    z &= zH;
                }
                afoVar.c.b(java.lang.Boolean.valueOf(!z));
            }
            return defpackage.afbk.a;
        }
        if (i == 1) {
            java.lang.Object obj3 = this.b;
            defpackage.aeb aebVar = (defpackage.aeb) obj3;
            defpackage.aek aekVar = aebVar.b;
            defpackage.aei aeiVar = (defpackage.aei) obj;
            defpackage.afw.h(aeiVar, aekVar);
            java.lang.Object objB = aebVar.b(aeiVar.a());
            boolean zF = defpackage.afga.f(objB, aeiVar.a());
            ?? r5 = this.c;
            if (!zF) {
                java.lang.Object obj4 = this.a;
                aekVar.c(objB);
                ((defpackage.aek) obj4).c(objB);
                if (r5 != 0) {
                    r5.invoke(obj3);
                }
                java.lang.Object obj5 = this.d;
                aeiVar.b();
                ((defpackage.afgq) obj5).a = true;
            } else if (r5 != 0) {
                r5.invoke(obj3);
            }
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.aei aeiVar2 = (defpackage.aei) obj;
            float fFloatValue = ((java.lang.Number) aeiVar2.a()).floatValue();
            afgs afgsVar = (afgs) this.c;
            float f3 = fFloatValue - afgsVar.a;
            float fA = this.a.a(f3);
            afgsVar.a = ((java.lang.Number) aeiVar2.a()).floatValue();
            ((afgs) this.d).a = ((java.lang.Number) aeiVar2.f.a.invoke(aeiVar2.c)).floatValue();
            if (java.lang.Math.abs(f3 - fA) > 0.5f) {
                aeiVar2.b();
            }
            ((defpackage.anm) this.b).a++;
            return defpackage.afbk.a;
        }
        if (i == 3) {
            defpackage.aei aeiVar3 = (defpackage.aei) obj;
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(((java.lang.Number) aeiVar3.a()).floatValue());
            afgu afguVar = (afgu) this.d;
            long jI = defpackage.aph.i(jFloatToRawIntBits, afguVar.a);
            if (!defpackage.aph.h(jI)) {
                if (!defpackage.aph.h(defpackage.aph.i(jI, ((defpackage.aph) this.b).l((defpackage.izq) this.a, jI)))) {
                    aeiVar3.b();
                    return defpackage.afbk.a;
                }
                afguVar.a = defpackage.aph.k(afguVar.a, jI);
            }
            if (((java.lang.Boolean) this.c.invoke(new defpackage.apx(afguVar.a))).booleanValue()) {
                aeiVar3.b();
            }
            return defpackage.afbk.a;
        }
        if (i != 4) {
            if (i == 5) {
                defpackage.skd skdVar = new defpackage.skd((defpackage.ngb) this.b, (defpackage.cvl) this.d, this.c);
                java.lang.Object obj6 = this.a;
                ((defpackage.azy) obj6).f = skdVar;
                return new defpackage.agq(obj6, 3);
            }
            defpackage.beg begVar = (defpackage.beg) this.b;
            if (begVar.q()) {
                begVar.u = defpackage.asq.W((defpackage.fbl) this.d, (defpackage.dkd) this.c, begVar.s, (defpackage.djl) this.a, begVar.m, begVar.n);
            }
            return new defpackage.bdu(0);
        }
        defpackage.aph aphVar = (defpackage.aph) this.b;
        defpackage.apx apxVar = (defpackage.apx) obj;
        defpackage.apd apdVarG = defpackage.aph.g(aphVar.a);
        if (apdVarG != null) {
            java.lang.Object obj7 = this.a;
            java.lang.Object obj8 = this.c;
            java.lang.Object obj9 = this.d;
            aphVar.e(apdVarG);
            defpackage.afgv afgvVar = (defpackage.afgv) obj9;
            afgvVar.a = ((defpackage.apd) afgvVar.a).a(apdVarG);
            long jB = aphVar.b(((defpackage.apd) afgvVar.a).a);
            ((afgu) obj8).a = jB;
            ((defpackage.afgq) obj7).a = !defpackage.aph.h(defpackage.aph.i(jB, apxVar.a));
        }
        return java.lang.Boolean.valueOf(apdVarG != null);
    }

    public /* synthetic */ afl(afgs afgsVar, defpackage.apw apwVar, afgs afgsVar2, defpackage.anm anmVar, int i) {
        this.e = i;
        this.c = afgsVar;
        this.a = apwVar;
        this.d = afgsVar2;
        this.b = anmVar;
    }

    public /* synthetic */ afl(defpackage.aph aphVar, afgu afguVar, defpackage.izq izqVar, defpackage.affc affcVar, int i) {
        this.e = i;
        this.b = aphVar;
        this.d = afguVar;
        this.a = izqVar;
        this.c = affcVar;
    }

    public /* synthetic */ afl(defpackage.azy azyVar, defpackage.ngb ngbVar, defpackage.cvl cvlVar, defpackage.bam bamVar, int i) {
        this.e = i;
        this.a = azyVar;
        this.b = ngbVar;
        this.d = cvlVar;
        this.c = bamVar;
    }

    public /* synthetic */ afl(defpackage.bwx bwxVar, defpackage.afo afoVar, afgs afgsVar, aiuw aiuwVar, int i) {
        this.e = i;
        this.a = bwxVar;
        this.b = afoVar;
        this.c = afgsVar;
        this.d = aiuwVar;
    }

    public /* synthetic */ afl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.e = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.a = obj4;
    }
}
