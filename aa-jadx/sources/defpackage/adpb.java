package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adpb {
    public final java.lang.Class a;
    public final java.lang.reflect.Method b;
    public final java.lang.reflect.Method c;
    public final java.lang.reflect.Method d;
    public final java.util.List e;

    public adpb(java.lang.Class cls, java.lang.ClassLoader classLoader) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        java.lang.Class clsAsSubclass = cls.asSubclass(defpackage.xwo.class);
        this.a = clsAsSubclass;
        this.d = clsAsSubclass.getMethod("getScopes", null);
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName("xxa", false, classLoader).asSubclass(defpackage.xwo.class).getDeclaredMethod("newBuilder", null);
        this.b = declaredMethod;
        java.lang.Class<?> returnType = declaredMethod.getReturnType();
        this.c = returnType.getMethod("build", null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.e = arrayList;
        java.lang.reflect.Method method = clsAsSubclass.getMethod("getClientId", null);
        arrayList.add(new defpackage.adpc(method, returnType.getMethod("setClientId", method.getReturnType())));
        java.lang.reflect.Method method2 = clsAsSubclass.getMethod("getClientEmail", null);
        arrayList.add(new defpackage.adpc(method2, returnType.getMethod("setClientEmail", method2.getReturnType())));
        java.lang.reflect.Method method3 = clsAsSubclass.getMethod("getPrivateKey", null);
        arrayList.add(new defpackage.adpc(method3, returnType.getMethod("setPrivateKey", method3.getReturnType())));
        java.lang.reflect.Method method4 = clsAsSubclass.getMethod("getPrivateKeyId", null);
        arrayList.add(new defpackage.adpc(method4, returnType.getMethod("setPrivateKeyId", method4.getReturnType())));
        java.lang.reflect.Method method5 = clsAsSubclass.getMethod("getQuotaProjectId", null);
        arrayList.add(new defpackage.adpc(method5, returnType.getMethod("setQuotaProjectId", method5.getReturnType())));
    }
}
