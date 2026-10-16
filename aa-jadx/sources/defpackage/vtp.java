package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class vtp implements defpackage.xzi {
    private final android.content.Context a;

    public vtp(android.content.Context context) {
        this.a = context;
    }

    @Override // defpackage.xzi
    public final /* bridge */ /* synthetic */ java.lang.Object fF() {
        android.content.Context context = this.a;
        return !defpackage.tnx.e(context) ? defpackage.xxe.a : defpackage.xyn.h(new java.io.File(context.getFilesDir(), "primes/crash"));
    }
}
