package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xpr implements defpackage.abpb {
    UI_ELEMENT_UNKNOWN(0),
    UI_ELEMENT_CLOCK(1),
    UI_ELEMENT_BATTERY_LEVEL(2),
    UI_ELEMENT_PHONE_SIGNAL(3),
    UI_ELEMENT_NATIVE_UI_AFFORDANCE(4),
    UI_ELEMENT_NAVIGATION_TURN_DATA_AVAILABLE(5);

    private final int h;

    xpr(int i) {
        this.h = i;
    }

    public static defpackage.xpr b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
