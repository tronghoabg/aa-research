package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class afwq extends afxe {
    private final boolean requiresInstance;

    /* JADX WARN: Illegal instructions before constructor call */
    private afwq(Field field, boolean z) {
        Type[] typeArr;
        Type genericType = field.getGenericType();
        genericType.getClass();
        if (z) {
            Class<?> declaringClass = field.getDeclaringClass();
            declaringClass.getClass();
            typeArr = new Type[]{declaringClass};
        } else {
            typeArr = new Type[0];
        }
        super(field, genericType, typeArr, null);
        this.requiresInstance = z;
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        return ((Field) mo61getMember()).get(this.requiresInstance ? woy.cU(objArr) : null);
    }

    public /* synthetic */ afwq(Field field, boolean z, afeu afeuVar) {
        this(field, z);
    }
}
