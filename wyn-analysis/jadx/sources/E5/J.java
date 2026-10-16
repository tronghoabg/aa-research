package E5;

import U1.C0838h;
import U1.C0855z;
import k8.InterfaceC3207p;

/* loaded from: classes3.dex */
public final /* synthetic */ class J implements InterfaceC3207p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3126b;

    public /* synthetic */ J(Object obj, int i5) {
        this.f3125a = i5;
        this.f3126b = obj;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        switch (this.f3125a) {
            case 0:
                return Boolean.valueOf(((O) this.f3126b).f3186y);
            case 1:
                return (C0838h) this.f3126b;
            case 2:
                return (eb.a) this.f3126b;
            case 3:
                return (k2.G) this.f3126b;
            default:
                return Boolean.valueOf(((C0855z) this.f3126b).f12191C);
        }
    }
}
