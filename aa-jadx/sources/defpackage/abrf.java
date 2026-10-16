package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum abrf {
    DOUBLE(defpackage.abrg.d, 1),
    FLOAT(defpackage.abrg.c, 5),
    INT64(defpackage.abrg.b, 0),
    UINT64(defpackage.abrg.b, 0),
    INT32(defpackage.abrg.a, 0),
    FIXED64(defpackage.abrg.b, 1),
    FIXED32(defpackage.abrg.a, 5),
    BOOL(defpackage.abrg.e, 0),
    STRING(defpackage.abrg.f, 2),
    GROUP(defpackage.abrg.i, 3),
    MESSAGE(defpackage.abrg.i, 2),
    BYTES(defpackage.abrg.g, 2),
    UINT32(defpackage.abrg.a, 0),
    ENUM(defpackage.abrg.h, 0),
    SFIXED32(defpackage.abrg.a, 5),
    SFIXED64(defpackage.abrg.b, 1),
    SINT32(defpackage.abrg.a, 0),
    SINT64(defpackage.abrg.b, 0);

    public final defpackage.abrg s;
    public final int t;

    abrf(defpackage.abrg abrgVar, int i) {
        this.s = abrgVar;
        this.t = i;
    }
}
