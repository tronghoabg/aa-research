package u9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* loaded from: classes4.dex */
public final class e extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(String str) {
        copyOnWrite();
        f.b((f) this.instance, str);
    }

    public final void b(Timestamp timestamp) {
        copyOnWrite();
        f.c((f) this.instance, timestamp);
    }
}
