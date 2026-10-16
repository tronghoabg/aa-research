package com.moloco.sdk.publisher;

import Fe.e;
import com.moloco.sdk.internal.publisher.r0;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import tf.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/moloco/sdk/internal/e;", "<anonymous>", "()Lcom/moloco/sdk/internal/e;"}, k = 3, mv = {2, 0, 0})
@InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco$adCreator$2$1", f = "Moloco.kt", l = {513}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Moloco$adCreator$2$1 extends AbstractC3471j implements l {
    int label;

    public Moloco$adCreator$2$1(InterfaceC3103c<? super Moloco$adCreator$2$1> interfaceC3103c) {
        super(1, interfaceC3103c);
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c<C2515C> create(InterfaceC3103c<?> interfaceC3103c) {
        return new Moloco$adCreator$2$1(interfaceC3103c);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            return obj;
        }
        e.U(obj);
        r0 initializationHandler = Moloco.INSTANCE.getInitializationHandler();
        this.label = 1;
        Object objC = initializationHandler.c(this);
        return objC == aVar ? aVar : objC;
    }

    @Override // tf.l
    public final Object invoke(InterfaceC3103c<? super com.moloco.sdk.internal.e> interfaceC3103c) {
        return ((Moloco$adCreator$2$1) create(interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }
}
