package com.waze.gw;

import com.waze.strings.DisplayStrings;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes10.dex */
final class HudGattProfile {
    final UUID cccd;
    final UUID notify;
    final String protocolFamily;
    final int requestedMtu;
    final UUID service;
    final UUID write;
    static final HudGattProfile HLP1 = new HudGattProfile(HlpUuids.SERVICE, HlpUuids.TX, HlpUuids.RX, HlpUuids.CCCD, 247, "hlp1");
    static final HudGattProfile VIETMAP_H50 = new HudGattProfile(uuid16(65535), uuid16(39612), uuid16(4660), HlpUuids.CCCD, DisplayStrings.DS_REPORT_MENU_V2_TRAFFIC_STANDSTILL_LABEL, "vietmap_h50");
    static final HudGattProfile VIETMAP_H1 = new HudGattProfile(uuid16(65520), uuid16(65522), uuid16(65521), HlpUuids.CCCD, 247, "vietmap_h1");

    HudGattProfile(UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, int i2, String str) {
        if (uuid == null || uuid2 == null || uuid3 == null || uuid4 == null) {
            throw new NullPointerException("GATT UUIDs must not be null");
        }
        if (i2 < 23) {
            throw new IllegalArgumentException("MTU must be at least 23");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("protocol family must not be empty");
        }
        this.service = uuid;
        this.write = uuid2;
        this.notify = uuid3;
        this.cccd = uuid4;
        this.requestedMtu = i2;
        this.protocolFamily = str;
    }

    private static UUID uuid16(int i2) {
        return UUID.fromString(String.format(Locale.US, "0000%04X-0000-1000-8000-00805F9B34FB", Integer.valueOf(i2 & 65535)));
    }
}
