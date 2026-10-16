package u9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* loaded from: classes4.dex */
public final class l extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(String str) {
        copyOnWrite();
        m.b((m) this.instance, str);
    }

    public final void b(Timestamp timestamp) {
        copyOnWrite();
        m.c((m) this.instance, timestamp);
    }
}
