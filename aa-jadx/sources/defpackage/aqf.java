package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aqf implements defpackage.cqc {
    public boolean a;
    private final defpackage.aqp b;

    public aqf(defpackage.aqp aqpVar, boolean z) {
        this.b = aqpVar;
        this.a = z;
    }

    @Override // defpackage.cqc
    public final long a(long j, long j2, int i) {
        if (!this.a) {
            return 0L;
        }
        defpackage.aqp aqpVar = this.b;
        if (aqpVar.a.i()) {
            return 0L;
        }
        return aqpVar.f(aqpVar.a(aqpVar.a.a(aqpVar.a(aqpVar.b(j2)))));
    }

    @Override // defpackage.cqc
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cqc
    public final java.lang.Object c(long j, long j2, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aqe aqeVar;
        long jR;
        if (afdkVar instanceof defpackage.aqe) {
            aqeVar = (defpackage.aqe) afdkVar;
            int i = aqeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqeVar.d = i - Integer.MIN_VALUE;
            } else {
                aqeVar = new defpackage.aqe(this, afdkVar);
            }
        } else {
            aqeVar = new defpackage.aqe(this, afdkVar);
        }
        java.lang.Object objG = aqeVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aqeVar.d;
        if (i2 == 0) {
            defpackage.afga.cz(objG);
            jR = 0;
            if (this.a) {
                defpackage.aqp aqpVar = this.b;
                if (!aqpVar.f) {
                    aqeVar.a = j2;
                    aqeVar.d = 1;
                    objG = aqpVar.g(j2, aqeVar);
                    if (objG == afdrVar) {
                        return afdrVar;
                    }
                }
                jR = defpackage.acmj.r(j2, jR);
            }
            return new defpackage.dmd(jR);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = aqeVar.a;
        defpackage.afga.cz(objG);
        j2 = j3;
        jR = ((defpackage.dmd) objG).a;
        jR = defpackage.acmj.r(j2, jR);
        return new defpackage.dmd(jR);
    }

    @Override // defpackage.cqc
    public final /* synthetic */ java.lang.Object d(long j, defpackage.afdk afdkVar) {
        return new defpackage.dmd(0L);
    }
}
