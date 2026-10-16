package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum aw implements com.google.v.eg {
    TYPE_ANY(0),
    TYPE_USER_DEFINED_LABEL(1),
    TYPE_POINT_ANNOTATION(2),
    TYPE_LINE_ANNOTATION(3),
    TYPE_AREA_ANNOTATION(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f11143g;

    aw(int i2) {
        this.f11143g = i2;
    }

    public static aw a(int i2) {
        if (i2 == 0) {
            return TYPE_ANY;
        }
        if (i2 == 1) {
            return TYPE_USER_DEFINED_LABEL;
        }
        if (i2 == 2) {
            return TYPE_POINT_ANNOTATION;
        }
        if (i2 == 3) {
            return TYPE_LINE_ANNOTATION;
        }
        if (i2 != 4) {
            return null;
        }
        return TYPE_AREA_ANNOTATION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11143g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11143g);
    }
}
