package defpackage;

/* loaded from: classes2.dex */
public final class crf extends cqf {
    private final String d;

    public crf(cqr cqrVar, cwj cwjVar) {
        super(cqrVar, cwjVar);
        this.d = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // defpackage.cqf
    public final void d(cqr cqrVar) {
        czp czpVarH = h();
        if (czpVarH != null) {
            czpVarH.b = cqrVar;
        }
    }

    @Override // defpackage.cyz
    public final /* synthetic */ Object ep() {
        return this.d;
    }

    @Override // defpackage.cqf
    public final boolean g(int i) {
        return a.Y(i, 3) || a.Y(i, 4);
    }
}
