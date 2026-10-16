package G1;

import Hf.InterfaceC0603m;
import N.C0721e0;
import ef.C2515C;
import jf.InterfaceC3103c;

/* loaded from: classes.dex */
public final class a implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0721e0 f4141b;

    public /* synthetic */ a(C0721e0 c0721e0, int i5) {
        this.f4140a = i5;
        this.f4141b = c0721e0;
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        switch (this.f4140a) {
            case 0:
                this.f4141b.setValue(obj);
                break;
            case 1:
                this.f4141b.setValue(obj);
                break;
            case 2:
                this.f4141b.setValue(obj);
                break;
            default:
                this.f4141b.setValue(obj);
                break;
        }
        return C2515C.f34653a;
    }
}
