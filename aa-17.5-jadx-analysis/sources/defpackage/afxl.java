package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
public final class afxl<M extends Member> implements afwf<M> {
    private final afwf<M> caller;
    private final afxk data;
    private final boolean isDefault;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145 A[LOOP:1: B:80:0x013f->B:82:0x0145, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public afxl(defpackage.afue<?> r11, defpackage.afwf<? extends M> r12, boolean r13, java.util.List<java.lang.Integer> r14) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxl.<init>(afue, afwf, boolean, java.util.List):void");
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Method method;
        objArr.getClass();
        afxk afxkVar = this.data;
        int length = objArr.length;
        afha argumentRange = afxkVar.getArgumentRange();
        Method[] unboxParameters = afxkVar.getUnboxParameters();
        Method box = afxkVar.getBox();
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objDefaultPrimitiveValue = objArr[i];
            int i2 = argumentRange.a;
            if (i <= argumentRange.b && i2 <= i && (method = unboxParameters[i]) != null) {
                if (objDefaultPrimitiveValue != null) {
                    objDefaultPrimitiveValue = method.invoke(objDefaultPrimitiveValue, null);
                } else {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    objDefaultPrimitiveValue = afvu.defaultPrimitiveValue(returnType);
                }
            }
            objArr2[i] = objDefaultPrimitiveValue;
        }
        Object objCall = this.caller.call(objArr2);
        return (objCall == afcr.a || box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // defpackage.afwf
    public /* bridge */ void checkArguments(int i) {
        default$checkArguments(i);
    }

    public void default$checkArguments(int i) {
        if (afxf.getArity(this) != i) {
            throw new IllegalArgumentException(a.ck(this, i));
        }
    }

    @Override // defpackage.afwf
    /* renamed from: getMember */
    public M mo61getMember() {
        return (M) this.caller.mo61getMember();
    }

    @Override // defpackage.afwf
    public List<Type> getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    @Override // defpackage.afwf
    public Type getReturnType() {
        return this.caller.getReturnType();
    }

    @Override // defpackage.afwf
    public boolean isBoundInstanceCallWithValueClasses() {
        return this.caller instanceof afwx;
    }
}
