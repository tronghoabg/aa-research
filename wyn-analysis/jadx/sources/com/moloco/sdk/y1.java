package com.moloco.sdk;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum y1 implements Internal.EnumLite {
    UNKNOWN(0),
    WIFI(1),
    CELLULAR(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f32471a;

    y1(int i5) {
        this.f32471a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f32471a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
