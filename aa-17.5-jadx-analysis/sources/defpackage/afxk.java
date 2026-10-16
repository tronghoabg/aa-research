package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class afxk {
    private final afha argumentRange;
    private final Method box;
    private final Method[] unboxParameters;

    public afxk(afha afhaVar, Method[] methodArr, Method method) {
        afhaVar.getClass();
        methodArr.getClass();
        this.argumentRange = afhaVar;
        this.unboxParameters = methodArr;
        this.box = method;
    }

    public final afha getArgumentRange() {
        return this.argumentRange;
    }

    public final Method getBox() {
        return this.box;
    }

    public final Method[] getUnboxParameters() {
        return this.unboxParameters;
    }
}
