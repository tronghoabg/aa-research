package com.waze.gw;

/* loaded from: classes10.dex */
final class HudFeatureFlags {
    static final boolean VIETMAP_DEV_OVERRIDE = false;
    static final boolean VIETMAP_H1_RUNTIME_ENABLED = false;
    static final boolean VIETMAP_H50_RUNTIME_ENABLED = true;
    static final boolean VIETMAP_TAB_VISIBLE = true;

    private HudFeatureFlags() {
    }

    static boolean isTabVisible() {
        return true;
    }

    static boolean vietMapTabVisible() {
        return isTabVisible();
    }

    static boolean h50RuntimeEnabled() {
        return isRuntimeEnabled(HudProtocolFamily.VIETMAP_H50);
    }

    static boolean h1RuntimeEnabled() {
        return isRuntimeEnabled(HudProtocolFamily.VIETMAP_H1);
    }

    static boolean isRuntimeEnabled(HudProtocolFamily hudProtocolFamily) {
        if (hudProtocolFamily == HudProtocolFamily.HLP1) {
            return true;
        }
        if (hudProtocolFamily == null || hudProtocolFamily == HudProtocolFamily.AUTO) {
            return false;
        }
        if (hudProtocolFamily == HudProtocolFamily.VIETMAP_H50) {
            return true;
        }
        return hudProtocolFamily == HudProtocolFamily.VIETMAP_H1 ? false : false;
    }
}
