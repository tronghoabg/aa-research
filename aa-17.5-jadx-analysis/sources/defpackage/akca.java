package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class akca {
    private static final String b = "akby";
    public static final MessageDigest a = a();

    private static MessageDigest a() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            String str = b;
            if (!ahkw.i(str, 3)) {
                return null;
            }
            ahkw.c(str, "Error while instantiating messageDigest", e);
            return null;
        }
    }
}
