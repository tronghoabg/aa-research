package com.waze.gw;

import com.waze.strings.DisplayStrings;

/* loaded from: classes10.dex */
final class HudLaneCodec {
    static final int LEFT = 4;
    static final int RIGHT = 32;
    static final int SHARP_LEFT = 8;
    static final int SHARP_RIGHT = 64;
    static final int SLIGHT_LEFT = 2;
    static final int SLIGHT_RIGHT = 16;
    static final int STRAIGHT = 1;
    static final int U_TURN = 128;

    private HudLaneCodec() {
    }

    static int directionBit(int i2) {
        while (i2 > 180) {
            i2 -= 360;
        }
        while (i2 < -180) {
            i2 += DisplayStrings.DS_ONE_DAY_AGO;
        }
        if (Math.abs(i2) >= 150) {
            return 128;
        }
        if (i2 <= -100) {
            return 8;
        }
        if (i2 <= -55) {
            return 4;
        }
        if (i2 <= -20) {
            return 2;
        }
        if (i2 < 20) {
            return 1;
        }
        if (i2 < 55) {
            return 16;
        }
        return i2 < 100 ? 32 : 64;
    }
}
