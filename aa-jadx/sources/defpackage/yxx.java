package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum yxx implements defpackage.abpb {
    POOL_UNSPECIFIED(0),
    POOL_AUDIO(1),
    POOL_VIDEO(2);

    public final int d;

    yxx(int i) {
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
