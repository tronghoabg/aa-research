package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class V implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final V f27630a = new V();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DescriptorProtos.FieldOptions.JSType.forNumber(i5) != null;
    }
}
