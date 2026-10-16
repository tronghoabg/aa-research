package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class afxe<M extends Member> implements afwf<M> {
    public static final afwj Companion = new afwj(null);
    private final M member;
    private final List<Type> parameterTypes;
    private final Type returnType;

    private afxe(M m, Type type, Type[] typeArr) {
        this.member = m;
        this.returnType = type;
        this.parameterTypes = woy.df(typeArr);
    }

    @Override // defpackage.afwf
    public /* bridge */ void checkArguments(int i) {
        default$checkArguments(i);
    }

    protected final void checkObjectInstance(Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
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
    public final M mo61getMember() {
        return this.member;
    }

    @Override // defpackage.afwf
    public List<Type> getParameterTypes() {
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

    public /* bridge */ void checkArguments(Object[] objArr) {
        default$checkArguments(objArr);
    }

    public /* synthetic */ afxe(Member member, Type type, Type[] typeArr, afeu afeuVar) {
        this(member, type, typeArr);
    }

    public void default$checkArguments(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr.length);
    }
}
