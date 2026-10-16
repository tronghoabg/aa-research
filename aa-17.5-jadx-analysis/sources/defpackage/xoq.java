package defpackage;

/* loaded from: classes.dex */
public enum xoq implements abnz {
    UI_ELEMENT_UNKNOWN(0),
    UI_ELEMENT_CLOCK(1),
    UI_ELEMENT_BATTERY_LEVEL(2),
    UI_ELEMENT_PHONE_SIGNAL(3),
    UI_ELEMENT_NATIVE_UI_AFFORDANCE(4),
    UI_ELEMENT_NAVIGATION_TURN_DATA_AVAILABLE(5);

    private final int h;

    xoq(int i) {
        this.h = i;
    }

    public static xoq b(int i) {
        if (i == 0) {
            return UI_ELEMENT_UNKNOWN;
        }
        if (i == 1) {
            return UI_ELEMENT_CLOCK;
        }
        if (i == 2) {
            return UI_ELEMENT_BATTERY_LEVEL;
        }
        if (i == 3) {
            return UI_ELEMENT_PHONE_SIGNAL;
        }
        if (i == 4) {
            return UI_ELEMENT_NATIVE_UI_AFFORDANCE;
        }
        if (i != 5) {
            return null;
        }
        return UI_ELEMENT_NAVIGATION_TURN_DATA_AVAILABLE;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
