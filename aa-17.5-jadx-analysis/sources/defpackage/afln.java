package defpackage;

/* loaded from: classes3.dex */
public abstract class afln<PropertyType, ReturnType> extends afko<ReturnType> implements afhh, afhs {
    public afln() {
        super(afpq.EMPTY);
    }

    @Override // defpackage.afue
    public afwf<?> getCallerWithDefaults() {
        return null;
    }

    @Override // defpackage.afue
    public afrj getContainer() {
        return getProperty().getContainer();
    }

    @Override // defpackage.afko
    public abstract agdm getDescriptor();

    @Override // defpackage.afhs
    public abstract afmi<PropertyType> getProperty();

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return getProperty().getRawBoundReceiver();
    }

    @Override // defpackage.afhh
    public boolean isExternal() {
        return getDescriptor().isExternal();
    }

    @Override // defpackage.afhh
    public boolean isInfix() {
        return getDescriptor().isInfix();
    }

    @Override // defpackage.afhh
    public boolean isInline() {
        return getDescriptor().isInline();
    }

    @Override // defpackage.afhh
    public boolean isOperator() {
        return getDescriptor().isOperator();
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return getDescriptor().isSuspend();
    }
}
