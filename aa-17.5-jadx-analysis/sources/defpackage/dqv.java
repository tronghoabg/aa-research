package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class dqv extends dqn {
    public ArrayList aL;

    public dqv(byte[] bArr) {
        super(0, 0);
        this.aL = new ArrayList();
    }

    @Override // defpackage.dqn
    public final void ad(lah lahVar) {
        super.ad(lahVar);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((dqn) this.aL.get(i)).ad(lahVar);
        }
    }

    public void ae() {
        ArrayList arrayList = this.aL;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dqn dqnVar = (dqn) this.aL.get(i);
            if (dqnVar instanceof dqv) {
                ((dqv) dqnVar).ae();
            }
        }
    }

    public final void am(dqn dqnVar) {
        this.aL.add(dqnVar);
        dqn dqnVar2 = dqnVar.ae;
        if (dqnVar2 != null) {
            ((dqv) dqnVar2).an(dqnVar);
        }
        dqnVar.ae = this;
    }

    public final void an(dqn dqnVar) {
        this.aL.remove(dqnVar);
        dqnVar.u();
    }

    public final void ao() {
        this.aL.clear();
    }

    @Override // defpackage.dqn
    public void u() {
        this.aL.clear();
        super.u();
    }

    public dqv() {
        this.aL = new ArrayList();
    }
}
