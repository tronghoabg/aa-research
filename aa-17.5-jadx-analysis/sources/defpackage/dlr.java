package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dlr {
    public static final dlr a;
    public static final dlr b;
    private static final /* synthetic */ dlr[] c;

    static {
        dlr dlrVar = new dlr("Ltr", 0);
        a = dlrVar;
        dlr dlrVar2 = new dlr("Rtl", 1);
        b = dlrVar2;
        dlr[] dlrVarArr = {dlrVar, dlrVar2};
        c = dlrVarArr;
        affa.p(dlrVarArr);
    }

    public static dlr valueOf(String str) {
        return (dlr) Enum.valueOf(dlr.class, str);
    }

    public static dlr[] values() {
        return (dlr[]) c.clone();
    }
}
