package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afxw extends defpackage.afye {
    private final boolean notNull;
    private final boolean requiresInstance;

    /* JADX WARN: Illegal instructions before constructor call */
    private afxw(java.lang.reflect.Field field, boolean z, boolean z2) {
        java.lang.reflect.Type[] typeArr;
        java.lang.Class cls = java.lang.Void.TYPE;
        cls.getClass();
        if (z2) {
            java.lang.Class<?> declaringClass = field.getDeclaringClass();
            declaringClass.getClass();
            java.lang.reflect.Type genericType = field.getGenericType();
            genericType.getClass();
            typeArr = new java.lang.reflect.Type[]{declaringClass, genericType};
        } else {
            java.lang.reflect.Type genericType2 = field.getGenericType();
            genericType2.getClass();
            typeArr = new java.lang.reflect.Type[]{genericType2};
        }
        super(field, cls, typeArr, null);
        this.notNull = z;
        this.requiresInstance = z2;
    }

    @Override // defpackage.afxf
    public java.lang.Object call(java.lang.Object[] objArr) throws java.lang.IllegalAccessException {
        objArr.getClass();
        checkArguments(objArr);
        ((java.lang.reflect.Field) mo60getMember()).set(this.requiresInstance ? defpackage.afga.bO(objArr) : null, defpackage.afga.bR(objArr));
        return defpackage.afbk.a;
    }

    @Override // defpackage.afye
    public void checkArguments(java.lang.Object[] objArr) {
        objArr.getClass();
        super.checkArguments(objArr);
        if (this.notNull && defpackage.afga.bR(objArr) == null) {
            throw new java.lang.IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }

    public /* synthetic */ afxw(java.lang.reflect.Field field, boolean z, boolean z2, defpackage.affu affuVar) {
        this(field, z, z2);
    }
}
