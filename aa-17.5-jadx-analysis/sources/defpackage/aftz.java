package defpackage;

import defpackage.afhv;

/* loaded from: classes3.dex */
public class aftz<V, D extends afhv<? extends V>> extends afub<V, D> implements afhv<V> {
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftz(String str, afdr<? extends D> afdrVar) {
        super(afdrVar);
        str.getClass();
        afdrVar.getClass();
        this.name = str;
    }

    @Override // defpackage.afhv
    public V get() {
        return (V) getDelegate().get();
    }

    @Override // defpackage.afhv
    public Object getDelegate() {
        return getDelegate().getDelegate();
    }

    @Override // defpackage.afia
    public afhu<V> getGetter() {
        return getDelegate().getGetter();
    }

    @Override // defpackage.afhd
    public String getName() {
        return this.name;
    }

    @Override // defpackage.afdr
    public V invoke() {
        return (V) getDelegate().invoke();
    }
}
