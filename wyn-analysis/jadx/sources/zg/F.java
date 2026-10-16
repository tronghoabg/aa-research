package zg;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.RequestBody;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes5.dex */
public final class F extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48531b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Method f48532c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48533d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4671j f48534e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f48535f;

    public F(Method method, int i5, Headers headers, InterfaceC4671j interfaceC4671j) {
        this.f48532c = method;
        this.f48533d = i5;
        this.f48535f = headers;
        this.f48534e = interfaceC4671j;
    }

    @Override // zg.a0
    public final void a(N n10, Object obj) {
        InterfaceC4671j interfaceC4671j = this.f48534e;
        Object obj2 = this.f48535f;
        int i5 = this.f48533d;
        Method method = this.f48532c;
        switch (this.f48531b) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    n10.c((Headers) obj2, (RequestBody) interfaceC4671j.convert(obj));
                    return;
                } catch (IOException e7) {
                    throw a0.k(method, i5, "Unable to convert " + obj + " to RequestBody", e7);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw a0.k(method, i5, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw a0.k(method, i5, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw a0.k(method, i5, AbstractC0279p0.l("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {HttpHeaders.CONTENT_DISPOSITION, AbstractC0279p0.l("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    Headers.f42269b.getClass();
                    n10.c(Headers.Companion.c(strArr), (RequestBody) interfaceC4671j.convert(value));
                }
                return;
        }
    }

    public F(Method method, int i5, InterfaceC4671j interfaceC4671j, String str) {
        this.f48532c = method;
        this.f48533d = i5;
        this.f48534e = interfaceC4671j;
        this.f48535f = str;
    }
}
