package fd;

import android.content.Context;
import ef.C2515C;
import java.util.List;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import u1.InterfaceC4220i;

/* renamed from: fd.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2638i extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f35337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2628H f35338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f35339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2638i(C2628H c2628h, List list, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35338b = c2628h;
        this.f35339c = list;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2638i(this.f35338b, this.f35339c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2638i) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35337a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        Context context = this.f35338b.f35320a;
        if (context == null) {
            AbstractC3340k.m("context");
            throw null;
        }
        InterfaceC4220i interfaceC4220iA = AbstractC2629I.a(context);
        C2637h c2637h = new C2637h(this.f35339c, null);
        this.f35337a = 1;
        Object objD0 = android.support.v4.media.session.b.d0(interfaceC4220iA, c2637h, this);
        return objD0 == aVar ? aVar : objD0;
    }
}
