package defpackage;

import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public final class pxu {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/paintfe/PaintServerAddressSelector");

    public static final URL a() {
        try {
            URL url = new URL("https://www.google.com/maps/vt");
            if (!"https".equals(url.getProtocol())) {
                ((ynz) a.a(uys.a).ai(6943)).y("Paint server URL should be an https URL: %s", "https://www.google.com/maps/vt");
            }
            ((ynz) ((ynz) a.f()).ai(6941)).y("Using Paint server URL: %s", url);
            return url;
        } catch (MalformedURLException e) {
            ((ynz) a.a(uys.a).ai(6942)).y("Invalid paint service address: %s", "https://www.google.com/maps/vt");
            throw new IllegalArgumentException(e);
        }
    }
}
