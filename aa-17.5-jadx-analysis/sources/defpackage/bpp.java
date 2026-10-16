package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class bpp {
    public static final bpp a;
    public static final bpp b;
    public static final bpp c;
    public static final bpp d;
    public static final bpp e;
    private static final /* synthetic */ bpp[] f;

    static {
        bpp bppVar = new bpp("TopBar", 0);
        a = bppVar;
        bpp bppVar2 = new bpp("MainContent", 1);
        b = bppVar2;
        bpp bppVar3 = new bpp("Snackbar", 2);
        c = bppVar3;
        bpp bppVar4 = new bpp("Fab", 3);
        d = bppVar4;
        bpp bppVar5 = new bpp("BottomBar", 4);
        e = bppVar5;
        bpp[] bppVarArr = {bppVar, bppVar2, bppVar3, bppVar4, bppVar5};
        f = bppVarArr;
        affa.p(bppVarArr);
    }

    public static bpp valueOf(String str) {
        return (bpp) Enum.valueOf(bpp.class, str);
    }

    public static bpp[] values() {
        return (bpp[]) f.clone();
    }
}
