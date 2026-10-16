package defpackage;

/* loaded from: classes.dex */
public class dqu extends dqs {
    public int aN = 0;
    public int aO = 0;
    public int aP = 0;
    public int aQ = 0;
    public int aR = 0;
    public int aS = 0;
    public boolean aT = false;
    public int aU = 0;
    public int aV = 0;
    protected final dqw aW = new dqw();
    dqx aX = null;

    @Override // defpackage.dqs
    public final void ah() {
        for (int i = 0; i < this.aM; i++) {
            dqn dqnVar = this.aL[i];
            if (dqnVar != null) {
                dqnVar.Q = true;
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

    protected final void ak(dqn dqnVar, int i, int i2, int i3, int i4) {
        dqx dqxVar;
        dqn dqnVar2;
        while (true) {
            dqxVar = this.aX;
            if (dqxVar != null || (dqnVar2 = this.ae) == null) {
                break;
            } else {
                this.aX = ((dqo) dqnVar2).c;
            }
        }
        dqw dqwVar = this.aW;
        dqwVar.i = i;
        dqwVar.j = i3;
        dqwVar.a = i2;
        dqwVar.b = i4;
        dqxVar.b(dqnVar, dqwVar);
        dqnVar.M(dqwVar.c);
        dqnVar.B(dqwVar.d);
        dqnVar.P = dqwVar.f;
        dqnVar.x(dqwVar.e);
    }

    public void b(int i, int i2, int i3, int i4) {
    }
}
