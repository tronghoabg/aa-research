package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class afox<V> extends afoy<V> implements afhv<V> {
    private final aezr getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afox(afrj afrjVar, Field field, Object obj, afpq afpqVar) {
        super(afrjVar, field, obj, afpqVar);
        afrjVar.getClass();
        field.getClass();
        afpqVar.getClass();
        this.getter$delegate = woy.dH(2, new afov(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afow getter_delegate$lambda$0(afox afoxVar) {
        return new afow(afoxVar);
    }

    @Override // defpackage.afhv
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // defpackage.afhv
    public Object getDelegate() {
        return null;
    }

    @Override // defpackage.afoy, defpackage.afia
    public afow<V> getGetter() {
        return (afow) this.getter$delegate.a();
    }

    @Override // defpackage.afdr
    public V invoke() {
        return get();
    }

    @Override // defpackage.afue
    public afue<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afox(afrjVar, getJField(), getRawBoundReceiver(), afpqVar);
    }
}
