package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class afxh extends afxi {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxh(Method method) {
        super(method, woy.bg(method.getDeclaringClass()), null);
        method.getClass();
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        Object obj = objArr[0];
        int length = objArr.length;
        return callMethod(obj, length <= 1 ? new Object[0] : woy.cI(objArr, 1, length));
    }
}
