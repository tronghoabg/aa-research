package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hjm {
    public static final hjm a;
    public static final hjm b;
    public static final hjm c;
    private static final /* synthetic */ hjm[] e;
    public final int d;

    static {
        hjm hjmVar = new hjm("COMPACT", 0, 0);
        a = hjmVar;
        hjm hjmVar2 = new hjm("TALL", 1, 700);
        b = hjmVar2;
        hjm hjmVar3 = new hjm("EXTRA_TALL", 2, 1200);
        c = hjmVar3;
        hjm[] hjmVarArr = {hjmVar, hjmVar2, hjmVar3};
        e = hjmVarArr;
        affa.p(hjmVarArr);
    }

    private hjm(String str, int i, int i2) {
        this.d = i2;
    }

    public static hjm valueOf(String str) {
        return (hjm) Enum.valueOf(hjm.class, str);
    }

    public static hjm[] values() {
        return (hjm[]) e.clone();
    }
}
