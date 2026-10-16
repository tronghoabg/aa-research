package u0;

import N.C0733k0;
import android.view.View;
import com.wynauto.wyn.R;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class B0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f46091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N.p0 f46092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f46093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(N.p0 p0Var, View view, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46092b = p0Var;
        this.f46093c = view;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new B0(this.f46092b, this.f46093c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((B0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f46091a;
        C2515C c2515c = C2515C.f34653a;
        N.p0 p0Var = this.f46092b;
        View view = this.f46093c;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                this.f46091a = 1;
                Object objP = Hf.k0.p(p0Var.f7897q, new C0733k0(2, null), this);
                if (objP != aVar) {
                    objP = c2515c;
                }
                if (objP == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
            if (I0.b(view) == p0Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return c2515c;
        } finally {
            if (I0.b(view) == p0Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
