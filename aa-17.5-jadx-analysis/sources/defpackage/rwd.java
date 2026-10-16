package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rwd {
    public static final rwd a;
    private static final /* synthetic */ rwd[] b;

    static {
        rwd rwdVar = new rwd();
        a = rwdVar;
        b = new rwd[]{rwdVar};
    }

    private rwd() {
    }

    public static rwd valueOf(String str) {
        return (rwd) Enum.valueOf(rwd.class, str);
    }

    public static rwd[] values() {
        return (rwd[]) b.clone();
    }
}
