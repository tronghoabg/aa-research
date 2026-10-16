package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sap {
    public static final sap a;
    public static final sap b;
    public static final sap c;
    private static final /* synthetic */ sap[] d;

    static {
        sap sapVar = new sap("UNKNOWN", 0);
        a = sapVar;
        sap sapVar2 = new sap("ALLOWED", 1);
        b = sapVar2;
        sap sapVar3 = new sap("REJECTED", 2);
        c = sapVar3;
        d = new sap[]{sapVar, sapVar2, sapVar3};
    }

    public static sap valueOf(String str) {
        return (sap) Enum.valueOf(sap.class, str);
    }

    public static sap[] values() {
        return (sap[]) d.clone();
    }
}
