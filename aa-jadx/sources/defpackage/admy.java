package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class admy {
    public static final /* synthetic */ int d = 0;
    private static final java.util.BitSet e;
    public final java.lang.String a;
    public final byte[] b;
    public final java.lang.Object c;
    private final java.lang.String f;

    static {
        java.util.BitSet bitSet = new java.util.BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        e = bitSet;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[SYNTHETIC] */
    public admy(java.lang.String str, boolean z, java.lang.Object obj) {
        str.getClass();
        this.f = str;
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        defpackage.ysr.aY(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            defpackage.adnd.a.logp(java.util.logging.Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (java.lang.Throwable) new java.lang.RuntimeException("exception to show backtrace"));
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char cCharAt = lowerCase.charAt(i);
            if (z && cCharAt == ':') {
                if (i == 0) {
                    i = 0;
                } else {
                    cCharAt = ':';
                    if (e.get(cCharAt)) {
                        throw new java.lang.IllegalArgumentException(defpackage.ysr.aR("Invalid character '%s' in key name '%s'", java.lang.Character.valueOf(cCharAt), lowerCase));
                    }
                }
            } else if (e.get(cCharAt)) {
                throw new java.lang.IllegalArgumentException(defpackage.ysr.aR("Invalid character '%s' in key name '%s'", java.lang.Character.valueOf(cCharAt), lowerCase));
            }
            i++;
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        this.c = obj;
    }

    public abstract java.lang.Object a(byte[] bArr);

    public abstract byte[] b(java.lang.Object obj);

    public boolean c() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.admy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Key{name='" + this.a + "'}";
    }
}
