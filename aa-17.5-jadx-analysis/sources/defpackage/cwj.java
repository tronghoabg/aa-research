package defpackage;

/* loaded from: classes.dex */
public final class cwj {
    private final float a = 10.0f;
    private final float b = 40.0f;
    private final float c = 10.0f;
    private final float d = 40.0f;
    private final boolean e = true;

    public static final long a(dlg dlgVar) {
        return ty.c(dlgVar.eF(10.0f), dlgVar.eF(40.0f), dlgVar.eF(10.0f), dlgVar.eF(40.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwj)) {
            return false;
        }
        cwj cwjVar = (cwj) obj;
        float f = cwjVar.a;
        if (Float.compare(10.0f, 10.0f) == 0) {
            float f2 = cwjVar.b;
            if (Float.compare(40.0f, 40.0f) == 0) {
                float f3 = cwjVar.c;
                if (Float.compare(10.0f, 10.0f) == 0) {
                    float f4 = cwjVar.d;
                    if (Float.compare(40.0f, 40.0f) == 0) {
                        boolean z = cwjVar.e;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(10.0f) * 31) + Float.floatToIntBits(40.0f)) * 31) + Float.floatToIntBits(10.0f)) * 31) + Float.floatToIntBits(40.0f)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + dlj.b(10.0f) + ", top=" + dlj.b(40.0f) + ", end=" + dlj.b(10.0f) + ", bottom=" + dlj.b(40.0f) + ", isLayoutDirectionAware=true)";
    }
}
