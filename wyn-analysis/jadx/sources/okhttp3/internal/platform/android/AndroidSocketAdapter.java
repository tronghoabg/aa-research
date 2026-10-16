package okhttp3.internal.platform.android;

import Bf.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public class AndroidSocketAdapter implements SocketAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f42898f = new Companion(0);

    /* renamed from: g, reason: collision with root package name */
    public static final AndroidSocketAdapter$Companion$factory$1 f42899g = new AndroidSocketAdapter$Companion$factory$1();

    /* renamed from: a, reason: collision with root package name */
    public final Class f42900a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f42901b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f42902c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f42903d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f42904e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidSocketAdapter(Class cls) throws NoSuchMethodException, SecurityException {
        this.f42900a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC3340k.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f42901b = declaredMethod;
        this.f42902c = cls.getMethod("setHostname", String.class);
        this.f42903d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f42904e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC3340k.e(protocols, "protocols");
        if (this.f42900a.isInstance(sSLSocket)) {
            try {
                this.f42901b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f42902c.invoke(sSLSocket, str);
                }
                Method method = this.f42904e;
                Platform.f42887a.getClass();
                method.invoke(sSLSocket, Platform.Companion.b(protocols));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        if (!this.f42900a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f42903d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, a.f1670a);
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if ((cause instanceof NullPointerException) && AbstractC3340k.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e10);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        AndroidPlatform.f42860f.getClass();
        return AndroidPlatform.f42861g;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return this.f42900a.isInstance(sSLSocket);
    }
}
