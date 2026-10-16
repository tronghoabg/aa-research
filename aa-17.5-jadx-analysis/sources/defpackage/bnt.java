package defpackage;

/* loaded from: classes2.dex */
public final class bnt {
    public final float a = 6.0f;
    public final float b = 6.0f;
    public final float c = 6.0f;
    public final float d = 8.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bnt)) {
            return false;
        }
        if (dlj.c(6.0f, 6.0f) && dlj.c(6.0f, 6.0f) && dlj.c(6.0f, 6.0f)) {
            return dlj.c(8.0f, 8.0f);
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(6.0f) * 31) + Float.floatToIntBits(6.0f)) * 31) + Float.floatToIntBits(6.0f)) * 31) + Float.floatToIntBits(8.0f);
    }
}
