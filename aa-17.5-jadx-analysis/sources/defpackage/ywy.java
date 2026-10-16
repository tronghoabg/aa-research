package defpackage;

/* loaded from: classes.dex */
public enum ywy implements abnz {
    CAR_APP_CATEGORY_UNKNOWN(0),
    CAR_APP_CATEGORY_NAVIGATION(1),
    CAR_APP_CATEGORY_PARKING(2),
    CAR_APP_CATEGORY_CHARGING(3),
    CAR_APP_CATEGORY_MESSAGING(4),
    CAR_APP_CATEGORY_POI(5);

    public final int g;

    ywy(int i) {
        this.g = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
