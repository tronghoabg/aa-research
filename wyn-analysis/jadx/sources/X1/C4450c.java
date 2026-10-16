package x1;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4450c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f47648a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f47649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f47650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4450c(p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f47650c = (AbstractC3471j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C4450c c4450c = new C4450c(this.f47650c, interfaceC3103c);
        c4450c.f47649b = obj;
        return c4450c;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4450c) create((C4449b) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f47648a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C4449b c4449b = (C4449b) this.f47649b;
            this.f47648a = 1;
            obj = this.f47650c.invoke(c4449b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        C4449b c4449b2 = (C4449b) obj;
        c4449b2.f47647b.set(true);
        return c4449b2;
    }
}
