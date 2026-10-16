package defpackage;

/* loaded from: classes.dex */
final class adlr implements adnm {
    private final /* synthetic */ int a;

    public adlr(int i) {
        this.a = i;
    }

    @Override // defpackage.adnm
    public final /* synthetic */ int a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return ((adlq) obj).a();
        }
        if (i != 1) {
            return ((adms) obj).d();
        }
        ((adlk) obj).e();
        return 5;
    }

    @Override // defpackage.adnm
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((adlq) obj).c();
        } else if (i != 1) {
            ((adms) obj).f();
        } else {
            ((adlk) obj).d();
        }
    }
}
