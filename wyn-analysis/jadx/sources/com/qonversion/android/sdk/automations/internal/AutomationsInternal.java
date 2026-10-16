package com.qonversion.android.sdk.automations.internal;

import com.qonversion.android.sdk.automations.Automations;
import com.qonversion.android.sdk.automations.AutomationsDelegate;
import com.qonversion.android.sdk.automations.ScreenCustomizationDelegate;
import com.qonversion.android.sdk.internal.di.QDependencyInjector;
import com.qonversion.android.sdk.listeners.QonversionShowScreenCallback;
import ef.InterfaceC2519c;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;", "Lcom/qonversion/android/sdk/automations/Automations;", "<init>", "()V", "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;", "delegate", "Lef/C;", "setDelegate", "(Lcom/qonversion/android/sdk/automations/AutomationsDelegate;)V", "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;", "setScreenCustomizationDelegate", "(Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;)V", "", "withID", "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;", "callback", "showScreen", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V", "token", "setNotificationsToken", "(Ljava/lang/String;)V", "", "messageData", "", "handleNotification", "(Ljava/util/Map;)Z", "", "getNotificationCustomPayload", "(Ljava/util/Map;)Ljava/util/Map;", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "automationsManager", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutomationsInternal implements Automations {

    @NotNull
    private final QAutomationsManager automationsManager = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().automationsManager();

    @Override // com.qonversion.android.sdk.automations.Automations
    @Nullable
    public Map<String, Object> getNotificationCustomPayload(@NotNull Map<String, String> messageData) {
        AbstractC3340k.e(messageData, "messageData");
        return this.automationsManager.getNotificationCustomPayload(messageData);
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    @InterfaceC2519c
    public boolean handleNotification(@NotNull Map<String, String> messageData) {
        AbstractC3340k.e(messageData, "messageData");
        return this.automationsManager.handlePushIfPossible(messageData);
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    public void setDelegate(@NotNull AutomationsDelegate delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.automationsManager.setAutomationsDelegate(new WeakReference<>(delegate));
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    @InterfaceC2519c
    public void setNotificationsToken(@NotNull String token) {
        AbstractC3340k.e(token, "token");
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    public void setScreenCustomizationDelegate(@NotNull ScreenCustomizationDelegate delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.automationsManager.setScreenCustomizationDelegate(new WeakReference<>(delegate));
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    public void showScreen(@NotNull String withID, @NotNull QonversionShowScreenCallback callback) {
        AbstractC3340k.e(withID, "withID");
        AbstractC3340k.e(callback, "callback");
        this.automationsManager.loadScreen(withID, callback);
    }
}
