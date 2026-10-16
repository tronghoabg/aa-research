package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class opj {
    public static final opj a;
    public static final opj b;
    private static final /* synthetic */ opj[] c;

    static {
        opj opjVar = new opj("FEATURED", 0);
        a = opjVar;
        opj opjVar2 = new opj("BROWSE", 1);
        b = opjVar2;
        opj[] opjVarArr = {opjVar, opjVar2};
        c = opjVarArr;
        affa.p(opjVarArr);
    }

    public static opj valueOf(String str) {
        return (opj) Enum.valueOf(opj.class, str);
    }

    public static opj[] values() {
        return (opj[]) c.clone();
    }
}
