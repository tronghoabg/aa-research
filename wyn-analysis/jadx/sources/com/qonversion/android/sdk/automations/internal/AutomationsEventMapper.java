package com.qonversion.android.sdk.automations.internal;

import com.qonversion.android.sdk.automations.dto.AutomationsEvent;
import com.qonversion.android.sdk.automations.dto.AutomationsEventType;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.logger.Logger;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;", "", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "(Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "getEventFromRemoteMessage", "Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;", "messageData", "", "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutomationsEventMapper {

    @NotNull
    private static final String EVENT = "qonv.event";

    @NotNull
    private static final String EVENT_DATE = "happened";

    @NotNull
    private static final String EVENT_NAME = "name";

    @NotNull
    private static final String EVENT_PRODUCT_ID = "product_id";

    @NotNull
    private final Logger logger;

    public AutomationsEventMapper(@NotNull Logger logger) {
        AbstractC3340k.e(logger, "logger");
        this.logger = logger;
    }

    @Nullable
    public final AutomationsEvent getEventFromRemoteMessage(@NotNull Map<String, String> messageData) {
        AbstractC3340k.e(messageData, "messageData");
        try {
            String str = messageData.get(EVENT);
            if (str == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("name");
            AbstractC3340k.b(string);
            if (string.length() == 0) {
                return null;
            }
            long jOptLong = jSONObject.optLong(EVENT_DATE);
            Date date = jOptLong == 0 ? new Date(com.qonversion.android.sdk.internal.billing.UtilsKt.getCurrentTimeInMillis()) : new Date(ExtensionsKt.secondsToMilliSeconds(jOptLong));
            String strOptString = jSONObject.optString(EVENT_PRODUCT_ID);
            AbstractC3340k.b(strOptString);
            if (strOptString.length() <= 0) {
                strOptString = null;
            }
            AutomationsEventType automationsEventTypeFromType = AutomationsEventType.INSTANCE.fromType(string);
            if (automationsEventTypeFromType != AutomationsEventType.Unknown) {
                return new AutomationsEvent(automationsEventTypeFromType, date, strOptString);
            }
            return null;
        } catch (JSONException unused) {
            this.logger.error("getEventFromRemoteMessage() -> Failed to retrieve event that triggered push notification");
            return null;
        }
    }
}
