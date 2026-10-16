package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tix {
    public static final tix a;
    public static final tix b;
    public static final tix c;
    public static final tix d;
    private static final /* synthetic */ tix[] f;
    public final int e;

    static {
        tix tixVar = new tix("Small", 0, 1);
        a = tixVar;
        tix tixVar2 = new tix("Large", 1, 2);
        b = tixVar2;
        tix tixVar3 = new tix("Icon", 2, 4);
        c = tixVar3;
        tix tixVar4 = new tix("ExtraSmall", 3, 8);
        d = tixVar4;
        tix[] tixVarArr = {tixVar, tixVar2, tixVar3, tixVar4};
        f = tixVarArr;
        affa.p(tixVarArr);
    }

    private tix(String str, int i, int i2) {
        this.e = i2;
    }

    public static tix valueOf(String str) {
        return (tix) Enum.valueOf(tix.class, str);
    }

    public static tix[] values() {
        return (tix[]) f.clone();
    }
}
