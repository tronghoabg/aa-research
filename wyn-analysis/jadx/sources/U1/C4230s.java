package u1;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: u1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4230s extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4210H f46486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4230s(AbstractC4210H abstractC4210H, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46486b = abstractC4210H;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C4230s c4230s = new C4230s(this.f46486b, interfaceC3103c);
        c4230s.f46485a = obj;
        return c4230s;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4230s) create((AbstractC4210H) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        AbstractC4210H abstractC4210H = (AbstractC4210H) this.f46485a;
        AbstractC4210H abstractC4210H2 = this.f46486b;
        boolean z2 = false;
        if (!(abstractC4210H2 instanceof C4214c) && !(abstractC4210H2 instanceof C4222k) && abstractC4210H == abstractC4210H2) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
