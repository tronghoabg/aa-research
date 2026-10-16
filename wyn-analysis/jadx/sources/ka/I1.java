package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes4.dex */
public final class I1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(G1 g12) {
        copyOnWrite();
        K1.d((K1) this.instance, g12);
    }

    public final void b(String str) {
        copyOnWrite();
        K1.b((K1) this.instance, str);
    }

    public final void c(ByteString byteString) {
        copyOnWrite();
        K1.c((K1) this.instance, byteString);
    }
}
