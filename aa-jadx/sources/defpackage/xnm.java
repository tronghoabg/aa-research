package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xnm implements defpackage.abpb {
    RADIO_BAND_AM(1),
    RADIO_BAND_FM(2),
    RADIO_BAND_DAB(3);

    public final int d;

    xnm(int i) {
        this.d = i;
    }

    public static defpackage.xnm b(int i) {
        if (i == 1) {
            return RADIO_BAND_AM;
        }
        if (i == 2) {
            return RADIO_BAND_FM;
        }
        if (i != 3) {
            return null;
        }
        return RADIO_BAND_DAB;
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
