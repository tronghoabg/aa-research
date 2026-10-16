package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class afwz extends afxd implements afwe {
    private final Object boundReceiver;
    private final boolean isCallByToValueClassMangledMethod;

    /* JADX WARN: Illegal instructions before constructor call */
    public afwz(Method method, boolean z, Object obj) {
        method.getClass();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        int length = genericParameterTypes.length;
        super(method, false, (Type[]) (length <= 1 ? new Type[0] : woy.cI(genericParameterTypes, 1, length)), null);
        this.isCallByToValueClassMangledMethod = z;
        this.boundReceiver = obj;
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.boundReceiver);
        affx.a(objArr, arrayList);
        return callMethod(null, arrayList.toArray(new Object[arrayList.size()]));
    }

    public final boolean isCallByToValueClassMangledMethod$kotlin_reflection() {
        return this.isCallByToValueClassMangledMethod;
    }
}
