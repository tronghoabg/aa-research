package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mzb {
    public static final mzb a;
    public static final mzb b;
    public static final mzb c;
    public static final mzb d;
    public static final mzb e;
    private static final /* synthetic */ mzb[] f;

    static {
        mzb mzbVar = new mzb("NO_APP", 0);
        a = mzbVar;
        mzb mzbVar2 = new mzb("LOADING", 1);
        b = mzbVar2;
        mzb mzbVar3 = new mzb("VALID_MEDIA", 2);
        c = mzbVar3;
        mzb mzbVar4 = new mzb("INVALID_MEDIA", 3);
        d = mzbVar4;
        mzb mzbVar5 = new mzb("SUGGESTION_AVAILABLE", 4);
        e = mzbVar5;
        mzb[] mzbVarArr = {mzbVar, mzbVar2, mzbVar3, mzbVar4, mzbVar5};
        f = mzbVarArr;
        affa.p(mzbVarArr);
    }

    public static mzb valueOf(String str) {
        return (mzb) Enum.valueOf(mzb.class, str);
    }

    public static mzb[] values() {
        return (mzb[]) f.clone();
    }
}
