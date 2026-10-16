package com.unity3d.ads.core.configuration;

import Hf.InterfaceC0592c0;
import Hf.k0;
import Hf.x0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "", "<init>", "()V", "", "force", "Lef/C;", "invoke", "(Z)V", "LHf/c0;", "_forceAlternativeFlow", "LHf/c0;", "getForceAlternativeFlow", "()Z", "forceAlternativeFlow", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ForceAlternativeFlow {

    @NotNull
    private final InterfaceC0592c0 _forceAlternativeFlow = k0.c(Boolean.FALSE);

    public final boolean getForceAlternativeFlow() {
        return ((Boolean) ((x0) this._forceAlternativeFlow).getValue()).booleanValue();
    }

    public final void invoke(boolean force) {
        x0 x0Var;
        Object value;
        InterfaceC0592c0 interfaceC0592c0 = this._forceAlternativeFlow;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            ((Boolean) value).getClass();
        } while (!x0Var.i(value, Boolean.valueOf(force)));
    }
}
