package com.unity3d.ads.core.data.repository;

import Ef.E;
import Fe.e;
import Hf.InterfaceC0602l;
import Hf.k0;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "<anonymous>", "(LEf/E;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AndroidSessionRepository$nativeConfiguration$1 extends AbstractC3471j implements p {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, InterfaceC3103c<? super AndroidSessionRepository$nativeConfiguration$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = androidSessionRepository;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super NativeConfigurationOuterClass.NativeConfiguration> interfaceC3103c) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            return obj;
        }
        e.U(obj);
        InterfaceC0602l interfaceC0602l = this.this$0.persistedNativeConfiguration;
        this.label = 1;
        Object objO = k0.o(interfaceC0602l, this);
        return objO == aVar ? aVar : objO;
    }
}
