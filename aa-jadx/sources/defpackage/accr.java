package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum accr implements defpackage.abpb {
    UNKNOWN_LOCATION_SHARING_STATE(0),
    NOT_SHARING(1),
    SHARING_BUT_NOT_REPORTING(2),
    SHARING_AND_REPORTING(3);

    public final int e;

    accr(int i) {
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
