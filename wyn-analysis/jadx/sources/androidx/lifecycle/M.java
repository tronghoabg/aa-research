package androidx.lifecycle;

import Ef.C0502n;
import Ef.InterfaceC0501m0;
import ef.C2515C;

/* loaded from: classes.dex */
public final class M implements InterfaceC1455t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnumC1449m f18606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f18607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ef.E f18608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC1449m f18609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0502n f18610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Nf.d f18611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G1.c f18612g;

    public M(EnumC1449m enumC1449m, kotlin.jvm.internal.G g9, Ef.E e7, EnumC1449m enumC1449m2, C0502n c0502n, Nf.d dVar, G1.c cVar) {
        this.f18606a = enumC1449m;
        this.f18607b = g9;
        this.f18608c = e7;
        this.f18609d = enumC1449m2;
        this.f18610e = c0502n;
        this.f18611f = dVar;
        this.f18612g = cVar;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        kotlin.jvm.internal.G g9 = this.f18607b;
        if (enumC1449m == this.f18606a) {
            g9.f39740a = Ef.H.D(this.f18608c, null, new L(this.f18611f, this.f18612g, null), 3);
            return;
        }
        if (enumC1449m == this.f18609d) {
            InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) g9.f39740a;
            if (interfaceC0501m0 != null) {
                interfaceC0501m0.cancel(null);
            }
            g9.f39740a = null;
        }
        if (enumC1449m == EnumC1449m.ON_DESTROY) {
            this.f18610e.resumeWith(C2515C.f34653a);
        }
    }
}
