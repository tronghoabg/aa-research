package Ef;

import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class Q0 implements InterfaceC3106f, InterfaceC3107g {

    /* renamed from: a, reason: collision with root package name */
    public static final Q0 f3697a = new Q0();

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        return Fe.e.C(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g interfaceC3107g) {
        return Fe.e.N(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return Fe.e.O(this, interfaceC3108h);
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return this;
    }
}
