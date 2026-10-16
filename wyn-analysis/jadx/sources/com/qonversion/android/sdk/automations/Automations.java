package com.qonversion.android.sdk.automations;

import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.automations.internal.AutomationsInternal;
import com.qonversion.android.sdk.listeners.QonversionShowScreenCallback;
import ef.C2514B;
import ef.InterfaceC2519c;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0013H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/qonversion/android/sdk/automations/Automations;", "", "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;", "delegate", "Lef/C;", "setDelegate", "(Lcom/qonversion/android/sdk/automations/AutomationsDelegate;)V", "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;", "setScreenCustomizationDelegate", "(Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;)V", "", "withID", "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;", "callback", "showScreen", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V", "token", "setNotificationsToken", "(Ljava/lang/String;)V", "", "messageData", "", "handleNotification", "(Ljava/util/Map;)Z", "getNotificationCustomPayload", "(Ljava/util/Map;)Ljava/util/Map;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Automations {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/qonversion/android/sdk/automations/Automations$Companion;", "", "()V", "backingInstance", "Lcom/qonversion/android/sdk/automations/Automations;", "shared", "getSharedInstance$annotations", "getSharedInstance", "()Lcom/qonversion/android/sdk/automations/Automations;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Nullable
        private static Automations backingInstance;

        private Companion() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        @NotNull
        public final Automations getSharedInstance() {
            if (backingInstance == null) {
                synchronized (Automations.class) {
                    try {
                        if (backingInstance == null) {
                            try {
                                Qonversion.INSTANCE.getSharedInstance();
                                backingInstance = new AutomationsInternal();
                            } catch (C2514B unused) {
                                throw new C2514B("Qonversion has not been initialized. Automations should be used after Qonversion is initialized.");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Automations automations = backingInstance;
            if (automations != null) {
                return automations;
            }
            throw new IllegalStateException("Unexpected uninitialized state");
        }
    }

    @Nullable
    Map<String, Object> getNotificationCustomPayload(@NotNull Map<String, String> messageData);

    @InterfaceC2519c
    boolean handleNotification(@NotNull Map<String, String> messageData);

    void setDelegate(@NotNull AutomationsDelegate delegate);

    @InterfaceC2519c
    void setNotificationsToken(@NotNull String token);

    void setScreenCustomizationDelegate(@NotNull ScreenCustomizationDelegate delegate);

    void showScreen(@NotNull String withID, @NotNull QonversionShowScreenCallback callback);
}
