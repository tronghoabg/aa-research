package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rjj {
    public static final rjj a;
    public static final rjj b;
    public static final rjj c;
    private static final /* synthetic */ rjj[] d;

    static {
        rjj rjjVar = new rjj("UNKNOWN", 0);
        a = rjjVar;
        rjj rjjVar2 = new rjj("NAVIGATION", 1);
        b = rjjVar2;
        rjj rjjVar3 = new rjj("TURN_CARD", 2);
        c = rjjVar3;
        d = new rjj[]{rjjVar, rjjVar2, rjjVar3};
    }

    public static rjj valueOf(String str) {
        return (rjj) Enum.valueOf(rjj.class, str);
    }

    public static rjj[] values() {
        return (rjj[]) d.clone();
    }
}
