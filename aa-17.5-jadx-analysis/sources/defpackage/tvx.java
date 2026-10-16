package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class tvx extends tvl implements tyu {
    public final txc c;
    protected final udx d;
    public final txe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected tvx(txc txcVar, tvw tvwVar, udx udxVar, txe txeVar, boolean z) {
        super(null);
        final zhc zhcVar = null;
        this.c = txcVar;
        this.d = udxVar;
        this.e = txeVar;
        if (z) {
            final ArrayList arrayList = new ArrayList(3);
            abcs abcsVar = ((uat) udxVar).a;
            abco abcoVar = abcsVar.c;
            abcoVar = abcoVar == null ? abco.a : abcoVar;
            final twt twtVar = (twt) tvwVar;
            ufe ufeVar = twtVar.d;
            twt.a(ufeVar, abcoVar, udxVar, arrayList);
            abco abcoVar2 = abcsVar.d;
            twt.a(ufeVar, abcoVar2 == null ? abco.a : abcoVar2, udxVar, arrayList);
            if (!arrayList.isEmpty()) {
                zhcVar = new zhc();
                twtVar.b.execute(new Runnable() { // from class: twr
                    @Override // java.lang.Runnable
                    public final void run() {
                        twt twtVar2 = twtVar;
                        ueu ueuVar = twtVar2.e;
                        Executor executor = twtVar2.b;
                        zhc zhcVar2 = zhcVar;
                        List<nzj> list = arrayList;
                        tws twsVar = new tws(executor, zhcVar2, list.size());
                        int i = 0;
                        for (nzj nzjVar : list) {
                            if (ues.b((String) nzjVar.c, (uja) nzjVar.a, (ujf) nzjVar.b, ueuVar, twtVar2.c, "prefetch", twsVar) != null) {
                                i++;
                            }
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            twsVar.a(twt.a);
                        }
                    }
                });
            }
            if (zhcVar != null) {
                zhcVar.c(new shd(this, 20), zfq.a);
            } else {
                this.a = true;
            }
        }
    }

    public synchronized boolean a() {
        return r();
    }

    public udx b() {
        return this.d;
    }

    @Override // defpackage.tqs
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public abcs j() {
        return ((uat) this.d).a;
    }

    @Override // defpackage.tpz
    public void f() {
        this.e.c(this);
    }

    @Override // defpackage.tpz
    public void i() {
        this.e.g(this);
    }

    @Override // defpackage.tvl
    public void o(tqd tqdVar) {
        p(tqdVar, this);
    }

    public void v() {
        synchronized (this) {
            this.b = true;
            k();
        }
    }

    public void w() {
        s(new tvv(this, 1));
    }

    public void x() {
        s(new tvv(this, 0));
    }

    public void u() {
    }
}
