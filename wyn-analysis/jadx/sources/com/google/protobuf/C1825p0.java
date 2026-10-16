package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.Internal;

/* renamed from: com.google.protobuf.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1825p0 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C1825p0 f27729a = new C1825p0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return Field.Cardinality.forNumber(i5) != null;
    }
}
