package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class drc extends defpackage.dra {
    public int aN = 0;
    public int aO = 0;
    public int aP = 0;
    public int aQ = 0;
    public int aR = 0;
    public int aS = 0;
    public boolean aT = false;
    public int aU = 0;
    public int aV = 0;
    protected final defpackage.dre aW = new defpackage.dre();
    defpackage.drf aX = null;

    @Override // defpackage.dra
    public final void ah() {
        for (int i = 0; i < this.aM; i++) {
            defpackage.dqv dqvVar = this.aL[i];
            if (dqvVar != null) {
                dqvVar.Q = true;
            }
        }
    }

    public final void ai(int i, int i2) {
        this.aU = i;
        this.aV = i2;
    }

    public final void aj(int i) {
        this.aP = i;
        this.aR = i;
        this.aS = i;
    }

    protected final void ak(defpackage.dqv dqvVar, int i, int i2, int i3, int i4) {
        defpackage.drf drfVar;
        defpackage.dqv dqvVar2;
        while (true) {
            drfVar = this.aX;
            if (drfVar != null || (dqvVar2 = this.ae) == null) {
                break;
            } else {
                this.aX = ((defpackage.dqw) dqvVar2).c;
            }
        }
        defpackage.dre dreVar = this.aW;
        dreVar.i = i;
        dreVar.j = i3;
        dreVar.a = i2;
        dreVar.b = i4;
        drfVar.b(dqvVar, dreVar);
        dqvVar.M(dreVar.c);
        dqvVar.B(dreVar.d);
        dqvVar.P = dreVar.f;
        dqvVar.x(dreVar.e);
    }

    public void b(int i, int i2, int i3, int i4) {
    }
}
