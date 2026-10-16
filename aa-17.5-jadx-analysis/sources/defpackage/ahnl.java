package defpackage;

/* loaded from: classes3.dex */
public final class ahnl {
    public static final ahnl INSTANCE = new ahnl();
    private static final aisp SANITIZE_AS_JAVA_INVALID_CHARACTERS = new aisp("[^\\p{L}\\p{Digit}]");
    private static final String CONTEXT_RECEIVER_PREFIX = "$context_receiver";

    private ahnl() {
    }

    public static final ahnj contextReceiverName(int i) {
        return ahnj.identifier(CONTEXT_RECEIVER_PREFIX + '_' + i);
    }

    public static final String sanitizeAsJavaIdentifier(String str) {
        str.getClass();
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.b(str, "_");
    }
}
