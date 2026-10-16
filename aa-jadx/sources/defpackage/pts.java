package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pts implements defpackage.ptp {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/gmm/systems/network/addressprovider/GmmServerAddressProvider");

    public static final java.net.URL b() {
        try {
            return new java.net.URL("https://clients4.google.com/glm/mmap");
        } catch (java.net.MalformedURLException e) {
            ((defpackage.ype) a.a(defpackage.uzo.a).ai(6890)).y("Invalid non-zero-rated service address: %s", "https://clients4.google.com/glm/mmap");
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // defpackage.ptp
    public final java.net.URL a() {
        try {
            return new java.net.URL("https://clients4.google.com/glm/mmap");
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
