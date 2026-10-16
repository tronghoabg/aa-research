package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class afwg extends afxe implements afwe {
    private final Object boundReceiver;

    /* JADX WARN: Illegal instructions before constructor call */
    public afwg(Constructor<?> constructor, Object obj) {
        constructor.getClass();
        Class<?> declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        genericParameterTypes.getClass();
        int length = genericParameterTypes.length;
        super(constructor, declaringClass, (Type[]) (length <= 2 ? new Type[0] : woy.cI(genericParameterTypes, 1, length - 1)), null);
        this.boundReceiver = obj;
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        Constructor constructor = (Constructor) mo61getMember();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.boundReceiver);
        affx.a(objArr, arrayList);
        arrayList.add(null);
        return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
    }
}
