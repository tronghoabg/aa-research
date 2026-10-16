package com.waze.gw;

import android.content.Context;
import com.waze.gw.HlpProtocol;

/* loaded from: classes10.dex */
final class HudProtocolSessionFactory {
    private HudProtocolSessionFactory() {
    }

    static HudProtocolSession create(Context context, HudProtocolFamily hudProtocolFamily, HudTransport hudTransport, HudSessionListener hudSessionListener) {
        if (hudProtocolFamily == HudProtocolFamily.HLP1) {
            return new HlpProtocol.Session(context, hudTransport, hudSessionListener);
        }
        if (hudProtocolFamily == HudProtocolFamily.VIETMAP_H50) {
            return new VietMapH50Session(hudTransport, hudSessionListener, new VietMapH50CodecAdapter());
        }
        throw new IllegalArgumentException("Unsupported HUD protocol family: " + String.valueOf(hudProtocolFamily));
    }

    static boolean hasRuntimeSession(HudProtocolFamily hudProtocolFamily) {
        return hudProtocolFamily == HudProtocolFamily.HLP1 || hudProtocolFamily == HudProtocolFamily.VIETMAP_H50;
    }

    static HudGattProfile gattProfile(HudProtocolFamily hudProtocolFamily) {
        return hudProtocolFamily == HudProtocolFamily.VIETMAP_H50 ? HudGattProfile.VIETMAP_H50 : hudProtocolFamily == HudProtocolFamily.VIETMAP_H1 ? HudGattProfile.VIETMAP_H1 : HudGattProfile.HLP1;
    }
}
