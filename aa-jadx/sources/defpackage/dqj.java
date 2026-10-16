package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dqj extends defpackage.dqd {
    public int ao;
    private int ap;
    private defpackage.dqs aq;

    public dqj(defpackage.dqh dqhVar) {
        super(dqhVar, 5);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0020  */
    @Override // defpackage.dqd, defpackage.dpx, defpackage.dqe
    public final void e() {
        x();
        int i = this.ao;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = 1;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    i3 = 1;
                } else if (i2 == 4) {
                    i3 = 2;
                } else if (i2 == 5) {
                    i3 = 3;
                }
            }
        }
        defpackage.dqs dqsVar = this.aq;
        dqsVar.a = i3;
        dqsVar.c = this.ap;
    }

    @Override // defpackage.dpx
    public final void o(int i) {
        this.ap = i;
    }

    @Override // defpackage.dpx
    public final void w(java.lang.Object obj) {
        this.ap = this.al.a(obj);
    }

    @Override // defpackage.dqd
    public final defpackage.dra x() {
        defpackage.dqs dqsVar = this.aq;
        if (dqsVar != null) {
            return dqsVar;
        }
        defpackage.dqs dqsVar2 = new defpackage.dqs();
        this.aq = dqsVar2;
        return dqsVar2;
    }
}
