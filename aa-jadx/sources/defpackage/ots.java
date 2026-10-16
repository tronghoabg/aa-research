package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ots implements defpackage.abpb {
    EVENT_TYPE_UNSPECIFIED(0),
    ASSISTANT_NUDGE_IN_DIALER_SHOWN(1),
    ASSISTANT_NUDGE_IN_DIALER_CLICKED(2),
    GEARHEAD_LAUNCHER_SHOWN(3),
    GEARHEAD_LONG_DRIVE_START(4),
    ASSISTANT_NUDGE_IN_MESSAGING_APP_CLICKED(5),
    ASSISTANT_NUDGE_TO_CONTACT_IN_MESSAGING_APP_CLICKED(6),
    ASSISTANT_TOOLTIP_FOR_DIALER_OPEN(11),
    ASSISTANT_TOOLTIP_FOR_PHONE_CALL_ENDED(12),
    ASSISTANT_TOOLTIP_FOR_FIRST_RUN(13),
    ASSISTANT_TOOLTIP_FOR_FIRST_RUN_IN_THREE_RUNS(14),
    ASSISTANT_TOOLTIP_FOR_SECOND_RUN_IN_THREE_RUNS(15),
    ASSISTANT_TOOLTIP_FOR_THIRD_RUN_IN_THREE_RUNS(16),
    ASSISTANT_TOOLTIP_FOR_MEDIA_OPEN(17),
    ASSISTANT_TOOLTIP_FOR_LAUNCHER_OPEN(18),
    ASSISTANT_TOOLTIP_FOR_LONG_DRIVE_START(19),
    ASSISTANT_MEDIA_REC_TOOLTIP_FIRST_RUN(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    ASSISTANT_MEDIA_REC_TOOLTIP_MEDIA_IDLE(102),
    CUJ_SHORTCUTS_MEDIA_IMMERSIVE_CLICKED(121),
    CUJ_SHORTCUTS_MEDIA_CLICKED(122),
    CUJ_SHORTCUTS_CALL_CLICKED(123),
    CUJ_SHORTCUTS_MESSAGING_CLICKED(124),
    GEARHEAD_LAUNCHER_APP_CLICKED(125),
    ASSISTANT_SMART_ACTION_CALL_SENDER_CLICKED(126),
    GEMINI_THUMBS_UP_FEEDBACK_CLICKED(127),
    GEMINI_THUMBS_DOWN_FEEDBACK_CLICKED(128),
    ASSISTANT_THUMBS_UP_FEEDBACK_CLICKED(129),
    ASSISTANT_THUMBS_DOWN_FEEDBACK_CLICKED(130);

    public final int C;

    ots(int i) {
        this.C = i;
    }

    public static defpackage.ots b(int i) {
        if (i == 101) {
            return ASSISTANT_MEDIA_REC_TOOLTIP_FIRST_RUN;
        }
        if (i == 102) {
            return ASSISTANT_MEDIA_REC_TOOLTIP_MEDIA_IDLE;
        }
        switch (i) {
            case 0:
                return EVENT_TYPE_UNSPECIFIED;
            case 1:
                return ASSISTANT_NUDGE_IN_DIALER_SHOWN;
            case 2:
                return ASSISTANT_NUDGE_IN_DIALER_CLICKED;
            case 3:
                return GEARHEAD_LAUNCHER_SHOWN;
            case 4:
                return GEARHEAD_LONG_DRIVE_START;
            case 5:
                return ASSISTANT_NUDGE_IN_MESSAGING_APP_CLICKED;
            case 6:
                return ASSISTANT_NUDGE_TO_CONTACT_IN_MESSAGING_APP_CLICKED;
            default:
                switch (i) {
                    case 11:
                        return ASSISTANT_TOOLTIP_FOR_DIALER_OPEN;
                    case 12:
                        return ASSISTANT_TOOLTIP_FOR_PHONE_CALL_ENDED;
                    case 13:
                        return ASSISTANT_TOOLTIP_FOR_FIRST_RUN;
                    case 14:
                        return ASSISTANT_TOOLTIP_FOR_FIRST_RUN_IN_THREE_RUNS;
                    case 15:
                        return ASSISTANT_TOOLTIP_FOR_SECOND_RUN_IN_THREE_RUNS;
                    case 16:
                        return ASSISTANT_TOOLTIP_FOR_THIRD_RUN_IN_THREE_RUNS;
                    case 17:
                        return ASSISTANT_TOOLTIP_FOR_MEDIA_OPEN;
                    case 18:
                        return ASSISTANT_TOOLTIP_FOR_LAUNCHER_OPEN;
                    case 19:
                        return ASSISTANT_TOOLTIP_FOR_LONG_DRIVE_START;
                    default:
                        switch (i) {
                            case 121:
                                return CUJ_SHORTCUTS_MEDIA_IMMERSIVE_CLICKED;
                            case 122:
                                return CUJ_SHORTCUTS_MEDIA_CLICKED;
                            case 123:
                                return CUJ_SHORTCUTS_CALL_CLICKED;
                            case 124:
                                return CUJ_SHORTCUTS_MESSAGING_CLICKED;
                            case 125:
                                return GEARHEAD_LAUNCHER_APP_CLICKED;
                            case 126:
                                return ASSISTANT_SMART_ACTION_CALL_SENDER_CLICKED;
                            case 127:
                                return GEMINI_THUMBS_UP_FEEDBACK_CLICKED;
                            case 128:
                                return GEMINI_THUMBS_DOWN_FEEDBACK_CLICKED;
                            case 129:
                                return ASSISTANT_THUMBS_UP_FEEDBACK_CLICKED;
                            case 130:
                                return ASSISTANT_THUMBS_DOWN_FEEDBACK_CLICKED;
                            default:
                                return null;
                        }
                }
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.C);
    }
}
