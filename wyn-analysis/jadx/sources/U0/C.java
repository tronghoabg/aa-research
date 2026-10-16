package u0;

import Ef.C0502n;
import N.ChoreographerFrameCallbackC0747v;
import android.view.Choreographer;
import jf.C3104d;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class C implements N.Q {

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f46094a;

    public C(Choreographer choreographer) {
        this.f46094a = choreographer;
    }

    @Override // N.Q
    public final Object d(tf.l lVar, AbstractC3464c abstractC3464c) {
        InterfaceC3106f interfaceC3106f = abstractC3464c.getContext().get(C3104d.f38758a);
        B b5 = interfaceC3106f instanceof B ? (B) interfaceC3106f : null;
        C0502n c0502n = new C0502n(1, A6.h.A(abstractC3464c));
        c0502n.t();
        ChoreographerFrameCallbackC0747v choreographerFrameCallbackC0747v = new ChoreographerFrameCallbackC0747v(c0502n, this, lVar);
        if (b5 == null || !AbstractC3340k.a(b5.f46082b, this.f46094a)) {
            this.f46094a.postFrameCallback(choreographerFrameCallbackC0747v);
            c0502n.v(new A.W(24, this, choreographerFrameCallbackC0747v));
        } else {
            synchronized (b5.f46084d) {
                b5.f46086f.add(choreographerFrameCallbackC0747v);
                if (!b5.f46089i) {
                    b5.f46089i = true;
                    b5.f46082b.postFrameCallback(b5.f46090j);
                }
            }
            c0502n.v(new A.W(23, b5, choreographerFrameCallbackC0747v));
        }
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
        return N.P.f7726b;
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
