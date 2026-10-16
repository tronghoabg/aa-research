package fd;

import android.content.Context;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import u1.InterfaceC4220i;
import x1.C4452e;

/* renamed from: fd.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2625E extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f35308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2628H f35310c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f35311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2625E(String str, C2628H c2628h, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35309b = str;
        this.f35310c = c2628h;
        this.f35311d = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2625E(this.f35309b, this.f35310c, this.f35311d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2625E) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35308a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C4452e c4452e = new C4452e(this.f35309b);
            Context context = this.f35310c.f35320a;
            if (context == null) {
                AbstractC3340k.m("context");
                throw null;
            }
            InterfaceC4220i interfaceC4220iA = AbstractC2629I.a(context);
            C2624D c2624d = new C2624D(c4452e, this.f35311d, null);
            this.f35308a = 1;
            if (android.support.v4.media.session.b.d0(interfaceC4220iA, c2624d, this) == aVar) {
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
