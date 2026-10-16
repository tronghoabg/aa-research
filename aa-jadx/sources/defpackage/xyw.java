package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xyw {
    public static final java.util.Random a = new defpackage.xyu();
    public static final java.lang.ThreadLocal b;

    static {
        a();
        new defpackage.xyv();
        b = new defpackage.xyt();
    }

    public static java.security.SecureRandom a() {
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
