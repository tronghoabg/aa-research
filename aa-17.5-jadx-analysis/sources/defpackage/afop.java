package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class afop<PropertyType, ReturnType> extends afug<ReturnType> implements afhh, afhs {
    public afop() {
        super(afpq.EMPTY);
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return afbe.a;
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

    @Override // defpackage.afhs
    public abstract afoy<PropertyType> getProperty();

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return getProperty().getRawBoundReceiver();
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return afbe.a;
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return getProperty().getVisibility();
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
        return getProperty().isPackagePrivate();
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return false;
    }

    @Override // defpackage.afue
    public final afue<ReturnType> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }
}
