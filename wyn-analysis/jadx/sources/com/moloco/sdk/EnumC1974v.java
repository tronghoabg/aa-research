package com.moloco.sdk;

import com.google.protobuf.Internal;

/* renamed from: com.moloco.sdk.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC1974v implements Internal.EnumLite {
    UNKNOWN(0),
    PORTRAIT(1),
    LANDSCAPE(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f29871a;

    EnumC1974v(int i5) {
        this.f29871a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29871a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
