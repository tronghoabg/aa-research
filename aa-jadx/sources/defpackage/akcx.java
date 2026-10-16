package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akcx {
    private final java.lang.Object a;

    public akcx(float f) {
        this.a = java.lang.Float.valueOf(f);
    }

    private final void c(int i) {
        int i2;
        java.lang.Object obj = this.a;
        if (obj instanceof java.lang.Boolean) {
            i2 = 1;
        } else if (obj instanceof java.lang.Long) {
            i2 = 2;
        } else if (obj instanceof java.lang.Float) {
            i2 = 3;
        } else if (obj instanceof java.lang.String) {
            i2 = 4;
        } else {
            if (!(obj instanceof defpackage.abnv)) {
                throw new java.lang.IllegalStateException("Unexpected flag value type: ".concat(java.lang.String.valueOf(obj.getClass().getName())));
            }
            i2 = 5;
        }
        if (i == i2) {
            return;
        }
        throw new java.lang.IllegalStateException("Attempted to access flag value as " + defpackage.agxf.c(i) + ", but actual type is " + defpackage.agxf.c(i2));
    }

    public final java.lang.String a() {
        c(4);
        return (java.lang.String) this.a;
    }

    public final boolean b() {
        c(1);
        return ((java.lang.Boolean) this.a).booleanValue();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    public akcx(java.lang.Object obj) {
        this.a = obj;
    }

    public akcx(boolean z) {
        this.a = java.lang.Boolean.valueOf(z);
    }

    public akcx(long j) {
        this.a = java.lang.Long.valueOf(j);
    }
}
