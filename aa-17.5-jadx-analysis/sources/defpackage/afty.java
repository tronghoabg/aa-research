package defpackage;

import defpackage.afhm;

/* loaded from: classes3.dex */
public final class afty<T, V, D extends afhm<T, V>> extends afua<T, V, D> implements afhm<T, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afty(String str, afdr<? extends D> afdrVar) {
        super(str, afdrVar);
        str.getClass();
        afdrVar.getClass();
    }

    @Override // defpackage.afhp
    public afhl<T, V> getSetter() {
        return getDelegate().getSetter();
    }

    @Override // defpackage.afhm
    public void set(T t, V v) {
        getDelegate().set(t, v);
    }
}
