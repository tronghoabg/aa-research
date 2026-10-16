package com.qonversion.android.sdk.internal.api;

import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Init", "Identify", "Products", "Purchase", "UserProperties", "Restore", "SyncHistoricalData", "SyncPurchases", "ActualizePermissions", "Logout", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestTrigger {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ RequestTrigger[] $VALUES;

    @NotNull
    private final String key;
    public static final RequestTrigger Init = new RequestTrigger("Init", 0, "Init");
    public static final RequestTrigger Identify = new RequestTrigger("Identify", 1, "Identify");
    public static final RequestTrigger Products = new RequestTrigger("Products", 2, "Products");
    public static final RequestTrigger Purchase = new RequestTrigger("Purchase", 3, "Purchase");
    public static final RequestTrigger UserProperties = new RequestTrigger("UserProperties", 4, "UserProperties");
    public static final RequestTrigger Restore = new RequestTrigger("Restore", 5, "Restore");
    public static final RequestTrigger SyncHistoricalData = new RequestTrigger("SyncHistoricalData", 6, "SyncHistoricalData");
    public static final RequestTrigger SyncPurchases = new RequestTrigger("SyncPurchases", 7, "SyncPurchases");
    public static final RequestTrigger ActualizePermissions = new RequestTrigger("ActualizePermissions", 8, "ActualizePermissions");
    public static final RequestTrigger Logout = new RequestTrigger("Logout", 9, "Logout");

    private static final /* synthetic */ RequestTrigger[] $values() {
        return new RequestTrigger[]{Init, Identify, Products, Purchase, UserProperties, Restore, SyncHistoricalData, SyncPurchases, ActualizePermissions, Logout};
    }

    static {
        RequestTrigger[] requestTriggerArr$values = $values();
        $VALUES = requestTriggerArr$values;
        $ENTRIES = d.t(requestTriggerArr$values);
    }

    private RequestTrigger(String str, int i5, String str2) {
        this.key = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static RequestTrigger valueOf(String str) {
        return (RequestTrigger) Enum.valueOf(RequestTrigger.class, str);
    }

    public static RequestTrigger[] values() {
        return (RequestTrigger[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
