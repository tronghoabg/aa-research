package e.a;

import java.util.BitSet;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class ch<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f46523a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final BitSet f46524b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46525c;

    /* renamed from: d, reason: collision with root package name */
    private final String f46526d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f46527e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f46528f;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        f46524b = bitSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ ch(java.lang.String r10, boolean r11, java.lang.Object r12) {
        /*
            r9 = this;
            r9.<init>()
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
            r9.f46525c = r10
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r0)
            java.lang.String r0 = "name"
            com.google.d.b.an.C(r10, r0)
            boolean r0 = r10.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "token must have at least 1 tchar"
            com.google.d.b.an.m(r0, r2)
            java.lang.String r0 = "connection"
            boolean r0 = r10.equals(r0)
            r2 = 0
            if (r0 == 0) goto L3d
            java.util.logging.Logger r3 = e.a.cm.f()
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "exception to show backtrace"
            r8.<init>(r0)
            java.lang.String r6 = "validateName"
            java.lang.String r7 = "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1"
            java.lang.String r5 = "io.grpc.Metadata$Key"
            r3.logp(r4, r5, r6, r7, r8)
        L3d:
            r0 = r2
        L3e:
            int r3 = r10.length()
            if (r0 >= r3) goto L74
            char r3 = r10.charAt(r0)
            if (r11 == 0) goto L53
            r4 = 58
            if (r3 != r4) goto L53
            if (r0 != 0) goto L52
            r0 = r2
            goto L5b
        L52:
            r3 = r4
        L53:
            java.util.BitSet r4 = e.a.ch.f46524b
            boolean r4 = r4.get(r3)
            if (r4 == 0) goto L5d
        L5b:
            int r0 = r0 + r1
            goto L3e
        L5d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Character r11 = java.lang.Character.valueOf(r3)
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r2] = r11
            r12[r1] = r10
            java.lang.String r10 = "Invalid character '%s' in key name '%s'"
            java.lang.String r10 = com.google.d.b.an.d(r10, r12)
            r9.<init>(r10)
            throw r9
        L74:
            r9.f46526d = r10
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r10 = r10.getBytes(r11)
            r9.f46527e = r10
            r9.f46528f = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.ch.<init>(java.lang.String, boolean, java.lang.Object):void");
    }

    public static ch c(String str, cd cdVar) {
        return new cc(str, cdVar);
    }

    public static ch h(ce ceVar) {
        return new ci(ceVar);
    }

    abstract Object a(byte[] bArr);

    abstract byte[] b(Object obj);

    final Object d(Class cls) {
        Object obj = this.f46528f;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public final String e() {
        return this.f46526d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f46526d.equals(((ch) obj).f46526d);
    }

    boolean f() {
        return false;
    }

    final byte[] g() {
        return this.f46527e;
    }

    public final int hashCode() {
        return this.f46526d.hashCode();
    }

    public final String toString() {
        return "Key{name='" + this.f46526d + "'}";
    }
}
