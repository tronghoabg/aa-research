package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class sbf {
    public static final sbf a;
    public static final sbf b;
    private static final /* synthetic */ sbf[] c;

    static {
        sbf sbfVar = new sbf("STATUS", 0);
        a = sbfVar;
        sbf sbfVar2 = new sbf("ERROR", 1);
        b = sbfVar2;
        c = new sbf[]{sbfVar, sbfVar2};
    }

    public static sbf valueOf(String str) {
        return (sbf) Enum.valueOf(sbf.class, str);
    }

    public static sbf[] values() {
        return (sbf[]) c.clone();
    }
}
