package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acjd implements defpackage.abpb {
    GOOGLE(1),
    IMMERSIVE(2);

    private final int d;

    acjd(int i) {
        this.d = i;
    }

    public static defpackage.acjd b(int i) {
        if (i == 1) {
            return GOOGLE;
        }
        if (i != 2) {
            return null;
        }
        return IMMERSIVE;
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
