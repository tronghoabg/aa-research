package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class afxi implements afwf {
    private final List<Type> parameterTypes;
    private final Type returnType;
    private final Method unboxMethod;

    /* JADX WARN: Multi-variable type inference failed */
    private afxi(Method method, List<? extends Type> list) {
        this.unboxMethod = method;
        this.parameterTypes = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.returnType = returnType;
    }

    protected final Object callMethod(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.unboxMethod.invoke(obj, Arrays.copyOf(objArr, objArr.length));
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

    public boolean default$isBoundInstanceCallWithValueClasses() {
        return false;
    }

    @Override // defpackage.afwf
    /* renamed from: getMember */
    public /* bridge */ /* synthetic */ Member mo61getMember() {
        return null;
    }

    @Override // defpackage.afwf
    public final List<Type> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // defpackage.afwf
    public final Type getReturnType() {
        return this.returnType;
    }

    @Override // defpackage.afwf
    public /* bridge */ boolean isBoundInstanceCallWithValueClasses() {
        return default$isBoundInstanceCallWithValueClasses();
    }

    @Override // defpackage.afwf
    /* renamed from: getMember */
    public final Method mo61getMember() {
        return null;
    }

    public /* bridge */ void checkArguments(Object[] objArr) {
        default$checkArguments(objArr);
    }

    public /* synthetic */ afxi(Method method, List list, afeu afeuVar) {
        this(method, list);
    }

    public void default$checkArguments(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr.length);
    }
}
