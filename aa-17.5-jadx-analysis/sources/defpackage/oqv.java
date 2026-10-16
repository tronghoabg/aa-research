package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oqv {
    public static final oqv a;
    public static final oqv b;
    public static final oqv c;
    public static final oqv d;
    public static final oqv e;
    private static final /* synthetic */ oqv[] f;

    static {
        oqv oqvVar = new oqv("CONNECTED", 0);
        a = oqvVar;
        oqv oqvVar2 = new oqv("CONNECTING", 1);
        b = oqvVar2;
        oqv oqvVar3 = new oqv("DISCONNECTING", 2);
        c = oqvVar3;
        oqv oqvVar4 = new oqv("DISCONNECTED", 3);
        d = oqvVar4;
        oqv oqvVar5 = new oqv("UNKNOWN", 4);
        e = oqvVar5;
        f = new oqv[]{oqvVar, oqvVar2, oqvVar3, oqvVar4, oqvVar5};
    }

    public static oqv valueOf(String str) {
        return (oqv) Enum.valueOf(oqv.class, str);
    }

    public static oqv[] values() {
        return (oqv[]) f.clone();
    }
}
