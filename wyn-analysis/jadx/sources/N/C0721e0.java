package N;

import jf.InterfaceC3108h;

/* renamed from: N.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721e0 implements V, Ef.E {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3108h f7762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f7763b;

    public C0721e0(V v2, InterfaceC3108h interfaceC3108h) {
        this.f7762a = interfaceC3108h;
        this.f7763b = v2;
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f7762a;
    }

    @Override // N.K0
    public final Object getValue() {
        return this.f7763b.getValue();
    }

    @Override // N.V
    public final void setValue(Object obj) {
        this.f7763b.setValue(obj);
    }
}
