package defpackage;

/* loaded from: classes2.dex */
public enum ell {
    DOUBLE(elm.d, 1),
    FLOAT(elm.c, 5),
    INT64(elm.b, 0),
    UINT64(elm.b, 0),
    INT32(elm.a, 0),
    FIXED64(elm.b, 1),
    FIXED32(elm.a, 5),
    BOOL(elm.e, 0),
    STRING(elm.f, 2),
    GROUP(elm.i, 3),
    MESSAGE(elm.i, 2),
    BYTES(elm.g, 2),
    UINT32(elm.a, 0),
    ENUM(elm.h, 0),
    SFIXED32(elm.a, 5),
    SFIXED64(elm.b, 1),
    SINT32(elm.a, 0),
    SINT64(elm.b, 0);

    public final elm s;
    public final int t;

    ell(elm elmVar, int i) {
        this.s = elmVar;
        this.t = i;
    }
}
