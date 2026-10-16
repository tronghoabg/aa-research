package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zfo implements java.lang.reflect.InvocationHandler {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yhe c;
    public final defpackage.zfn a;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        for (java.lang.reflect.Method method : defpackage.zfn.class.getMethods()) {
            if (method.getDeclaringClass().equals(defpackage.zfn.class)) {
                try {
                    method.setAccessible(true);
                } catch (java.lang.RuntimeException e) {
                    if (!e.getClass().getName().equals("java.security.AccessControlException")) {
                        throw e;
                    }
                }
                yhaVar.f(method.getName(), method);
            }
        }
        c = yhaVar.d(false);
    }

    public zfo(defpackage.zfn zfnVar) {
        this.a = zfnVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        java.lang.String name = method.getName();
        java.lang.reflect.Method method2 = (java.lang.reflect.Method) c.get(name);
        if (method2 != null) {
            try {
                return method2.invoke(this.a, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        }
        if (name.equals("getAnnotatedBounds") || name.equals("isAnnotationPresent") || name.startsWith("getAnnotation") || name.startsWith("getDeclaredAnnotation")) {
            throw new java.lang.UnsupportedOperationException("Annotation methods are not supported on synthetic TypeVariables created during type resolution. The semantics of annotations on resolved types with modified bounds are undefined. Use the original TypeVariable for annotation access. See b/147144588.");
        }
        throw new java.lang.UnsupportedOperationException(name);
    }
}
