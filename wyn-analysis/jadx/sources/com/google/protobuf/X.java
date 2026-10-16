package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class X implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final X f27635a = new X();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DescriptorProtos.FileOptions.OptimizeMode.forNumber(i5) != null;
    }
}
