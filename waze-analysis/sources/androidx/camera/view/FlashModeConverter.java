package androidx.camera.view;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FlashModeConverter {
    private FlashModeConverter() {
    }

    public static String nameOf(int i2) {
        if (i2 == 0) {
            return "AUTO";
        }
        if (i2 == 1) {
            return "ON";
        }
        if (i2 == 2) {
            return "OFF";
        }
        throw new IllegalArgumentException("Unknown flash mode " + i2);
    }

    public static int valueOf(String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 2527) {
            if (iHashCode != 78159) {
                if (iHashCode == 2020783 && str.equals("AUTO")) {
                    return 0;
                }
            } else if (str.equals("OFF")) {
                return 2;
            }
        } else if (str.equals("ON")) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown flash mode name ".concat(str));
    }
}
