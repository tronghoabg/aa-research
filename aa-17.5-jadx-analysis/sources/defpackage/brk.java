package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class brk {
    public static final brk a;
    public static final brk b;
    public static final brk c;
    private static final /* synthetic */ brk[] d;

    static {
        brk brkVar = new brk("Tabs", 0);
        a = brkVar;
        brk brkVar2 = new brk("Divider", 1);
        b = brkVar2;
        brk brkVar3 = new brk("Indicator", 2);
        c = brkVar3;
        brk[] brkVarArr = {brkVar, brkVar2, brkVar3};
        d = brkVarArr;
        affa.p(brkVarArr);
    }

    public static brk valueOf(String str) {
        return (brk) Enum.valueOf(brk.class, str);
    }

    public static brk[] values() {
        return (brk[]) d.clone();
    }
}
