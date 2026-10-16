package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum pkm implements defpackage.abpb {
    UNSPECIFIED(0),
    NONE(1),
    AES_GCM(2);

    public final int d;

    pkm(int i) {
        this.d = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
