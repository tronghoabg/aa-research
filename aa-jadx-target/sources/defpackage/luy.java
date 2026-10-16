package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class luy extends defpackage.luw {
    @Override // defpackage.luw
    public final defpackage.ygm a(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        defpackage.yhv yhvVar = new defpackage.yhv();
        defpackage.ygm ygmVar = this.a;
        if (ygmVar != null) {
            return ygmVar;
        }
        for (android.content.pm.ResolveInfo resolveInfo : defpackage.mkp.a.c.getPackageManager().queryIntentServices(new android.content.Intent("androidx.car.app.messaging.action.HANDLE_CAR_MESSAGING"), 65)) {
            yhvVar.c(new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
        }
        this.a = yhvVar.g();
        return yhvVar.g();
    }
}
