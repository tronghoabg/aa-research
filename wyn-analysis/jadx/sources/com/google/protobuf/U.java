package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class U implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i5) {
        return DescriptorProtos.FieldOptions.JSType.forNumber(i5);
    }
}
