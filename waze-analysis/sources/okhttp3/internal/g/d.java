package okhttp3.internal.g;

import h.g.b.x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class d implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final List f56277a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f56278b;

    /* renamed from: c, reason: collision with root package name */
    private String f56279c;

    public d(List list) {
        x.f(list, "protocols");
        this.f56277a = list;
    }

    public final String a() {
        return this.f56279c;
    }

    public final boolean b() {
        return this.f56278b;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        x.f(obj, "proxy");
        x.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (x.n(name, "supports") && x.n(Boolean.TYPE, returnType)) {
            return true;
        }
        if (x.n(name, "unsupported") && x.n(Void.TYPE, returnType)) {
            this.f56278b = true;
            return null;
        }
        if (x.n(name, "protocols") && objArr.length == 0) {
            return this.f56277a;
        }
        if ((x.n(name, "selectProtocol") || x.n(name, "select")) && x.n(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                x.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = list.get(i2);
                        x.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!this.f56277a.contains(str)) {
                            if (i2 == size) {
                                break;
                            }
                            i2++;
                        } else {
                            this.f56279c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) this.f56277a.get(0);
                this.f56279c = str2;
                return str2;
            }
        }
        if ((!x.n(name, "protocolSelected") && !x.n(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        x.d(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f56279c = (String) obj4;
        return null;
    }
}
