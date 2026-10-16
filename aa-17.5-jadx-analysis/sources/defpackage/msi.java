package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class msi {
    public static final msi a;
    public static final msi b;
    public static final msi c;
    public static final msi d;
    public static final /* synthetic */ afdf e;
    private static final /* synthetic */ msi[] f;

    static {
        msi msiVar = new msi("TOP_LEFT", 0);
        a = msiVar;
        msi msiVar2 = new msi("TOP_RIGHT", 1);
        b = msiVar2;
        msi msiVar3 = new msi("BOTTOM_LEFT", 2);
        c = msiVar3;
        msi msiVar4 = new msi("BOTTOM_RIGHT", 3);
        d = msiVar4;
        msi[] msiVarArr = {msiVar, msiVar2, msiVar3, msiVar4};
        f = msiVarArr;
        e = affa.p(msiVarArr);
    }

    public static msi valueOf(String str) {
        return (msi) Enum.valueOf(msi.class, str);
    }

    public static msi[] values() {
        return (msi[]) f.clone();
    }
}
