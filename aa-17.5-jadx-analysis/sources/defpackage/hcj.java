package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hcj {
    public static final hcj a;
    public static final hcj b;
    private static final /* synthetic */ hcj[] d;
    public final boolean c;

    static {
        hcj hcjVar = new hcj("FULL_SCREEN", 0, false);
        a = hcjVar;
        hcj hcjVar2 = new hcj("CARD", 1, true);
        b = hcjVar2;
        hcj[] hcjVarArr = {hcjVar, hcjVar2};
        d = hcjVarArr;
        affa.p(hcjVarArr);
    }

    private hcj(String str, int i, boolean z) {
        this.c = z;
    }

    public static hcj valueOf(String str) {
        return (hcj) Enum.valueOf(hcj.class, str);
    }

    public static hcj[] values() {
        return (hcj[]) d.clone();
    }
}
