package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class adoa {
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final List e;

    public adoa(Class cls, ClassLoader classLoader) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        Class clsAsSubclass = cls.asSubclass(xvi.class);
        this.a = clsAsSubclass;
        this.d = clsAsSubclass.getMethod("getScopes", null);
        Method declaredMethod = Class.forName("xvu", false, classLoader).asSubclass(xvi.class).getDeclaredMethod("newBuilder", null);
        this.b = declaredMethod;
        Class<?> returnType = declaredMethod.getReturnType();
        this.c = returnType.getMethod("build", null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        Method method = clsAsSubclass.getMethod("getClientId", null);
        arrayList.add(new adob(method, returnType.getMethod("setClientId", method.getReturnType())));
        Method method2 = clsAsSubclass.getMethod("getClientEmail", null);
        arrayList.add(new adob(method2, returnType.getMethod("setClientEmail", method2.getReturnType())));
        Method method3 = clsAsSubclass.getMethod("getPrivateKey", null);
        arrayList.add(new adob(method3, returnType.getMethod("setPrivateKey", method3.getReturnType())));
        Method method4 = clsAsSubclass.getMethod("getPrivateKeyId", null);
        arrayList.add(new adob(method4, returnType.getMethod("setPrivateKeyId", method4.getReturnType())));
        Method method5 = clsAsSubclass.getMethod("getQuotaProjectId", null);
        arrayList.add(new adob(method5, returnType.getMethod("setQuotaProjectId", method5.getReturnType())));
    }
}
