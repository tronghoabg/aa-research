package defpackage;

/* loaded from: classes2.dex */
final class sqe implements sqf {
    final /* synthetic */ sqg a;
    private final /* synthetic */ int b;

    public sqe(sqg sqgVar, int i) {
        this.b = i;
        this.a = sqgVar;
    }

    @Override // defpackage.sqf
    public final int a() {
        return this.b != 0 ? 4 : 5;
    }

    @Override // defpackage.sqf
    public final void b() {
        int i = this.b;
        sqk sqkVar = this.a.a;
        if (i != 0) {
            sqkVar.onStart();
        } else {
            sqkVar.onResume();
        }
    }
}
