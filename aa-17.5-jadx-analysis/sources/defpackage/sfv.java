package defpackage;

/* loaded from: classes2.dex */
final class sfv implements rpd {
    final /* synthetic */ sfw a;

    public sfv(sfw sfwVar) {
        this.a = sfwVar;
    }

    @Override // defpackage.rpd
    public final void a() {
        bc bcVar = (bc) this.a.getContext();
        if (bcVar == null) {
            sfw.f.h().ai(8876).u("BottomSheet fragment dismiss called without being attached to activity");
        } else {
            bcVar.finish();
            bcVar.overridePendingTransition(0, 0);
        }
    }
}
