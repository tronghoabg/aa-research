package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ajbg {
    private int a;
    private defpackage.ajch b;
    public defpackage.ajbi[] d;
    public int e;

    public final defpackage.ajay he() {
        defpackage.ajch ajchVar;
        synchronized (this) {
            ajchVar = this.b;
            if (ajchVar == null) {
                ajchVar = new defpackage.ajch(this.e);
                this.b = ajchVar;
            }
        }
        return ajchVar;
    }

    protected abstract defpackage.ajbi i();

    protected abstract defpackage.ajbi[] m();

    protected final defpackage.ajbi n() {
        defpackage.ajbi ajbiVarI;
        defpackage.ajch ajchVar;
        synchronized (this) {
            defpackage.ajbi[] ajbiVarArrM = this.d;
            if (ajbiVarArrM == null) {
                ajbiVarArrM = m();
                this.d = ajbiVarArrM;
            } else {
                int i = this.e;
                int length = ajbiVarArrM.length;
                if (i >= length) {
                    java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(ajbiVarArrM, length + length);
                    objArrCopyOf.getClass();
                    ajbiVarArrM = (defpackage.ajbi[]) objArrCopyOf;
                    this.d = ajbiVarArrM;
                }
            }
            int i2 = this.a;
            do {
                ajbiVarI = ajbiVarArrM[i2];
                if (ajbiVarI == null) {
                    ajbiVarI = i();
                    ajbiVarArrM[i2] = ajbiVarI;
                }
                i2++;
                if (i2 >= ajbiVarArrM.length) {
                    i2 = 0;
                }
            } while (!ajbiVarI.a(this));
            this.a = i2;
            this.e++;
            ajchVar = this.b;
        }
        if (ajchVar != null) {
            ajchVar.p(1);
        }
        return ajbiVarI;
    }

    protected final void o(defpackage.ajbi ajbiVar) {
        defpackage.ajch ajchVar;
        int i;
        defpackage.afdk[] afdkVarArrB;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            ajchVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            ajbiVar.getClass();
            afdkVarArrB = ajbiVar.b(this);
        }
        for (defpackage.afdk afdkVar : afdkVarArrB) {
            if (afdkVar != null) {
                afdkVar.w(defpackage.afbk.a);
            }
        }
        if (ajchVar != null) {
            ajchVar.p(-1);
        }
    }
}
