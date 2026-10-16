package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum yzd implements defpackage.abpb {
    DOMAIN_UNSPECIFIED(0),
    GEARHEAD(1),
    CONNECTIVITY(2),
    FRX(3),
    CAR_SERVICE(4),
    BINDING(5),
    PROVIDER(6);

    public final int h;

    yzd(int i2) {
        this.h = i2;
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
