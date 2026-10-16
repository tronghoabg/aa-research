package f6;

import k8.InterfaceC3207p;

/* renamed from: f6.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2598k implements InterfaceC3207p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f35070b;

    public /* synthetic */ C2598k(int i5, Class cls) {
        this.f35069a = i5;
        this.f35070b = cls;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        switch (this.f35069a) {
            case 0:
                try {
                    return (InterfaceC2612y) this.f35070b.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
            default:
                try {
                    return (k2.G) this.f35070b.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
