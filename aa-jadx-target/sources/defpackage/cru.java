package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cru implements defpackage.dlo, defpackage.afdk {
    public aiuf a;
    final /* synthetic */ defpackage.crv b;
    private final /* synthetic */ defpackage.crv c;
    private final defpackage.afdk d;
    private defpackage.cqv e = defpackage.cqv.b;
    private final defpackage.afdo f = defpackage.afdp.a;

    public cru(defpackage.crv crvVar, defpackage.afdk afdkVar) {
        this.b = crvVar;
        this.c = crvVar;
        this.d = afdkVar;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.c.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.c.b();
    }

    @Override // defpackage.dlu
    public final float dE(long j) {
        return defpackage.dln.n(this.c, j);
    }

    @Override // defpackage.dlo
    public final float dF(float f) {
        return (f / this.c.a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final float dG(int i) {
        return (i / this.c.a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final float dH(long j) {
        return defpackage.dln.p(this.c, j);
    }

    @Override // defpackage.dlo
    public final float dI(float f) {
        return f * this.c.a();
    }

    @Override // defpackage.dlo
    public final int dM(long j) {
        throw null;
    }

    @Override // defpackage.dlo
    public final int dN(float f) {
        return defpackage.dln.q(this.c, f);
    }

    @Override // defpackage.dlo
    public final long dO(long j) {
        return defpackage.dln.r(this.c, j);
    }

    @Override // defpackage.dlo
    public final long dP(long j) {
        return defpackage.dln.s(this.c, j);
    }

    @Override // defpackage.dlu
    public final long dQ(float f) {
        return defpackage.dln.o(this.c, f);
    }

    @Override // defpackage.dlo
    public final long dR(float f) {
        defpackage.crv crvVar = this.c;
        return defpackage.dln.o(crvVar, (f / crvVar.a()) + 0.0f);
    }

    @Override // defpackage.afdk
    public final defpackage.afdo gT() {
        return this.f;
    }

    public final long n() {
        defpackage.crv crvVar = this.b;
        long jS = defpackage.dln.s(crvVar, crvVar.n().g());
        long j = crvVar.g;
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jS >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jS & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final long o() {
        return this.b.g;
    }

    public final defpackage.cqu p() {
        return this.b.d;
    }

    public final defpackage.dck q() {
        return this.b.n();
    }

    public final java.lang.Object r(defpackage.cqv cqvVar, defpackage.afdk afdkVar) {
        aiug aiugVar = new aiug(defpackage.afga.s(afdkVar), 1);
        aiugVar.z();
        this.e = cqvVar;
        this.a = aiugVar;
        return aiugVar.k();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [cru, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [aiwg] */
    /* JADX WARN: Type inference failed for: r10v4, types: [aiwg] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public final java.lang.Object s(long j, defpackage.affg affgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        crs crsVar;
        aiuf aiufVar;
        if (afdkVar instanceof crs) {
            crsVar = (crs) afdkVar;
            int i = crsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                crsVar.d = i - Integer.MIN_VALUE;
            } else {
                crsVar = new crs((defpackage.cru) this, afdkVar);
            }
        } else {
            crsVar = new crs((defpackage.cru) this, afdkVar);
        }
        java.lang.Object objInvoke = crsVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = crsVar.d;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(objInvoke);
                if (j <= 0 && (aiufVar = this.a) != null) {
                    aiufVar.w(defpackage.afga.cy(new defpackage.cqw(j)));
                }
                aiwg aiwgVarD = ahoc.d(this.b.N(), (defpackage.afdo) null, 0, new dml(j, (defpackage.cru) this, (defpackage.afdk) null, 1), 3);
                crsVar.a = aiwgVarD;
                crsVar.d = 1;
                objInvoke = affgVar.invoke(this, crsVar);
                this = aiwgVarD;
                if (objInvoke == afdrVar) {
                    return afdrVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj = crsVar.a;
                defpackage.afga.cz(objInvoke);
                this = obj;
            }
            this.s(cql.a);
            return objInvoke;
        } catch (java.lang.Throwable th) {
            this.s(cql.a);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object t(long j, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        crt crtVar;
        if (afdkVar instanceof crt) {
            crtVar = (crt) afdkVar;
            int i = crtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                crtVar.c = i - Integer.MIN_VALUE;
            } else {
                crtVar = new crt(this, afdkVar);
            }
        } else {
            crtVar = new crt(this, afdkVar);
        }
        java.lang.Object obj = crtVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = crtVar.c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.afga.cz(obj);
                return obj;
            }
            defpackage.afga.cz(obj);
            crtVar.c = 1;
            java.lang.Object objS = s(j, affgVar, crtVar);
            return objS == afdrVar ? afdrVar : objS;
        } catch (defpackage.cqw unused) {
            return null;
        }
    }

    public final void v(defpackage.cqu cquVar, defpackage.cqv cqvVar) {
        aiuf aiufVar;
        if (cqvVar != this.e || (aiufVar = this.a) == null) {
            return;
        }
        this.a = null;
        aiufVar.w(cquVar);
    }

    @Override // defpackage.afdk
    public final void w(java.lang.Object obj) {
        defpackage.crv crvVar = this.b;
        synchronized (crvVar.f) {
            crvVar.e.m(this);
        }
        this.d.w(obj);
    }
}
