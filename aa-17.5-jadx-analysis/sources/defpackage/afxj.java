package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
public final class afxj implements afwf {
    public static final afxj INSTANCE = new afxj();

    private afxj() {
    }

    private final Void throwUnsupported() {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        throwUnsupported();
        throw new aezp();
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

    public Void getMember() {
        return null;
    }

    @Override // defpackage.afwf
    public List<Type> getParameterTypes() {
        return afbe.a;
    }

    @Override // defpackage.afwf
    public Type getReturnType() {
        throwUnsupported();
        throw new aezp();
    }

    @Override // defpackage.afwf
    public /* bridge */ boolean isBoundInstanceCallWithValueClasses() {
        return false;
    }

    @Override // defpackage.afwf
    /* renamed from: getMember */
    public /* bridge */ /* synthetic */ Member mo61getMember() {
        return null;
    }
}
