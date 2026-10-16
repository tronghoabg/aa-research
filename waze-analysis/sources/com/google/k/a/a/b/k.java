package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum k implements com.google.v.eg {
    TYPE_FEATURE(17),
    TYPE_POSTAL_CODE_SUFFIX(18),
    TYPE_POST_BOX(21),
    TYPE_STREET_NUMBER(22),
    TYPE_FLOOR(23),
    TYPE_ROOM(24),
    TYPE_HOUSE_ID(25),
    TYPE_DISTANCE_MARKER(26),
    TYPE_LANDMARK(27),
    TYPE_PLUS_CODE(28);


    /* renamed from: l, reason: collision with root package name */
    private final int f11670l;

    k(int i2) {
        this.f11670l = i2;
    }

    public static k a(int i2) {
        switch (i2) {
            case 17:
                return TYPE_FEATURE;
            case 18:
                return TYPE_POSTAL_CODE_SUFFIX;
            case 19:
            case 20:
            default:
                return null;
            case 21:
                return TYPE_POST_BOX;
            case 22:
                return TYPE_STREET_NUMBER;
            case 23:
                return TYPE_FLOOR;
            case 24:
                return TYPE_ROOM;
            case 25:
                return TYPE_HOUSE_ID;
            case 26:
                return TYPE_DISTANCE_MARKER;
            case 27:
                return TYPE_LANDMARK;
            case 28:
                return TYPE_PLUS_CODE;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11670l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11670l);
    }
}
