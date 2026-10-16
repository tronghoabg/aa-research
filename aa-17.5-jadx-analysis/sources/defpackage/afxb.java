package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class afxb extends afxd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxb(Method method) {
        super(method, true, null, 4, null);
        method.getClass();
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        checkObjectInstance(woy.cV(objArr));
        int length = objArr.length;
        return callMethod(null, length <= 1 ? new Object[0] : woy.cI(objArr, 1, length));
    }
}
