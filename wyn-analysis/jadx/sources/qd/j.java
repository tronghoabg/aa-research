package qd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class j implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f44238a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44239b;

    /* renamed from: c, reason: collision with root package name */
    public String f44240c;

    public j(ArrayList arrayList) {
        this.f44238a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = n.f44258a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f44239b = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.f44238a;
        if (zEquals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (arrayList.contains(list.get(i5))) {
                        String str = (String) list.get(i5);
                        this.f44240c = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f44240c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f44240c = (String) objArr[0];
        return null;
    }
}
