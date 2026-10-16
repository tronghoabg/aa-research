package com.waze.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ClientEngStatsEventName {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ ClientEngStatsEventName[] $VALUES;
    public static final ClientEngStatsEventName WEB_VIEW_INVALID_URL = new ClientEngStatsEventName("WEB_VIEW_INVALID_URL", 0);
    public static final ClientEngStatsEventName AAP_ON_GET_TEMPLATE_DELAY = new ClientEngStatsEventName("AAP_ON_GET_TEMPLATE_DELAY", 1);
    public static final ClientEngStatsEventName CREDENTIALS_REPOSITORY_USAGE = new ClientEngStatsEventName("CREDENTIALS_REPOSITORY_USAGE", 2);
    public static final ClientEngStatsEventName VULKAN_SUPPORT_STATUS = new ClientEngStatsEventName("VULKAN_SUPPORT_STATUS", 3);
    public static final ClientEngStatsEventName MAIN_MAP_CAMERA_IS_CENTERED = new ClientEngStatsEventName("MAIN_MAP_CAMERA_IS_CENTERED", 4);

    private static final /* synthetic */ ClientEngStatsEventName[] $values() {
        return new ClientEngStatsEventName[]{WEB_VIEW_INVALID_URL, AAP_ON_GET_TEMPLATE_DELAY, CREDENTIALS_REPOSITORY_USAGE, VULKAN_SUPPORT_STATUS, MAIN_MAP_CAMERA_IS_CENTERED};
    }

    static {
        ClientEngStatsEventName[] clientEngStatsEventNameArr$values = $values();
        $VALUES = clientEngStatsEventNameArr$values;
        $ENTRIES = h.d.b.a(clientEngStatsEventNameArr$values);
    }

    private ClientEngStatsEventName(String str, int i2) {
    }

    public static h.d.a<ClientEngStatsEventName> getEntries() {
        return $ENTRIES;
    }

    public static ClientEngStatsEventName valueOf(String str) {
        return (ClientEngStatsEventName) Enum.valueOf(ClientEngStatsEventName.class, str);
    }

    public static ClientEngStatsEventName[] values() {
        return (ClientEngStatsEventName[]) $VALUES.clone();
    }
}
