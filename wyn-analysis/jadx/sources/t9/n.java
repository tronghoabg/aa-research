package t9;

import com.google.protobuf.Timestamp;
import ka.B1;
import ka.C1;
import ka.C3257n0;
import ka.C3263p0;

/* loaded from: classes4.dex */
public final class n implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final n f45966a = new n();

    @Override // t9.p
    public final C1 a(C1 c12) {
        return null;
    }

    @Override // t9.p
    public final C1 b(C1 c12, s8.q qVar) {
        B1 b1W = C1.w();
        b1W.n("server_timestamp");
        C1 c13 = (C1) b1W.build();
        B1 b1W2 = C1.w();
        b1W2.o(Timestamp.newBuilder().setSeconds(qVar.f45352a).setNanos(qVar.f45353b));
        C1 c14 = (C1) b1W2.build();
        C3257n0 c3257n0F = C3263p0.f();
        c3257n0F.b("__type__", c13);
        c3257n0F.b("__local_write_time__", c14);
        if (s9.n.c(c12)) {
            c12 = s9.n.b(c12);
        }
        if (c12 != null) {
            c3257n0F.b("__previous_value__", c12);
        }
        B1 b1W3 = C1.w();
        b1W3.j(c3257n0F);
        return (C1) b1W3.build();
    }

    @Override // t9.p
    public final C1 c(C1 c12, C1 c13) {
        return c13;
    }
}
