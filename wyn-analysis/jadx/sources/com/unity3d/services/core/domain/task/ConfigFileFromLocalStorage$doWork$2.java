package com.unity3d.services.core.domain.task;

import Ef.E;
import Fe.e;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.properties.SdkProperties;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import java.io.File;
import java.util.concurrent.CancellationException;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import qf.i;
import tf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEf/E;", "Lef/n;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(LEf/E;)Lef/n;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ConfigFileFromLocalStorage$doWork$2 extends AbstractC3471j implements p {
    final /* synthetic */ ConfigFileFromLocalStorage.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$2(ConfigFileFromLocalStorage.Params params, InterfaceC3103c<? super ConfigFileFromLocalStorage$doWork$2> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$params = params;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new ConfigFileFromLocalStorage$doWork$2(this.$params, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2530n> interfaceC3103c) {
        return ((ConfigFileFromLocalStorage$doWork$2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objZ;
        Throwable thA;
        a aVar = a.f39711a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.U(obj);
        ConfigFileFromLocalStorage.Params params = this.$params;
        try {
            File file = new File(SdkProperties.getLocalConfigurationFilepath());
            objZ = !file.exists() ? params.getDefaultConfiguration() : new Configuration(new JSONObject(i.W(file)));
        } catch (CancellationException e7) {
            throw e7;
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        if ((objZ instanceof C2529m) && (thA = C2530n.a(objZ)) != null) {
            objZ = e.z(thA);
        }
        return new C2530n(objZ);
    }
}
