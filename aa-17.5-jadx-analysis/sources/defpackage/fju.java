package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fju {
    public static final fju a;
    public static final fju b;
    public static final fju c;
    public static final fju d;
    public static final fju e;
    public static final fju f;
    private static final /* synthetic */ fju[] g;

    static {
        fju fjuVar = new fju("ENQUEUED", 0);
        a = fjuVar;
        fju fjuVar2 = new fju("RUNNING", 1);
        b = fjuVar2;
        fju fjuVar3 = new fju("SUCCEEDED", 2);
        c = fjuVar3;
        fju fjuVar4 = new fju("FAILED", 3);
        d = fjuVar4;
        fju fjuVar5 = new fju("BLOCKED", 4);
        e = fjuVar5;
        fju fjuVar6 = new fju("CANCELLED", 5);
        f = fjuVar6;
        fju[] fjuVarArr = {fjuVar, fjuVar2, fjuVar3, fjuVar4, fjuVar5, fjuVar6};
        g = fjuVarArr;
        affa.p(fjuVarArr);
    }

    public static fju valueOf(String str) {
        return (fju) Enum.valueOf(fju.class, str);
    }

    public static fju[] values() {
        return (fju[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
