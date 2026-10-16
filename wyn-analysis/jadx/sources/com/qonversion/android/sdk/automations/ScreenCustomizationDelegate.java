package com.qonversion.android.sdk.automations;

import com.qonversion.android.sdk.automations.dto.QScreenPresentationConfig;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;", "", "getPresentationConfigurationForScreen", "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;", ScreenActivity.INTENT_SCREEN_ID, "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ScreenCustomizationDelegate {
    @NotNull
    QScreenPresentationConfig getPresentationConfigurationForScreen(@NotNull String screenId);
}
