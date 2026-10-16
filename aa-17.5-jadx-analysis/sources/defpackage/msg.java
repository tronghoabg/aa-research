package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class msg {
    public static final msg a;
    private static final /* synthetic */ msg[] c;
    public final float b = 32.0f;

    static {
        msg msgVar = new msg();
        a = msgVar;
        msg[] msgVarArr = {msgVar};
        c = msgVarArr;
        affa.p(msgVarArr);
    }

    private msg() {
    }

    public static msg valueOf(String str) {
        return (msg) Enum.valueOf(msg.class, str);
    }

    public static msg[] values() {
        return (msg[]) c.clone();
    }
}
