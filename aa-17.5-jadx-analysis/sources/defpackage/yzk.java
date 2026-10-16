package defpackage;

/* loaded from: classes3.dex */
public enum yzk implements abnz {
    NOTIFICATION_SHOWN(1),
    NOTIFICATION_DISMISSED(2),
    PROMPT_SHOWN(4),
    PROMPT_DISMISSED(8),
    RESPONSE_ENJOYING(16),
    RESPONSE_NOT_ENJOYING(32),
    OPEN_PLAY_STORE(64),
    OPEN_HELP_FEEDBACK(128);

    public final int i;

    yzk(int i) {
        this.i = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
