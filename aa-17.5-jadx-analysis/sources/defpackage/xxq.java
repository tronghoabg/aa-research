package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* loaded from: classes3.dex */
public final class xxq {
    public static final Random a = new xxo();
    public static final ThreadLocal b;

    static {
        a();
        new xxp();
        b = new xxn();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
