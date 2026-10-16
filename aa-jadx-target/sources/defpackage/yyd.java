package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum yyd implements defpackage.abpb {
    CAR_APP_CATEGORY_UNKNOWN(0),
    CAR_APP_CATEGORY_NAVIGATION(1),
    CAR_APP_CATEGORY_PARKING(2),
    CAR_APP_CATEGORY_CHARGING(3),
    CAR_APP_CATEGORY_MESSAGING(4),
    CAR_APP_CATEGORY_POI(5);

    public final int g;

    yyd(int i) {
        this.g = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
