package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class afug<R> implements afue<R> {
    private final afup<Object[]> _absentArguments;
    private final afpq overriddenStorage;

    public afug(afpq afpqVar) {
        afpqVar.getClass();
        this.overriddenStorage = afpqVar;
        this._absentArguments = afus.lazySoft(new afuf(this));
    }

    @Override // defpackage.afhd
    public /* bridge */ R call(Object... objArr) {
        return default$call(objArr);
    }

    @Override // defpackage.afhd
    public /* bridge */ R callBy(Map<afhr, ? extends Object> map) {
        return default$callBy(map);
    }

    public R default$call(Object... objArr) throws afim {
        objArr.getClass();
        try {
            return (R) getCaller().call(objArr);
        } catch (IllegalAccessException e) {
            throw new afim(e);
        }
    }

    public R default$callBy(Map<afhr, ? extends Object> map) {
        map.getClass();
        return afuh.isAnnotationConstructor(this) ? (R) afuh.callAnnotationConstructor(this, map) : (R) afuh.callDefaultMethod(this, map, null);
    }

    @Override // defpackage.afue
    public Object[] getAbsentArguments() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    @Override // defpackage.afue
    public afpq getOverriddenStorage() {
        return this.overriddenStorage;
    }

    @Override // defpackage.afhd
    public final boolean isAbstract() {
        return getModality() == agox.ABSTRACT;
    }

    @Override // defpackage.afhd
    public final boolean isFinal() {
        return getModality() == agox.FINAL;
    }

    @Override // defpackage.afhd
    public final boolean isOpen() {
        return getModality() == agox.OPEN;
    }
}
