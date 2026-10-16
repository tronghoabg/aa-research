package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.Internal;

/* renamed from: com.google.protobuf.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1828q0 implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i5) {
        return Field.Kind.forNumber(i5);
    }
}
