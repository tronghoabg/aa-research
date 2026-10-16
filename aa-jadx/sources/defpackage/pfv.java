package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pfv implements defpackage.pbc {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.WIRELESS.CHANNEL");
    private final android.content.Context b;

    public pfv(android.content.Context context) {
        this.b = context;
    }

    public final defpackage.yhx a() throws defpackage.pfu {
        android.net.wifi.WifiScanner wifiScanner = (android.net.wifi.WifiScanner) defpackage.jfr.c(this.b).getSystemService(android.net.wifi.WifiScanner.class);
        if (wifiScanner != null) {
            return defpackage.yhx.n(wifiScanner.getAvailableChannels(6));
        }
        throw new defpackage.pfu();
    }
}
