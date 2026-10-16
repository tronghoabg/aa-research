package defpackage;

/* loaded from: classes3.dex */
final class you extends yox {
    final /* synthetic */ yox a;
    final /* synthetic */ yox b;

    public you(yox yoxVar, yox yoxVar2) {
        this.a = yoxVar;
        this.b = yoxVar2;
    }

    @Override // defpackage.yox
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
