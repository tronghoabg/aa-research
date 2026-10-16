package defpackage;

/* loaded from: classes2.dex */
public final class hiw {
    public static final hiw a = new hiw(4.0f);
    public static final hiw b = new hiw(6.0f);
    public final float c;

    private hiw(float f) {
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hiw) && dlj.c(this.c, ((hiw) obj).c);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TemplateFocusRingSize(thickness=" + dlj.b(this.c) + ")";
    }
}
