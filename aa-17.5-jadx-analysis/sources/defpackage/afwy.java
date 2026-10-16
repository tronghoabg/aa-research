package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class afwy extends afxd implements afwe {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwy(Method method) {
        super(method, false, null, 4, null);
        method.getClass();
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        return callMethod(null, objArr);
    }
}
