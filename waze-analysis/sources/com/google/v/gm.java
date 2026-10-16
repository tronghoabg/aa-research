package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gm {
    DOUBLE(gn.f13025d, 1),
    FLOAT(gn.f13024c, 5),
    INT64(gn.f13023b, 0),
    UINT64(gn.f13023b, 0),
    INT32(gn.f13022a, 0),
    FIXED64(gn.f13023b, 1),
    FIXED32(gn.f13022a, 5),
    BOOL(gn.f13026e, 0),
    STRING(gn.f13027f, 2),
    GROUP(gn.f13030i, 3),
    MESSAGE(gn.f13030i, 2),
    BYTES(gn.f13028g, 2),
    UINT32(gn.f13022a, 0),
    ENUM(gn.f13029h, 0),
    SFIXED32(gn.f13022a, 5),
    SFIXED64(gn.f13023b, 1),
    SINT32(gn.f13022a, 0),
    SINT64(gn.f13023b, 0);

    private final gn t;
    private final int u;

    gm(gn gnVar, int i2) {
        this.t = gnVar;
        this.u = i2;
    }

    public final int a() {
        return this.u;
    }

    public final gn b() {
        return this.t;
    }
}
