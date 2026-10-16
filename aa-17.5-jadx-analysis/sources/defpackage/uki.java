package defpackage;

/* loaded from: classes3.dex */
final class uki {
    final int a;
    aemo b = null;
    int c;

    public uki(int i, int i2) {
        this.a = i;
        this.c = i2;
    }

    public final synchronized void a(abfj abfjVar) {
        aemq aemqVar;
        int i = this.c;
        if (i >= 0) {
            try {
                abet abetVar = abet.a;
                abpc abpcVarL = abnv.L(abet.class);
                byte[] bArr = abfjVar.s;
                abfo abfoVar = abfjVar.c;
                abet abetVar2 = (abet) abpcVarL.k(bArr, abfoVar.b(i), abfoVar.a(i), abfjVar.a);
                if (abetVar2.b.size() != abetVar2.c.size()) {
                    ((ynz) ((ynz) ukj.a.g()).ai((char) 9397)).u("InternalStyle transform input has style id count mismatch and will be ignored.");
                    aemqVar = null;
                } else {
                    aend aendVar = new aend(abetVar2.b.size());
                    aendVar.a = -1L;
                    long jE = 0;
                    long jE2 = 0;
                    for (int i2 = 0; i2 < abetVar2.b.size(); i2++) {
                        jE += abetVar2.b.e(i2);
                        jE2 += abetVar2.c.e(i2);
                        if (!aendVar.e(jE)) {
                            aendVar.b(jE, jE2);
                        }
                    }
                    aemqVar = new aemq(aendVar);
                }
                this.b = aemqVar;
            } catch (abon e) {
                ((ynz) ((ynz) ((ynz) ukj.a.g()).p(e)).ai((char) 9396)).u("InternalStyle transform failed parsing");
            }
            this.c = -1;
        }
    }
}
