package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class T implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final T f27624a = new T();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return DescriptorProtos.FieldOptions.CType.forNumber(i5) != null;
    }
}
