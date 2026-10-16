package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum elt {
    DOUBLE(defpackage.elu.d, 1),
    FLOAT(defpackage.elu.c, 5),
    INT64(defpackage.elu.b, 0),
    UINT64(defpackage.elu.b, 0),
    INT32(defpackage.elu.a, 0),
    FIXED64(defpackage.elu.b, 1),
    FIXED32(defpackage.elu.a, 5),
    BOOL(defpackage.elu.e, 0),
    STRING(defpackage.elu.f, 2),
    GROUP(defpackage.elu.i, 3),
    MESSAGE(defpackage.elu.i, 2),
    BYTES(defpackage.elu.g, 2),
    UINT32(defpackage.elu.a, 0),
    ENUM(defpackage.elu.h, 0),
    SFIXED32(defpackage.elu.a, 5),
    SFIXED64(defpackage.elu.b, 1),
    SINT32(defpackage.elu.a, 0),
    SINT64(defpackage.elu.b, 0);

    public final defpackage.elu s;
    public final int t;

    elt(defpackage.elu eluVar, int i) {
        this.s = eluVar;
        this.t = i;
    }
}
