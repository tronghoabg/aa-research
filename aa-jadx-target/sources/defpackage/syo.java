package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class syo implements java.lang.AutoCloseable, defpackage.syp {
    public static final android.net.Uri a = android.net.Uri.parse("content://com.google.android.gms.common.appdoctor/fixes");
    public final android.content.ContentProviderClient b;
    private final java.lang.String c;

    public syo(android.content.Context context) throws android.os.RemoteException {
        this.c = context.getPackageName();
        android.content.pm.ProviderInfo providerInfoM = android.os.Build.VERSION.SDK_INT >= 33 ? ag$.ExternalSyntheticApiModelOutline0.m(context.getPackageManager(), "com.google.android.gms.common.appdoctor", ag$.ExternalSyntheticApiModelOutline0.m(0L)) : context.getPackageManager().resolveContentProvider("com.google.android.gms.common.appdoctor", 0);
        if (providerInfoM == null || !j$.util.Objects.equals(providerInfoM.applicationInfo.packageName, "com.google.android.gms")) {
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
