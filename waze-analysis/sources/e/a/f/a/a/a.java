package e.a.f.a.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INVALID_STREAM(1),
    UNSUPPORTED_VERSION(1),
    STREAM_IN_USE(1),
    STREAM_ALREADY_CLOSED(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    STREAM_CLOSED(5),
    FRAME_TOO_LARGE(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13),
    INVALID_CREDENTIALS(-1);

    public final int s;

    a(int i2) {
        this.s = i2;
    }

    public static a a(int i2) {
        for (a aVar : values()) {
            if (aVar.s == i2) {
                return aVar;
            }
        }
        return null;
    }
}
