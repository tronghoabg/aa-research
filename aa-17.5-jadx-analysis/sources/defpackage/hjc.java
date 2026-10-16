package defpackage;

/* loaded from: classes2.dex */
public final class hjc {
    public static final hjc a = new hjc(72.0f, 72.0f);
    public static final hjc b = new hjc(90.0f, 90.0f);
    public final float c;
    public final float d;

    private hjc(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjc)) {
            return false;
        }
        hjc hjcVar = (hjc) obj;
        return dlj.c(this.c, hjcVar.c) && dlj.c(this.d, hjcVar.d);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        float f = this.d;
        return "TemplateSemanticSize(leading=" + dlj.b(this.c) + ", trailing=" + dlj.b(f) + ")";
    }
}
