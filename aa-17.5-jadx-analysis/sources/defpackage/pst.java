package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@psl
/* loaded from: classes2.dex */
public final class pst implements psm {
    public static final pst a;
    public static final pst b;
    private static final /* synthetic */ pst[] c;

    static {
        pst pstVar = new pst("FINISH", 0);
        a = pstVar;
        pst pstVar2 = new pst("CANCEL", 1);
        b = pstVar2;
        c = new pst[]{pstVar, pstVar2};
    }

    public static pst valueOf(String str) {
        return (pst) Enum.valueOf(pst.class, str);
    }

    public static pst[] values() {
        return (pst[]) c.clone();
    }

    @Override // defpackage.psm
    public final /* synthetic */ void a() {
    }
}
