package com.moloco.sdk;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum m1 implements Internal.EnumLite {
    NONE(0),
    CLOSE(1),
    SKIP(2),
    MUTE(3),
    UNMUTE(4),
    CTA(5),
    REPLAY(6),
    DEC_SKIP(7),
    AD_BADGE(8),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f29806a;

    m1(int i5) {
        this.f29806a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29806a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
