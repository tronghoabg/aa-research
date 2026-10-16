package Hf;

import ea.C2480D;
import ef.C2515C;
import jf.InterfaceC3103c;

/* loaded from: classes5.dex */
public final class Z implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f5103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5104c;

    public /* synthetic */ Z(InterfaceC0602l interfaceC0602l, Object obj, int i5) {
        this.f5102a = i5;
        this.f5103b = interfaceC0602l;
        this.f5104c = obj;
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) throws Throwable {
        switch (this.f5102a) {
            case 0:
                Object objCollect = this.f5103b.collect(new C0615z(4, interfaceC0603m, this.f5104c), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            case 1:
                ((x0) this.f5103b).collect(new C0615z(9, interfaceC0603m, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) this.f5104c), interfaceC3103c);
                return kf.a.f39711a;
            default:
                Object objCollect2 = ((C0611v) this.f5103b).collect(new C0615z(10, interfaceC0603m, (C2480D) this.f5104c), interfaceC3103c);
                return objCollect2 == kf.a.f39711a ? objCollect2 : C2515C.f34653a;
        }
    }
}
