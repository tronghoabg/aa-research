package ea;

import android.content.Context;
import android.util.Log;
import ef.C2515C;
import java.io.IOException;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import u1.InterfaceC4220i;

/* renamed from: ea.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2479C extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f34445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2480D f34446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34447c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2479C(C2480D c2480d, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34446b = c2480d;
        this.f34447c = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2479C(this.f34446b, this.f34447c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2479C) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f34445a;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                C2509y c2509y = C2480D.f34448e;
                Context context = this.f34446b.f34450a;
                c2509y.getClass();
                InterfaceC4220i interfaceC4220i = (InterfaceC4220i) C2480D.f34449f.getValue(context, C2509y.f34589a[0]);
                C2478B c2478b = new C2478B(this.f34447c, null);
                this.f34445a = 1;
                if (android.support.v4.media.session.b.d0(interfaceC4220i, c2478b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
        } catch (IOException e7) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e7);
        }
        return C2515C.f34653a;
    }
}
