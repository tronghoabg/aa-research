package Hf;

import If.AbstractC0622c;
import If.C0620a;
import ef.C2515C;
import jf.InterfaceC3103c;

/* loaded from: classes5.dex */
public final class L implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f5053b;

    public /* synthetic */ L(kotlin.jvm.internal.G g9, int i5) {
        this.f5052a = i5;
        this.f5053b = g9;
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        switch (this.f5052a) {
            case 0:
                this.f5053b.f39740a = obj;
                throw new C0620a(this);
            case 1:
                this.f5053b.f39740a = obj;
                throw new C0620a(this);
            default:
                kotlin.jvm.internal.G g9 = this.f5053b;
                if (g9.f39740a != AbstractC0622c.f5464b) {
                    throw new IllegalArgumentException("Flow has more than one element");
                }
                g9.f39740a = obj;
                return C2515C.f34653a;
        }
    }
}
