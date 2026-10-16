package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.HashMap;

/* renamed from: ka.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3236g0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(HashMap map) {
        copyOnWrite();
        C3242i0.b((C3242i0) this.instance).putAll(map);
    }

    public final void b(C3261o1 c3261o1) {
        copyOnWrite();
        C3242i0.d((C3242i0) this.instance, c3261o1);
    }

    public final void c(String str) {
        copyOnWrite();
        C3242i0.c((C3242i0) this.instance, str);
    }

    public final void d(int i5) {
        copyOnWrite();
        C3242i0.e((C3242i0) this.instance, i5);
    }
}
