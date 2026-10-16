package defpackage;

/* loaded from: classes3.dex */
final class vjy extends vja {
    final /* synthetic */ vka a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjy(vka vkaVar) {
        super((byte[]) null);
        this.a = vkaVar;
    }

    @Override // defpackage.vja
    public final void o(double d) {
        vka vkaVar = this.a;
        vkaVar.b = (float) d;
        vkaVar.invalidateSelf();
    }
}
