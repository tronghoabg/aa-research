package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hoy {
    public static final hoy a;
    public static final hoy b;
    public static final hoy c;
    public static final /* synthetic */ afdf d;
    private static final /* synthetic */ hoy[] f;
    public final String e;

    static {
        hoy hoyVar = new hoy("CHROME", 0, "CHROME");
        a = hoyVar;
        hoy hoyVar2 = new hoy("LOAM_FILE", 1, "LOAM_FILE");
        b = hoyVar2;
        hoy hoyVar3 = new hoy("NESTA", 2, "NESTA");
        c = hoyVar3;
        hoy[] hoyVarArr = {hoyVar, hoyVar2, hoyVar3};
        f = hoyVarArr;
        d = affa.p(hoyVarArr);
    }

    private hoy(String str, int i, String str2) {
        this.e = str2;
    }

    public static hoy valueOf(String str) {
        return (hoy) Enum.valueOf(hoy.class, str);
    }

    public static hoy[] values() {
        return (hoy[]) f.clone();
    }
}
