package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class aftf<V> extends aftd<V, V> implements afht<V> {
    private final aezr caller$delegate = woy.dH(2, new afte(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf caller_delegate$lambda$0(aftf aftfVar) {
        return afts.computeCallerForAccessor(aftfVar, true);
    }

    public boolean equals(Object obj) {
        return (obj instanceof aftf) && affa.f(getProperty(), ((aftf) obj).getProperty());
    }

    @Override // defpackage.aftd
    public agok getAccessor() {
        return getProperty().getKmProperty().getGetter();
    }

    @Override // defpackage.afue
    public List<afhr> getAllParameters() {
        return getProperty().getAllParameters();
    }

    @Override // defpackage.afue
    public afwf<?> getCaller() {
        return (afwf) this.caller$delegate.a();
    }

    @Override // defpackage.afhd
    public String getName() {
        return "<get-" + getProperty().getName() + '>';
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return getProperty().getParameters();
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return getProperty().getReturnType();
    }

    public int hashCode() {
        return getProperty().hashCode();
    }

    public String toString() {
        aftr property = getProperty();
        Objects.toString(property);
        return "getter of ".concat(String.valueOf(property));
    }
}
