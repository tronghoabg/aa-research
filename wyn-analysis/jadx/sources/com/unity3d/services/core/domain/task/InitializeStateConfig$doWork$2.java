package com.unity3d.services.core.domain.task;

import Ef.E;
import Fe.e;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import java.util.concurrent.CancellationException;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEf/E;", "Lef/n;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(LEf/E;)Lef/n;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class InitializeStateConfig$doWork$2 extends AbstractC3471j implements p {
    final /* synthetic */ InitializeStateConfig.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, InterfaceC3103c<? super InitializeStateConfig$doWork$2> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2530n> interfaceC3103c) {
        return ((InitializeStateConfig$doWork$2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objZ;
        Throwable thA;
        Object objMo283invokegIAlus;
        Configuration configuration = "Unity Ads init: load configuration from ";
        a aVar = a.f39711a;
        int i5 = this.label;
        try {
            try {
                if (i5 == 0) {
                    e.U(obj);
                    InitializeStateConfig.Params params = this.$params;
                    InitializeStateConfig initializeStateConfig = this.this$0;
                    DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                    Configuration configuration2 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                    InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    objMo283invokegIAlus = initializeStateConfigWithLoader.mo283invokegIAlus((BaseParams) params2, (InterfaceC3103c) this);
                    configuration = configuration2;
                    if (objMo283invokegIAlus == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Configuration configuration3 = (Configuration) this.L$0;
                    e.U(obj);
                    objMo283invokegIAlus = ((C2530n) obj).f34674a;
                    configuration = configuration3;
                }
                e.U(objMo283invokegIAlus);
                objZ = (Configuration) objMo283invokegIAlus;
            } catch (NetworkIOException e7) {
                throw new InitializationException(ErrorState.NetworkConfigRequest, e7, configuration);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        if ((objZ instanceof C2529m) && (thA = C2530n.a(objZ)) != null) {
            objZ = e.z(thA);
        }
        return new C2530n(objZ);
    }
}
