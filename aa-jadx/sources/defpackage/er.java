package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class er {
    static final defpackage.eq a = new defpackage.eq(new defpackage.pm(1));
    public static int b = -100;
    public static defpackage.dwh c = null;
    public static defpackage.dwh d = null;
    private static java.lang.Boolean i = null;
    public static boolean e = false;
    public static final defpackage.zf f = new defpackage.zf(0);
    public static final java.lang.Object g = new java.lang.Object();
    public static final java.lang.Object h = new java.lang.Object();

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(defpackage.er erVar) {
        synchronized (g) {
            defpackage.ze zeVar = new defpackage.ze(f);
            while (zeVar.hasNext()) {
                defpackage.er erVar2 = (defpackage.er) ((java.lang.ref.WeakReference) zeVar.next()).get();
                if (erVar2 == erVar || erVar2 == null) {
                    zeVar.remove();
                }
            }
        }
    }

    static boolean p(android.content.Context context) {
        if (i == null) {
            try {
                android.content.pm.ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) defpackage.fk.class), 640);
                if (serviceInfo.metaData != null) {
                    i = java.lang.Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                i = java.lang.Boolean.FALSE;
            }
        }
        return i.booleanValue();
    }

    public android.content.Context a() {
        throw null;
    }

    public abstract defpackage.ef b();

    public abstract android.view.MenuInflater c();

    public abstract android.view.View d(int i2);

    public abstract void e(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void l(int i2);

    public abstract void m(android.view.View view);

    public abstract void n(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void o(java.lang.CharSequence charSequence);

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t(int i2);
}
