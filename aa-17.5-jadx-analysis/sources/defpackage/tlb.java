package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class tlb {
    public static final tlb a;
    public static final tlb b;
    private static final /* synthetic */ tlb[] c;

    static {
        tlb tlbVar = new tlb("SETUP_CALLED", 0);
        a = tlbVar;
        tlb tlbVar2 = new tlb("TEARDOWN_CALLED", 1);
        b = tlbVar2;
        tlb[] tlbVarArr = {tlbVar, tlbVar2};
        c = tlbVarArr;
        affa.p(tlbVarArr);
    }

    public static tlb valueOf(String str) {
        return (tlb) Enum.valueOf(tlb.class, str);
    }

    public static tlb[] values() {
        return (tlb[]) c.clone();
    }
}
