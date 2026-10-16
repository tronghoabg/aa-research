package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: com.moloco.sdk.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1875h extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ByteString byteString) {
        copyOnWrite();
        C1877i.a((C1877i) this.instance, byteString);
    }

    public final void b(ByteString byteString) {
        copyOnWrite();
        C1877i.b((C1877i) this.instance, byteString);
    }
}
