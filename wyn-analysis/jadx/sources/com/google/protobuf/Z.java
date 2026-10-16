package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class Z implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f27640a = new Z();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DescriptorProtos.MethodOptions.IdempotencyLevel.forNumber(i5) != null;
    }
}
