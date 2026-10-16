package com.google.android.gms.h.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum d implements eg {
    UNKNOWN(0),
    PROVIDENCE(1),
    INTENT_OPERATION(2),
    BROADCAST_RECEIVER(3),
    CONTENT_PROVIDER(4),
    ACTIVITY(5),
    SERVICE(6),
    BINDER(7),
    SYNC_ADAPTER(8),
    GCM_TASK(9),
    INTENT_SERVICE(10),
    SERVICE_CONNECTION(11),
    GCM_LISTENER(12),
    CALLBACKS(13),
    ALARM_LISTENER(14),
    CUSTOM_EVENT_LOOP(15),
    SENSOR_EVENT_LISTENER(16),
    BLE_SCAN_CALLBACK(17),
    BINDER_BY_INTERCEPTOR(18),
    CONTENT_OBSERVER(19),
    BACKUP_AGENT(20),
    SLICE_PROVIDER(21),
    LOCATION_LISTENER(22),
    GMS_APPLICATION(23),
    OAUTH(24),
    LOCATION_CALLBACKS(25),
    BT_ADAPTER(26),
    NETWORK_CALLBACK(27),
    JOB_SERVICE(28),
    OPPORTUNISTIC_WAKEUP(29),
    STICKY_LISTENER(30);

    private final int G;

    d(int i2) {
        this.G = i2;
    }

    public static d a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return PROVIDENCE;
            case 2:
                return INTENT_OPERATION;
            case 3:
                return BROADCAST_RECEIVER;
            case 4:
                return CONTENT_PROVIDER;
            case 5:
                return ACTIVITY;
            case 6:
                return SERVICE;
            case 7:
                return BINDER;
            case 8:
                return SYNC_ADAPTER;
            case 9:
                return GCM_TASK;
            case 10:
                return INTENT_SERVICE;
            case 11:
                return SERVICE_CONNECTION;
            case 12:
                return GCM_LISTENER;
            case 13:
                return CALLBACKS;
            case 14:
                return ALARM_LISTENER;
            case 15:
                return CUSTOM_EVENT_LOOP;
            case 16:
                return SENSOR_EVENT_LISTENER;
            case 17:
                return BLE_SCAN_CALLBACK;
            case 18:
                return BINDER_BY_INTERCEPTOR;
            case 19:
                return CONTENT_OBSERVER;
            case 20:
                return BACKUP_AGENT;
            case 21:
                return SLICE_PROVIDER;
            case 22:
                return LOCATION_LISTENER;
            case 23:
                return GMS_APPLICATION;
            case 24:
                return OAUTH;
            case 25:
                return LOCATION_CALLBACKS;
            case 26:
                return BT_ADAPTER;
            case 27:
                return NETWORK_CALLBACK;
            case 28:
                return JOB_SERVICE;
            case 29:
                return OPPORTUNISTIC_WAKEUP;
            case 30:
                return STICKY_LISTENER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.G;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.G);
    }
}
