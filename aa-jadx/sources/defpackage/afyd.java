package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afyd extends defpackage.afye {
    private final boolean isVoidMethod;

    private afyd(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr) {
        java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        if (z) {
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            java.lang.Class<?> declaringClass = method.getDeclaringClass();
            declaringClass.getClass();
            arrayList.add(declaringClass);
            defpackage.afgx.a(typeArr, arrayList);
            typeArr = (java.lang.reflect.Type[]) arrayList.toArray(new java.lang.reflect.Type[arrayList.size()]);
        }
        super(method, genericReturnType, typeArr, null);
        this.isVoidMethod = defpackage.afga.f(getReturnType(), java.lang.Void.TYPE);
    }

    protected final java.lang.Object callMethod(java.lang.Object obj, java.lang.Object[] objArr) {
        objArr.getClass();
        return this.isVoidMethod ? defpackage.afbk.a : ((java.lang.reflect.Method) mo60getMember()).invoke(obj, java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public /* synthetic */ afyd(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr, defpackage.affu affuVar) {
        this(method, z, typeArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ afyd(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr, int i, defpackage.affu affuVar) {
        z = (i & 2) != 0 ? !java.lang.reflect.Modifier.isStatic(method.getModifiers()) : z;
        if ((i & 4) != 0) {
            typeArr = method.getGenericParameterTypes();
            typeArr.getClass();
        }
        this(method, z, typeArr, null);
    }
}
