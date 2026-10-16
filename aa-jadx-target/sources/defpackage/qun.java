package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qun {
    public static final java.util.List a = j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList("com.google.android.projection.bumblebee", "com.google.android.projection.gearhead"));

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.String a(android.content.Context context) {
        return b(context, !"user".equals(android.os.Build.TYPE));
    }

    public static java.lang.String b(android.content.Context context, boolean z) {
        java.lang.String packageName = context.getPackageName();
        java.util.List list = a;
        if (list.contains(packageName)) {
            return context.getPackageName();
        }
        android.content.ComponentName componentNameResolveActivity = new android.content.Intent("android.intent.action.MAIN").addCategory("android.intent.category.CAR_DOCK").resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity != null && list.contains(componentNameResolveActivity.getPackageName())) {
            try {
                java.lang.String packageName2 = componentNameResolveActivity.getPackageName();
                qsp.m(context, packageName2, z);
                return packageName2;
            } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.SecurityException unused) {
            }
        }
        java.util.ArrayList arrayList = null;
        for (java.lang.String str : a) {
            try {
                qsp.m(context, str, z);
                return str;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(e);
            }
        }
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Android Auto is not installed!");
        if (arrayList == null || arrayList.isEmpty()) {
            throw illegalStateException;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            illegalStateException.addSuppressed((java.lang.Exception) arrayList.get(i));
        }
        throw illegalStateException;
    }
}
