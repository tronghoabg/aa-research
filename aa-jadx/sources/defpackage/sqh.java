package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sqh {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = -1;
    private static volatile defpackage.sqg c;

    public static java.security.MessageDigest a() {
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
