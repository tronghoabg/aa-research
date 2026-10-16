package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum xqf implements defpackage.abpb {
    VIDEO_FOCUS_PROJECTED(1),
    VIDEO_FOCUS_NATIVE(2),
    VIDEO_FOCUS_NATIVE_TRANSIENT(3),
    VIDEO_FOCUS_PROJECTED_NO_INPUT_FOCUS(4);

    public final int e;

    xqf(int i) {
        this.e = i;
    }

    public static defpackage.xqf b(int i) {
        if (i == 1) {
            return VIDEO_FOCUS_PROJECTED;
        }
        if (i == 2) {
            return VIDEO_FOCUS_NATIVE;
        }
        if (i == 3) {
            return VIDEO_FOCUS_NATIVE_TRANSIENT;
        }
        if (i != 4) {
            return null;
        }
        return VIDEO_FOCUS_PROJECTED_NO_INPUT_FOCUS;
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
