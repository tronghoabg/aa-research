package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aecz implements java.lang.reflect.InvocationHandler {
    public static final /* synthetic */ int c = 0;
    public boolean a;
    public java.lang.String b;
    private final java.util.List d;

    public aecz(java.util.List list) {
        this.d = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        java.lang.String name = method.getName();
        java.lang.Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = defpackage.aedd.a;
        }
        if (name.equals("supports") && java.lang.Boolean.TYPE == returnType) {
            return java.lang.Boolean.TRUE;
        }
        if (name.equals("unsupported") && java.lang.Void.TYPE == returnType) {
            this.a = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.d;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && returnType == java.lang.String.class && objArr.length == 1) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof java.util.List) {
                java.util.List list = (java.util.List) obj2;
                int size = list.size();
                int i = 0;
                while (true) {
                    java.util.List list2 = this.d;
                    if (i >= size) {
                        java.lang.String str = (java.lang.String) list2.get(0);
                        this.b = str;
                        return str;
                    }
                    if (list2.contains(list.get(i))) {
                        java.lang.String str2 = (java.lang.String) list.get(i);
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
        this.b = (java.lang.String) objArr[0];
        return null;
    }
}
