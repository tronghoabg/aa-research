package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class nto {
    private static final yph a = yph.c("GH.InternetConn");
    private final Context b;

    public nto(Context context) {
        this.b = context;
    }

    public static nto a() {
        return (nto) mki.a.b(nto.class, new may(17));
    }

    private final boolean c() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService(ConnectivityManager.class);
        connectivityManager.getClass();
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    public final boolean b() {
        if (dup.c(this.b, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            throw new SecurityException("ACCESS_NETWORK_STATE permission not granted");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return c();
        }
        try {
            return c();
        } catch (SecurityException e) {
            ((ype) ((ype) ((ype) ((ype) a.h()).l(1, TimeUnit.MINUTES)).p(e)).ai(5457)).u("Ignoring exception likely caused by b/155549446. Assuming internet is not connected.");
            return false;
        }
    }
}
