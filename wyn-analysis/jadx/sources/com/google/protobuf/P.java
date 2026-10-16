package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class P implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i5) {
        return DescriptorProtos.FieldDescriptorProto.Type.forNumber(i5);
    }
}
