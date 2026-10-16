package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class afxg extends afxi implements afwe {
    private final Object boundReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxg(Method method, Object obj) {
        super(method, afbe.a, null);
        method.getClass();
        this.boundReceiver = obj;
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        return callMethod(this.boundReceiver, objArr);
    }
}
