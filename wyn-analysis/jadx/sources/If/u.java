package If;

import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class u implements InterfaceC3108h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3108h f5518a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f5519b;

    public u(InterfaceC3108h interfaceC3108h, Throwable th) {
        this.f5518a = interfaceC3108h;
        this.f5519b = th;
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, tf.p pVar) {
        return this.f5518a.fold(obj, pVar);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        return this.f5518a.get(interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g interfaceC3107g) {
        return this.f5518a.minusKey(interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return this.f5518a.plus(interfaceC3108h);
    }
}
