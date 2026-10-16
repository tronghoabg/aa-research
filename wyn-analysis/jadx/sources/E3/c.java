package e3;

import Ef.E;
import android.net.Uri;
import ef.C2515C;
import g3.C2697b;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f34420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f34421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f34422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Uri uri, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34421b = dVar;
        this.f34422c = uri;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new c(this.f34421b, this.f34422c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f34420a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C2697b c2697b = this.f34421b.f34423a;
            this.f34420a = 1;
            if (c2697b.d(this.f34422c, this) == aVar) {
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
