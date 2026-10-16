package p0;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class u extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f43185a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f43187c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.p f43188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, tf.p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f43187c = tVar;
        this.f43188d = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        u uVar = new u(this.f43187c, this.f43188d, interfaceC3103c);
        uVar.f43186b = obj;
        return uVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f43185a;
        if (i5 == 0) {
            Fe.e.U(obj);
            E e7 = (E) this.f43186b;
            t tVar = this.f43187c;
            tVar.getClass();
            AbstractC3340k.e(e7, "<set-?>");
            this.f43185a = 1;
            if (this.f43188d.invoke(tVar, this) == aVar) {
                return aVar;
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
