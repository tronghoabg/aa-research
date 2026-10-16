package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nuc {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.InternetConn");
    private final android.content.Context b;

    public nuc(android.content.Context context) {
        this.b = context;
    }

    public static defpackage.nuc a() {
        return (defpackage.nuc) defpackage.mkp.a.b(defpackage.nuc.class, new defpackage.mbf(17));
    }

    private final boolean c() {
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.b.getSystemService(android.net.ConnectivityManager.class);
        connectivityManager.getClass();
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    public final boolean b() {
        if (defpackage.duw.c(this.b, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            throw new java.lang.SecurityException("ACCESS_NETWORK_STATE permission not granted");
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return c();
        }
        try {
            return c();
        } catch (java.lang.SecurityException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(1, java.util.concurrent.TimeUnit.MINUTES)).p(e)).ai(5460)).u("Ignoring exception likely caused by b/155549446. Assuming internet is not connected.");
            return false;
        }
    }
}
