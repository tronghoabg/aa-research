package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afvg<R> implements defpackage.afve<R> {
    private final defpackage.afvp<java.lang.Object[]> _absentArguments;
    private final defpackage.afqq overriddenStorage;

    public afvg(defpackage.afqq afqqVar) {
        afqqVar.getClass();
        this.overriddenStorage = afqqVar;
        this._absentArguments = defpackage.afvs.lazySoft(new defpackage.afvf(this));
    }

    @Override // defpackage.afid
    public /* bridge */ R call(java.lang.Object... objArr) {
        return default$call(objArr);
    }

    @Override // defpackage.afid
    public /* bridge */ R callBy(java.util.Map<defpackage.afir, ? extends java.lang.Object> map) {
        return default$callBy(map);
    }

    public R default$call(java.lang.Object... objArr) throws defpackage.afjm {
        objArr.getClass();
        try {
            return (R) getCaller().call(objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new defpackage.afjm(e);
        }
    }

    public R default$callBy(java.util.Map<defpackage.afir, ? extends java.lang.Object> map) {
        map.getClass();
        return defpackage.afvh.isAnnotationConstructor(this) ? (R) defpackage.afvh.callAnnotationConstructor(this, map) : (R) defpackage.afvh.callDefaultMethod(this, map, null);
    }

    @Override // defpackage.afve
    public java.lang.Object[] getAbsentArguments() {
        return (java.lang.Object[]) this._absentArguments.invoke().clone();
    }

    @Override // defpackage.afve
    public defpackage.afqq getOverriddenStorage() {
        return this.overriddenStorage;
    }

    @Override // defpackage.afid
    public final boolean isAbstract() {
        return getModality() == defpackage.agpx.ABSTRACT;
    }

    @Override // defpackage.afid
    public final boolean isFinal() {
        return getModality() == defpackage.agpx.FINAL;
    }

    @Override // defpackage.afid
    public final boolean isOpen() {
        return getModality() == defpackage.agpx.OPEN;
    }
}
