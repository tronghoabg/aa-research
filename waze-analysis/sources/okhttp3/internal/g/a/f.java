package okhttp3.internal.g.a;

import h.g.b.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56260a = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final e f56261g;

    /* renamed from: b, reason: collision with root package name */
    private final Class f56262b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f56263c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f56264d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f56265e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f56266f;

    static {
        x.f("com.google.android.gms.org.conscrypt", "packageName");
        f56261g = new e();
    }

    public f(Class cls) throws NoSuchMethodException, SecurityException {
        x.f(cls, "sslSocketClass");
        this.f56262b = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        x.e(declaredMethod, "getDeclaredMethod(...)");
        this.f56263c = declaredMethod;
        this.f56264d = cls.getMethod("setHostname", String.class);
        this.f56265e = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f56266f = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.g.a.i
    public final String a(SSLSocket sSLSocket) {
        x.f(sSLSocket, "sslSocket");
        if (!d(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f56265e.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, h.n.a.f48221b);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && x.n(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // okhttp3.internal.g.a.i
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(sSLSocket, "sslSocket");
        x.f(list, "protocols");
        if (d(sSLSocket)) {
            try {
                this.f56263c.invoke(sSLSocket, true);
                this.f56264d.invoke(sSLSocket, str);
                Method method = this.f56266f;
                int i2 = okhttp3.internal.g.g.f56288b;
                x.f(list, "protocols");
                k.h hVar = new k.h();
                for (String str2 : com.waze.ce.x.f(list)) {
                    hVar.ae(str2.length());
                    hVar.ar(str2);
                }
                method.invoke(sSLSocket, hVar.T());
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    @Override // okhttp3.internal.g.a.i
    public final boolean c() {
        return okhttp3.internal.g.c.f56274a;
    }

    @Override // okhttp3.internal.g.a.i
    public final boolean d(SSLSocket sSLSocket) {
        x.f(sSLSocket, "sslSocket");
        return this.f56262b.isInstance(sSLSocket);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Class cls, Class cls2, Class cls3) {
        this(cls);
        x.f(cls, "sslSocketClass");
        x.f(cls2, "sslSocketFactoryClass");
        x.f(cls3, "paramClass");
    }
}
