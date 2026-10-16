package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum yzp implements defpackage.abpb {
    UNKNOWN_PROCESS_TYPE(0),
    PROJECTION(1),
    CAR(2),
    SHARED(3);

    public final int e;

    yzp(int i) {
        this.e = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
