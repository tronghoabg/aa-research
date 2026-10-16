package defpackage;

/* loaded from: classes.dex */
public class tbo extends eql {
    public boolean a;
    private spu h = tce.a;

    public final void a() {
        spu spuVar = this.h;
        tcf tcfVar = spuVar instanceof tcf ? (tcf) spuVar : null;
        if (tcfVar != null) {
            super.m(tcfVar.a);
            this.h = tce.a;
        }
    }

    public final void b(boolean z) {
        this.a = z;
        if (z) {
            return;
        }
        a();
    }

    @Override // defpackage.eqj
    public final void m(Object obj) {
        if (this.a) {
            this.h = new tcf(obj);
        } else {
            super.m(obj);
        }
    }
}
