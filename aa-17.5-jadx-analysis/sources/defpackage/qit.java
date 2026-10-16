package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class qit implements Runnable {
    public final /* synthetic */ qiu a;
    private final /* synthetic */ int b;

    public /* synthetic */ qit(qiu qiuVar, int i) {
        this.b = i;
        this.a = qiuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            qiv qivVar = (qiv) this.a.a;
            if (!qivVar.c()) {
                ((ype) qiv.a.l().ai((char) 7388)).u("Not connected, so not caching notifications");
                return;
            }
            yfq yfqVarC = mbw.b().c(null);
            List list = qivVar.d;
            list.clear();
            list.addAll(yfqVarC);
            qivVar.j.t();
            return;
        }
        qiu qiuVar = this.a;
        if (i != 1) {
            qiv qivVar2 = (qiv) qiuVar.a;
            qivVar2.c.b(4);
            qivVar2.d.clear();
            qivVar2.e = null;
            return;
        }
        qiv qivVar3 = (qiv) qiuVar.a;
        qivVar3.c.b(2);
        qivVar3.b.post(new qit(qiuVar, 0));
    }
}
