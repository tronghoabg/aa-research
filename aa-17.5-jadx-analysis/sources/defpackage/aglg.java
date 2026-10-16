package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class aglg extends aglb implements agzv {
    private final Object recordComponent;

    public aglg(Object obj) {
        obj.getClass();
        this.recordComponent = obj;
    }

    @Override // defpackage.aglb
    public Member getMember() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodLoadGetAccessor = agjv.INSTANCE.loadGetAccessor(this.recordComponent);
        if (methodLoadGetAccessor != null) {
            return methodLoadGetAccessor;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // defpackage.agzv
    public agzw getType() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsLoadGetType = agjv.INSTANCE.loadGetType(this.recordComponent);
        if (clsLoadGetType != null) {
            return new agkv(clsLoadGetType);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // defpackage.agzv
    public boolean isVararg() {
        return false;
    }
}
