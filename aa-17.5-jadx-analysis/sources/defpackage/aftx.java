package defpackage;

import defpackage.afhk;

/* loaded from: classes3.dex */
public final class aftx<V, D extends afhk<V>> extends aftz<V, D> implements afhk<V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftx(String str, afdr<? extends D> afdrVar) {
        super(str, afdrVar);
        str.getClass();
        afdrVar.getClass();
    }

    @Override // defpackage.afhp
    public afhj<V> getSetter() {
        return getDelegate().getSetter();
    }

    @Override // defpackage.afhk
    public void set(V v) {
        getDelegate().set(v);
    }
}
