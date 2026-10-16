package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mup {
    public static final mup a;
    public static final mup b;
    public static final mup c;
    private static final /* synthetic */ mup[] d;

    static {
        mup mupVar = new mup("COLLAPSED", 0);
        a = mupVar;
        mup mupVar2 = new mup("INTERMEDIATE", 1);
        b = mupVar2;
        mup mupVar3 = new mup("FULLY_EXPANDED", 2);
        c = mupVar3;
        mup[] mupVarArr = {mupVar, mupVar2, mupVar3};
        d = mupVarArr;
        affa.p(mupVarArr);
    }

    public static mup valueOf(String str) {
        return (mup) Enum.valueOf(mup.class, str);
    }

    public static mup[] values() {
        return (mup[]) d.clone();
    }
}
