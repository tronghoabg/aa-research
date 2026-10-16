package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pyp {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/gmm/systems/paintfe/PaintServerAddressSelector");

    public static final java.net.URL a() {
        try {
            java.net.URL url = new java.net.URL("https://www.google.com/maps/vt");
            if (!"https".equals(url.getProtocol())) {
                ((defpackage.ype) a.a(defpackage.uzo.a).ai(6969)).y("Paint server URL should be an https URL: %s", "https://www.google.com/maps/vt");
            }
            ((defpackage.ype) ((defpackage.ype) a.f()).ai(6967)).y("Using Paint server URL: %s", url);
            return url;
        } catch (java.net.MalformedURLException e) {
            ((defpackage.ype) a.a(defpackage.uzo.a).ai(6968)).y("Invalid paint service address: %s", "https://www.google.com/maps/vt");
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
