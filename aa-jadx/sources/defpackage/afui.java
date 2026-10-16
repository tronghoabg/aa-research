package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afui<V> extends defpackage.afud<V, defpackage.afbk> implements defpackage.afii<V> {
    private final defpackage.afar<defpackage.afir> setterParameter = defpackage.afga.cB(2, new defpackage.afug(this));
    private final defpackage.afar caller$delegate = defpackage.afga.cB(2, new defpackage.afuh(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afxf caller_delegate$lambda$0(defpackage.afui afuiVar) {
        return defpackage.afus.computeCallerForAccessor(afuiVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afvl setterParameter$lambda$0(defpackage.afui afuiVar) {
        defpackage.agpq setterParameter = afuiVar.getProperty().getKmProperty().getSetterParameter();
        return setterParameter != null ? new defpackage.aftw(afuiVar, setterParameter, afuiVar.getProperty().getAllParameters().size(), defpackage.afiq.d, (defpackage.afwq) afuiVar.getProperty().getTypeParameterTable().a()) : new defpackage.afld(afuiVar.getProperty());
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afui) && defpackage.afga.f(getProperty(), ((defpackage.afui) obj).getProperty());
    }

    @Override // defpackage.afud
    public defpackage.agpk getAccessor() {
        return getProperty().getKmProperty().getSetter();
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
        defpackage.afur property = getProperty();
        java.util.Objects.toString(property);
        return "setter of ".concat(java.lang.String.valueOf(property));
    }
}
