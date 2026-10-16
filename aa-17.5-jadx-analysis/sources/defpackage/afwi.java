package defpackage;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class afwi extends afxe implements afwe {
    private final Object boundReceiver;

    /* JADX WARN: Illegal instructions before constructor call */
    public afwi(Constructor<?> constructor, Object obj) {
        constructor.getClass();
        Class<?> declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        super(constructor, declaringClass, aipm.getGenericParameterTypesWithEnclosingThis(constructor), null);
        this.boundReceiver = obj;
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr.length + 1);
        Constructor constructor = (Constructor) mo61getMember();
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.boundReceiver);
        affx.a(objArr, arrayList);
        return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
    }
}
