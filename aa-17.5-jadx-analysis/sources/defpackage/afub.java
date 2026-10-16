package defpackage;

import defpackage.afia;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class afub<V, D extends afia<? extends V>> implements afia<V> {
    private final aezr delegate$delegate;

    public afub(afdr<? extends D> afdrVar) {
        afdrVar.getClass();
        this.delegate$delegate = woy.dH(2, afdrVar);
    }

    @Override // defpackage.afhd
    public V call(Object... objArr) {
        objArr.getClass();
        return getDelegate().call(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.afhd
    public V callBy(Map<afhr, ? extends Object> map) {
        map.getClass();
        return getDelegate().callBy(map);
    }

    public boolean equals(Object obj) {
        return affa.f(getDelegate(), obj);
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return getDelegate().getAnnotations();
    }

    public final D getDelegate() {
        return (D) this.delegate$delegate.a();
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return getDelegate().getParameters();
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return getDelegate().getReturnType();
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return getDelegate().getTypeParameters();
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return getDelegate().getVisibility();
    }

    public int hashCode() {
        return getDelegate().hashCode();
    }

    @Override // defpackage.afhd
    public boolean isAbstract() {
        return getDelegate().isAbstract();
    }

    @Override // defpackage.afia
    public boolean isConst() {
        return getDelegate().isConst();
    }

    @Override // defpackage.afhd
    public boolean isFinal() {
        return getDelegate().isFinal();
    }

    @Override // defpackage.afia
    public boolean isLateinit() {
        return getDelegate().isLateinit();
    }

    @Override // defpackage.afhd
    public boolean isOpen() {
        return getDelegate().isOpen();
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return getDelegate().isSuspend();
    }

    public String toString() {
        return getDelegate().toString();
    }
}
