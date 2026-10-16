package u9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import ka.G1;

/* loaded from: classes4.dex */
public final class o extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(G1 g12) {
        copyOnWrite();
        p.c((p) this.instance, g12);
    }

    public final void b(G1 g12) {
        copyOnWrite();
        p.d((p) this.instance, g12);
    }

    public final void c(int i5) {
        copyOnWrite();
        p.b((p) this.instance, i5);
    }

    public final void d(Timestamp timestamp) {
        copyOnWrite();
        p.e((p) this.instance, timestamp);
    }
}
