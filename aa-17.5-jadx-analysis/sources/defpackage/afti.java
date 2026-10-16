package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class afti<V> extends aftd<V, afak> implements afhi<V> {
    private final aezr<afhr> setterParameter = woy.dH(2, new aftg(this));
    private final aezr caller$delegate = woy.dH(2, new afth(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf caller_delegate$lambda$0(afti aftiVar) {
        return afts.computeCallerForAccessor(aftiVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aful setterParameter$lambda$0(afti aftiVar) {
        agoq setterParameter = aftiVar.getProperty().getKmProperty().getSetterParameter();
        return setterParameter != null ? new afsw(aftiVar, setterParameter, aftiVar.getProperty().getAllParameters().size(), afhq.d, (afvq) aftiVar.getProperty().getTypeParameterTable().a()) : new afkd(aftiVar.getProperty());
    }

    public boolean equals(Object obj) {
        return (obj instanceof afti) && affa.f(getProperty(), ((afti) obj).getProperty());
    }

    @Override // defpackage.aftd
    public agok getAccessor() {
        return getProperty().getKmProperty().getSetter();
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
        aftr property = getProperty();
        Objects.toString(property);
        return "setter of ".concat(String.valueOf(property));
    }
}
