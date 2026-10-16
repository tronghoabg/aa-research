package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tke {
    public static final tke a;
    public static final tke b;
    private static final /* synthetic */ tke[] d;
    public final float c;

    static {
        tke tkeVar = new tke("QUARTER", 0, 0.25f);
        a = tkeVar;
        tke tkeVar2 = new tke("ONE_EIGHTH", 1, 0.125f);
        b = tkeVar2;
        tke[] tkeVarArr = {tkeVar, tkeVar2};
        d = tkeVarArr;
        affa.p(tkeVarArr);
    }

    private tke(String str, int i, float f) {
        this.c = f;
    }

    public static tke valueOf(String str) {
        return (tke) Enum.valueOf(tke.class, str);
    }

    public static tke[] values() {
        return (tke[]) d.clone();
    }
}
