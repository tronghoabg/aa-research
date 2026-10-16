package s9;

import com.google.protobuf.Timestamp;
import ka.C1;

/* loaded from: classes4.dex */
public abstract class n {
    public static Timestamp a(C1 c12) {
        return c12.s().e("__local_write_time__").u();
    }

    public static C1 b(C1 c12) {
        C1 c1D = c12.s().d("__previous_value__");
        return c(c1D) ? b(c1D) : c1D;
    }

    public static boolean c(C1 c12) {
        C1 c1D = c12 == null ? null : c12.s().d("__type__");
        return c1D != null && "server_timestamp".equals(c1D.getStringValue());
    }
}
