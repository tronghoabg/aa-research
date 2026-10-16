package p0;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class v extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f43189a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f43191c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f43192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(t tVar, tf.p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f43191c = tVar;
        this.f43192d = (AbstractC3471j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        v vVar = new v(this.f43191c, this.f43192d, interfaceC3103c);
        vVar.f43190b = obj;
        return vVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f43189a;
        if (i5 == 0) {
            Fe.e.U(obj);
            E e7 = (E) this.f43190b;
            t tVar = this.f43191c;
            tVar.getClass();
            AbstractC3340k.e(e7, "<set-?>");
            this.f43189a = 1;
            if (this.f43192d.invoke(tVar, this) == aVar) {
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
