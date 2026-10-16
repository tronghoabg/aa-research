package defpackage;

/* loaded from: classes2.dex */
public final class wr implements epf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.epf
    public final void fw(eqa eqaVar) {
        int i = this.b;
        if (i == 0) {
            yj.a();
            ((ept) this.a).d(this);
            return;
        }
        if (i == 1) {
            ((ept) this.a).d(this);
            return;
        }
        if (i == 2) {
            ((ept) this.a).d(this);
            return;
        }
        if (i == 3) {
            ((ert) this.a).a();
            return;
        }
        ynz ynzVar = (ynz) tkm.b.f().ai(9082);
        tki tkiVar = (tki) this.a;
        String str = tkiVar.a;
        ynzVar.y("Unregister delegate %s", str);
        tkiVar.b.c.remove(str);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fL(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
