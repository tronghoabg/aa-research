package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class afou<V> extends afop<V, afak> implements afhi<V> {
    private final aezr<afhr> setterParameter = woy.dH(2, new afos(this));
    private final aezr caller$delegate = woy.dH(2, new afot(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf caller_delegate$lambda$0(afou afouVar) {
        return afoz.computeCallerForAccessor(afouVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afkd setterParameter$lambda$0(afou afouVar) {
        return new afkd(afouVar.getProperty());
    }

    public boolean equals(Object obj) {
        return (obj instanceof afou) && affa.f(getProperty(), ((afou) obj).getProperty());
    }

    @Override // defpackage.afue
    public List<afhr> getAllParameters() {
        return woy.bZ(getProperty().getAllParameters(), this.setterParameter.a());
    }

    @Override // defpackage.afue
    public afwf<?> getCaller() {
        return (afwf) this.caller$delegate.a();
    }

    @Override // defpackage.afhd
    public String getName() {
        return "<set-" + getProperty().getName() + '>';
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return woy.bZ(getProperty().getParameters(), this.setterParameter.a());
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return afvm.INSTANCE.getUNIT_RETURN_TYPE();
    }

    public int hashCode() {
        return getProperty().hashCode();
    }

    public String toString() {
        afoy property = getProperty();
        Objects.toString(property);
        return "setter of ".concat(String.valueOf(property));
    }
}
