package defpackage;

/* loaded from: classes3.dex */
public final class tif extends qw {
    final /* synthetic */ tjp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tif(qn qnVar, tjp tjpVar) {
        super(qnVar);
        this.f = tjpVar;
    }

    @Override // defpackage.qw
    public final wb h() {
        tjp tjpVar = this.f;
        Throwable th = tjpVar.a;
        if (th != null) {
            throw new IllegalStateException("Problem during composition", th);
        }
        tii.a().l().u("Building template");
        return (wb) tjpVar.d();
    }
}
