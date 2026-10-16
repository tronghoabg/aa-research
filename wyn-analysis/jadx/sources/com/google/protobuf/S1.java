package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class S1 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final S1 f27623a = new S1();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return Syntax.forNumber(i5) != null;
    }
}
