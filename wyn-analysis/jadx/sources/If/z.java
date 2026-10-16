package If;

import Cd.U;
import Ef.H;
import Hf.InterfaceC0603m;
import ef.C2515C;
import ef.C2530n;
import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.InterfaceC3465d;

/* loaded from: classes5.dex */
public final class z extends AbstractC3464c implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0603m f5522a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3108h f5523b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5524c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3108h f5525d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3103c f5526e;

    public z(InterfaceC0603m interfaceC0603m, InterfaceC3108h interfaceC3108h) {
        super(x.f5520a, C3109i.f38759a);
        this.f5522a = interfaceC0603m;
        this.f5523b = interfaceC3108h;
        this.f5524c = ((Number) interfaceC3108h.fold(0, new U(4))).intValue();
    }

    public final Object d(InterfaceC3103c interfaceC3103c, Object obj) {
        InterfaceC3108h context = interfaceC3103c.getContext();
        H.p(context);
        InterfaceC3108h interfaceC3108h = this.f5525d;
        if (interfaceC3108h != context) {
            if (interfaceC3108h instanceof u) {
                throw new IllegalStateException(Bf.l.V("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((u) interfaceC3108h).f5519b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new Bf.s(this, 4))).intValue() != this.f5524c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f5523b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f5525d = context;
        }
        this.f5526e = interfaceC3103c;
        A a5 = B.f5451a;
        InterfaceC0603m interfaceC0603m = this.f5522a;
        AbstractC3340k.c(interfaceC0603m, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        a5.getClass();
        Object objEmit = interfaceC0603m.emit(obj, this);
        if (!AbstractC3340k.a(objEmit, kf.a.f39711a)) {
            this.f5526e = null;
        }
        return objEmit;
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        try {
            Object objD = d(interfaceC3103c, obj);
            return objD == kf.a.f39711a ? objD : C2515C.f34653a;
        } catch (Throwable th) {
            this.f5525d = new u(interfaceC3103c.getContext(), th);
            throw th;
        }
    }

    @Override // lf.AbstractC3462a, lf.InterfaceC3465d
    public final InterfaceC3465d getCallerFrame() {
        InterfaceC3103c interfaceC3103c = this.f5526e;
        if (interfaceC3103c instanceof InterfaceC3465d) {
            return (InterfaceC3465d) interfaceC3103c;
        }
        return null;
    }

    @Override // lf.AbstractC3464c, jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        InterfaceC3108h interfaceC3108h = this.f5525d;
        return interfaceC3108h == null ? C3109i.f38759a : interfaceC3108h;
    }

    @Override // lf.AbstractC3462a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = C2530n.a(obj);
        if (thA != null) {
            this.f5525d = new u(getContext(), thA);
        }
        InterfaceC3103c interfaceC3103c = this.f5526e;
        if (interfaceC3103c != null) {
            interfaceC3103c.resumeWith(obj);
        }
        return kf.a.f39711a;
    }
}
