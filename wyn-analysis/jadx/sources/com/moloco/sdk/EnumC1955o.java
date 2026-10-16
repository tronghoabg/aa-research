package com.moloco.sdk;

import com.google.protobuf.Internal;

/* renamed from: com.moloco.sdk.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC1955o implements Internal.EnumLite {
    SILENT(0),
    VIBRATE(1),
    NORMAL(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f29812a;

    EnumC1955o(int i5) {
        this.f29812a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29812a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
