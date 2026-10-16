package com.google.firebase.perf.f;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum z implements eg {
    HTTP_METHOD_UNKNOWN(0),
    GET(1),
    PUT(2),
    POST(3),
    DELETE(4),
    HEAD(5),
    PATCH(6),
    OPTIONS(7),
    TRACE(8),
    CONNECT(9);


    /* renamed from: l, reason: collision with root package name */
    private final int f10482l;

    z(int i2) {
        this.f10482l = i2;
    }

    public static z a(int i2) {
        switch (i2) {
            case 0:
                return HTTP_METHOD_UNKNOWN;
            case 1:
                return GET;
            case 2:
                return PUT;
            case 3:
                return POST;
            case 4:
                return DELETE;
            case 5:
                return HEAD;
            case 6:
                return PATCH;
            case 7:
                return OPTIONS;
            case 8:
                return TRACE;
            case 9:
                return CONNECT;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f10482l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10482l);
    }
}
