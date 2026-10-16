package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class afwh extends afxe {
    /* JADX WARN: Illegal instructions before constructor call */
    public afwh(Constructor<?> constructor) {
        constructor.getClass();
        Class<?> declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        genericParameterTypes.getClass();
        int length = genericParameterTypes.length;
        super(constructor, declaringClass, (Type[]) (length <= 1 ? new Type[0] : woy.cI(genericParameterTypes, 0, length - 1)), null);
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        Constructor constructor = (Constructor) mo61getMember();
        ArrayList arrayList = new ArrayList(2);
        affx.a(objArr, arrayList);
        arrayList.add(null);
        return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
    }
}
