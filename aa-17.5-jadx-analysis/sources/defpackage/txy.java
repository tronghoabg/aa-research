package defpackage;

/* loaded from: classes3.dex */
public final class txy implements tth {
    final /* synthetic */ tyb a;
    private final /* synthetic */ int b;

    public txy(tyb tybVar, int i) {
        this.b = i;
        this.a = tybVar;
    }

    @Override // defpackage.tth
    public final boolean d() {
        int i = this.b;
        tyb tybVar = this.a;
        if (i == 0) {
            return tybVar.r.d();
        }
        return false;
    }
}
