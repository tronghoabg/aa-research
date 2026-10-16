package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.Internal;

/* renamed from: com.google.protobuf.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1830r0 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C1830r0 f27738a = new C1830r0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return Field.Kind.forNumber(i5) != null;
    }
}
