package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class kun {
    public static final kun a;
    public static final kun b;
    public static final kun c;
    public static final kun d;
    public static final /* synthetic */ afdf e;
    private static final /* synthetic */ kun[] g;
    public final afeg f;

    static {
        kun kunVar = new kun("Icons", 0, kum.a);
        a = kunVar;
        kun kunVar2 = new kun("Buttons", 1, kum.b);
        b = kunVar2;
        kun kunVar3 = new kun("ToggleButtons", 2, kum.c);
        c = kunVar3;
        kun kunVar4 = new kun("Notifications", 3, kum.d);
        d = kunVar4;
        kun[] kunVarArr = {kunVar, kunVar2, kunVar3, kunVar4};
        g = kunVarArr;
        e = affa.p(kunVarArr);
    }

    private kun(String str, int i, afeg afegVar) {
        this.f = afegVar;
    }

    public static kun valueOf(String str) {
        return (kun) Enum.valueOf(kun.class, str);
    }

    public static kun[] values() {
        return (kun[]) g.clone();
    }
}
