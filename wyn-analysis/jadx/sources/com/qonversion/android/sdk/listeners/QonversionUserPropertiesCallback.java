package com.qonversion.android.sdk.listeners;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.properties.QUserProperties;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;", "", "Lcom/qonversion/android/sdk/dto/properties/QUserProperties;", "userProperties", "Lef/C;", "onSuccess", "(Lcom/qonversion/android/sdk/dto/properties/QUserProperties;)V", "Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "onError", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface QonversionUserPropertiesCallback {
    void onError(@NotNull QonversionError error);

    void onSuccess(@NotNull QUserProperties userProperties);
}
