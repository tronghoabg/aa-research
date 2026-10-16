package defpackage;

import j$.time.Duration;
import java.util.List;

/* loaded from: classes.dex */
public final class nvc extends eql {
    public static final yph a = yph.c("GH.OngoingNotifLD");
    public static final Duration h = wub.ak(75);
    private static final nvb l = new nvb(null, afbe.a);
    public final eqj i;
    public aitx j;
    public aivh k;
    private final eqj m;
    private final eqj n;

    public nvc(eqj eqjVar, eqj eqjVar2, eqj eqjVar3) {
        eqjVar3.getClass();
        this.m = eqjVar;
        this.i = eqjVar2;
        this.n = eqjVar3;
        spu.aZ(this, new eqj[]{eqjVar, eqjVar3, eqjVar2}, new njq(this, 10));
    }

    public final List a() {
        Object objE = this.m.e();
        objE.getClass();
        return (List) objE;
    }

    public final List b() {
        Object objE = this.n.e();
        objE.getClass();
        return (List) objE;
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        this.j = ahni.b(mkm.a.e().i());
        super.c();
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        super.d();
        aitx aitxVar = this.j;
        if (aitxVar == null) {
            affa.d("coroutineScope");
            aitxVar = null;
        }
        ahni.e(aitxVar, null);
        m(l);
    }
}
