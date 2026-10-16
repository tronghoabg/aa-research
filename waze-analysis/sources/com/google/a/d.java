package com.google.a;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum d implements eg {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNORDERED_LIST(6),
    NON_EMPTY_DEFAULT(7),
    IDENTIFIER(8),
    MUTABLE_RESOURCE_CONTAINER(9),
    MUTABLE_RESOURCE_NAME(10),
    LEGACY_RESOURCE_IDENTIFIER(11),
    UNRECOGNIZED(-1);

    private static final eh n = new c();
    private final int p;

    d(int i2) {
        this.p = i2;
    }

    public static eh a() {
        return n;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
