package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.NullValue;
import com.google.protobuf.Timestamp;

/* loaded from: classes4.dex */
public final class B1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final C3263p0 a() {
        return ((C1) this.instance).s();
    }

    public final void b(C3232f c3232f) {
        copyOnWrite();
        C1.g((C3235g) c3232f.build(), (C1) this.instance);
    }

    public final void c(C3235g c3235g) {
        copyOnWrite();
        C1.g(c3235g, (C1) this.instance);
    }

    public final void d(boolean z2) {
        copyOnWrite();
        C1.j((C1) this.instance, z2);
    }

    public final void e(ByteString byteString) {
        copyOnWrite();
        C1.d((C1) this.instance, byteString);
    }

    public final void f(double d3) {
        copyOnWrite();
        C1.l((C1) this.instance, d3);
    }

    public final void g(Ia.b bVar) {
        copyOnWrite();
        C1.f((C1) this.instance, (Ia.c) bVar.build());
    }

    public final void h(long j8) {
        copyOnWrite();
        C1.k((C1) this.instance, j8);
    }

    public final void j(C3257n0 c3257n0) {
        copyOnWrite();
        C1.h((C1) this.instance, (C3263p0) c3257n0.build());
    }

    public final void k(C3263p0 c3263p0) {
        copyOnWrite();
        C1.h((C1) this.instance, c3263p0);
    }

    public final void l(NullValue nullValue) {
        copyOnWrite();
        C1.i((C1) this.instance, nullValue);
    }

    public final void m(String str) {
        copyOnWrite();
        C1.e(str, (C1) this.instance);
    }

    public final void n(String str) {
        copyOnWrite();
        C1.c(str, (C1) this.instance);
    }

    public final void o(Timestamp.Builder builder) {
        copyOnWrite();
        C1.b((C1) this.instance, builder.build());
    }
}
