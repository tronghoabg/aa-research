package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1407y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f18274a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18275b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f18275b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw A.f();
        } catch (A e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static AbstractC1404v c(Object obj, Object obj2) {
        AbstractC1404v abstractC1404v = (AbstractC1404v) ((AbstractC1382a) obj);
        AbstractC1402t abstractC1402t = (AbstractC1402t) abstractC1404v.d(5);
        abstractC1402t.c();
        AbstractC1402t.d(abstractC1402t.f18270b, abstractC1404v);
        AbstractC1382a abstractC1382a = (AbstractC1382a) obj2;
        if (!abstractC1402t.f18269a.getClass().isInstance(abstractC1382a)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC1402t.c();
        AbstractC1402t.d(abstractC1402t.f18270b, (AbstractC1404v) abstractC1382a);
        return abstractC1402t.b();
    }
}
