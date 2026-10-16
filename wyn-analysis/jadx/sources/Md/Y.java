package md;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import k8.AbstractC3198g;

/* loaded from: classes5.dex */
public abstract class Y {

    /* renamed from: d, reason: collision with root package name */
    public static final BitSet f40606d;

    /* renamed from: a, reason: collision with root package name */
    public final String f40607a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f40608b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f40609c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            bitSet.set(c10);
        }
        for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
            bitSet.set(c11);
        }
        f40606d = bitSet;
    }

    public Y(boolean z2, String str, Object obj) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Fe.e.t(lowerCase, MediationMetaData.KEY_NAME);
        Fe.e.p("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            b0.f40614c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i5 = 0; i5 < lowerCase.length(); i5++) {
            char cCharAt = lowerCase.charAt(i5);
            if ((!z2 || cCharAt != ':' || i5 != 0) && !f40606d.get(cCharAt)) {
                throw new IllegalArgumentException(Fe.g.E("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
        }
        this.f40607a = lowerCase;
        this.f40608b = lowerCase.getBytes(AbstractC3198g.f39299a);
        this.f40609c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f40607a.equals(((Y) obj).f40607a);
    }

    public final int hashCode() {
        return this.f40607a.hashCode();
    }

    public final String toString() {
        return wg.b.c(new StringBuilder("Key{name='"), this.f40607a, "'}");
    }
}
