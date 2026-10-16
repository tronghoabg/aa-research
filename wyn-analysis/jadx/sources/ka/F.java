package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.Map;

/* loaded from: classes4.dex */
public final class F extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(Map map) {
        copyOnWrite();
        H.c((H) this.instance).putAll(map);
    }

    public final void b(String str) {
        copyOnWrite();
        H.b((H) this.instance, str);
    }

    public final void c(Timestamp timestamp) {
        copyOnWrite();
        H.d((H) this.instance, timestamp);
    }
}
