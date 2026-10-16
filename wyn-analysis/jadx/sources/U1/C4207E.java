package u1;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: u1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4207E extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f46433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f46434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46435c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4207E(tf.p pVar, Object obj, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46434b = (AbstractC3471j) pVar;
        this.f46435c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C4207E(this.f46434b, this.f46435c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4207E) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f46433a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        this.f46433a = 1;
        Object objInvoke = this.f46434b.invoke(this.f46435c, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
