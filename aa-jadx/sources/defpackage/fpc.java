package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fpc {
    public static final java.lang.String a = defpackage.fjv.b("PackageManagerHelper");
    public static final java.util.HashMap b = new java.util.HashMap();

    public static final void a(android.content.pm.PackageManager packageManager, android.content.ComponentName componentName, boolean z, defpackage.affg affgVar) {
        try {
            if (z == ((java.lang.Boolean) affgVar.invoke(packageManager, componentName)).booleanValue()) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
            defpackage.fjv.a().c(a, defpackage.a.bI(z ? "enabled" : "disabled", componentName.getClassName(), " "));
        } catch (java.lang.Exception e) {
            defpackage.fjv fjvVarA = defpackage.fjv.a();
            java.lang.String str = a;
            java.lang.String className = componentName.getClassName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(className);
            sb.append(" could not be ");
            sb.append(true == z ? "enabled" : "disabled");
            fjvVarA.d(str, sb.toString(), e);
        }
    }
}
