package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: classes4.dex */
public final class P0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(List list) {
        copyOnWrite();
        Q0.a((Q0) this.instance, list);
    }

    public final void b(long j8) {
        copyOnWrite();
        Q0.b((Q0) this.instance, j8);
    }

    public final void c(String str) {
        copyOnWrite();
        Q0.c((Q0) this.instance, str);
    }
}
