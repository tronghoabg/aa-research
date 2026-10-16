package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class acc {
    public static final acc a;
    public static final acc b;
    public static final acc c;
    private static final /* synthetic */ acc[] d;

    static {
        acc accVar = new acc("PreEnter", 0);
        a = accVar;
        acc accVar2 = new acc("Visible", 1);
        b = accVar2;
        acc accVar3 = new acc("PostExit", 2);
        c = accVar3;
        acc[] accVarArr = {accVar, accVar2, accVar3};
        d = accVarArr;
        affa.p(accVarArr);
    }

    public static acc valueOf(String str) {
        return (acc) Enum.valueOf(acc.class, str);
    }

    public static acc[] values() {
        return (acc[]) d.clone();
    }
}
