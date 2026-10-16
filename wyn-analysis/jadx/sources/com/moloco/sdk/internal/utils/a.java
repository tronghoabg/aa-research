package com.moloco.sdk.internal.utils;

import Ef.E;
import Fe.e;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.l;
import tf.p;

/* loaded from: classes4.dex */
public final class a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public Nf.a f29770a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC3471j f29771b;

    /* renamed from: c, reason: collision with root package name */
    public int f29772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Nf.d f29773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f29774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Nf.d dVar, l lVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29773d = dVar;
        this.f29774e = (AbstractC3471j) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lf.j, tf.l] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new a(this.f29773d, this.f29774e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [tf.l] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v5, types: [Nf.a] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Nf.d dVar;
        ?? r12;
        Nf.a aVar;
        Throwable th;
        kf.a aVar2 = kf.a.f39711a;
        int i5 = this.f29772c;
        try {
            if (i5 == 0) {
                e.U(obj);
                dVar = this.f29773d;
                this.f29770a = dVar;
                AbstractC3471j abstractC3471j = this.f29774e;
                this.f29771b = abstractC3471j;
                this.f29772c = 1;
                r12 = abstractC3471j;
                if (dVar.b(this) != aVar2) {
                }
                return aVar2;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f29770a;
                try {
                    e.U(obj);
                    aVar.a(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    aVar.a(null);
                    throw th;
                }
            }
            l lVar = (l) this.f29771b;
            Nf.a aVar3 = this.f29770a;
            e.U(obj);
            dVar = aVar3;
            r12 = lVar;
            this.f29770a = dVar;
            this.f29771b = null;
            this.f29772c = 2;
            Object objInvoke = r12.invoke(this);
            if (objInvoke != aVar2) {
                aVar = dVar;
                obj = objInvoke;
                aVar.a(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            aVar.a(null);
            throw th;
        }
    }
}
