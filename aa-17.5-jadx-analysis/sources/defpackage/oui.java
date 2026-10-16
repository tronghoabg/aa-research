package defpackage;

/* loaded from: classes.dex */
public enum oui implements abnz {
    DROPPED_MEDIA_STREAM_FRAME_REASON_UNSPECIFIED(0),
    MEDIA_NOT_STARTED(1),
    MEDIA_INTERRUPTED_WAITING_TO_SEND_FRAME(2),
    MEDIA_QUITTING(3),
    AUDIO_BOTTOM_HALF_NOT_YET_AVAILABLE(100),
    AUDIO_BOTTOM_HALF_CAR_NOT_READY(200),
    AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPING_IMMEDIATELY(201),
    AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED(202),
    AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_SHUTTING_DOWN(203),
    AUDIO_BOTTOM_HALF_SENDER_QUEUE_OVERFLOW(204);

    public final int k;

    oui(int i) {
        this.k = i;
    }

    public static oui b(int i) {
        if (i == 0) {
            return DROPPED_MEDIA_STREAM_FRAME_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return MEDIA_NOT_STARTED;
        }
        if (i == 2) {
            return MEDIA_INTERRUPTED_WAITING_TO_SEND_FRAME;
        }
        if (i == 3) {
            return MEDIA_QUITTING;
        }
        if (i == 100) {
            return AUDIO_BOTTOM_HALF_NOT_YET_AVAILABLE;
        }
        switch (i) {
            case 200:
                return AUDIO_BOTTOM_HALF_CAR_NOT_READY;
            case 201:
                return AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPING_IMMEDIATELY;
            case 202:
                return AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED;
            case 203:
                return AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_SHUTTING_DOWN;
            case 204:
                return AUDIO_BOTTOM_HALF_SENDER_QUEUE_OVERFLOW;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
