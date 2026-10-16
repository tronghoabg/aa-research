package N;

import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class t0 implements Q {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f7924a = new t0();

    @Override // N.Q
    public final Object d(tf.l lVar, AbstractC3464c abstractC3464c) {
        Lf.e eVar = Ef.S.f3698a;
        return Ef.H.P(Jf.n.f6132a, new s0(lVar, null), abstractC3464c);
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        return Fe.e.C(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return P.f7726b;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g interfaceC3107g) {
        return Fe.e.N(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return Fe.e.O(this, interfaceC3108h);
    }
}
