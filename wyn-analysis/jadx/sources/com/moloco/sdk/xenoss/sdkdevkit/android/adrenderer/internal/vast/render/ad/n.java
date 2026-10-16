package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import Ef.E;
import Hf.j0;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class n extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2101d f31633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f31634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AbstractC2101d abstractC2101d, q qVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31633b = abstractC2101d;
        this.f31634c = qVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new n(this.f31633b, this.f31634c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31632a;
        if (i5 == 0) {
            Fe.e.U(obj);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Emitting event: ");
            AbstractC2101d abstractC2101d = this.f31633b;
            sb2.append(abstractC2101d);
            MolocoLogger.info$default(molocoLogger, "AdController", sb2.toString(), null, false, 12, null);
            j0 j0Var = this.f31634c.f31648h;
            this.f31632a = 1;
            if (j0Var.emit(abstractC2101d, this) == aVar) {
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
