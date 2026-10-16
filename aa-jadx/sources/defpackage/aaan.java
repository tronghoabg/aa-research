package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaan {
    public final defpackage.aaak a;
    private final int b;

    public aaan(int i, defpackage.aaak aaakVar) {
        this.b = i;
        this.a = aaakVar;
    }

    public final float a() {
        defpackage.aaak aaakVar = this.a;
        float f = aaakVar.k;
        if (f != -1.0f) {
            return f;
        }
        float f2 = aaakVar.i;
        float f3 = aaakVar.j;
        float fSqrt = (float) java.lang.Math.sqrt((f2 * f2) + (f3 * f3));
        aaakVar.k = fSqrt;
        return fSqrt;
    }

    public final float b() {
        defpackage.aaak aaakVar = this.a;
        float f = aaakVar.l;
        if (f != -1.0f) {
            return f;
        }
        float f2 = aaakVar.g;
        float f3 = aaakVar.h;
        float fSqrt = (float) java.lang.Math.sqrt((f2 * f2) + (f3 * f3));
        aaakVar.l = fSqrt;
        return fSqrt;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScaleEvent{eventType=");
        int i = this.b;
        if (i == 0) {
            sb.append("EVENT_TYPE_ON_SCALING");
        } else if (i == 1) {
            sb.append("EVENT_TYPE_ON_SCALE_BEGIN");
        } else if (i != 2) {
            sb.append("EVENT_TYPE_ON_TWO_FINGER_TAP");
        } else {
            sb.append("EVENT_TYPE_ON_SCALE_END");
        }
        sb.append('}');
        return sb.toString();
    }
}
