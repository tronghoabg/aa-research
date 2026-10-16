package defpackage;

/* loaded from: classes3.dex */
public class xrq extends xrt {
    public xrq(Integer num, int[] iArr) {
        super(num, iArr);
    }

    public xqq a() {
        return wpq.S(b(), new xro(this, 5));
    }

    public xqq b() {
        return wpq.T(new tbm(this, 19));
    }

    public xqq c() {
        return wpq.S(b(), new xro(this, 11));
    }

    public final xqq d() {
        return wpq.S(b(), new tbm(this, 20));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.xrt
    public final aacq e() {
        aacq aacqVar = new aacq(i());
        ?? r1 = aacqVar.a;
        r1.put(xqp.b, wpq.ag(new xro(this, 1)));
        r1.put(xqp.c, wpq.ag(new xro(this, 0)));
        r1.put(xqp.d, wpq.ag(new xro(this, 2)));
        r1.put(xqp.e, wpq.ag(new xro(this, 3)));
        return aacqVar;
    }

    public final xqq f() {
        return wpq.S(g(), new xrn(6));
    }

    public final xqq g() {
        return wpq.S(b(), new xrn(11));
    }

    public final xqq h() {
        return wpq.S(b(), new xrn(4));
    }

    public final xqq i() {
        return wpq.af(woy.bi(b(), h(), d(), a(), c(), f()));
    }
}
