package com.moloco.sdk;

import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes4.dex */
public final class q1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(String str) {
        copyOnWrite();
        s1.a((s1) this.instance, str);
    }

    public final void b() {
        copyOnWrite();
        s1.b((s1) this.instance);
    }

    public final void c() {
        String str = Build.VERSION.RELEASE;
        copyOnWrite();
        s1.c((s1) this.instance);
    }

    public final void d(float f10) {
        copyOnWrite();
        s1.d((s1) this.instance, f10);
    }
}
