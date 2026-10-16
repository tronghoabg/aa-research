package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rqa {
    public static final rqa a;
    public static final rqa b;
    public static final rqa c;
    private static final /* synthetic */ rqa[] d;

    static {
        rqa rqaVar = new rqa("UNKNOWN", 0);
        a = rqaVar;
        rqa rqaVar2 = new rqa("ENABLED", 1);
        b = rqaVar2;
        rqa rqaVar3 = new rqa("DISABLED", 2);
        c = rqaVar3;
        d = new rqa[]{rqaVar, rqaVar2, rqaVar3};
    }

    public static rqa valueOf(String str) {
        return (rqa) Enum.valueOf(rqa.class, str);
    }

    public static rqa[] values() {
        return (rqa[]) d.clone();
    }
}
