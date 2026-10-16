package Hf;

import If.AbstractC0621b;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class V extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5084a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f5086c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0621b f5087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V(InterfaceC0602l interfaceC0602l, InterfaceC0590b0 interfaceC0590b0, Object obj, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5086c = interfaceC0602l;
        this.f5087d = (AbstractC0621b) interfaceC0590b0;
        this.f5088e = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Hf.b0, If.b] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        V v2 = new V(this.f5086c, this.f5087d, this.f5088e, interfaceC3103c);
        v2.f5085b = obj;
        return v2;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((m0) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [Hf.b0, Hf.m, If.b] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5084a;
        if (i5 == 0) {
            Fe.e.U(obj);
            int iOrdinal = ((m0) this.f5085b).ordinal();
            ?? r12 = this.f5087d;
            if (iOrdinal == 0) {
                this.f5084a = 1;
                if (this.f5086c.collect(r12, this) == aVar) {
                    return aVar;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new E5.Q((byte) 0, 9);
                }
                H6.g gVar = k0.f5154a;
                Object obj2 = this.f5088e;
                if (obj2 == gVar) {
                    r12.c();
                } else {
                    r12.b(obj2);
                }
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
