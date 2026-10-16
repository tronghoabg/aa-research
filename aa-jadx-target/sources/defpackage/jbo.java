package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jbo extends defpackage.jbq {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.INST");
    private final defpackage.jbn b;

    public jbo(defpackage.jbn jbnVar, defpackage.jbu jbuVar) {
        super(13, jbnVar, jbuVar, 0);
        this.b = jbnVar;
    }

    @Override // defpackage.jbq
    public final void a(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        if (i != 32770) {
            a.g().ai(1780).w("Invalid message type: %d", i);
            return;
        }
        xnf xnfVarA = defpackage.abox.A(xnf.a, byteBuffer, defpackage.abol.a());
        defpackage.jbn jbnVar = this.b;
        java.lang.String str = xnfVarA.c;
        java.lang.String str2 = xnfVarA.d;
        xkz xkzVar = xnfVarA.b;
        if (xkzVar == null) {
            xkzVar = xkz.a;
        }
        int iAC = defpackage.a.aC(xkzVar.c);
        if (iAC == 0) {
            iAC = 1;
        }
        defpackage.aba abaVar = ((defpackage.ikr) jbnVar).b;
        synchronized (abaVar) {
            for (int i2 = 0; i2 < abaVar.d; i2++) {
                try {
                    ((defpackage.ikq) abaVar.g(i2)).a.f(str, str2, iAC - 1);
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ikr.a.h()).p(e)).ai(173)).u("Error calling onInput()");
                }
            }
        }
    }

    @Override // defpackage.ize
    public final void b(int i) {
    }
}
