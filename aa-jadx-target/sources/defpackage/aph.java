package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aph extends defpackage.apj implements defpackage.apy {
    public final aiyk a;
    public aiwg b;
    private final /* synthetic */ defpackage.apy h;
    private final defpackage.affc i;
    private final defpackage.kwv j;

    public aph(defpackage.apy apyVar, defpackage.aqp aqpVar, defpackage.kwv kwvVar, defpackage.affg affgVar, defpackage.dlo dloVar, defpackage.affc affcVar) {
        super(aqpVar, affgVar, dloVar);
        this.h = apyVar;
        this.j = kwvVar;
        this.i = affcVar;
        this.a = defpackage.afqt.q(Integer.MAX_VALUE, 0, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object d(defpackage.aph aphVar, defpackage.afgv afgvVar, afgu afguVar, defpackage.afgv afgvVar2, long j, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.apg apgVar;
        boolean z;
        if (afdkVar instanceof defpackage.apg) {
            apgVar = (defpackage.apg) afdkVar;
            int i = apgVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                apgVar.b = i - Integer.MIN_VALUE;
            } else {
                apgVar = new defpackage.apg(afdkVar);
            }
        } else {
            apgVar = new defpackage.apg(afdkVar);
        }
        java.lang.Object objC = apgVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = apgVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(objC);
            if (j < 0) {
                return java.lang.Boolean.FALSE;
            }
            long j2 = aitq.a;
            long jF = agac.f(j, aits.c);
            defpackage.adh adhVar = new defpackage.adh(aphVar, (defpackage.afdk) null, 9);
            apgVar.c = aphVar;
            apgVar.d = afgvVar;
            apgVar.e = afguVar;
            apgVar.f = afgvVar2;
            apgVar.b = 1;
            objC = aibv.c(jF, adhVar, apgVar);
            if (objC == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afgvVar2 = apgVar.f;
            afguVar = apgVar.e;
            afgvVar = apgVar.d;
            aphVar = apgVar.c;
            defpackage.afga.cz(objC);
        }
        defpackage.apd apdVar = (defpackage.apd) objC;
        if (apdVar != null) {
            boolean z2 = ((defpackage.apd) afgvVar.a).c;
            afgvVar.a = new defpackage.apd(apdVar.a, apdVar.b);
            afguVar.a = aphVar.b(((defpackage.apd) afgvVar.a).a);
            afgvVar2.a = defpackage.ca.B(0.0f, 0.0f);
            aphVar.e(apdVar);
            z = !h(afguVar.a);
        } else {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final defpackage.apd g(aiyk aiykVar) {
        defpackage.apd apdVarA = null;
        java.util.Iterator itA = new defpackage.afcb(new defpackage.apl(new defpackage.aln(aiykVar, 7), null), 3).a();
        while (itA.hasNext()) {
            defpackage.apd apdVar = (defpackage.apd) itA.next();
            apdVarA = apdVarA == null ? apdVar : apdVarA.a(apdVar);
        }
        return apdVarA;
    }

    public static final boolean h(long j) {
        return java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) < 0.5f;
    }

    public static final long i(long j, long j2) {
        return java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final long k(long j, long j2) {
        return java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Override // defpackage.apy
    public final long a(long j) {
        throw null;
    }

    @Override // defpackage.apy
    public final long b(long j) {
        return this.h.b(j);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:32:0x010c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0126, code lost:
    
        if (r0.invoke(r1, r8) == r9) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.apd r16, float r17, float r18, defpackage.afdk r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aph.c(apd, float, float, afdk):java.lang.Object");
    }

    public final void e(defpackage.apd apdVar) {
        this.g.p(apdVar.b, apdVar.a);
    }

    @Override // defpackage.apj
    protected final boolean f(defpackage.cqu cquVar) {
        return cquVar.e == 6;
    }

    @Override // defpackage.apj
    protected final boolean j(defpackage.cqu cquVar) {
        android.view.ViewConfiguration viewConfiguration = (android.view.ViewConfiguration) this.j.a;
        float f = -a$.ExternalSyntheticApiModelOutline1.m$1(viewConfiguration);
        float f2 = -a$.ExternalSyntheticApiModelOutline1.m(viewConfiguration);
        defpackage.cji cjiVar = new defpackage.cji(0L);
        java.util.List list = cquVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cjiVar = new defpackage.cji(defpackage.a.ah(cjiVar.a, ((defpackage.crd) list.get(i)).j));
        }
        long j = cjiVar.a;
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        return ((java.lang.Boolean) this.i.invoke(new defpackage.apx(b(jFloatToRawIntBits)))).booleanValue() ? aiyo.c(this.a.j(new defpackage.apd(jFloatToRawIntBits, ((defpackage.crd) defpackage.afga.az(list)).b))) : this.e;
    }

    public final long l(defpackage.izq izqVar, long j) {
        return b(izqVar.p(this.h.a(j)));
    }
}
