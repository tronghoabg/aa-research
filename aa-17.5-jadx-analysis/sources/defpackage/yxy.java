package defpackage;

/* loaded from: classes.dex */
public enum yxy implements abnz {
    DOMAIN_UNSPECIFIED(0),
    GEARHEAD(1),
    CONNECTIVITY(2),
    FRX(3),
    CAR_SERVICE(4),
    BINDING(5),
    PROVIDER(6);

    public final int h;

    yxy(int i2) {
        this.h = i2;
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
