package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class afnr extends afug implements afhu {
    final /* synthetic */ afnt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnr(afnt afntVar) {
        super(afpq.EMPTY);
        this.this$0 = afntVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof afnr) && affa.f(getProperty(), ((afnr) obj).getProperty());
    }

    @Override // defpackage.afue
    public List<afhr> getAllParameters() {
        return getProperty().getAllParameters();
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return getProperty().getAnnotations();
    }

    @Override // defpackage.afue
    public afwf<?> getCaller() {
        return getProperty().getCaller();
    }

    @Override // defpackage.afue
    public afwf<?> getCallerWithDefaults() {
        return null;
    }

    @Override // defpackage.afue
    public afrj getContainer() {
        return getProperty().getContainer();
    }

    @Override // defpackage.afue
    public agox getModality() {
        return getProperty().getModality();
    }

    @Override // defpackage.afhd
    public String getName() {
        return "<get-" + getProperty().getName() + '>';
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return getProperty().getParameters();
    }

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return null;
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return getProperty().getReturnType();
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return getProperty().getTypeParameters();
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return getProperty().getVisibility();
    }

    public int hashCode() {
        return getProperty().hashCode();
    }

    @Override // defpackage.afdr
    public afdf<?> invoke() {
        return this.this$0.get();
    }

    @Override // defpackage.afhh
    public boolean isExternal() {
        return false;
    }

    @Override // defpackage.afhh
    public boolean isInfix() {
        return false;
    }

    @Override // defpackage.afhh
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.afhh
    public boolean isOperator() {
        return false;
    }

    @Override // defpackage.afue
    public boolean isPackagePrivate() {
        return false;
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return false;
    }

    @Override // defpackage.afue
    public afue<afdf<?>> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    public String toString() {
        afun<afdf<?>> property = getProperty();
        Objects.toString(property);
        return "getter of ".concat(String.valueOf(property));
    }

    @Override // defpackage.afhs
    public afun<afdf<?>> getProperty() {
        return this.this$0;
    }
}
