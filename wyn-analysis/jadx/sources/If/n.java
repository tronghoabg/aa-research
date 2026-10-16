package If;

import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.G;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class n extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5494a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f5496c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0603m f5497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5496c = oVar;
        this.f5497d = interfaceC0603m;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        n nVar = new n(this.f5496c, this.f5497d, interfaceC3103c);
        nVar.f5495b = obj;
        return nVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5494a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Ef.E e7 = (Ef.E) this.f5495b;
            G g9 = new G();
            o oVar = this.f5496c;
            InterfaceC0602l interfaceC0602l = oVar.f5479d;
            m mVar = new m(g9, e7, oVar, this.f5497d);
            this.f5494a = 1;
            if (interfaceC0602l.collect(mVar, this) == aVar) {
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
