package D3;

import Gf.t;
import android.app.Activity;
import com.applovin.impl.T0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p7.AbstractC3772b;
import tf.p;

/* loaded from: classes.dex */
public final class j extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2312a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f2314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f2315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Activity activity, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f2314c = bVar;
        this.f2315d = activity;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        j jVar = new j(this.f2314c, this.f2315d, interfaceC3103c);
        jVar.f2313b = obj;
        return jVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f2312a;
        if (i5 == 0) {
            Fe.e.U(obj);
            t tVar = (t) this.f2313b;
            i iVar = new i(tVar, 0);
            b bVar = this.f2314c;
            ((E3.a) bVar.f2296b).b(this.f2315d, new T0(1), iVar);
            A0.e eVar = new A0.e(3, bVar, iVar);
            this.f2312a = 1;
            if (AbstractC3772b.f(tVar, eVar, this) == aVar) {
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
