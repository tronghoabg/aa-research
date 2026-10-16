package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class O implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final O f27598a = new O();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DescriptorProtos.FieldDescriptorProto.Label.forNumber(i5) != null;
    }
}
