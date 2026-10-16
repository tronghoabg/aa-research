package com.waze.gw;

/* loaded from: classes10.dex */
final class HudManeuverAssets {
    private HudManeuverAssets() {
    }

    static String drawableName(int i2) {
        switch (i2) {
            case 1:
            case 22:
            case 23:
            case 27:
                return "big_trans_direction_left";
            case 2:
            case 24:
            case 25:
            case 28:
                return "big_trans_direction_right";
            case 3:
            case 17:
            case 29:
                return "big_trans_direction_exit_left";
            case 4:
            case 18:
            case 30:
                return "big_trans_direction_exit_right";
            case 5:
            case 19:
            case 26:
            default:
                return "big_trans_direction_forward";
            case 6:
            case 7:
                return "car_big_trans_directions_roundabout";
            case 8:
            case 9:
                return "car_big_trans_directions_roundabout_l";
            case 10:
            case 11:
                return "car_big_trans_directions_roundabout_s";
            case 12:
            case 13:
                return "car_big_trans_directions_roundabout_r";
            case 14:
            case 15:
                return "car_big_trans_directions_roundabout_u";
            case 16:
            case 21:
                return "big_trans_direction_end";
            case 20:
                return "big_trans_direction_u_turn";
            case 31:
                return "big_trans_direction_stop";
        }
    }

    static boolean preserveArtwork(int i2) {
        return (i2 >= 6 && i2 <= 15) || i2 == 16 || i2 == 21 || i2 == 31;
    }
}
