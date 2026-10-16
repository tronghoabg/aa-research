package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afuf<V> extends defpackage.afud<V, V> implements defpackage.afit<V> {
    private final defpackage.afar caller$delegate = defpackage.afga.cB(2, new defpackage.afue(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afxf caller_delegate$lambda$0(defpackage.afuf afufVar) {
        return defpackage.afus.computeCallerForAccessor(afufVar, true);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afuf) && defpackage.afga.f(getProperty(), ((defpackage.afuf) obj).getProperty());
    }

    @Override // defpackage.afud
    public defpackage.agpk getAccessor() {
        return getProperty().getKmProperty().getGetter();
    }

    @Override // defpackage.afve
    public java.util.List<defpackage.afir> getAllParameters() {
        return getProperty().getAllParameters();
    }

    @Override // defpackage.afve
    public defpackage.afxf<?> getCaller() {
        return (defpackage.afxf) this.caller$delegate.a();
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        return "<get-" + getProperty().getName() + '>';
    }

    @Override // defpackage.afid
    public java.util.List<defpackage.afir> getParameters() {
        return getProperty().getParameters();
    }

    @Override // defpackage.afid
    public defpackage.afjb getReturnType() {
        return getProperty().getReturnType();
    }

    public int hashCode() {
        return getProperty().hashCode();
    }

    public java.lang.String toString() {
        defpackage.afur property = getProperty();
        java.util.Objects.toString(property);
        return "getter of ".concat(java.lang.String.valueOf(property));
    }
}
