package com.unity3d.services.core.domain;

import Ef.A;
import Ef.S;
import Jf.n;
import Lf.d;
import Lf.e;
import com.unity3d.ads.BuildConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/domain/SDKDispatchers;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "<init>", "()V", "LEf/A;", "io", "LEf/A;", "getIo", "()LEf/A;", BuildConfig.FLAVOR, "getDefault", "main", "getMain", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    @NotNull
    private final A default;

    @NotNull
    private final A io;

    @NotNull
    private final A main;

    public SDKDispatchers() {
        e eVar = S.f3698a;
        this.io = d.f7120b;
        this.default = S.f3698a;
        this.main = n.f6132a;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public A getDefault() {
        return this.default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public A getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public A getMain() {
        return this.main;
    }
}
