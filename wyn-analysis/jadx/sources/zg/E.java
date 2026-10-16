package zg;

import A7.AbstractC0279p0;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;

/* loaded from: classes5.dex */
public final class E extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48528b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f48529c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48530d;

    public /* synthetic */ E(Method method, int i5, int i10) {
        this.f48528b = i10;
        this.f48529c = method;
        this.f48530d = i5;
    }

    @Override // zg.a0
    public final void a(N n10, Object obj) {
        switch (this.f48528b) {
            case 0:
                Map map = (Map) obj;
                Method method = this.f48529c;
                int i5 = this.f48530d;
                if (map == null) {
                    throw a0.k(method, i5, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw a0.k(method, i5, "Header map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw a0.k(method, i5, AbstractC0279p0.l("Header map contained null value for key '", str, "'."), new Object[0]);
                    }
                    n10.b(str, value.toString());
                }
                return;
            case 1:
                Headers headers = (Headers) obj;
                if (headers == null) {
                    throw a0.k(this.f48529c, this.f48530d, "Headers parameter must not be null.", new Object[0]);
                }
                Headers.Builder builder = n10.f48556f;
                builder.getClass();
                int size = headers.size();
                for (int i10 = 0; i10 < size; i10++) {
                    builder.c(headers.c(i10), headers.f(i10));
                }
                return;
            default:
                if (obj == null) {
                    throw a0.k(this.f48529c, this.f48530d, "@Url parameter is null.", new Object[0]);
                }
                n10.f48553c = obj.toString();
                return;
        }
    }
}
