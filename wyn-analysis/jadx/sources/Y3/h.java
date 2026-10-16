package Y3;

import E5.Q;
import Ef.H;
import android.graphics.drawable.Drawable;
import ef.C2515C;
import h4.C2776c;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import r0.C3902g;
import r0.InterfaceC3903h;
import y3.C4552j;

/* loaded from: classes.dex */
public final class h extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public n f16639a;

    /* renamed from: b, reason: collision with root package name */
    public int f16640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f16641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f16641c = nVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new h(this.f16641c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((h4.h) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f16640b;
        if (i5 == 0) {
            Fe.e.U(obj);
            n nVar2 = this.f16641c;
            X3.k kVar = (X3.k) nVar2.f16663s.getValue();
            h4.h hVar = (h4.h) nVar2.f16662r.getValue();
            h4.g gVarA = h4.h.a(hVar);
            gVarA.f36079d = new C4552j(nVar2, 27);
            gVarA.f36087m = null;
            gVarA.f36088n = null;
            gVarA.f36091q = 0;
            C2776c c2776c = hVar.f36110t;
            if (c2776c.f36067a == null) {
                gVarA.f36086l = new m(nVar2);
                gVarA.f36087m = null;
                gVarA.f36088n = null;
                gVarA.f36091q = 0;
            }
            if (c2776c.f36068b == 0) {
                InterfaceC3903h interfaceC3903h = nVar2.f16658n;
                int i10 = u.f16675b;
                gVarA.f36090p = AbstractC3340k.a(interfaceC3903h, C3902g.f44297b) ? true : AbstractC3340k.a(interfaceC3903h, C3902g.f44298c) ? 2 : 1;
            }
            if (c2776c.f36069c != 1) {
                gVarA.f36089o = 2;
            }
            h4.h hVarA = gVarA.a();
            this.f16639a = nVar2;
            this.f16640b = 1;
            kVar.getClass();
            Object objL = H.l(new X3.g(kVar, hVarA, null), this);
            if (objL == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj = objL;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.f16639a;
            Fe.e.U(obj);
        }
        h4.i iVar = (h4.i) obj;
        nVar.getClass();
        if (iVar instanceof h4.o) {
            h4.o oVar = (h4.o) iVar;
            return new f(nVar.h(oVar.f36133a), oVar);
        }
        if (!(iVar instanceof h4.d)) {
            throw new Q((byte) 0, 9);
        }
        Drawable drawable = ((h4.d) iVar).f36071a;
        return new d(drawable != null ? nVar.h(drawable) : null, (h4.d) iVar);
    }
}
