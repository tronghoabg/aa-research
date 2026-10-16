package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* renamed from: ka.j1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3246j1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(C3252l1 c3252l1) {
        copyOnWrite();
        C3261o1.c((C3261o1) this.instance, c3252l1);
    }

    public final void b(Int32Value.Builder builder) {
        copyOnWrite();
        C3261o1.g((C3261o1) this.instance, builder.build());
    }

    public final void c(C3258n1 c3258n1) {
        copyOnWrite();
        C3261o1.b((C3261o1) this.instance, c3258n1);
    }

    public final void d(Timestamp timestamp) {
        copyOnWrite();
        C3261o1.e((C3261o1) this.instance, timestamp);
    }

    public final void e(ByteString byteString) {
        copyOnWrite();
        C3261o1.d((C3261o1) this.instance, byteString);
    }

    public final void f(int i5) {
        copyOnWrite();
        C3261o1.f((C3261o1) this.instance, i5);
    }
}
