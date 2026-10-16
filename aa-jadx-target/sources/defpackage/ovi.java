package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum ovi implements defpackage.abpb {
    FOCUS_CHANGE_COMMAND_UNSPECIFIED(0),
    NONE(1),
    FOCUS_GAIN(2),
    FOCUS_LOSS(3),
    BOTTOM_HALF_SWITCH(4);

    public final int f;

    ovi(int i) {
        this.f = i;
    }

    public static defpackage.ovi b(int i) {
        if (i == 0) {
            return FOCUS_CHANGE_COMMAND_UNSPECIFIED;
        }
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return FOCUS_GAIN;
        }
        if (i == 3) {
            return FOCUS_LOSS;
        }
        if (i != 4) {
            return null;
        }
        return BOTTOM_HALF_SWITCH;
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
