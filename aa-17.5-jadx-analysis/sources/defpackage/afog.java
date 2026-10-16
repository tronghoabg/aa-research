package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class afog<V> extends afox<V> implements afhk<V> {
    private final aezr setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afog(afrj afrjVar, Field field, Object obj, afpq afpqVar) {
        super(afrjVar, field, obj, afpqVar);
        afrjVar.getClass();
        field.getClass();
        afpqVar.getClass();
        this.setter$delegate = woy.dH(2, new afoe(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afof setter_delegate$lambda$0(afog afogVar) {
        return new afof(afogVar);
    }

    @Override // defpackage.afhk, defpackage.afhp
    public afof<V> getSetter() {
        return (afof) this.setter$delegate.a();
    }

    @Override // defpackage.afhk
    public void set(V v) {
        getSetter().call(v);
    }

    @Override // defpackage.afox, defpackage.afue
    public afue<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afog(afrjVar, getJField(), getRawBoundReceiver(), afpqVar);
    }
}
