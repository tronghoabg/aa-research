package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum jr implements com.google.v.eg {
    POLICE(0),
    AMBULANCE(1),
    FIRE(2),
    ROADSIDE_ASSISTANCE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48803f;

    jr(int i2) {
        this.f48803f = i2;
    }

    public static jr a(int i2) {
        if (i2 == 0) {
            return POLICE;
        }
        if (i2 == 1) {
            return AMBULANCE;
        }
        if (i2 == 2) {
            return FIRE;
        }
        if (i2 != 3) {
            return null;
        }
        return ROADSIDE_ASSISTANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48803f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48803f);
    }
}
