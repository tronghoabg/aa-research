package e3;

import Ef.E;
import android.net.Uri;
import android.view.InputEvent;
import ef.C2515C;
import g3.C2697b;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f34416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f34417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f34418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputEvent f34419d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34417b = dVar;
        this.f34418c = uri;
        this.f34419d = inputEvent;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f34417b, this.f34418c, this.f34419d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f34416a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C2697b c2697b = this.f34417b.f34423a;
            this.f34416a = 1;
            if (c2697b.c(this.f34418c, this.f34419d, this) == aVar) {
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
