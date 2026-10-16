package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
final class afns implements afwf {
    final /* synthetic */ afnt this$0;

    public afns(afnt afntVar) {
        this.this$0 = afntVar;
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        afdf afdfVar = this.this$0.result;
        checkArguments(objArr);
        return afdfVar;
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
        return afik.c(this.this$0.getReturnType());
    }

    @Override // defpackage.afwf
    public /* bridge */ boolean isBoundInstanceCallWithValueClasses() {
        return false;
    }

    @Override // defpackage.afwf
    /* renamed from: getMember, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Member mo61getMember() {
        return null;
    }

    public /* bridge */ void checkArguments(Object[] objArr) {
        default$checkArguments(objArr);
    }

    public void default$checkArguments(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr.length);
    }
}
