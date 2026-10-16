package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class Q implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f27605a = new Q();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DescriptorProtos.FieldDescriptorProto.Type.forNumber(i5) != null;
    }
}
