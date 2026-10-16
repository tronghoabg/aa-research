package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akda {
    private static final java.lang.String b = "akcy";
    public static final java.security.MessageDigest a = a();

    private static java.security.MessageDigest a() {
        try {
            return java.security.MessageDigest.getInstance("MD5");
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.String str = b;
            if (!defpackage.agwk.i(str, 3)) {
                return null;
            }
            defpackage.agwk.c(str, "Error while instantiating messageDigest", e);
            return null;
        }
    }
}
