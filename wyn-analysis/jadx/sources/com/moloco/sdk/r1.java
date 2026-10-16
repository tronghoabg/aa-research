package com.moloco.sdk;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum r1 implements Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f29829a;

    r1(int i5) {
        this.f29829a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29829a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
