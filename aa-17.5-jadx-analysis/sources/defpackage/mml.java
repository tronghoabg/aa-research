package defpackage;

/* loaded from: classes2.dex */
public final class mml extends om {
    final /* synthetic */ mmm a;
    final /* synthetic */ qn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mml(mmm mmmVar, qn qnVar) {
        super(true);
        this.a = mmmVar;
        this.e = qnVar;
    }

    @Override // defpackage.om
    public final void b() {
        mmm mmmVar = this.a;
        if (mmmVar.g().a() instanceof mmm) {
            this.e.c();
        } else {
            mmmVar.g().c();
        }
    }
}
