package defpackage;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class afwk extends afxe {
    /* JADX WARN: Illegal instructions before constructor call */
    public afwk(Constructor<?> constructor) {
        constructor.getClass();
        Class<?> declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        super(constructor, declaringClass, aipm.getGenericParameterTypesWithEnclosingThis(constructor), null);
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        return ((Constructor) mo61getMember()).newInstance(Arrays.copyOf(objArr, objArr.length));
    }
}
