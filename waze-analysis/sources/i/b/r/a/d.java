package i.b.r.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum d implements eg {
    DEFAULT_PREFERENCE(1),
    USER_PREFERENCE(2),
    OLD_TRIP_SERVER_PREDICTION(3),
    PREDICTION_ALGORITHM(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f49282f;

    d(int i2) {
        this.f49282f = i2;
    }

    public static d a(int i2) {
        if (i2 == 1) {
            return DEFAULT_PREFERENCE;
        }
        if (i2 == 2) {
            return USER_PREFERENCE;
        }
        if (i2 == 3) {
            return OLD_TRIP_SERVER_PREDICTION;
        }
        if (i2 != 4) {
            return null;
        }
        return PREDICTION_ALGORITHM;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49282f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49282f);
    }
}
