package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.Internal;

/* renamed from: com.google.protobuf.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1822o0 implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i5) {
        return Field.Cardinality.forNumber(i5);
    }
}
