package defpackage;

/* loaded from: classes3.dex */
public enum xml implements abnz {
    RADIO_BAND_AM(1),
    RADIO_BAND_FM(2),
    RADIO_BAND_DAB(3);

    public final int d;

    xml(int i) {
        this.d = i;
    }

    public static xml b(int i) {
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

    @Override // defpackage.abnz
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
