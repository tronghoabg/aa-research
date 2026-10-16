package fd;

import android.content.Context;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import u1.InterfaceC4220i;
import x1.C4452e;

/* renamed from: fd.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2623C extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f35301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2628H f35303c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f35304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2623C(String str, C2628H c2628h, double d3, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35302b = str;
        this.f35303c = c2628h;
        this.f35304d = d3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2623C(this.f35302b, this.f35303c, this.f35304d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2623C) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35301a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C4452e c4452e = new C4452e(this.f35302b);
            Context context = this.f35303c.f35320a;
            if (context == null) {
                AbstractC3340k.m("context");
                throw null;
            }
            InterfaceC4220i interfaceC4220iA = AbstractC2629I.a(context);
            C2622B c2622b = new C2622B(c4452e, this.f35304d, null);
            this.f35301a = 1;
            if (android.support.v4.media.session.b.d0(interfaceC4220iA, c2622b, this) == aVar) {
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
