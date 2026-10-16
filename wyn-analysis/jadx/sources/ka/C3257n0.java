package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* renamed from: ka.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3257n0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(Map map) {
        copyOnWrite();
        C3263p0.b((C3263p0) this.instance).putAll(map);
    }

    public final void b(String str, C1 c12) {
        str.getClass();
        c12.getClass();
        copyOnWrite();
        C3263p0.b((C3263p0) this.instance).put(str, c12);
    }

    public final void c(String str) {
        copyOnWrite();
        C3263p0.b((C3263p0) this.instance).remove(str);
    }

    public final boolean containsFields(String str) {
        str.getClass();
        return ((C3263p0) this.instance).getFieldsMap().containsKey(str);
    }
}
