package defpackage;

/* loaded from: classes.dex */
public enum yxj implements abnz {
    CONNECTION_RESET_ORIGIN_UNSPECIFIED(0),
    CONNECTION_RESET_ORIGIN_DEATH_RECIPIENT(1),
    CONNECTION_RESET_ORIGIN_CRASH_HANDLER(2),
    CONNECTION_RESET_ORIGIN_USB_MONITOR(3),
    CONNECTION_RESET_ORIGIN_PRE_SETUP(4);

    public final int f;

    yxj(int i) {
        this.f = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
