package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nnr {
    public static final nnr a;
    public static final nnr b;
    public static final nnr c;
    public static final nnr d;
    private static final /* synthetic */ nnr[] e;

    static {
        nnr nnrVar = new nnr("INACTIVE", 0);
        a = nnrVar;
        nnr nnrVar2 = new nnr("IN_CALL", 1);
        b = nnrVar2;
        nnr nnrVar3 = new nnr("NAVIGATION", 2);
        c = nnrVar3;
        nnr nnrVar4 = new nnr("MEDIA", 3);
        d = nnrVar4;
        nnr[] nnrVarArr = {nnrVar, nnrVar2, nnrVar3, nnrVar4};
        e = nnrVarArr;
        affa.p(nnrVarArr);
    }

    public static nnr valueOf(String str) {
        return (nnr) Enum.valueOf(nnr.class, str);
    }

    public static nnr[] values() {
        return (nnr[]) e.clone();
    }
}
