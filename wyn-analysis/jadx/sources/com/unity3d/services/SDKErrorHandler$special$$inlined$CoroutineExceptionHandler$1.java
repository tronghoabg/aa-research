package com.unity3d.services;

import Ef.B;
import Ef.C;
import com.unity3d.services.core.log.DeviceLog;
import jf.AbstractC3101a;
import jf.InterfaceC3108h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/unity3d/services/SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1", "Ljf/a;", "LEf/C;", "Ljf/h;", "context", "", "exception", "Lef/C;", "handleException", "(Ljf/h;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1 extends AbstractC3101a implements C {
    public SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(B b5) {
        super(b5);
    }

    @Override // Ef.C
    public void handleException(@NotNull InterfaceC3108h context, @NotNull Throwable exception) {
        DeviceLog.error("SDKErrorHandler encountered an exception: %s", exception);
    }
}
