package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class adms implements defpackage.adon {
    private final /* synthetic */ int a;

    public adms(int i) {
        this.a = i;
    }

    @Override // defpackage.adon
    public final /* synthetic */ int a(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            return ((defpackage.admr) obj).a();
        }
        if (i != 1) {
            return ((defpackage.adnt) obj).d();
        }
        ((defpackage.adml) obj).e();
        return 5;
    }

    @Override // defpackage.adon
    public final /* synthetic */ void b(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            ((defpackage.admr) obj).c();
        } else if (i != 1) {
            ((defpackage.adnt) obj).f();
        } else {
            ((defpackage.adml) obj).d();
        }
    }
}
