package defpackage;

/* loaded from: classes3.dex */
public final class zzi {
    public final zzf a;
    private final int b;

    public zzi(int i, zzf zzfVar) {
        this.b = i;
        this.a = zzfVar;
    }

    public final float a() {
        zzf zzfVar = this.a;
        float f = zzfVar.k;
        if (f != -1.0f) {
            return f;
        }
        float f2 = zzfVar.i;
        float f3 = zzfVar.j;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
        zzfVar.k = fSqrt;
        return fSqrt;
    }

    public final float b() {
        zzf zzfVar = this.a;
        float f = zzfVar.l;
        if (f != -1.0f) {
            return f;
        }
        float f2 = zzfVar.g;
        float f3 = zzfVar.h;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
        zzfVar.l = fSqrt;
        return fSqrt;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScaleEvent{eventType=");
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
