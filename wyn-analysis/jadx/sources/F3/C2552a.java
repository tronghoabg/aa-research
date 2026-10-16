package f3;

import Ef.E;
import Fe.e;
import ef.C2515C;
import h3.C2773a;
import h3.g;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2552a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f34800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2553b f34801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2773a f34802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2552a(C2553b c2553b, C2773a c2773a, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34801b = c2553b;
        this.f34802c = c2773a;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2552a(this.f34801b, this.f34802c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2552a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f34800a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            return obj;
        }
        e.U(obj);
        g gVar = this.f34801b.f34803a;
        this.f34800a = 1;
        Object objB = gVar.b(this.f34802c, this);
        return objB == aVar ? aVar : objB;
    }
}
