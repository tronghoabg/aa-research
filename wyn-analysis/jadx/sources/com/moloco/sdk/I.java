package com.moloco.sdk;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum I implements Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    WIFI(1),
    CELLULAR(2),
    NO_NETWORK(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f28315a;

    I(int i5) {
        this.f28315a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f28315a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
