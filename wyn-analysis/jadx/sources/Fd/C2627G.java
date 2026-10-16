package fd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: fd.G, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2627G extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f35316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2628H f35317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35318c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2627G(C2628H c2628h, String str, String str2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35317b = c2628h;
        this.f35318c = str;
        this.f35319d = str2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2627G(this.f35317b, this.f35318c, this.f35319d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2627G) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35316a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f35316a = 1;
            if (C2628H.a(this.f35317b, this.f35318c, this.f35319d, this) == aVar) {
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
