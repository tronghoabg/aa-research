package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nyi {
    public static final nyi a;
    public static final nyi b;
    public static final nyi c;
    private static final /* synthetic */ nyi[] d;

    static {
        nyi nyiVar = new nyi("LAUNCHER_CUSTOMIZATION_ENABLED", 0);
        a = nyiVar;
        nyi nyiVar2 = new nyi("COMPATIBLE_WITH_VEHICLE", 1);
        b = nyiVar2;
        nyi nyiVar3 = new nyi("IGNORE_CACHE", 2);
        c = nyiVar3;
        d = new nyi[]{nyiVar, nyiVar2, nyiVar3};
    }

    public static nyi valueOf(String str) {
        return (nyi) Enum.valueOf(nyi.class, str);
    }

    public static nyi[] values() {
        return (nyi[]) d.clone();
    }
}
