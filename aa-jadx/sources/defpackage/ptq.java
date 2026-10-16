package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptq implements defpackage.ptp {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/gmm/systems/network/addressprovider/GmmGrpcAddressProvider");

    public static java.net.URL b() {
        try {
            java.net.URL url = new java.net.URL("https://mobilemaps-pa.googleapis.com:443");
            if (!url.getProtocol().equals("https")) {
                ((defpackage.ype) a.a(defpackage.uzo.a).ai(6888)).y("https is required for service address: %s", "https://mobilemaps-pa.googleapis.com:443");
            }
            return url;
        } catch (java.net.MalformedURLException e) {
            ((defpackage.ype) a.a(defpackage.uzo.a).ai(6889)).y("Invalid gRPC service address: %s", "https://mobilemaps-pa.googleapis.com:443");
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // defpackage.ptp
    public final java.net.URL a() {
        return b();
    }
}
