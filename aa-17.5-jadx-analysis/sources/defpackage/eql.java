package defpackage;

import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class eql extends eqm {
    private pq a;

    /* JADX WARN: Multi-variable type inference failed */
    public eql(ksa ksaVar, eqj eqjVar) {
        this();
        Integer num = (Integer) ksaVar.d.e();
        Object objE = eqjVar.e();
        objE.getClass();
        m(t(num, ((Number) objE).intValue()));
        r(ksaVar.d, new kko(new erl(this, eqjVar, 6, (char[]) null), 2));
        r(eqjVar, new kko(new erl((Object) this, (Object) ksaVar, 7, (byte[]) (0 == true ? 1 : 0)), 2));
    }

    public static final krz t(Integer num, int i) {
        ksj ksjVar = i == 3 ? ksi.a : ksh.a;
        if (num != null) {
            return new krz(new krx(ksjVar.a(num.intValue()), ksh.a), ksjVar);
        }
        kry kryVar = i == 3 ? kry.a : null;
        return kryVar != null ? new krz(kryVar, ksjVar) : new krz(kry.a, ksh.a);
    }

    @Override // defpackage.eqj
    protected void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eqk) ((Map.Entry) it.next()).getValue()).b();
        }
    }

    @Override // defpackage.eqj
    protected void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eqk) ((Map.Entry) it.next()).getValue()).c();
        }
    }

    @Override // defpackage.eqj
    public void p() {
        m(Optional.empty());
    }

    @Override // defpackage.eqj
    public final void q(Object obj) {
        j(Optional.ofNullable(obj));
    }

    public final void r(eqj eqjVar, eqn eqnVar) {
        if (eqjVar == null) {
            throw new NullPointerException("source cannot be null");
        }
        eqk eqkVar = new eqk(eqjVar, eqnVar);
        eqk eqkVar2 = (eqk) this.a.b(eqjVar, eqkVar);
        if (eqkVar2 != null && eqkVar2.b != eqnVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (eqkVar2 == null && n()) {
            eqkVar.b();
        }
    }

    public final void s(eqj eqjVar) {
        eqk eqkVar = (eqk) this.a.c(eqjVar);
        if (eqkVar != null) {
            eqkVar.c();
        }
    }

    public eql(Object obj) {
        super(obj);
        this.a = new pq();
    }

    public eql() {
        this.a = new pq();
    }

    public eql(lkg lkgVar, String str, mon monVar) {
        this();
        r(lkgVar.a, new ewg(new gaz(str, this, lkgVar, monVar, 12), 15));
    }

    public eql(final lkp lkpVar) {
        this();
        r(lkpVar.k, new ewg(new afec() { // from class: lko
            /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x025c  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x02a5  */
            @Override // defpackage.afec
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instructions count: 754
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lko.invoke(java.lang.Object):java.lang.Object");
            }
        }, 16));
    }
}
