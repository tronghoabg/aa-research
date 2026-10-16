package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tew {
    public final java.lang.Object a;
    private final java.lang.Long b;

    public tew(java.lang.Object obj, java.lang.Long l) {
        this.a = obj;
        this.b = java.lang.Long.valueOf(tnb.a() + java.lang.Math.max(0L, l.longValue()));
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        if (a()) {
            return tnb.a() < this.b.longValue();
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.Long lValueOf;
        java.lang.Object obj = this.a;
        if (a()) {
            if (a()) {
                lValueOf = !b() ? 0L : java.lang.Long.valueOf(this.b.longValue() - tnb.a());
            } else {
                lValueOf = null;
            }
            strConcat = java.lang.String.valueOf(lValueOf).concat("ns");
        } else {
            strConcat = "null";
        }
        return java.lang.String.format("Expirable{content=%s lifespan=%s}", obj, strConcat);
    }

    public tew(java.lang.Object obj) {
        this.a = obj;
        this.b = null;
    }
}
