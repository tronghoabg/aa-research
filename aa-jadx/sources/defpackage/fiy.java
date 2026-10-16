package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fiy implements defpackage.fiw {
    public static final defpackage.fiy b = new defpackage.fiy();

    @Override // defpackage.fiw
    public final android.graphics.Rect a(android.app.Activity activity) {
        android.content.res.Configuration configuration = activity.getResources().getConfiguration();
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        try {
            try {
                android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(configuration);
                java.lang.Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                android.graphics.Rect rect = new android.graphics.Rect((android.graphics.Rect) objInvoke);
                android.os.StrictMode.setVmPolicy(vmPolicy);
                return rect;
            } catch (java.lang.Exception e) {
                if (!(e instanceof java.lang.NoSuchFieldException) && !(e instanceof java.lang.NoSuchMethodException) && !(e instanceof java.lang.IllegalAccessException) && !(e instanceof java.lang.reflect.InvocationTargetException)) {
                    throw e;
                }
                android.util.Log.w(defpackage.fiv.b, e);
                android.graphics.Rect rectA = defpackage.fix.b.a(activity);
                android.os.StrictMode.setVmPolicy(vmPolicy);
                return rectA;
            }
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }
}
