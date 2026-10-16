package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class ajah {
    private int a;
    private ajbh b;
    public ajaj[] d;
    public int e;

    public final aizz hS() {
        ajbh ajbhVar;
        synchronized (this) {
            ajbhVar = this.b;
            if (ajbhVar == null) {
                ajbhVar = new ajbh(this.e);
                this.b = ajbhVar;
            }
        }
        return ajbhVar;
    }

    protected abstract ajaj i();

    protected abstract ajaj[] m();

    protected final ajaj n() {
        ajaj ajajVarI;
        ajbh ajbhVar;
        synchronized (this) {
            ajaj[] ajajVarArrM = this.d;
            if (ajajVarArrM == null) {
                ajajVarArrM = m();
                this.d = ajajVarArrM;
            } else {
                int i = this.e;
                int length = ajajVarArrM.length;
                if (i >= length) {
                    Object[] objArrCopyOf = Arrays.copyOf(ajajVarArrM, length + length);
                    objArrCopyOf.getClass();
                    ajajVarArrM = (ajaj[]) objArrCopyOf;
                    this.d = ajajVarArrM;
                }
            }
            int i2 = this.a;
            do {
                ajajVarI = ajajVarArrM[i2];
                if (ajajVarI == null) {
                    ajajVarI = i();
                    ajajVarArrM[i2] = ajajVarI;
                }
                i2++;
                if (i2 >= ajajVarArrM.length) {
                    i2 = 0;
                }
            } while (!ajajVarI.a(this));
            this.a = i2;
            this.e++;
            ajbhVar = this.b;
        }
        if (ajbhVar != null) {
            ajbhVar.p(1);
        }
        return ajajVarI;
    }

    protected final void o(ajaj ajajVar) {
        ajbh ajbhVar;
        int i;
        afck[] afckVarArrB;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            ajbhVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            ajajVar.getClass();
            afckVarArrB = ajajVar.b(this);
        }
        for (afck afckVar : afckVarArrB) {
            if (afckVar != null) {
                afckVar.w(afak.a);
            }
        }
        if (ajbhVar != null) {
            ajbhVar.p(-1);
        }
    }
}
