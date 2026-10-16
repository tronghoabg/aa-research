package defpackage;

/* loaded from: classes3.dex */
public abstract class agbn extends agcc {
    private final agey delegate;

    public agbn(agey ageyVar) {
        ageyVar.getClass();
        this.delegate = ageyVar;
    }

    @Override // defpackage.agcc
    public agey getDelegate() {
        return this.delegate;
    }

    @Override // defpackage.agcc
    public String getInternalDisplayName() {
        return getDelegate().getInternalDisplayName();
    }

    @Override // defpackage.agcc
    public agcc normalize() {
        return agcb.toDescriptorVisibility(getDelegate().normalize());
    }
}
