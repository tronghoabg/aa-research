package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bdt {
    public static final bdt a;
    public static final bdt b;
    public static final bdt c;
    private static final /* synthetic */ bdt[] d;

    static {
        bdt bdtVar = new bdt("Cursor", 0);
        a = bdtVar;
        bdt bdtVar2 = new bdt("SelectionStart", 1);
        b = bdtVar2;
        bdt bdtVar3 = new bdt("SelectionEnd", 2);
        c = bdtVar3;
        bdt[] bdtVarArr = {bdtVar, bdtVar2, bdtVar3};
        d = bdtVarArr;
        affa.p(bdtVarArr);
    }

    public static bdt valueOf(String str) {
        return (bdt) Enum.valueOf(bdt.class, str);
    }

    public static bdt[] values() {
        return (bdt[]) d.clone();
    }
}
