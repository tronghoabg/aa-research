package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum abgl implements defpackage.abpb {
    WORLD_ENCODING_UNKNOWN(0),
    WORLD_ENCODING_LAT_LNG_E7(3),
    WORLD_ENCODING_LAT_LNG_DOUBLE(4),
    SCREEN_SPACE_FLOAT(5),
    WORLD_ENCODING_MAX_PRECISION_DELTA_VARINT(6);

    public final int f;

    abgl(int i) {
        this.f = i;
    }

    public static defpackage.abgl b(int i) {
        if (i == 0) {
            return WORLD_ENCODING_UNKNOWN;
        }
        if (i == 3) {
            return WORLD_ENCODING_LAT_LNG_E7;
        }
        if (i == 4) {
            return WORLD_ENCODING_LAT_LNG_DOUBLE;
        }
        if (i == 5) {
            return SCREEN_SPACE_FLOAT;
        }
        if (i != 6) {
            return null;
        }
        return WORLD_ENCODING_MAX_PRECISION_DELTA_VARINT;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
