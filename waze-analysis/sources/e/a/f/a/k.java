package e.a.f.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final List f47584a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f47585b;

    /* renamed from: c, reason: collision with root package name */
    private String f47586c;

    public k(List list) {
        this.f47584a = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = o.f47604a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f47585b = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.f47584a;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    List list2 = this.f47584a;
                    if (i2 >= size) {
                        String str = (String) list2.get(0);
                        this.f47586c = str;
                        return str;
                    }
                    if (list2.contains(list.get(i2))) {
                        String str2 = (String) list.get(i2);
                        this.f47586c = str2;
                        return str2;
                    }
                    i2++;
                }
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f47586c = (String) objArr[0];
        return null;
    }
}
