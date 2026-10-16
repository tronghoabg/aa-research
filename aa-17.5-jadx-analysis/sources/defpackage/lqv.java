package defpackage;

import j$.util.Collection;

/* loaded from: classes2.dex */
public final class lqv implements eqn {
    public final eqj a;
    private final eqa b;
    private final eqn c = new lkn(7);
    private yfq d;

    public lqv(eqa eqaVar, eqj eqjVar) {
        this.b = eqaVar;
        this.a = eqjVar;
        int i = yfq.d;
        this.d = yls.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        loi loiVar = (loi) obj;
        yfq yfqVar = this.d;
        int size = yfqVar.size();
        for (int i = 0; i < size; i++) {
            ((eqj) yfqVar.get(i)).k(this.c);
        }
        this.d = yls.a;
        log logVar = (log) lom.b(loiVar, log.class);
        if (logVar == null) {
            return;
        }
        yfq yfqVar2 = (yfq) Collection.EL.stream(logVar.a).filter(new kxo(16)).map(new lpc(this, 3)).limit(4L).collect(ycm.a);
        this.d = yfqVar2;
        int size2 = yfqVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((eqj) yfqVar2.get(i2)).fE(this.b, this.c);
        }
    }
}
