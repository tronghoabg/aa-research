package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tof {
    private static final java.lang.String a = "tof";
    private final defpackage.ygw b;

    public tof(defpackage.ygw ygwVar) {
        this.b = ygwVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized boolean a(android.content.Context context) {
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        int i = defpackage.tob.a;
        if (!new java.io.File(absolutePath, "_google_maps_sdk_recovery_needed_").exists()) {
            return false;
        }
        java.lang.String str = a;
        android.util.Log.w(str, "Invoking recovery actions due to previous crash loop detection.");
        try {
            defpackage.you youVarListIterator = this.b.listIterator(0);
            while (youVarListIterator.hasNext()) {
                ((defpackage.tog) youVarListIterator.next()).a(context);
            }
            defpackage.tob.a(absolutePath, "_google_maps_sdk_recovery_needed_");
            for (java.lang.String str2 : new java.io.File(absolutePath).list(new defpackage.toa(0))) {
                defpackage.tob.a(absolutePath, str2);
            }
            android.util.Log.w(str, "Crash loop detection recovery actions completed.");
            return true;
        } catch (java.lang.RuntimeException unused) {
            android.util.Log.w(a, "Crash loop detection recovery actions failed");
            return false;
        }
    }
}
