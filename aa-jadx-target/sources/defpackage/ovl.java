package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum ovl implements defpackage.abpb {
    MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED(0),
    CHANNEL_OPENED(1),
    MESSAGE_CONFIG_RECEIVED(2),
    START(3),
    START_REQUESTED_BEFORE_CONFIG_MESSAGE_RECEIVED(4),
    SENDING_CODEC_CONFIG(5),
    INVALID_MESSAGE_RECEIVED(100),
    INVALID_MESSAGE_CALLBACK_ID(101),
    CAR_DID_NOT_SEND_ALL_ACKS(102),
    CALLBACK_QUEUE_OVERFLOW(103),
    RECEIVED_ACK_WITH_WRONG_SESSION_ID(104),
    CHANNEL_CLOSE_REQUESTED(200),
    CHANNEL_CLOSED_DUE_TO_PROTOCOL_ERROR(201),
    PREPARE_STOP(202),
    STOP(203),
    STOP_CALLED_WHEN_NOT_STARTED(204),
    TRIED_TO_SEND_CODEC_CONFIG_WHILE_NOT_STARTED(300),
    TRIED_TO_SEND_DATA_WHILE_NOT_STARTED(301),
    RECEIVED_ACK_WHILE_NOT_STARTED(302),
    AUDIO_SYSTEM_SOUND_CAPTURING_STARTING(1000),
    AUDIO_SYSTEM_SOUND_CAPTURING_STARTED(1001),
    AUDIO_RECORD_UNINITIALIZED(1002),
    AUDIO_CAPTURE_SETUP_WITH_NEW_APIS_FAILED(1003),
    AUDIO_SET_VOLUME(1004),
    AUDIO_RECORD_READ_ERROR(1005),
    AUDIO_REQUESTING_BOTTOM_HALF(1006),
    AUDIO_PREVIOUS_BOTTOM_HALF_NOT_RELEASED(1007),
    AUDIO_STREAMING_REQUEST_CANCELLED_DUE_TO_LONG_SILENCE(1008),
    AUDIO_CAR_READY(1009),
    AUDIO_BOTTOM_HALF_AVAILABLE(1010),
    AUDIO_RECORD_FORCE_SINGLE_CHANNEL_CAPTURING(1011),
    AUDIO_RECORD_READ_REMOTE_ERROR(1012),
    NULL_AUDIO_RECORD(1013),
    AUDIO_POLICY_REGISTER_FAILURE(1014),
    AUDIO_HANDLE_FOCUS_CHANGE_COMMAND(1100),
    AUDIO_FOCUS_CHANGE_COMMAND_TIMED_OUT(1101),
    AUDIO_BOTTOM_HALF_SWITCHED(1102),
    AUDIO_CONCURRENT_FOCUS_CHANGE_COMMAND(1103),
    AUDIO_SYSTEM_SOUND_CAPTURING_ENDING(1200),
    AUDIO_SYSTEM_SOUND_CAPTURING_ENDED(1201),
    AUDIO_SYSTEM_SOUND_CAPTURING_END_TIMEOUT(1202),
    AUDIO_SYSTEM_SOUND_CAPTURING_END_SECOND_TRY_TIMEOUT(1203),
    AUDIO_STREAMING_STOPPED_DUE_TO_LONG_SILENCE(1204),
    AUDIO_RECORD_RELEASE_TIMEOUT(1205),
    AUDIO_RECORD_RELEASE_CAPTURE_THREAD_INTERRUPTED(1206),
    AUDIO_RECORD_RELEASE_FAILED(1207),
    AUDIO_RECORD_RELEASE_RECORD_NOT_AVAILABLE(1208),
    AUDIO_BOTTOM_HALF_LOST(1209),
    AUDIO_IRRELEVANT_BOTTOM_HALF_LOST(1210),
    AUDIO_BOTTOM_HALF_STREAMING_STARTED(2000),
    AUDIO_BOTTOM_HALF_STREAMING_ALREADY_STARTED(2001),
    AUDIO_BOTTOM_HALF_CAR_READY(2002),
    AUDIO_BOTTOM_HALF_END_POINT_READY(2003),
    AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_INITIALIZED(2004),
    AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STARTED(2005),
    AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_ALREADY_STARTED(2006),
    AUDIO_BOTTOM_HALF_CAR_NOT_READY(2200),
    AUDIO_BOTTOM_HALF_DISABLED(2201),
    AUDIO_BOTTOM_HALF_STREAMING_STOPPED(2202),
    AUDIO_BOTTOM_HALF_STREAMING_ALREADY_STOPPED(2203),
    AUDIO_BOTTOM_HALF_TIMEOUT_WAITING_FOR_STREAM_TO_STOP(2204),
    AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED(2205),
    AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_MESSAGE_IGNORED(2206);

    public final int al;

    ovl(int i) {
        this.al = i;
    }

    public static defpackage.ovl b(int i) {
        if (i == 0) {
            return MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CHANNEL_OPENED;
        }
        if (i == 2) {
            return MESSAGE_CONFIG_RECEIVED;
        }
        if (i == 3) {
            return START;
        }
        if (i == 4) {
            return START_REQUESTED_BEFORE_CONFIG_MESSAGE_RECEIVED;
        }
        if (i == 5) {
            return SENDING_CODEC_CONFIG;
        }
        switch (i) {
            case 100:
                return INVALID_MESSAGE_RECEIVED;
            case 101:
                return INVALID_MESSAGE_CALLBACK_ID;
            case 102:
                return CAR_DID_NOT_SEND_ALL_ACKS;
            case 103:
                return CALLBACK_QUEUE_OVERFLOW;
            case 104:
                return RECEIVED_ACK_WITH_WRONG_SESSION_ID;
            default:
                switch (i) {
                    case 200:
                        return CHANNEL_CLOSE_REQUESTED;
                    case 201:
                        return CHANNEL_CLOSED_DUE_TO_PROTOCOL_ERROR;
                    case 202:
                        return PREPARE_STOP;
                    case 203:
                        return STOP;
                    case 204:
                        return STOP_CALLED_WHEN_NOT_STARTED;
                    default:
                        switch (i) {
                            case 300:
                                return TRIED_TO_SEND_CODEC_CONFIG_WHILE_NOT_STARTED;
                            case 301:
                                return TRIED_TO_SEND_DATA_WHILE_NOT_STARTED;
                            case 302:
                                return RECEIVED_ACK_WHILE_NOT_STARTED;
                            default:
                                switch (i) {
                                    case 1000:
                                        return AUDIO_SYSTEM_SOUND_CAPTURING_STARTING;
                                    case 1001:
                                        return AUDIO_SYSTEM_SOUND_CAPTURING_STARTED;
                                    case 1002:
                                        return AUDIO_RECORD_UNINITIALIZED;
                                    case 1003:
                                        return AUDIO_CAPTURE_SETUP_WITH_NEW_APIS_FAILED;
                                    case 1004:
                                        return AUDIO_SET_VOLUME;
                                    case 1005:
                                        return AUDIO_RECORD_READ_ERROR;
                                    case 1006:
                                        return AUDIO_REQUESTING_BOTTOM_HALF;
                                    case 1007:
                                        return AUDIO_PREVIOUS_BOTTOM_HALF_NOT_RELEASED;
                                    case 1008:
                                        return AUDIO_STREAMING_REQUEST_CANCELLED_DUE_TO_LONG_SILENCE;
                                    case 1009:
                                        return AUDIO_CAR_READY;
                                    case 1010:
                                        return AUDIO_BOTTOM_HALF_AVAILABLE;
                                    case 1011:
                                        return AUDIO_RECORD_FORCE_SINGLE_CHANNEL_CAPTURING;
                                    case 1012:
                                        return AUDIO_RECORD_READ_REMOTE_ERROR;
                                    case 1013:
                                        return NULL_AUDIO_RECORD;
                                    case 1014:
                                        return AUDIO_POLICY_REGISTER_FAILURE;
                                    default:
                                        switch (i) {
                                            case 1100:
                                                return AUDIO_HANDLE_FOCUS_CHANGE_COMMAND;
                                            case 1101:
                                                return AUDIO_FOCUS_CHANGE_COMMAND_TIMED_OUT;
                                            case 1102:
                                                return AUDIO_BOTTOM_HALF_SWITCHED;
                                            case 1103:
                                                return AUDIO_CONCURRENT_FOCUS_CHANGE_COMMAND;
                                            default:
                                                switch (i) {
                                                    case 1200:
                                                        return AUDIO_SYSTEM_SOUND_CAPTURING_ENDING;
                                                    case 1201:
                                                        return AUDIO_SYSTEM_SOUND_CAPTURING_ENDED;
                                                    case 1202:
                                                        return AUDIO_SYSTEM_SOUND_CAPTURING_END_TIMEOUT;
                                                    case 1203:
                                                        return AUDIO_SYSTEM_SOUND_CAPTURING_END_SECOND_TRY_TIMEOUT;
                                                    case 1204:
                                                        return AUDIO_STREAMING_STOPPED_DUE_TO_LONG_SILENCE;
                                                    case 1205:
                                                        return AUDIO_RECORD_RELEASE_TIMEOUT;
                                                    case 1206:
                                                        return AUDIO_RECORD_RELEASE_CAPTURE_THREAD_INTERRUPTED;
                                                    case 1207:
                                                        return AUDIO_RECORD_RELEASE_FAILED;
                                                    case 1208:
                                                        return AUDIO_RECORD_RELEASE_RECORD_NOT_AVAILABLE;
                                                    case 1209:
                                                        return AUDIO_BOTTOM_HALF_LOST;
                                                    case 1210:
                                                        return AUDIO_IRRELEVANT_BOTTOM_HALF_LOST;
                                                    default:
                                                        switch (i) {
                                                            case 2000:
                                                                return AUDIO_BOTTOM_HALF_STREAMING_STARTED;
                                                            case 2001:
                                                                return AUDIO_BOTTOM_HALF_STREAMING_ALREADY_STARTED;
                                                            case 2002:
                                                                return AUDIO_BOTTOM_HALF_CAR_READY;
                                                            case 2003:
                                                                return AUDIO_BOTTOM_HALF_END_POINT_READY;
                                                            case 2004:
                                                                return AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_INITIALIZED;
                                                            case 2005:
                                                                return AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STARTED;
                                                            case 2006:
                                                                return AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_ALREADY_STARTED;
                                                            default:
                                                                switch (i) {
                                                                    case 2200:
                                                                        return AUDIO_BOTTOM_HALF_CAR_NOT_READY;
                                                                    case 2201:
                                                                        return AUDIO_BOTTOM_HALF_DISABLED;
                                                                    case 2202:
                                                                        return AUDIO_BOTTOM_HALF_STREAMING_STOPPED;
                                                                    case 2203:
                                                                        return AUDIO_BOTTOM_HALF_STREAMING_ALREADY_STOPPED;
                                                                    case 2204:
                                                                        return AUDIO_BOTTOM_HALF_TIMEOUT_WAITING_FOR_STREAM_TO_STOP;
                                                                    case 2205:
                                                                        return AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED;
                                                                    case 2206:
                                                                        return AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_MESSAGE_IGNORED;
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.al;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.al);
    }
}
