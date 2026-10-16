package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lek {
    public static final defpackage.lej a = new defpackage.lej();
    public static final defpackage.afhl b = new defpackage.kkv(defpackage.mkp.b, 6);

    public static final defpackage.lek a() {
        return a.a();
    }

    private static final boolean d(long j) {
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        try {
            return context.getPackageManager().getPackageInfo(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.NOW_PACKAGE, 0).getLongVersionCode() >= j;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean b() {
        return (defpackage.acyc.a.fF().aR() && d(defpackage.acyc.C())) || defpackage.leo.a.a().e();
    }

    public final boolean c() {
        return (defpackage.acyc.aU() && d(defpackage.acyc.D())) || defpackage.leo.a.a().e();
    }
}
