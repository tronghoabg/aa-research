package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fpb extends defpackage.affy implements defpackage.affg {
    public static final defpackage.fpb a = new defpackage.fpb();

    public fpb() {
        super(2, defpackage.fpc.class, "isServiceEnabled", "isServiceEnabled(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", 1);
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.pm.PackageManager packageManager = (android.content.pm.PackageManager) obj;
        android.content.ComponentName componentName = (android.content.ComponentName) obj2;
        packageManager.getClass();
        componentName.getClass();
        java.lang.String str = defpackage.fpc.a;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        boolean zBooleanValue = false;
        if (componentEnabledSetting == 0) {
            java.util.HashMap map = defpackage.fpc.b;
            synchronized (map) {
                java.lang.Boolean bool = (java.lang.Boolean) map.get(componentName);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        android.content.pm.ServiceInfo serviceInfo = packageManager.getServiceInfo(componentName, defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE);
                        if (serviceInfo != null) {
                            zBooleanValue = ((android.content.pm.ComponentInfo) serviceInfo).enabled;
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                        defpackage.fjv.a();
                        android.util.Log.w(defpackage.fpc.a, java.lang.String.valueOf(componentName.getClassName()).concat(" could not be found in manifest"), e);
                    }
                    java.util.HashMap map2 = defpackage.fpc.b;
                    synchronized (map2) {
                        map2.put(componentName, java.lang.Boolean.valueOf(zBooleanValue));
                    }
                }
            }
        } else if (componentEnabledSetting == 1) {
            zBooleanValue = true;
        }
        return java.lang.Boolean.valueOf(zBooleanValue);
    }
}
