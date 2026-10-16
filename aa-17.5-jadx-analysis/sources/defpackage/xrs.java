package defpackage;

/* loaded from: classes3.dex */
public class xrs extends xrt {
    public xrs(Integer num, int[] iArr) {
        super(num, iArr);
    }

    public xqq a() {
        return wpq.T(new xrr(this, 0));
    }

    public final xqq b() {
        return wpq.S(a(), new xro(this, 12));
    }

    public final xqq c() {
        return wpq.S(a(), new xro(this, 13));
    }

    public final xqq d() {
        return wpq.S(a(), new xrp(4));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.xrt
    public final aacq e() {
        aacq aacqVar = new aacq(f());
        ?? r1 = aacqVar.a;
        r1.put(xqp.c, wpq.ag(new xro(this, 19)));
        r1.put(xqp.d, wpq.ag(new xro(this, 20)));
        r1.put(xqp.e, wpq.ag(new xrr(this, 1)));
        return aacqVar;
    }

    public final xqq f() {
        return wpq.af(woy.bi(a(), d(), b(), c(), c()));
    }
}
