package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adms implements adon {
    private final /* synthetic */ int a;

    public adms(int i) {
        this.a = i;
    }

    public final /* synthetic */ int a(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            return ((admr) obj).a();
        }
        if (i != 1) {
            return ((defpackage.adnt) obj).d();
        }
        ((defpackage.adml) obj).e();
        return 5;
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            ((admr) obj).c();
        } else if (i != 1) {
            ((defpackage.adnt) obj).f();
        } else {
            ((defpackage.adml) obj).d();
        }
    }
}
