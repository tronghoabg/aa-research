package i.b.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum m implements eg {
    UNKNOWN_CONTEXT(0),
    SIGNUP(1),
    SETTINGS_MENU(2),
    SYETEM_PRIVILEGES(3),
    POP_UP(4),
    CARPOOL_THIRD_PARTY_CONSENT_POPUP(5),
    CARPOOL_THIRD_PARTY_CONSENT_SHEET(6),
    CARPOOL_THIRD_PARTY_CONSENT_SETTINGS(7),
    EXTERNAL_TRIP_SHARING_INITIAL_CONSENT_SCREEN(8),
    EXTERNAL_TRIP_SHARING_MIDTRIP_CONSENT_SCREEN(9);


    /* renamed from: l, reason: collision with root package name */
    private final int f48344l;

    m(int i2) {
        this.f48344l = i2;
    }

    public static m a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_CONTEXT;
            case 1:
                return SIGNUP;
            case 2:
                return SETTINGS_MENU;
            case 3:
                return SYETEM_PRIVILEGES;
            case 4:
                return POP_UP;
            case 5:
                return CARPOOL_THIRD_PARTY_CONSENT_POPUP;
            case 6:
                return CARPOOL_THIRD_PARTY_CONSENT_SHEET;
            case 7:
                return CARPOOL_THIRD_PARTY_CONSENT_SETTINGS;
            case 8:
                return EXTERNAL_TRIP_SHARING_INITIAL_CONSENT_SCREEN;
            case 9:
                return EXTERNAL_TRIP_SHARING_MIDTRIP_CONSENT_SCREEN;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48344l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48344l);
    }
}
