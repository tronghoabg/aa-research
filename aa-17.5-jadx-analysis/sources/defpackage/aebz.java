package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes3.dex */
final class aebz implements InvocationHandler {
    public static final /* synthetic */ int c = 0;
    public boolean a;
    public String b;
    private final List d;

    public aebz(List list) {
        this.d = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = aecd.a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.a = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.d;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                int i = 0;
                while (true) {
                    List list2 = this.d;
                    if (i >= size) {
                        String str = (String) list2.get(0);
                        this.b = str;
                        return str;
                    }
                    if (list2.contains(list.get(i))) {
                        String str2 = (String) list.get(i);
                        this.b = str2;
                        return str2;
                    }
                    i++;
                }
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.b = (String) objArr[0];
        return null;
    }
}
