package com.unity3d.services.core.domain.task;

import Ef.E;
import Fe.e;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
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
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2", f = "InitializeStateCreate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class InitializeStateCreate$doWork$2 extends AbstractC3471j implements p {
    final /* synthetic */ InitializeStateCreate.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreate$doWork$2(InitializeStateCreate.Params params, InterfaceC3103c<? super InitializeStateCreate$doWork$2> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$params = params;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new InitializeStateCreate$doWork$2(this.$params, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2530n> interfaceC3103c) {
        return ((InitializeStateCreate$doWork$2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objZ;
        a aVar = a.f39711a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.U(obj);
        InitializeStateCreate.Params params = this.$params;
        try {
            DeviceLog.debug("Unity Ads init: creating webapp");
            Configuration config = params.getConfig();
            config.setWebViewData(params.getWebViewData());
            try {
                ErrorState errorStateCreate = WebViewApp.create(config, false);
                objZ = config;
                if (errorStateCreate != null) {
                    String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                    DeviceLog.error(webAppFailureMessage);
                    throw new InitializationException(errorStateCreate, new Exception(webAppFailureMessage), config);
                }
            } catch (IllegalThreadStateException e7) {
                DeviceLog.exception("Illegal Thread", e7);
                throw new InitializationException(ErrorState.CreateWebApp, e7, config);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        boolean z2 = objZ instanceof C2529m;
        Object objZ2 = objZ;
        if (z2) {
            Throwable thA = C2530n.a(objZ);
            objZ2 = objZ;
            if (thA != null) {
                objZ2 = e.z(thA);
            }
        }
        return new C2530n(objZ2);
    }
}
