package defpackage;

import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public final class psx implements psu {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/network/addressprovider/GmmServerAddressProvider");

    public static final URL b() {
        try {
            return new URL("https://clients4.google.com/glm/mmap");
        } catch (MalformedURLException e) {
            ((ynz) a.a(uys.a).ai(6864)).y("Invalid non-zero-rated service address: %s", "https://clients4.google.com/glm/mmap");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.psu
    public final URL a() {
        try {
            return new URL("https://clients4.google.com/glm/mmap");
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
