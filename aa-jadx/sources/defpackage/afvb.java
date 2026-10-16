package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afvb<V, D extends defpackage.afja<? extends V>> implements defpackage.afja<V> {
    private final defpackage.afar delegate$delegate;

    public afvb(defpackage.afer<? extends D> aferVar) {
        aferVar.getClass();
        this.delegate$delegate = defpackage.afga.cB(2, aferVar);
    }

    @Override // defpackage.afid
    public V call(java.lang.Object... objArr) {
        objArr.getClass();
        return getDelegate().call(java.util.Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.afid
    public V callBy(java.util.Map<defpackage.afir, ? extends java.lang.Object> map) {
        map.getClass();
        return getDelegate().callBy(map);
    }

    public boolean equals(java.lang.Object obj) {
        return defpackage.afga.f(getDelegate(), obj);
    }

    @Override // defpackage.afic
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return getDelegate().getAnnotations();
    }

    public final D getDelegate() {
        return (D) this.delegate$delegate.a();
    }

    @Override // defpackage.afid
    public java.util.List<defpackage.afir> getParameters() {
        return getDelegate().getParameters();
    }

    @Override // defpackage.afid
    public defpackage.afjb getReturnType() {
        return getDelegate().getReturnType();
    }

    @Override // defpackage.afid
    public java.util.List<defpackage.afjc> getTypeParameters() {
        return getDelegate().getTypeParameters();
    }

    @Override // defpackage.afid
    public defpackage.afjf getVisibility() {
        return getDelegate().getVisibility();
    }

    public int hashCode() {
        return getDelegate().hashCode();
    }

    @Override // defpackage.afid
    public boolean isAbstract() {
        return getDelegate().isAbstract();
    }

    @Override // defpackage.afja
    public boolean isConst() {
        return getDelegate().isConst();
    }

    @Override // defpackage.afid
    public boolean isFinal() {
        return getDelegate().isFinal();
    }

    @Override // defpackage.afja
    public boolean isLateinit() {
        return getDelegate().isLateinit();
    }

    @Override // defpackage.afid
    public boolean isOpen() {
        return getDelegate().isOpen();
    }

    @Override // defpackage.afid
    public boolean isSuspend() {
        return getDelegate().isSuspend();
    }

    public java.lang.String toString() {
        return getDelegate().toString();
    }
}
