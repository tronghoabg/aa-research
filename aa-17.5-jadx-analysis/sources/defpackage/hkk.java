package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class hkk implements afec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ hkk(afdr afdrVar, afdr afdrVar2, boolean z, obi obiVar, int i) {
        this.e = i;
        this.d = afdrVar;
        this.b = afdrVar2;
        this.a = z;
        this.c = obiVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [afdr, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.e;
        if (i == 0) {
            giz gizVar = (giz) obj;
            gizVar.getClass();
            return Boolean.valueOf((gizVar != giz.a || this.b == null) ? (gizVar == giz.b && this.a) ? ((cil) this.d).a(7) : false : ((cil) this.c).a(7));
        }
        if (i == 1) {
            Throwable th = (Throwable) obj;
            if (th instanceof fls) {
                ((fjn) this.c).g(((fls) th).a);
            }
            if (this.a && this.b != null) {
                ((flz) this.d).a.hashCode();
            }
            return afak.a;
        }
        cmd cmdVar = (cmd) obj;
        cmdVar.getClass();
        long jC = ebf.C(((Boolean) this.b.invoke()).booleanValue(), this.a, (oax) this.d.invoke());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cmdVar.o() >> 32));
        long jO = cmdVar.o() & 4294967295L;
        Object obj2 = this.c;
        float fA = ((obi) obj2).a(fIntBitsToFloat, Float.intBitsToFloat((int) jO));
        cma cmaVarR = cmdVar.r();
        long jA = cmaVarR.a();
        cmaVarR.b().g();
        try {
            cmaVarR.c.k(fA, fA, 0L);
            czz.aJ(cmdVar, ((obi) obj2).a, jC, null, 60);
            cmaVarR.b().e();
            cmaVarR.h(jA);
            return afak.a;
        } catch (Throwable th2) {
            cmaVarR.b().e();
            cmaVarR.h(jA);
            throw th2;
        }
    }

    public /* synthetic */ hkk(fjn fjnVar, boolean z, String str, flz flzVar, int i) {
        this.e = i;
        this.c = fjnVar;
        this.a = z;
        this.b = str;
        this.d = flzVar;
    }

    public /* synthetic */ hkk(hju hjuVar, cil cilVar, boolean z, cil cilVar2, int i) {
        this.e = i;
        this.b = hjuVar;
        this.c = cilVar;
        this.a = z;
        this.d = cilVar2;
    }
}
