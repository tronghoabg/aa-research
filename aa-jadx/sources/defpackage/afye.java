package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afye<M extends java.lang.reflect.Member> implements defpackage.afxf<M> {
    public static final defpackage.afxj Companion = new defpackage.afxj(null);
    private final M member;
    private final java.util.List<java.lang.reflect.Type> parameterTypes;
    private final java.lang.reflect.Type returnType;

    private afye(M m, java.lang.reflect.Type type, java.lang.reflect.Type[] typeArr) {
        this.member = m;
        this.returnType = type;
        this.parameterTypes = defpackage.afga.bZ(typeArr);
    }

    @Override // defpackage.afxf
    public /* bridge */ void checkArguments(int i) {
        default$checkArguments(i);
    }

    protected final void checkObjectInstance(java.lang.Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new java.lang.IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
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
    public final M mo60getMember() {
        return this.member;
    }

    @Override // defpackage.afxf
    public java.util.List<java.lang.reflect.Type> getParameterTypes() {
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

    public /* bridge */ void checkArguments(java.lang.Object[] objArr) {
        default$checkArguments(objArr);
    }

    public /* synthetic */ afye(java.lang.reflect.Member member, java.lang.reflect.Type type, java.lang.reflect.Type[] typeArr, defpackage.affu affuVar) {
        this(member, type, typeArr);
    }

    public void default$checkArguments(java.lang.Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr.length);
    }
}
