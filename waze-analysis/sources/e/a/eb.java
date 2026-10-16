package e.a;

import java.nio.charset.StandardCharsets;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum eb {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    private final int s;
    private final byte[] t;

    eb(int i2) {
        this.s = i2;
        this.t = Integer.toString(i2).getBytes(StandardCharsets.US_ASCII);
    }

    public final int a() {
        return this.s;
    }

    public final ee b() {
        return (ee) ee.n.get(this.s);
    }
}
