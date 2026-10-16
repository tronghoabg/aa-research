package Yf;

import ef.C2515C;
import ef.C2518b;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;

/* loaded from: classes5.dex */
public final class z extends AbstractC3470i implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public int f16897a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ C2518b f16898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f16899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(B b5, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f16899c = b5;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z zVar = new z(this.f16899c, (InterfaceC3103c) obj3);
        zVar.f16898b = (C2518b) obj;
        return zVar.invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f16897a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C2518b c2518b = this.f16898b;
            B b5 = this.f16899c;
            J5.f fVar = (J5.f) b5.f16809d;
            byte bY = fVar.y();
            if (bY == 1) {
                return b5.g(true);
            }
            if (bY == 0) {
                return b5.g(false);
            }
            if (bY != 6) {
                if (bY == 8) {
                    return b5.f();
                }
                J5.f.r(fVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f16897a = 1;
            obj = B.a(b5, c2518b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return (kotlinx.serialization.json.b) obj;
    }
}
