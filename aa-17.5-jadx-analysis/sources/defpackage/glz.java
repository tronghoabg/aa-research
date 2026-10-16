package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class glz implements gdm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public glz(glp glpVar, int i) {
        this.b = i;
        this.a = glpVar;
    }

    @Override // defpackage.gdm
    public final void a(gdq gdqVar) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((glp) obj).b.a(gdqVar);
        } else {
            ((gmg) obj).h(gdqVar);
        }
    }

    public /* synthetic */ glz(gmg gmgVar, int i) {
        this.b = i;
        this.a = gmgVar;
    }
}
