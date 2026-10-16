package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class agcn extends defpackage.agdc {
    private final defpackage.agfy delegate;

    public agcn(defpackage.agfy agfyVar) {
        agfyVar.getClass();
        this.delegate = agfyVar;
    }

    @Override // defpackage.agdc
    public defpackage.agfy getDelegate() {
        return this.delegate;
    }

    @Override // defpackage.agdc
    public java.lang.String getInternalDisplayName() {
        return getDelegate().getInternalDisplayName();
    }

    @Override // defpackage.agdc
    public defpackage.agdc normalize() {
        return defpackage.agdb.toDescriptorVisibility(getDelegate().normalize());
    }
}
