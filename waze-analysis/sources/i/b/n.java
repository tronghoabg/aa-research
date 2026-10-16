package i.b;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum n implements eg {
    UNKNOWN_APP_TYPE(0),
    WAZE(1),
    RIDER(2),
    BROADCAST(3),
    WAZE_BUILT_IN_DISPLAY(4),
    WAZE_BUILT_IN_DISPLAY_PHONE(5),
    WAZE_BUILT_IN_DISPLAY_CARPLAY(6),
    WEB_CLIENT(7),
    CARPOOL_ALERTS_ORCHESTRATOR(8),
    WAZE_ANDROID_AUTOMOTIVE_OS(9);


    /* renamed from: l, reason: collision with root package name */
    private final int f49098l;

    n(int i2) {
        this.f49098l = i2;
    }

    public static ei a() {
        return k.f48522d;
    }

    public static n b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_APP_TYPE;
            case 1:
                return WAZE;
            case 2:
                return RIDER;
            case 3:
                return BROADCAST;
            case 4:
                return WAZE_BUILT_IN_DISPLAY;
            case 5:
                return WAZE_BUILT_IN_DISPLAY_PHONE;
            case 6:
                return WAZE_BUILT_IN_DISPLAY_CARPLAY;
            case 7:
                return WEB_CLIENT;
            case 8:
                return CARPOOL_ALERTS_ORCHESTRATOR;
            case 9:
                return WAZE_ANDROID_AUTOMOTIVE_OS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49098l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49098l);
    }
}
