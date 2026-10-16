package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum kl implements com.google.v.eg {
    SUBJECT_UNSPECIFIED(0),
    CYCLONE(1),
    HURRICANE(2),
    TORNADO(3),
    TYPHOON(4),
    LANDSLIDE(5),
    THUNDERSTORM(11),
    FOG(12),
    HIGH_WINDS(13),
    FLOODING(14);


    /* renamed from: l, reason: collision with root package name */
    private final int f12039l;

    kl(int i2) {
        this.f12039l = i2;
    }

    public static kl a(int i2) {
        if (i2 == 0) {
            return SUBJECT_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CYCLONE;
        }
        if (i2 == 2) {
            return HURRICANE;
        }
        if (i2 == 3) {
            return TORNADO;
        }
        if (i2 == 4) {
            return TYPHOON;
        }
        if (i2 == 5) {
            return LANDSLIDE;
        }
        switch (i2) {
            case 11:
                return THUNDERSTORM;
            case 12:
                return FOG;
            case 13:
                return HIGH_WINDS;
            case 14:
                return FLOODING;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12039l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12039l);
    }
}
