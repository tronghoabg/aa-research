package defpackage;

/* loaded from: classes2.dex */
public final class cqp extends cqf {
    private final String d;

    public cqp(cqr cqrVar) {
        super(cqrVar, null);
        this.d = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.cqf
    public final void d(cqr cqrVar) {
        czp czpVarH = h();
        if (czpVarH != null) {
            if (cqrVar == null) {
                cqrVar = cqq.a;
            }
            czpVarH.a = cqrVar;
            dan.b(czpVarH.c, czpVarH.a);
        }
    }

    @Override // defpackage.cyz
    public final /* synthetic */ Object ep() {
        return this.d;
    }

    @Override // defpackage.cqf
    public final boolean g(int i) {
        return (a.Y(i, 3) || a.Y(i, 4)) ? false : true;
    }
}
