package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class njr {
    public static final njr a;
    public static final njr b;
    public static final njr c;
    private static final /* synthetic */ njr[] d;

    static {
        njr njrVar = new njr("Driver", 0);
        a = njrVar;
        njr njrVar2 = new njr("Passenger", 1);
        b = njrVar2;
        njr njrVar3 = new njr("None", 2);
        c = njrVar3;
        njr[] njrVarArr = {njrVar, njrVar2, njrVar3};
        d = njrVarArr;
        affa.p(njrVarArr);
    }

    public static njr valueOf(String str) {
        return (njr) Enum.valueOf(njr.class, str);
    }

    public static njr[] values() {
        return (njr[]) d.clone();
    }
}
