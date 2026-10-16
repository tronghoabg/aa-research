package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class syo implements java.lang.AutoCloseable, defpackage.syp {
    public static final android.net.Uri a = android.net.Uri.parse("content://com.google.android.gms.common.appdoctor/fixes");
    public final android.content.ContentProviderClient b;
    private final java.lang.String c;

    public syo(android.content.Context context) throws android.os.RemoteException {
        this.c = context.getPackageName();
        android.content.pm.ProviderInfo providerInfoResolveContentProvider = android.os.Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().resolveContentProvider("com.google.android.gms.common.appdoctor", android.content.pm.PackageManager.ComponentInfoFlags.of(0L)) : context.getPackageManager().resolveContentProvider("com.google.android.gms.common.appdoctor", 0);
        if (providerInfoResolveContentProvider == null || !j$.util.Objects.equals(providerInfoResolveContentProvider.applicationInfo.packageName, "com.google.android.gms")) {
            throw new android.os.RemoteException("com.google.android.gms is not the authority.");
        }
        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new android.os.RemoteException("Unable to acquire ContentProviderClient");
        }
        this.b = contentProviderClientAcquireUnstableContentProviderClient;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("com.google.android.common.appdoctor.package_name", this.c);
        return bundle;
    }

    @Override // java.lang.AutoCloseable, defpackage.syp
    public final void close() throws java.lang.Exception {
        this.b.close();
    }
}
