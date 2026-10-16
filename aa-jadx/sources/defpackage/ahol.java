package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahol {
    public static final defpackage.ahol INSTANCE = new defpackage.ahol();
    private static final defpackage.aito SANITIZE_AS_JAVA_INVALID_CHARACTERS = new defpackage.aito("[^\\p{L}\\p{Digit}]");
    private static final java.lang.String CONTEXT_RECEIVER_PREFIX = "$context_receiver";

    private ahol() {
    }

    public static final defpackage.ahoj contextReceiverName(int i) {
        return defpackage.ahoj.identifier(CONTEXT_RECEIVER_PREFIX + '_' + i);
    }

    public static final java.lang.String sanitizeAsJavaIdentifier(java.lang.String str) {
        str.getClass();
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.b(str, "_");
    }
}
