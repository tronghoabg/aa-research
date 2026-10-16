package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hjk {
    public static final defpackage.hjk a = new defpackage.hjk(72.0f, 72.0f);
    public static final defpackage.hjk b = new defpackage.hjk(90.0f, 90.0f);
    public final float c;
    public final float d;

    private hjk(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hjk)) {
            return false;
        }
        defpackage.hjk hjkVar = (defpackage.hjk) obj;
        return defpackage.dlr.c(this.c, hjkVar.c) && defpackage.dlr.c(this.d, hjkVar.d);
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.c) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        float f = this.d;
        return "TemplateSemanticSize(leading=" + defpackage.dlr.b(this.c) + ", trailing=" + defpackage.dlr.b(f) + ")";
    }
}
