package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ouz implements defpackage.abpb {
    MICROPHONE_SESSION_EVENT_TYPE_UNSPECIFIED(0),
    OUTPUT_STREAM_CREATED(1),
    IO_ERROR_CREATING_OUTPUT_STREAM(2),
    RECORDING_STARTED(3),
    MICROPHONE_OPENED(4),
    MICROPHONE_ALREADY_OPEN(5),
    TIMEOUT_ERROR(6),
    MICROPHONE_OPEN_FAILED(8),
    APP_OP_DENIED(9),
    APP_OP_DENIED_DEFERRED(10),
    THREAD_INTERRUPTED_WHILE_WAITING_FOR_DATA(100),
    RECEIVED_ZERO_LENGTH_FRAME(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    OUTPUT_STREAM_CLOSED(200),
    OUTPUT_STREAM_ALREADY_CLOSED(205),
    IO_ERROR_CLOSING_OUTPUT_STREAM(201),
    MICROPHONE_CLOSED(202),
    MICROPHONE_CLOSE_REQUESTED_BUT_STILL_IN_USE(203),
    MICROPHONE_CLOSED_WHILE_WAITING_FOR_DATA(204);

    public final int s;

    ouz(int i) {
        this.s = i;
    }

    public static defpackage.ouz b(int i) {
        if (i == 100) {
            return THREAD_INTERRUPTED_WHILE_WAITING_FOR_DATA;
        }
        if (i == 101) {
            return RECEIVED_ZERO_LENGTH_FRAME;
        }
        switch (i) {
            case 0:
                return MICROPHONE_SESSION_EVENT_TYPE_UNSPECIFIED;
            case 1:
                return OUTPUT_STREAM_CREATED;
            case 2:
                return IO_ERROR_CREATING_OUTPUT_STREAM;
            case 3:
                return RECORDING_STARTED;
            case 4:
                return MICROPHONE_OPENED;
            case 5:
                return MICROPHONE_ALREADY_OPEN;
            case 6:
                return TIMEOUT_ERROR;
            default:
                switch (i) {
                    case 8:
                        return MICROPHONE_OPEN_FAILED;
                    case 9:
                        return APP_OP_DENIED;
                    case 10:
                        return APP_OP_DENIED_DEFERRED;
                    default:
                        switch (i) {
                            case 200:
                                return OUTPUT_STREAM_CLOSED;
                            case 201:
                                return IO_ERROR_CLOSING_OUTPUT_STREAM;
                            case 202:
                                return MICROPHONE_CLOSED;
                            case 203:
                                return MICROPHONE_CLOSE_REQUESTED_BUT_STILL_IN_USE;
                            case 204:
                                return MICROPHONE_CLOSED_WHILE_WAITING_FOR_DATA;
                            case 205:
                                return OUTPUT_STREAM_ALREADY_CLOSED;
                            default:
                                return null;
                        }
                }
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.s);
    }
}
