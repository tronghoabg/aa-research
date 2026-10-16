package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class og {
    private static final int a = -419430401;
    private static final int b = -2145707237;
    private static defpackage.on c;

    /* JADX WARN: Type inference failed for: r0v5, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [affc, java.lang.Object] */
    public static /* synthetic */ void a(defpackage.od odVar) {
        defpackage.ov ovVarK = defpackage.ca.k(0, 0);
        defpackage.ov ovVarK2 = defpackage.ca.k(a, b);
        android.view.View decorView = odVar.getWindow().getDecorView();
        decorView.getClass();
        ol ojVar = c;
        if (ojVar == null) {
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                ojVar = new ol();
            } else if (android.os.Build.VERSION.SDK_INT >= 30) {
                ojVar = new ok();
            } else {
                ojVar = android.os.Build.VERSION.SDK_INT >= 29 ? new defpackage.oj() : new defpackage.oi();
            }
            c = ojVar;
        }
        ol olVar = ojVar;
        android.view.Window window = odVar.getWindow();
        window.getClass();
        ?? r0 = ovVarK.c;
        android.content.res.Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((java.lang.Boolean) r0.invoke(resources)).booleanValue();
        ?? r1 = ovVarK2.c;
        android.content.res.Resources resources2 = decorView.getResources();
        resources2.getClass();
        olVar.a(ovVarK, ovVarK2, window, decorView, zBooleanValue, ((java.lang.Boolean) r1.invoke(resources2)).booleanValue());
        android.view.Window window2 = odVar.getWindow();
        window2.getClass();
        olVar.b(window2);
    }
}
