package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afxq extends defpackage.afye {
    private final boolean requiresInstance;

    /* JADX WARN: Illegal instructions before constructor call */
    private afxq(java.lang.reflect.Field field, boolean z) {
        java.lang.reflect.Type[] typeArr;
        java.lang.reflect.Type genericType = field.getGenericType();
        genericType.getClass();
        if (z) {
            java.lang.Class<?> declaringClass = field.getDeclaringClass();
            declaringClass.getClass();
            typeArr = new java.lang.reflect.Type[]{declaringClass};
        } else {
            typeArr = new java.lang.reflect.Type[0];
        }
        super(field, genericType, typeArr, null);
        this.requiresInstance = z;
    }

    @Override // defpackage.afxf
    public java.lang.Object call(java.lang.Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        return ((java.lang.reflect.Field) mo60getMember()).get(this.requiresInstance ? defpackage.afga.bO(objArr) : null);
    }

    public /* synthetic */ afxq(java.lang.reflect.Field field, boolean z, defpackage.affu affuVar) {
        this(field, z);
    }
}
