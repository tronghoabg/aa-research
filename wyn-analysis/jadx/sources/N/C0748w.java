package N;

import Ef.C0502n;
import android.view.Choreographer;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import lf.AbstractC3464c;

/* renamed from: N.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748w implements Q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0748w f7942a = new C0748w();

    /* renamed from: b, reason: collision with root package name */
    public static final Choreographer f7943b;

    static {
        Lf.e eVar = Ef.S.f3698a;
        f7943b = (Choreographer) Ef.H.I(Jf.n.f6132a.f4117e, new C0746u(2, null));
    }

    @Override // N.Q
    public final Object d(tf.l lVar, AbstractC3464c abstractC3464c) {
        C0502n c0502n = new C0502n(1, A6.h.A(abstractC3464c));
        c0502n.t();
        ChoreographerFrameCallbackC0747v choreographerFrameCallbackC0747v = new ChoreographerFrameCallbackC0747v(c0502n, lVar);
        f7943b.postFrameCallback(choreographerFrameCallbackC0747v);
        c0502n.v(new B.F(choreographerFrameCallbackC0747v, 5));
        Object objS = c0502n.s();
        kf.a aVar = kf.a.f39711a;
        return objS;
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
