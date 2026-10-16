package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ydr {
    public java.util.EnumMap a = null;
    private final java.util.function.BinaryOperator b;

    public ydr(java.util.function.BinaryOperator binaryOperator) {
        this.b = binaryOperator;
    }

    public final void a(java.lang.Enum r2, java.lang.Object obj) {
        java.util.EnumMap enumMap = this.a;
        if (enumMap == null) {
            this.a = new java.util.EnumMap(java.util.Collections.singletonMap(r2, obj));
        } else {
            j$.util.Map.EL.merge(enumMap, r2, obj, this.b);
        }
    }
}
