package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dem {
    public static final dem a;
    public static final dem b;
    public static final dem c;
    private static final /* synthetic */ dem[] d;

    static {
        dem demVar = new dem("On", 0);
        a = demVar;
        dem demVar2 = new dem("Off", 1);
        b = demVar2;
        dem demVar3 = new dem("Indeterminate", 2);
        c = demVar3;
        dem[] demVarArr = {demVar, demVar2, demVar3};
        d = demVarArr;
        affa.p(demVarArr);
    }

    public static dem valueOf(String str) {
        return (dem) Enum.valueOf(dem.class, str);
    }

    public static dem[] values() {
        return (dem[]) d.clone();
    }
}
