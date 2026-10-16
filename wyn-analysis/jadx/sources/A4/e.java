package a4;

import Ef.E;
import cg.AbstractC1613b;
import cg.C1617f;
import ef.C2515C;
import java.io.IOException;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class e extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f17355a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f17355a = fVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new e(this.f17355a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        f fVar = this.f17355a;
        synchronized (fVar) {
            if (!fVar.f17367l || fVar.f17368m) {
                return C2515C.f34653a;
            }
            try {
                fVar.D();
            } catch (IOException unused) {
                fVar.f17369n = true;
            }
            try {
                if (fVar.f17365i >= 2000) {
                    fVar.P();
                }
            } catch (IOException unused2) {
                fVar.f17370o = true;
                fVar.f17366j = AbstractC1613b.c(new C1617f());
            }
            return C2515C.f34653a;
        }
    }
}
