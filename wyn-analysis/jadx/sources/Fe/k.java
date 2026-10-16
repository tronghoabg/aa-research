package Fe;

import Ef.E;
import ac.C1346a;
import androidx.fragment.app.FragmentActivity;
import ef.C2515C;
import io.qonversion.nocodes.internal.screen.view.ScreenActivity;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import re.C3979c;
import tf.p;

/* loaded from: classes5.dex */
public final class k extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f4095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f4095a = mVar;
        this.f4096b = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new k(this.f4095a, this.f4096b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        kVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        e.U(obj);
        m mVar = this.f4095a;
        C1346a c1346a = (C1346a) mVar.f421a;
        String str = this.f4096b;
        c1346a.O("ScreenPresenter -> opening the screen with id ".concat(str));
        h hVar = mVar.f4103c;
        hVar.getClass();
        ae.f fVar = new ae.f(ae.e.f17641f, ae.c.f17632g, str);
        C3979c c3979c = hVar.f4089c;
        if (c3979c != null) {
            c3979c.f(fVar);
        }
        try {
            FragmentActivity activity = hVar.getActivity();
            AbstractC3340k.c(activity, "null cannot be cast to non-null type io.qonversion.nocodes.internal.screen.view.ScreenActivity");
            int i5 = ScreenActivity.f37467b;
            ((ScreenActivity) activity).C(null, str, true);
            if (c3979c != null) {
                c3979c.e(fVar);
            }
        } catch (Exception unused) {
            if (c3979c != null) {
                c3979c.b(fVar);
            }
        }
        return C2515C.f34653a;
    }
}
