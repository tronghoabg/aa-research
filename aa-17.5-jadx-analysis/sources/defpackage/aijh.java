package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class aijh extends aigl {
    public aijh() {
        super(null);
    }

    @Override // defpackage.aigl
    public List<aiin> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // defpackage.aigl
    public aihr getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // defpackage.aigl
    public aiid getConstructor() {
        return getDelegate().getConstructor();
    }

    protected abstract aigl getDelegate();

    @Override // defpackage.aigl
    public ahxe getMemberScope() {
        return getDelegate().getMemberScope();
    }

    public boolean isComputed() {
        return true;
    }

    @Override // defpackage.aigl
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    public String toString() {
        return isComputed() ? getDelegate().toString() : "<Not computed yet>";
    }

    @Override // defpackage.aigl
    public final aijf unwrap() {
        aigl delegate = getDelegate();
        while (delegate instanceof aijh) {
            delegate = ((aijh) delegate).getDelegate();
        }
        delegate.getClass();
        return (aijf) delegate;
    }
}
