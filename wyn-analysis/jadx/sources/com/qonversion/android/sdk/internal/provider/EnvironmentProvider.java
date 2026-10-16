package com.qonversion.android.sdk.internal.provider;

import com.qonversion.android.sdk.dto.QEnvironment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/internal/provider/EnvironmentProvider;", "", "apiUrl", "", "getApiUrl", "()Ljava/lang/String;", "environment", "Lcom/qonversion/android/sdk/dto/QEnvironment;", "getEnvironment", "()Lcom/qonversion/android/sdk/dto/QEnvironment;", "isSandbox", "", "()Z", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EnvironmentProvider {
    @NotNull
    String getApiUrl();

    @NotNull
    QEnvironment getEnvironment();

    boolean isSandbox();
}
