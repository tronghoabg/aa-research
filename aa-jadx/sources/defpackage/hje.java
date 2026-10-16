package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hje {
    public static final defpackage.hje a = new defpackage.hje(4.0f);
    public static final defpackage.hje b = new defpackage.hje(6.0f);
    public final float c;

    private hje(float f) {
        this.c = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.hje) && defpackage.dlr.c(this.c, ((defpackage.hje) obj).c);
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return "TemplateFocusRingSize(thickness=" + defpackage.dlr.b(this.c) + ")";
    }
}
