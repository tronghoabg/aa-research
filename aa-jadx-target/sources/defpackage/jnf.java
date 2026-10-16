package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jnf implements defpackage.ryi {
    private final /* synthetic */ int a;

    public /* synthetic */ jnf(int i) {
        this.a = i;
    }

    @Override // defpackage.ryi
    public final defpackage.ygw a(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.xyn xynVar) {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? defpackage.kfn.f(context, scheduledExecutorService, xynVar) : defpackage.kfn.f(context, scheduledExecutorService, xynVar);
        }
        return defpackage.kfn.f(context, scheduledExecutorService, xynVar);
    }
}
