package com.qonversion.android.sdk.internal.api;

import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/RequestType;", "", "(Ljava/lang/String;I)V", "Init", "RemoteConfig", "RemoteConfigList", "AttachUserToExperiment", "DetachUserFromExperiment", "Purchase", "Restore", "Attribution", "GetProperties", "EligibilityForProductIds", "Identify", "AttachUserToRemoteConfiguration", "DetachUserFromRemoteConfiguration", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestType {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ RequestType[] $VALUES;
    public static final RequestType Init = new RequestType("Init", 0);
    public static final RequestType RemoteConfig = new RequestType("RemoteConfig", 1);
    public static final RequestType RemoteConfigList = new RequestType("RemoteConfigList", 2);
    public static final RequestType AttachUserToExperiment = new RequestType("AttachUserToExperiment", 3);
    public static final RequestType DetachUserFromExperiment = new RequestType("DetachUserFromExperiment", 4);
    public static final RequestType Purchase = new RequestType("Purchase", 5);
    public static final RequestType Restore = new RequestType("Restore", 6);
    public static final RequestType Attribution = new RequestType("Attribution", 7);
    public static final RequestType GetProperties = new RequestType("GetProperties", 8);
    public static final RequestType EligibilityForProductIds = new RequestType("EligibilityForProductIds", 9);
    public static final RequestType Identify = new RequestType("Identify", 10);
    public static final RequestType AttachUserToRemoteConfiguration = new RequestType("AttachUserToRemoteConfiguration", 11);
    public static final RequestType DetachUserFromRemoteConfiguration = new RequestType("DetachUserFromRemoteConfiguration", 12);

    private static final /* synthetic */ RequestType[] $values() {
        return new RequestType[]{Init, RemoteConfig, RemoteConfigList, AttachUserToExperiment, DetachUserFromExperiment, Purchase, Restore, Attribution, GetProperties, EligibilityForProductIds, Identify, AttachUserToRemoteConfiguration, DetachUserFromRemoteConfiguration};
    }

    static {
        RequestType[] requestTypeArr$values = $values();
        $VALUES = requestTypeArr$values;
        $ENTRIES = d.t(requestTypeArr$values);
    }

    private RequestType(String str, int i5) {
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) $VALUES.clone();
    }
}
