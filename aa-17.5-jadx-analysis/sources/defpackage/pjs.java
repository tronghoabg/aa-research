package defpackage;

/* loaded from: classes2.dex */
public enum pjs implements abnz {
    UNSPECIFIED(0),
    NONE(1),
    AES_GCM(2);

    public final int d;

    pjs(int i) {
        this.d = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
