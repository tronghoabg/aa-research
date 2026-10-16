package com.moloco.sdk;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum J0 implements Internal.EnumLite {
    UNKNOWN(0),
    MAX(1),
    LEVEL_PLAY(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f28321a;

    J0(int i5) {
        this.f28321a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f28321a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
