package com.unity3d.services.core.domain.task;

import A6.h;
import Ef.C0502n;
import Ef.E;
import Fe.e;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1", f = "InitializeStateNetworkError.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class InitializeStateNetworkError$doWork$2$1$success$1 extends AbstractC3471j implements p {
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2$1$success$1(InitializeStateNetworkError initializeStateNetworkError, InterfaceC3103c<? super InitializeStateNetworkError$doWork$2$1$success$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new InitializeStateNetworkError$doWork$2$1$success$1(this.this$0, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((InitializeStateNetworkError$doWork$2$1$success$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        int i5 = this.label;
        if (i5 == 0) {
            e.U(obj);
            InitializeStateNetworkError initializeStateNetworkError = this.this$0;
            this.L$0 = initializeStateNetworkError;
            this.label = 1;
            C0502n c0502n = new C0502n(1, h.A(this));
            c0502n.t();
            initializeStateNetworkError.startListening(c0502n);
            if (c0502n.s() == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
        }
        return C2515C.f34653a;
    }
}
