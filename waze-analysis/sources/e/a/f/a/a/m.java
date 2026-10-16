package e.a.f.a.a;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements q {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47531a = Logger.getLogger(j.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final k.k f47532b;

    static {
        k.k kVar = k.k.f50843a;
        f47532b = okhttp3.internal.publicsuffix.a.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    static /* bridge */ /* synthetic */ int a(int i2, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return i2 - s;
        }
        throw i("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
    }

    static /* bridge */ /* synthetic */ int b(k.j jVar) {
        return (jVar.c() & 255) | ((jVar.c() & 255) << 16) | ((jVar.c() & 255) << 8);
    }

    static /* bridge */ /* synthetic */ IllegalArgumentException d(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException i(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    @Override // e.a.f.a.a.q
    public final c g(k.j jVar) {
        return new k(jVar);
    }

    @Override // e.a.f.a.a.q
    public final d h(k.i iVar) {
        return new l(iVar);
    }
}
