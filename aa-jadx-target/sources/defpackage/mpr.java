package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mpr {
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static void a() {
    }

    public static final defpackage.mqi b(android.content.ComponentName componentName) {
        componentName.getClass();
        return new defpackage.mqi(componentName, defpackage.mqh.b);
    }

    public static final defpackage.mqi c(java.lang.String str) {
        java.util.List listK = afzh.K(str, new char[]{':'}, 0);
        android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString((java.lang.String) listK.get(0));
        if (componentNameUnflattenFromString != null) {
            return listK.size() == 1 ? b(componentNameUnflattenFromString) : new defpackage.mqi(componentNameUnflattenFromString, defpackage.mqh.valueOf((java.lang.String) listK.get(1)));
        }
        throw new java.lang.IllegalStateException("ComponentName should always be present");
    }

    public static final defpackage.mqi d(android.content.Intent intent) {
        intent.getClass();
        java.lang.String stringExtra = intent.getStringExtra("AppKey");
        if (stringExtra != null) {
            return c(stringExtra);
        }
        android.content.ComponentName component = intent.getComponent();
        if (component == null) {
            return null;
        }
        return new defpackage.mqi(component, defpackage.mqh.b);
    }

    public static defpackage.mpp e() {
        return (defpackage.mpp) defpackage.mkp.a.i(defpackage.mpp.class);
    }

    public static defpackage.mkw f() {
        return (defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class);
    }
}
