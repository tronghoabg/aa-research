package com.waze.gw;

/* loaded from: classes10.dex */
final class HudTurnCodec {
    private HudTurnCodec() {
    }

    static int encode(int i2) {
        switch (i2) {
            case 1:
            case 27:
                return 2;
            case 2:
            case 28:
                return 3;
            case 3:
                return 13;
            case 4:
                return 14;
            case 5:
                return 1;
            case 6:
            case 7:
                return 10;
            case 8:
            case 9:
                return 11;
            case 10:
            case 11:
                return 19;
            case 12:
            case 13:
                return 12;
            case 14:
            case 15:
                return 20;
            case 16:
            case 21:
            case 31:
                return 17;
            case 17:
            case 29:
                return 15;
            case 18:
            case 30:
                return 16;
            case 19:
            case 26:
                return 1;
            case 20:
                return 8;
            case 22:
                return 4;
            case 23:
                return 6;
            case 24:
                return 5;
            case 25:
                return 7;
            default:
                if (i2 >= 1) {
                    return 1;
                }
                return 0;
        }
    }
}
