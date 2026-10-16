package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class njn extends eql {
    public nmj a;
    public nmj h;
    public nmj i;
    public njk j = njk.a;
    public boolean k;

    public njn(eqj eqjVar, eqj eqjVar2, eqj eqjVar3, njp njpVar, mll mllVar) {
        r(eqjVar, new nns(new niw(this, 20), 1));
        r(eqjVar2, new nns(new njm(this, 1), 1));
        r(eqjVar3, new nns(new njm(this, 0), 1));
        r(njpVar.e, new nns(new njm(this, 2), 1));
        r(mllVar, new nns(new njm(this, 3), 1));
    }

    public final void a() {
        njk njkVar;
        nmj nmjVar;
        njp.b.l().T("Recalculating phone app. Type: %s, lastOrDefault: %s, inCallApp: %s, inCall: %s, railWidget: %s", this.j, this.a, this.i, this.h, Boolean.valueOf(this.k));
        njk njkVar2 = this.j;
        if (njkVar2 == njk.a) {
            nmjVar = this.a;
        } else if (njkVar2 == njk.c || (njkVar2 == (njkVar = njk.b) && this.k)) {
            nmjVar = this.i;
        } else {
            if (njkVar2 != njkVar) {
                Objects.toString(njkVar2);
                throw new IllegalStateException("Cannot show phone app for ".concat(String.valueOf(njkVar2)));
            }
            nmjVar = this.h;
        }
        m(nmjVar);
    }
}
