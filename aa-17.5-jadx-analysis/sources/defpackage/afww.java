package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class afww extends afxe {
    private final boolean notNull;
    private final boolean requiresInstance;

    /* JADX WARN: Illegal instructions before constructor call */
    private afww(Field field, boolean z, boolean z2) {
        Type[] typeArr;
        Class cls = Void.TYPE;
        cls.getClass();
        if (z2) {
            Class<?> declaringClass = field.getDeclaringClass();
            declaringClass.getClass();
            Type genericType = field.getGenericType();
            genericType.getClass();
            typeArr = new Type[]{declaringClass, genericType};
        } else {
            Type genericType2 = field.getGenericType();
            genericType2.getClass();
            typeArr = new Type[]{genericType2};
        }
        super(field, cls, typeArr, null);
        this.notNull = z;
        this.requiresInstance = z2;
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        objArr.getClass();
        checkArguments(objArr);
        ((Field) mo61getMember()).set(this.requiresInstance ? woy.cU(objArr) : null, woy.cX(objArr));
        return afak.a;
    }

    @Override // defpackage.afxe
    public void checkArguments(Object[] objArr) {
        objArr.getClass();
        super.checkArguments(objArr);
        if (this.notNull && woy.cX(objArr) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }

    public /* synthetic */ afww(Field field, boolean z, boolean z2, afeu afeuVar) {
        this(field, z, z2);
    }
}
