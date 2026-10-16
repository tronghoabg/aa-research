package defpackage;

import android.content.Context;
import android.net.wifi.WifiScanner;

/* loaded from: classes2.dex */
public final class pez implements paf {
    public static final yph a = yph.c("GH.WIRELESS.CHANNEL");
    private final Context b;

    public pez(Context context) {
        this.b = context;
    }

    public final ygr a() throws pey {
        WifiScanner wifiScanner = (WifiScanner) jfj.c(this.b).getSystemService(WifiScanner.class);
        if (wifiScanner != null) {
            return ygr.n(wifiScanner.getAvailableChannels(6));
        }
        throw new pey();
    }
}
