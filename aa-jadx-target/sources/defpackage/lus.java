package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lus extends defpackage.luw {
    private final defpackage.ths b;

    public lus(android.content.Context context) {
        this.b = new defpackage.ths(context, defpackage.acui.a.fF().b());
    }

    @Override // defpackage.luw
    public final defpackage.ygm a(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        android.content.pm.PackageManager packageManager = defpackage.mkp.a.c.getPackageManager();
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && this.b.a(activityInfo.packageName)) {
                ygrVar.i(new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            }
        }
        return ygrVar.g();
    }
}
