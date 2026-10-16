package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afpu<V> extends defpackage.afpp<V, defpackage.afbk> implements defpackage.afii<V> {
    private final defpackage.afar<defpackage.afir> setterParameter = defpackage.afga.cB(2, new defpackage.afps(this));
    private final defpackage.afar caller$delegate = defpackage.afga.cB(2, new defpackage.afpt(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afxf caller_delegate$lambda$0(defpackage.afpu afpuVar) {
        return defpackage.afpz.computeCallerForAccessor(afpuVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afld setterParameter$lambda$0(defpackage.afpu afpuVar) {
        return new defpackage.afld(afpuVar.getProperty());
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afpu) && defpackage.afga.f(getProperty(), ((defpackage.afpu) obj).getProperty());
    }

    @Override // defpackage.afve
    public java.util.List<defpackage.afir> getAllParameters() {
        return defpackage.afga.aT(getProperty().getAllParameters(), this.setterParameter.a());
    }

    @Override // defpackage.afve
    public defpackage.afxf<?> getCaller() {
        return (defpackage.afxf) this.caller$delegate.a();
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        return "<set-" + getProperty().getName() + '>';
    }

    @Override // defpackage.afid
    public java.util.List<defpackage.afir> getParameters() {
        return defpackage.afga.aT(getProperty().getParameters(), this.setterParameter.a());
    }

    @Override // defpackage.afid
    public defpackage.afjb getReturnType() {
        return defpackage.afwm.INSTANCE.getUNIT_RETURN_TYPE();
    }

    public int hashCode() {
        return getProperty().hashCode();
    }

    public java.lang.String toString() {
        defpackage.afpy property = getProperty();
        java.util.Objects.toString(property);
        return "setter of ".concat(java.lang.String.valueOf(property));
    }
}
