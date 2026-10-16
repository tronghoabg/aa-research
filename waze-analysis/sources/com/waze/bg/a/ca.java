package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum ca implements com.google.v.eg {
    WEATHER_UNSPECIFIED(0),
    WEATHER_DEFAULT(1),
    WEATHER_SLIPPERY_ROAD(2),
    WEATHER_FLOOD(3),
    WEATHER_UNPLOWED_ROAD(4),
    WEATHER_FOG(5),
    WEATHER_ICY_ROAD(6),
    WEATHER_HEAT_WAVE(7),
    WEATHER_TORNADO(8),
    WEATHER_HEAVY_RAIN(9),
    WEATHER_HAIL(10),
    WEATHER_HURRICANE(11),
    WEATHER_MONSOON(12);

    private final int o;

    ca(int i2) {
        this.o = i2;
    }

    public static com.google.v.ei a() {
        return o.u;
    }

    public static ca b(int i2) {
        switch (i2) {
            case 0:
                return WEATHER_UNSPECIFIED;
            case 1:
                return WEATHER_DEFAULT;
            case 2:
                return WEATHER_SLIPPERY_ROAD;
            case 3:
                return WEATHER_FLOOD;
            case 4:
                return WEATHER_UNPLOWED_ROAD;
            case 5:
                return WEATHER_FOG;
            case 6:
                return WEATHER_ICY_ROAD;
            case 7:
                return WEATHER_HEAT_WAVE;
            case 8:
                return WEATHER_TORNADO;
            case 9:
                return WEATHER_HEAVY_RAIN;
            case 10:
                return WEATHER_HAIL;
            case 11:
                return WEATHER_HURRICANE;
            case 12:
                return WEATHER_MONSOON;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
