package defpackage;

import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public final class psv implements psu {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/network/addressprovider/GmmGrpcAddressProvider");

    public static URL b() {
        try {
            URL url = new URL("https://mobilemaps-pa.googleapis.com:443");
            if (!url.getProtocol().equals("https")) {
                ((ynz) a.a(uys.a).ai(6862)).y("https is required for service address: %s", "https://mobilemaps-pa.googleapis.com:443");
            }
            return url;
        } catch (MalformedURLException e) {
            ((ynz) a.a(uys.a).ai(6863)).y("Invalid gRPC service address: %s", "https://mobilemaps-pa.googleapis.com:443");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.psu
    public final URL a() {
        return b();
    }
}
