package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bgm implements defpackage.affj {
    private final /* synthetic */ int a;

    public /* synthetic */ bgm(int i) {
        this.a = i;
    }

    @Override // defpackage.affj
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        int i = this.a;
        if (i == 0) {
            return defpackage.bgn.a((defpackage.bgb) obj, (defpackage.bhs) obj2, (defpackage.afer) obj3, (defpackage.bve) obj4, ((java.lang.Integer) obj5).intValue());
        }
        if (i != 1) {
            return defpackage.bgn.a((defpackage.bgb) obj, (defpackage.bhs) obj2, (defpackage.afer) obj3, (defpackage.bve) obj4, ((java.lang.Integer) obj5).intValue());
        }
        android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj2;
        boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
        long j = ((defpackage.dgc) obj5).b;
        java.lang.String string = ((java.lang.CharSequence) obj4).subSequence(defpackage.dgc.d(j), defpackage.dgc.c(j)).toString();
        android.content.Intent className = defpackage.bft.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        className.putExtra("android.intent.extra.PROCESS_TEXT", string);
        ((android.content.Context) obj).startActivity(className);
        return defpackage.afbk.a;
    }
}
