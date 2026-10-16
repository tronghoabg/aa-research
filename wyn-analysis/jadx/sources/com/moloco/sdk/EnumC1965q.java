package com.moloco.sdk;

import com.google.protobuf.Internal;

/* renamed from: com.moloco.sdk.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC1965q implements Internal.EnumLite {
    UNKNOWN(0),
    CHARGING(1),
    DISCHARGING(2),
    NOT_CHARGING(3),
    FULL(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f29825a;

    EnumC1965q(int i5) {
        this.f29825a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29825a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
