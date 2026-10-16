package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum uzb implements defpackage.abpb {
    UNKNOWN_UE3_REPORTER_FLUSH_STRATEGY(0),
    NONE(1),
    SEQUENTIAL_ON_UI_THREAD(2),
    WAIT_ON_UI_THREAD(3);

    public final int e;

    uzb(int i) {
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
