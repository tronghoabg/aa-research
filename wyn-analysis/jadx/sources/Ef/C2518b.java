package ef;

import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;

/* renamed from: ef.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2518b implements InterfaceC3103c {

    /* renamed from: a, reason: collision with root package name */
    public Yf.z f34657a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3103c f34658b;

    /* renamed from: c, reason: collision with root package name */
    public Object f34659c;

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return C3109i.f38759a;
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        this.f34658b = null;
        this.f34659c = obj;
    }
}
