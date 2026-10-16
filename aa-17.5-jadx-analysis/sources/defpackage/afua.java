package defpackage;

import defpackage.afhx;

/* loaded from: classes3.dex */
public class afua<T, V, D extends afhx<T, ? extends V>> extends afub<V, D> implements afhx<T, V> {
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afua(String str, afdr<? extends D> afdrVar) {
        super(afdrVar);
        str.getClass();
        afdrVar.getClass();
        this.name = str;
    }

    @Override // defpackage.afhx
    public V get(T t) {
        return (V) getDelegate().get(t);
    }

    @Override // defpackage.afhx
    public Object getDelegate(T t) {
        return getDelegate().getDelegate(t);
    }

    @Override // defpackage.afia
    public afhw<T, V> getGetter() {
        return getDelegate().getGetter();
    }

    @Override // defpackage.afhd
    public String getName() {
        return this.name;
    }

    @Override // defpackage.afec
    public V invoke(T t) {
        return (V) getDelegate().invoke(t);
    }
}
