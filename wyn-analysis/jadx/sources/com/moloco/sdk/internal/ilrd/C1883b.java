package com.moloco.sdk.internal.ilrd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.ilrd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1883b extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Nf.a f28544a;

    /* renamed from: b, reason: collision with root package name */
    public m f28545b;

    /* renamed from: c, reason: collision with root package name */
    public int f28546c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f28547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883b(m mVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28547d = mVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1883b(this.f28547d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1883b) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [Nf.a] */
    /* JADX WARN: Type inference failed for: r0v9, types: [Nf.a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [Nf.a] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        m mVar;
        Nf.d dVar;
        Nf.a aVar;
        kf.a aVar2 = kf.a.f39711a;
        int i5 = this.f28546c;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                mVar = this.f28547d;
                dVar = mVar.f28595p;
                this.f28544a = dVar;
                this.f28545b = mVar;
                this.f28546c = 1;
                if (dVar.b(this) != aVar2) {
                }
                return aVar2;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f28544a;
                try {
                    Fe.e.U(obj);
                    aVar = aVar;
                    C2515C c2515c = C2515C.f34653a;
                    aVar.a(null);
                    return c2515c;
                } catch (Throwable th) {
                    Nf.d dVar2 = aVar;
                    th = th;
                    dVar = dVar2;
                    dVar.a(null);
                    throw th;
                }
            }
            mVar = this.f28545b;
            Nf.a aVar3 = this.f28544a;
            Fe.e.U(obj);
            dVar = aVar3;
            this.f28544a = dVar;
            this.f28545b = null;
            this.f28546c = 2;
            if (m.b(mVar, this) != aVar2) {
                aVar = dVar;
                C2515C c2515c2 = C2515C.f34653a;
                aVar.a(null);
                return c2515c2;
            }
            return aVar2;
        } catch (Throwable th2) {
            th = th2;
            dVar.a(null);
            throw th;
        }
    }
}
