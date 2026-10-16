package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class cth extends cxa {
    final /* synthetic */ ctl a;
    final /* synthetic */ afeg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cth(ctl ctlVar, afeg afegVar, String str) {
        super(str);
        this.a = ctlVar;
        this.b = afegVar;
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        ctl ctlVar = this.a;
        cte cteVar = ctlVar.f;
        cteVar.a = ctsVar.p();
        cteVar.b = ctsVar.a();
        cteVar.c = ctsVar.b();
        if (ctsVar.eM() || ctlVar.a.j == null) {
            ctlVar.d = 0;
            ctq ctqVar = (ctq) this.b.invoke(cteVar, new dle(j));
            return new ctg(ctqVar, ctlVar, ctlVar.d, ctqVar);
        }
        ctlVar.e = 0;
        ctq ctqVar2 = (ctq) this.b.invoke(ctlVar.g, new dle(j));
        return new ctf(ctqVar2, ctlVar, ctlVar.e, ctqVar2);
    }
}
