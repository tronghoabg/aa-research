package defpackage;

/* loaded from: classes2.dex */
public final class gcb implements hju {
    public static final /* synthetic */ int c = 0;
    public final float a;
    public final hjw b;

    static {
        hjw hjwVar = hjw.a;
    }

    public gcb(float f, hjw hjwVar) {
        this.a = f;
        this.b = hjwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcb)) {
            return false;
        }
        gcb gcbVar = (gcb) obj;
        return Float.compare(this.a, gcbVar.a) == 0 && affa.f(this.b, gcbVar.b);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        hjw hjwVar = this.b;
        return iFloatToIntBits + (hjwVar == null ? 0 : hjwVar.hashCode());
    }

    public final String toString() {
        return "CarProgressIndicatorUiModel(progress=" + this.a + ", color=" + this.b + ")";
    }
}
