package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afyi implements defpackage.afxf {
    private final java.util.List<java.lang.reflect.Type> parameterTypes;
    private final java.lang.reflect.Type returnType;
    private final java.lang.reflect.Method unboxMethod;

    /* JADX WARN: Multi-variable type inference failed */
    private afyi(java.lang.reflect.Method method, java.util.List<? extends java.lang.reflect.Type> list) {
        this.unboxMethod = method;
        this.parameterTypes = list;
        java.lang.Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.returnType = returnType;
    }

    protected final java.lang.Object callMethod(java.lang.Object obj, java.lang.Object[] objArr) {
        objArr.getClass();
        return this.unboxMethod.invoke(obj, java.util.Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.afxf
    public /* bridge */ void checkArguments(int i) {
        default$checkArguments(i);
    }

    public void default$checkArguments(int i) {
        if (defpackage.afyf.getArity(this) != i) {
            throw new java.lang.IllegalArgumentException(defpackage.a.ck(this, i));
        }
    }

    public boolean default$isBoundInstanceCallWithValueClasses() {
        return false;
    }

    @Override // defpackage.afxf
    /* JADX INFO: renamed from: getMember */
    public /* bridge */ /* synthetic */ java.lang.reflect.Member mo60getMember() {
        return null;
    }

    @Override // defpackage.afxf
    public final java.util.List<java.lang.reflect.Type> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // defpackage.afxf
    public final java.lang.reflect.Type getReturnType() {
        return this.returnType;
    }

    @Override // defpackage.afxf
    public /* bridge */ boolean isBoundInstanceCallWithValueClasses() {
        return default$isBoundInstanceCallWithValueClasses();
    }

    @Override // defpackage.afxf
    /* JADX INFO: renamed from: getMember */
    public final java.lang.reflect.Method mo60getMember() {
        return null;
    }

    public /* bridge */ void checkArguments(java.lang.Object[] objArr) {
        default$checkArguments(objArr);
    }

    public /* synthetic */ afyi(java.lang.reflect.Method method, java.util.List list, defpackage.affu affuVar) {
        this(method, list);
    }

    public void default$checkArguments(java.lang.Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr.length);
    }
}
