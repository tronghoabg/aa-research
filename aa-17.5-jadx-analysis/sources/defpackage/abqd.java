package defpackage;

/* loaded from: classes.dex */
public enum abqd {
    DOUBLE(abqe.d, 1),
    FLOAT(abqe.c, 5),
    INT64(abqe.b, 0),
    UINT64(abqe.b, 0),
    INT32(abqe.a, 0),
    FIXED64(abqe.b, 1),
    FIXED32(abqe.a, 5),
    BOOL(abqe.e, 0),
    STRING(abqe.f, 2),
    GROUP(abqe.i, 3),
    MESSAGE(abqe.i, 2),
    BYTES(abqe.g, 2),
    UINT32(abqe.a, 0),
    ENUM(abqe.h, 0),
    SFIXED32(abqe.a, 5),
    SFIXED64(abqe.b, 1),
    SINT32(abqe.a, 0),
    SINT64(abqe.b, 0);

    public final abqe s;
    public final int t;

    abqd(abqe abqeVar, int i) {
        this.s = abqeVar;
        this.t = i;
    }
}
