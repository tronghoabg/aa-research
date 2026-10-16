package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "AlpnProvider", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* renamed from: i, reason: collision with root package name */
    public static final Companion f42873i = new Companion(0);

    /* renamed from: d, reason: collision with root package name */
    public final Method f42874d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f42875e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f42876f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f42877g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f42878h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AlpnProvider implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f42879a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f42880b;

        /* renamed from: c, reason: collision with root package name */
        public String f42881c;

        public AlpnProvider(ArrayList arrayList) {
            this.f42879a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) {
            AbstractC3340k.e(proxy, "proxy");
            AbstractC3340k.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (AbstractC3340k.a(name, "supports") && AbstractC3340k.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (AbstractC3340k.a(name, "unsupported") && AbstractC3340k.a(Void.TYPE, returnType)) {
                this.f42880b = true;
                return null;
            }
            boolean zA = AbstractC3340k.a(name, "protocols");
            ArrayList arrayList = this.f42879a;
            if (zA && objArr.length == 0) {
                return arrayList;
            }
            if ((AbstractC3340k.a(name, "selectProtocol") || AbstractC3340k.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i5 = 0;
                        while (true) {
                            int i10 = i5 + 1;
                            Object obj2 = list.get(i5);
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj2;
                            if (arrayList.contains(str)) {
                                this.f42881c = str;
                                return str;
                            }
                            if (i5 == size) {
                                break;
                            }
                            i5 = i10;
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f42881c = str2;
                    return str2;
                }
            }
            if ((!AbstractC3340k.a(name, "protocolSelected") && !AbstractC3340k.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f42881c = (String) obj3;
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f42874d = method;
        this.f42875e = method2;
        this.f42876f = method3;
        this.f42877g = cls;
        this.f42878h = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f42876f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sSLSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC3340k.e(protocols, "protocols");
        Platform.f42887a.getClass();
        try {
            this.f42874d.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f42877g, this.f42878h}, new AlpnProvider(Platform.Companion.a(protocols))));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String f(SSLSocket sSLSocket) throws IllegalArgumentException {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f42875e.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            boolean z2 = alpnProvider.f42880b;
            if (!z2 && alpnProvider.f42881c == null) {
                Platform.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z2) {
                return null;
            }
            return alpnProvider.f42881c;
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
