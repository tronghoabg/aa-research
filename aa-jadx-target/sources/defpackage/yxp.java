package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum yxp implements defpackage.abpb {
    UNKNOWN_CANCEL_TRIGGER(0),
    X_BUTTON_CLICKED(1),
    LOGO_CLICKED(2),
    SCRIM_CLICKED(3),
    BACK_BUTTON_CLICKED(4),
    HARDWARE_BUTTON_CLICKED(5),
    END_CALL_BUTTON_CLICKED(6),
    ROTARY_NUDGE(7),
    SCREEN_TURNED_OFF(8),
    FACET_SWITCHED(9),
    INTERRUPTED(10),
    RAIL_ICON_CLICKED(11),
    RESTART_ATTEMPTED(12),
    RESIZE(13),
    CANCELLED_USER_MAP_INTERACTION(14);

    public final int p;

    yxp(int i) {
        this.p = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.p);
    }
}
