package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afxk extends defpackage.afye {
    /* JADX WARN: Illegal instructions before constructor call */
    public afxk(java.lang.reflect.Constructor<?> constructor) {
        constructor.getClass();
        java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        super(constructor, declaringClass, defpackage.aiqm.getGenericParameterTypesWithEnclosingThis(constructor), null);
    }

    @Override // defpackage.afxf
    public java.lang.Object call(java.lang.Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        return ((java.lang.reflect.Constructor) mo60getMember()).newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
    }
}
